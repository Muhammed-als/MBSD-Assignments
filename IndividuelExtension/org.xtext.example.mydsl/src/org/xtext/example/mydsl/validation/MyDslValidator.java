package org.xtext.example.mydsl.validation;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtext.validation.Check;
import org.xtext.example.mydsl.myDsl.ArrayValue;
import org.xtext.example.mydsl.myDsl.Field;
import org.xtext.example.mydsl.myDsl.FieldType;
import org.xtext.example.mydsl.myDsl.FieldValue;
import org.xtext.example.mydsl.myDsl.Literal;
import org.xtext.example.mydsl.myDsl.Model;
import org.xtext.example.mydsl.myDsl.MyDslPackage;
import org.xtext.example.mydsl.myDsl.NumberLiteral;
import org.xtext.example.mydsl.myDsl.PrimitiveType;
import org.xtext.example.mydsl.myDsl.RefType;
import org.xtext.example.mydsl.myDsl.SimpleType;
import org.xtext.example.mydsl.myDsl.StringLiteral;
import org.xtext.example.mydsl.myDsl.StructValue;
import org.xtext.example.mydsl.myDsl.TypeDef;
import org.xtext.example.mydsl.myDsl.UnionType;
import org.xtext.example.mydsl.myDsl.Value;
import org.xtext.example.mydsl.myDsl.VarDef;
import org.xtext.example.mydsl.myDsl.VarRef;

/**
 * This class contains custom validation rules.
 *
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
public class MyDslValidator extends AbstractMyDslValidator {

    public static final String DUPLICATE_NAME = "org.xtext.example.mydsl.DuplicateName";
    public static final String TYPE_MISMATCH = "org.xtext.example.mydsl.TypeMismatch";
    public static final String MISSING_FIELD = "org.xtext.example.mydsl.MissingField";
    public static final String EXTRA_FIELD = "org.xtext.example.mydsl.ExtraField";
    
    /**
     * Check if there are defined duplicated types
     * @param model
     */
    @Check
    public void checkUniqueTypeDefNames(Model model) {
        Set<String> names = new HashSet<>();
        for (TypeDef typeDef : model.getTypes()) {
        	//  if type is not null and has already been added before (i.e., it's a duplicate)
            if (typeDef.getName() != null && !names.add(typeDef.getName())) {
                error("Type '" + typeDef.getName() + "' is already defined.",
                      typeDef,
                      MyDslPackage.Literals.TYPE_DEF__NAME,
                      DUPLICATE_NAME);
            }
        }
    }
    /**
     * check the given value for a variable
     * @param varDef
     */
    @Check
    public void checkFieldValueTypes(VarDef varDef) {
        // Get the type definition that this variable refers to, e.g., MissionTypes
        TypeDef expectedType = varDef.getType();

        // Get the actual struct value assigned to the variable
        StructValue structValue = varDef.getValue();

        // If either type or value is missing, skip validation
        if (expectedType == null || structValue == null) return;

        // Build a map of expected field names to Field definitions for easy lookup
        Map<String, Field> fieldMap = expectedType.getFields().stream()
            .collect(Collectors.toMap(Field::getName, f -> f));

        // Loop through all field assignments in the variable's struct value
        for (FieldValue entry : structValue.getEntries()) {
            // Get the expected field definition for the current entry name
            Field expectedField = fieldMap.get(entry.getName());

            // If the field is not expected (not in the type definition), report error
            if (expectedField == null) {
                error("Unexpected field '" + entry.getName() + "'", entry, 
                    MyDslPackage.Literals.FIELD_VALUE__NAME, EXTRA_FIELD);
                continue;
            }

            // Get whether the expected field is an array and the union type definition
            boolean isArray = expectedField.getType().isArray();
            UnionType unionType = expectedField.getType().getUnion();

            // If the expected field is an array and value is an array, validate each element
            if (isArray && entry.getValue() instanceof ArrayValue) {
                for (Value element : ((ArrayValue) entry.getValue()).getElements()) {
                    // Validate that each element in the array matches the expected union type
                    checkValueTypeMatches(unionType, element, entry);
                }
            } else {
                // If it's not an array, validate the value directly
                checkValueTypeMatches(unionType, entry.getValue(), entry);
            }
        }
    }

    /**
     * Helper function to check if a given value (literal, var ref, etc.) matches the expected union type
     * @param expectedUnion
     * @param value
     * @param context
     */
    private void checkValueTypeMatches(UnionType expectedUnion, Value value, FieldValue context) {
        // If the value is a reference to a variable (e.g., droneBeta)
        if (value instanceof VarRef) {
            VarDef ref = ((VarRef) value).getRef();

            if (ref != null) {
                // Get the actual type of the referenced variable (e.g., DroneTypes)
                TypeDef actualType = ref.getType();

                // Check if actual type is included in the union type (e.g., ConstraintTypes)
                boolean match = expectedUnion.getTypes().stream().anyMatch(
                    simple -> (simple instanceof RefType) &&
                              ((RefType) simple).getType() == actualType
                );

                // If it doesn't match, raise a type mismatch error
                if (!match) {
                    error(
                        "Type mismatch: expected one of " +
                        expectedUnion.getTypes().stream()
                            .map(t -> ((RefType) t).getType().getName())
                            .collect(Collectors.joining(" | ")) +
                        ", but got " + actualType.getName(),
                        context,
                        MyDslPackage.Literals.FIELD_VALUE__VALUE,
                        TYPE_MISMATCH
                    );
                }
            }
        }
        else if (value instanceof StringLiteral) {
            // Handle case where value is a string literal (e.g., "text")

            boolean match = expectedUnion.getTypes().stream().anyMatch(
                simple -> (simple instanceof PrimitiveType) &&
                          "string".equals(((PrimitiveType) simple).getValue())
            );

            if (!match) {
                error(
                    "Type mismatch: expected 'string' but got string literal.",
                    context,
                    MyDslPackage.Literals.FIELD_VALUE__VALUE,
                    TYPE_MISMATCH
                );
            }

        } else if (value instanceof NumberLiteral) {
            // Handle case where value is a number literal (e.g., 123)

            boolean match = expectedUnion.getTypes().stream().anyMatch(
                simple -> (simple instanceof PrimitiveType) &&
                          "number".equals(((PrimitiveType) simple).getValue())
            );

            if (!match) {
                error(
                    "Type mismatch: expected 'number' but got number literal.",
                    context,
                    MyDslPackage.Literals.FIELD_VALUE__VALUE,
                    TYPE_MISMATCH
                );
            }

        } else {
            // Optional: add other type checks like StructValue, etc.
            // For now, it is just warn about unknown types
            warning("Unhandled value type in type checking.", context, 
                MyDslPackage.Literals.FIELD_VALUE__VALUE);
        }
    }

}