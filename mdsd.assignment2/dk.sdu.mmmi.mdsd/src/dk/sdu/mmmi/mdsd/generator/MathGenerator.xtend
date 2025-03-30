package dk.sdu.mmmi.mdsd.generator
import dk.sdu.mmmi.mdsd.math.Div
import dk.sdu.mmmi.mdsd.math.Exp
import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Mult
import dk.sdu.mmmi.mdsd.math.Number
import dk.sdu.mmmi.mdsd.math.VariableUse
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.Parenthesis
import dk.sdu.mmmi.mdsd.math.Primary
import java.util.HashMap
import java.util.Map
import javax.swing.JOptionPane
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {
	static Map<String, Integer> variables = new HashMap();
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        val allResults = resource.allContents.filter(MathExp).toList.compute
        displayPanel(allResults)
    }
	/*
	 * Compute the value of a single MathExp object and any nested MathExp elements
	 * Example:
	 * val result = '''
			var a = 40
			var b = 40 + 2
			var c = 40 + 5 - 10 - 8
			var d = 40 + 2 * 4 + 80
			var e = (40 + 2) * (4 + 80)
		'''
	 * This function will be able to calculate and return the result for each one. In case of the function does not handle nested MathExp, then it will only be able to calculate the value of the first one.
	 */
	def static Map<String, Integer> compute(MathExp math) {
        // Create a new map if we're starting with a top-level MathExp
        if (variables.empty) {
            variables = new HashMap<String, Integer>()
        }
        
        // Check the expression stored in math.exp and store the result. 
        val value = computeExp(math.exp)
        variables.put(math.name, value)
        
        // Recursively process nested MathExp elements
        if (math.vars !== null && !math.vars.empty) {
            for (MathExp varExp : math.vars) {
                compute(varExp) // Recursively call compute
            }
        }
        
        return variables
    }
    
    /*                                                                                  
     * Compute the value of multiple MathExp objects and any nested MathExp elements    
     * Example:                                                                         
     * val result = '''                                                                 
     * var x = let y=10*8 in y+7 end '''                                                
     */			                                                                              
    def static Map<String, Integer> compute(Iterable<MathExp> mathExps) {
        variables = new HashMap<String, Integer>() // Reset variables
        
        // Loops through each MathExp in the provided list mathExps 
        for (MathExp math : mathExps) {
            val value = computeExp(math.exp)
            variables.put(math.name, value)
            
            if (math.vars !== null && !math.vars.empty) {
                for (MathExp varExp : math.vars) {
                    compute(varExp)
                }
            }
        }
        
        return variables
    }
	
	def static int computeExp(Exp exp) {
		switch (exp) {
		    // Basic number
		    Number: 
		        return exp.value
		    // Variable reference
		    VariableUse: 
		        return variables.getOrDefault(exp.getRef().getName(), 0)
		    // Expression in parentheses
		    Parenthesis: 
		        return computeExp(exp.exp)
		    // Addition operation
		    Plus: 
		        return computeExp(exp.left) + computeExp(exp.right)
		    // Subtraction operation
		    Minus: 
		        return computeExp(exp.left) - computeExp(exp.right)
		    // Multiplication operation
		    Mult: 
		        return computeExp(exp.left) * computeExp(exp.right)
		    // Division operation
		    Div: {
		        val right = computeExp(exp.right)
		        if (right == 0) throw new ArithmeticException("Division by zero")
		        return computeExp(exp.left) / right
		    }
		    // Unknown expression type
		    default:
		        throw new UnsupportedOperationException("Unknown expression type: " + exp)
		}
	}
	
	def static int computePrim(Primary factor) { 
		87
	}
	
	def void displayPanel(Map<String, Integer> result) {
		var resultString = ""
		for (entry : result.entrySet()) {
         	resultString += "var " + entry.key + " = " + entry.value + "\n"
        }
		
		JOptionPane.showMessageDialog(null, resultString, "Math Language", JOptionPane.INFORMATION_MESSAGE)
	}
}