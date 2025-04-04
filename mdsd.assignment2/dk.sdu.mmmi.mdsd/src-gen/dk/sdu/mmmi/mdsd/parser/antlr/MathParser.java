/*
 * generated by Xtext 2.38.0
 */
package dk.sdu.mmmi.mdsd.parser.antlr;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.parser.antlr.internal.InternalMathParser;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class MathParser extends AbstractAntlrParser {

	@Inject
	private MathGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalMathParser createParser(XtextTokenStream stream) {
		return new InternalMathParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "MathExp";
	}

	public MathGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
