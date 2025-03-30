package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.math.Div;
import dk.sdu.mmmi.mdsd.math.Exp;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.Parenthesis;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.Primary;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathGenerator extends AbstractGenerator {
  private static Map<String, Integer> variables = new HashMap<String, Integer>();

  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Map<String, Integer> allResults = MathGenerator.compute(IteratorExtensions.<MathExp>toList(Iterators.<MathExp>filter(resource.getAllContents(), MathExp.class)));
    this.displayPanel(allResults);
  }

  /**
   * Compute the value of a single MathExp object and any nested MathExp elements
   * Example:
   * val result = '''
   * var a = 40
   * var b = 40 + 2
   * var c = 40 + 5 - 10 - 8
   * var d = 40 + 2 * 4 + 80
   * var e = (40 + 2) * (4 + 80)
   * '''
   * This function will be able to calculate and return the result for each one. In case of the function does not handle nested MathExp, then it will only be able to calculate the value of the first one.
   */
  public static Map<String, Integer> compute(final MathExp math) {
    boolean _isEmpty = MathGenerator.variables.isEmpty();
    if (_isEmpty) {
      HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
      MathGenerator.variables = _hashMap;
    }
    final int value = MathGenerator.computeExp(math.getExp());
    MathGenerator.variables.put(math.getName(), Integer.valueOf(value));
    if (((math.getVars() != null) && (!math.getVars().isEmpty()))) {
      EList<MathExp> _vars = math.getVars();
      for (final MathExp varExp : _vars) {
        MathGenerator.compute(varExp);
      }
    }
    return MathGenerator.variables;
  }

  /**
   * Compute the value of multiple MathExp objects and any nested MathExp elements
   * Example:
   * val result = '''
   * var x = let y=10*8 in y+7 end '''
   */
  public static Map<String, Integer> compute(final Iterable<MathExp> mathExps) {
    HashMap<String, Integer> _hashMap = new HashMap<String, Integer>();
    MathGenerator.variables = _hashMap;
    for (final MathExp math : mathExps) {
      {
        final int value = MathGenerator.computeExp(math.getExp());
        MathGenerator.variables.put(math.getName(), Integer.valueOf(value));
        if (((math.getVars() != null) && (!math.getVars().isEmpty()))) {
          EList<MathExp> _vars = math.getVars();
          for (final MathExp varExp : _vars) {
            MathGenerator.compute(varExp);
          }
        }
      }
    }
    return MathGenerator.variables;
  }

  public static int computeExp(final Exp exp) {
    boolean _matched = false;
    if (exp instanceof dk.sdu.mmmi.mdsd.math.Number) {
      _matched=true;
      return ((dk.sdu.mmmi.mdsd.math.Number)exp).getValue();
    }
    if (!_matched) {
      if (exp instanceof VariableUse) {
        _matched=true;
        return (MathGenerator.variables.getOrDefault(((VariableUse)exp).getRef().getName(), Integer.valueOf(0))).intValue();
      }
    }
    if (!_matched) {
      if (exp instanceof Parenthesis) {
        _matched=true;
        return MathGenerator.computeExp(((Parenthesis)exp).getExp());
      }
    }
    if (!_matched) {
      if (exp instanceof Plus) {
        _matched=true;
        int _computeExp = MathGenerator.computeExp(((Plus)exp).getLeft());
        int _computeExp_1 = MathGenerator.computeExp(((Plus)exp).getRight());
        return (_computeExp + _computeExp_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        int _computeExp = MathGenerator.computeExp(((Minus)exp).getLeft());
        int _computeExp_1 = MathGenerator.computeExp(((Minus)exp).getRight());
        return (_computeExp - _computeExp_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Mult) {
        _matched=true;
        int _computeExp = MathGenerator.computeExp(((Mult)exp).getLeft());
        int _computeExp_1 = MathGenerator.computeExp(((Mult)exp).getRight());
        return (_computeExp * _computeExp_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Div) {
        _matched=true;
        final int right = MathGenerator.computeExp(((Div)exp).getRight());
        if ((right == 0)) {
          throw new ArithmeticException("Division by zero");
        }
        int _computeExp = MathGenerator.computeExp(((Div)exp).getLeft());
        return (_computeExp / right);
      }
    }
    throw new UnsupportedOperationException(("Unknown expression type: " + exp));
  }

  public static int computePrim(final Primary factor) {
    return 87;
  }

  public void displayPanel(final Map<String, Integer> result) {
    String resultString = "";
    Set<Map.Entry<String, Integer>> _entrySet = result.entrySet();
    for (final Map.Entry<String, Integer> entry : _entrySet) {
      String _resultString = resultString;
      String _key = entry.getKey();
      String _plus = ("var " + _key);
      String _plus_1 = (_plus + " = ");
      Integer _value = entry.getValue();
      String _plus_2 = (_plus_1 + _value);
      String _plus_3 = (_plus_2 + "\n");
      resultString = (_resultString + _plus_3);
    }
    JOptionPane.showMessageDialog(null, resultString, "Math Language", JOptionPane.INFORMATION_MESSAGE);
  }
}
