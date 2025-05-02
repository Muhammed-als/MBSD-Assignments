package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'"
    };
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_STRING=6;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int RULE_INT=5;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }


    	private MathGrammarAccess grammarAccess;

    	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleMathExp EOF )
            // InternalMath.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:62:1: ruleMathExp : ( ( rule__MathExp__Group__0 ) ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__MathExp__Group__0 ) ) )
            // InternalMath.g:67:2: ( ( rule__MathExp__Group__0 ) )
            {
            // InternalMath.g:67:2: ( ( rule__MathExp__Group__0 ) )
            // InternalMath.g:68:3: ( rule__MathExp__Group__0 )
            {
             before(grammarAccess.getMathExpAccess().getGroup()); 
            // InternalMath.g:69:3: ( rule__MathExp__Group__0 )
            // InternalMath.g:69:4: rule__MathExp__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:78:1: entryRuleExp : ruleExp EOF ;
    public final void entryRuleExp() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleExp EOF )
            // InternalMath.g:80:1: ruleExp EOF
            {
             before(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getExpRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:87:1: ruleExp : ( ruleAddition ) ;
    public final void ruleExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ruleAddition ) )
            // InternalMath.g:92:2: ( ruleAddition )
            {
            // InternalMath.g:92:2: ( ruleAddition )
            // InternalMath.g:93:3: ruleAddition
            {
             before(grammarAccess.getExpAccess().getAdditionParserRuleCall()); 
            pushFollow(FOLLOW_2);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getExpAccess().getAdditionParserRuleCall()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleAddition"
    // InternalMath.g:103:1: entryRuleAddition : ruleAddition EOF ;
    public final void entryRuleAddition() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleAddition EOF )
            // InternalMath.g:105:1: ruleAddition EOF
            {
             before(grammarAccess.getAdditionRule()); 
            pushFollow(FOLLOW_1);
            ruleAddition();

            state._fsp--;

             after(grammarAccess.getAdditionRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAddition"


    // $ANTLR start "ruleAddition"
    // InternalMath.g:112:1: ruleAddition : ( ( rule__Addition__Group__0 ) ) ;
    public final void ruleAddition() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( ( rule__Addition__Group__0 ) ) )
            // InternalMath.g:117:2: ( ( rule__Addition__Group__0 ) )
            {
            // InternalMath.g:117:2: ( ( rule__Addition__Group__0 ) )
            // InternalMath.g:118:3: ( rule__Addition__Group__0 )
            {
             before(grammarAccess.getAdditionAccess().getGroup()); 
            // InternalMath.g:119:3: ( rule__Addition__Group__0 )
            // InternalMath.g:119:4: rule__Addition__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAddition"


    // $ANTLR start "entryRuleMultiplication"
    // InternalMath.g:128:1: entryRuleMultiplication : ruleMultiplication EOF ;
    public final void entryRuleMultiplication() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( ruleMultiplication EOF )
            // InternalMath.g:130:1: ruleMultiplication EOF
            {
             before(grammarAccess.getMultiplicationRule()); 
            pushFollow(FOLLOW_1);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getMultiplicationRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleMultiplication"


    // $ANTLR start "ruleMultiplication"
    // InternalMath.g:137:1: ruleMultiplication : ( ( rule__Multiplication__Group__0 ) ) ;
    public final void ruleMultiplication() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__Multiplication__Group__0 ) ) )
            // InternalMath.g:142:2: ( ( rule__Multiplication__Group__0 ) )
            {
            // InternalMath.g:142:2: ( ( rule__Multiplication__Group__0 ) )
            // InternalMath.g:143:3: ( rule__Multiplication__Group__0 )
            {
             before(grammarAccess.getMultiplicationAccess().getGroup()); 
            // InternalMath.g:144:3: ( rule__Multiplication__Group__0 )
            // InternalMath.g:144:4: rule__Multiplication__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMultiplication"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:153:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( rulePrimary EOF )
            // InternalMath.g:155:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:162:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMath.g:167:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMath.g:167:2: ( ( rule__Primary__Alternatives ) )
            // InternalMath.g:168:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMath.g:169:3: ( rule__Primary__Alternatives )
            // InternalMath.g:169:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleParenthesis"
    // InternalMath.g:178:1: entryRuleParenthesis : ruleParenthesis EOF ;
    public final void entryRuleParenthesis() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( ruleParenthesis EOF )
            // InternalMath.g:180:1: ruleParenthesis EOF
            {
             before(grammarAccess.getParenthesisRule()); 
            pushFollow(FOLLOW_1);
            ruleParenthesis();

            state._fsp--;

             after(grammarAccess.getParenthesisRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleParenthesis"


    // $ANTLR start "ruleParenthesis"
    // InternalMath.g:187:1: ruleParenthesis : ( ( rule__Parenthesis__Group__0 ) ) ;
    public final void ruleParenthesis() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__Parenthesis__Group__0 ) ) )
            // InternalMath.g:192:2: ( ( rule__Parenthesis__Group__0 ) )
            {
            // InternalMath.g:192:2: ( ( rule__Parenthesis__Group__0 ) )
            // InternalMath.g:193:3: ( rule__Parenthesis__Group__0 )
            {
             before(grammarAccess.getParenthesisAccess().getGroup()); 
            // InternalMath.g:194:3: ( rule__Parenthesis__Group__0 )
            // InternalMath.g:194:4: rule__Parenthesis__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleParenthesis"


    // $ANTLR start "entryRuleNumber"
    // InternalMath.g:203:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
        try {
            // InternalMath.g:204:1: ( ruleNumber EOF )
            // InternalMath.g:205:1: ruleNumber EOF
            {
             before(grammarAccess.getNumberRule()); 
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;

             after(grammarAccess.getNumberRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalMath.g:212:1: ruleNumber : ( ( rule__Number__ValueAssignment ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:216:2: ( ( ( rule__Number__ValueAssignment ) ) )
            // InternalMath.g:217:2: ( ( rule__Number__ValueAssignment ) )
            {
            // InternalMath.g:217:2: ( ( rule__Number__ValueAssignment ) )
            // InternalMath.g:218:3: ( rule__Number__ValueAssignment )
            {
             before(grammarAccess.getNumberAccess().getValueAssignment()); 
            // InternalMath.g:219:3: ( rule__Number__ValueAssignment )
            // InternalMath.g:219:4: rule__Number__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__Number__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberAccess().getValueAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:228:1: entryRuleVariableUse : ruleVariableUse EOF ;
    public final void entryRuleVariableUse() throws RecognitionException {
        try {
            // InternalMath.g:229:1: ( ruleVariableUse EOF )
            // InternalMath.g:230:1: ruleVariableUse EOF
            {
             before(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            ruleVariableUse();

            state._fsp--;

             after(grammarAccess.getVariableUseRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:237:1: ruleVariableUse : ( ( rule__VariableUse__RefAssignment ) ) ;
    public final void ruleVariableUse() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:241:2: ( ( ( rule__VariableUse__RefAssignment ) ) )
            // InternalMath.g:242:2: ( ( rule__VariableUse__RefAssignment ) )
            {
            // InternalMath.g:242:2: ( ( rule__VariableUse__RefAssignment ) )
            // InternalMath.g:243:3: ( rule__VariableUse__RefAssignment )
            {
             before(grammarAccess.getVariableUseAccess().getRefAssignment()); 
            // InternalMath.g:244:3: ( rule__VariableUse__RefAssignment )
            // InternalMath.g:244:4: rule__VariableUse__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VariableUse__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVariableUseAccess().getRefAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVariableUse"


    // $ANTLR start "rule__Addition__Alternatives_1"
    // InternalMath.g:252:1: rule__Addition__Alternatives_1 : ( ( ( rule__Addition__Group_1_0__0 ) ) | ( ( rule__Addition__Group_1_1__0 ) ) );
    public final void rule__Addition__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:256:1: ( ( ( rule__Addition__Group_1_0__0 ) ) | ( ( rule__Addition__Group_1_1__0 ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            else if ( (LA1_0==14) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMath.g:257:2: ( ( rule__Addition__Group_1_0__0 ) )
                    {
                    // InternalMath.g:257:2: ( ( rule__Addition__Group_1_0__0 ) )
                    // InternalMath.g:258:3: ( rule__Addition__Group_1_0__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_0()); 
                    // InternalMath.g:259:3: ( rule__Addition__Group_1_0__0 )
                    // InternalMath.g:259:4: rule__Addition__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:263:2: ( ( rule__Addition__Group_1_1__0 ) )
                    {
                    // InternalMath.g:263:2: ( ( rule__Addition__Group_1_1__0 ) )
                    // InternalMath.g:264:3: ( rule__Addition__Group_1_1__0 )
                    {
                     before(grammarAccess.getAdditionAccess().getGroup_1_1()); 
                    // InternalMath.g:265:3: ( rule__Addition__Group_1_1__0 )
                    // InternalMath.g:265:4: rule__Addition__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Addition__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAdditionAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Alternatives_1"


    // $ANTLR start "rule__Multiplication__Alternatives_1"
    // InternalMath.g:273:1: rule__Multiplication__Alternatives_1 : ( ( ( rule__Multiplication__Group_1_0__0 ) ) | ( ( rule__Multiplication__Group_1_1__0 ) ) );
    public final void rule__Multiplication__Alternatives_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:277:1: ( ( ( rule__Multiplication__Group_1_0__0 ) ) | ( ( rule__Multiplication__Group_1_1__0 ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==15) ) {
                alt2=1;
            }
            else if ( (LA2_0==16) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:278:2: ( ( rule__Multiplication__Group_1_0__0 ) )
                    {
                    // InternalMath.g:278:2: ( ( rule__Multiplication__Group_1_0__0 ) )
                    // InternalMath.g:279:3: ( rule__Multiplication__Group_1_0__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 
                    // InternalMath.g:280:3: ( rule__Multiplication__Group_1_0__0 )
                    // InternalMath.g:280:4: rule__Multiplication__Group_1_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:284:2: ( ( rule__Multiplication__Group_1_1__0 ) )
                    {
                    // InternalMath.g:284:2: ( ( rule__Multiplication__Group_1_1__0 ) )
                    // InternalMath.g:285:3: ( rule__Multiplication__Group_1_1__0 )
                    {
                     before(grammarAccess.getMultiplicationAccess().getGroup_1_1()); 
                    // InternalMath.g:286:3: ( rule__Multiplication__Group_1_1__0 )
                    // InternalMath.g:286:4: rule__Multiplication__Group_1_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Multiplication__Group_1_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getMultiplicationAccess().getGroup_1_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Alternatives_1"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMath.g:294:1: rule__Primary__Alternatives : ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableUse ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:298:1: ( ( ruleNumber ) | ( ruleParenthesis ) | ( ruleVariableUse ) )
            int alt3=3;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case 17:
                {
                alt3=2;
                }
                break;
            case RULE_ID:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMath.g:299:2: ( ruleNumber )
                    {
                    // InternalMath.g:299:2: ( ruleNumber )
                    // InternalMath.g:300:3: ruleNumber
                    {
                     before(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleNumber();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getNumberParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:305:2: ( ruleParenthesis )
                    {
                    // InternalMath.g:305:2: ( ruleParenthesis )
                    // InternalMath.g:306:3: ruleParenthesis
                    {
                     before(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleParenthesis();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getParenthesisParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:311:2: ( ruleVariableUse )
                    {
                    // InternalMath.g:311:2: ( ruleVariableUse )
                    // InternalMath.g:312:3: ruleVariableUse
                    {
                     before(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleVariableUse();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__MathExp__Group__0"
    // InternalMath.g:321:1: rule__MathExp__Group__0 : rule__MathExp__Group__0__Impl rule__MathExp__Group__1 ;
    public final void rule__MathExp__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:325:1: ( rule__MathExp__Group__0__Impl rule__MathExp__Group__1 )
            // InternalMath.g:326:2: rule__MathExp__Group__0__Impl rule__MathExp__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__MathExp__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__0"


    // $ANTLR start "rule__MathExp__Group__0__Impl"
    // InternalMath.g:333:1: rule__MathExp__Group__0__Impl : ( 'var' ) ;
    public final void rule__MathExp__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:337:1: ( ( 'var' ) )
            // InternalMath.g:338:1: ( 'var' )
            {
            // InternalMath.g:338:1: ( 'var' )
            // InternalMath.g:339:2: 'var'
            {
             before(grammarAccess.getMathExpAccess().getVarKeyword_0()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getVarKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__0__Impl"


    // $ANTLR start "rule__MathExp__Group__1"
    // InternalMath.g:348:1: rule__MathExp__Group__1 : rule__MathExp__Group__1__Impl rule__MathExp__Group__2 ;
    public final void rule__MathExp__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:352:1: ( rule__MathExp__Group__1__Impl rule__MathExp__Group__2 )
            // InternalMath.g:353:2: rule__MathExp__Group__1__Impl rule__MathExp__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__MathExp__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__1"


    // $ANTLR start "rule__MathExp__Group__1__Impl"
    // InternalMath.g:360:1: rule__MathExp__Group__1__Impl : ( ( rule__MathExp__NameAssignment_1 ) ) ;
    public final void rule__MathExp__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:364:1: ( ( ( rule__MathExp__NameAssignment_1 ) ) )
            // InternalMath.g:365:1: ( ( rule__MathExp__NameAssignment_1 ) )
            {
            // InternalMath.g:365:1: ( ( rule__MathExp__NameAssignment_1 ) )
            // InternalMath.g:366:2: ( rule__MathExp__NameAssignment_1 )
            {
             before(grammarAccess.getMathExpAccess().getNameAssignment_1()); 
            // InternalMath.g:367:2: ( rule__MathExp__NameAssignment_1 )
            // InternalMath.g:367:3: rule__MathExp__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__1__Impl"


    // $ANTLR start "rule__MathExp__Group__2"
    // InternalMath.g:375:1: rule__MathExp__Group__2 : rule__MathExp__Group__2__Impl rule__MathExp__Group__3 ;
    public final void rule__MathExp__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:379:1: ( rule__MathExp__Group__2__Impl rule__MathExp__Group__3 )
            // InternalMath.g:380:2: rule__MathExp__Group__2__Impl rule__MathExp__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__MathExp__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__2"


    // $ANTLR start "rule__MathExp__Group__2__Impl"
    // InternalMath.g:387:1: rule__MathExp__Group__2__Impl : ( '=' ) ;
    public final void rule__MathExp__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:391:1: ( ( '=' ) )
            // InternalMath.g:392:1: ( '=' )
            {
            // InternalMath.g:392:1: ( '=' )
            // InternalMath.g:393:2: '='
            {
             before(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getEqualsSignKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__2__Impl"


    // $ANTLR start "rule__MathExp__Group__3"
    // InternalMath.g:402:1: rule__MathExp__Group__3 : rule__MathExp__Group__3__Impl rule__MathExp__Group__4 ;
    public final void rule__MathExp__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:406:1: ( rule__MathExp__Group__3__Impl rule__MathExp__Group__4 )
            // InternalMath.g:407:2: rule__MathExp__Group__3__Impl rule__MathExp__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__MathExp__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MathExp__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__3"


    // $ANTLR start "rule__MathExp__Group__3__Impl"
    // InternalMath.g:414:1: rule__MathExp__Group__3__Impl : ( ( rule__MathExp__ExpAssignment_3 ) ) ;
    public final void rule__MathExp__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:418:1: ( ( ( rule__MathExp__ExpAssignment_3 ) ) )
            // InternalMath.g:419:1: ( ( rule__MathExp__ExpAssignment_3 ) )
            {
            // InternalMath.g:419:1: ( ( rule__MathExp__ExpAssignment_3 ) )
            // InternalMath.g:420:2: ( rule__MathExp__ExpAssignment_3 )
            {
             before(grammarAccess.getMathExpAccess().getExpAssignment_3()); 
            // InternalMath.g:421:2: ( rule__MathExp__ExpAssignment_3 )
            // InternalMath.g:421:3: rule__MathExp__ExpAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__ExpAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getMathExpAccess().getExpAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__3__Impl"


    // $ANTLR start "rule__MathExp__Group__4"
    // InternalMath.g:429:1: rule__MathExp__Group__4 : rule__MathExp__Group__4__Impl ;
    public final void rule__MathExp__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:433:1: ( rule__MathExp__Group__4__Impl )
            // InternalMath.g:434:2: rule__MathExp__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MathExp__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__4"


    // $ANTLR start "rule__MathExp__Group__4__Impl"
    // InternalMath.g:440:1: rule__MathExp__Group__4__Impl : ( ( rule__MathExp__VarsAssignment_4 )* ) ;
    public final void rule__MathExp__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:444:1: ( ( ( rule__MathExp__VarsAssignment_4 )* ) )
            // InternalMath.g:445:1: ( ( rule__MathExp__VarsAssignment_4 )* )
            {
            // InternalMath.g:445:1: ( ( rule__MathExp__VarsAssignment_4 )* )
            // InternalMath.g:446:2: ( rule__MathExp__VarsAssignment_4 )*
            {
             before(grammarAccess.getMathExpAccess().getVarsAssignment_4()); 
            // InternalMath.g:447:2: ( rule__MathExp__VarsAssignment_4 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==11) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalMath.g:447:3: rule__MathExp__VarsAssignment_4
            	    {
            	    pushFollow(FOLLOW_7);
            	    rule__MathExp__VarsAssignment_4();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getMathExpAccess().getVarsAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__Group__4__Impl"


    // $ANTLR start "rule__Addition__Group__0"
    // InternalMath.g:456:1: rule__Addition__Group__0 : rule__Addition__Group__0__Impl rule__Addition__Group__1 ;
    public final void rule__Addition__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:460:1: ( rule__Addition__Group__0__Impl rule__Addition__Group__1 )
            // InternalMath.g:461:2: rule__Addition__Group__0__Impl rule__Addition__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__Addition__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0"


    // $ANTLR start "rule__Addition__Group__0__Impl"
    // InternalMath.g:468:1: rule__Addition__Group__0__Impl : ( ruleMultiplication ) ;
    public final void rule__Addition__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:472:1: ( ( ruleMultiplication ) )
            // InternalMath.g:473:1: ( ruleMultiplication )
            {
            // InternalMath.g:473:1: ( ruleMultiplication )
            // InternalMath.g:474:2: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getMultiplicationParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__0__Impl"


    // $ANTLR start "rule__Addition__Group__1"
    // InternalMath.g:483:1: rule__Addition__Group__1 : rule__Addition__Group__1__Impl ;
    public final void rule__Addition__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:487:1: ( rule__Addition__Group__1__Impl )
            // InternalMath.g:488:2: rule__Addition__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1"


    // $ANTLR start "rule__Addition__Group__1__Impl"
    // InternalMath.g:494:1: rule__Addition__Group__1__Impl : ( ( rule__Addition__Alternatives_1 )* ) ;
    public final void rule__Addition__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:498:1: ( ( ( rule__Addition__Alternatives_1 )* ) )
            // InternalMath.g:499:1: ( ( rule__Addition__Alternatives_1 )* )
            {
            // InternalMath.g:499:1: ( ( rule__Addition__Alternatives_1 )* )
            // InternalMath.g:500:2: ( rule__Addition__Alternatives_1 )*
            {
             before(grammarAccess.getAdditionAccess().getAlternatives_1()); 
            // InternalMath.g:501:2: ( rule__Addition__Alternatives_1 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=13 && LA5_0<=14)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMath.g:501:3: rule__Addition__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Addition__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAdditionAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0__0"
    // InternalMath.g:510:1: rule__Addition__Group_1_0__0 : rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 ;
    public final void rule__Addition__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:514:1: ( rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1 )
            // InternalMath.g:515:2: rule__Addition__Group_1_0__0__Impl rule__Addition__Group_1_0__1
            {
            pushFollow(FOLLOW_10);
            rule__Addition__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__0"


    // $ANTLR start "rule__Addition__Group_1_0__0__Impl"
    // InternalMath.g:522:1: rule__Addition__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:526:1: ( ( () ) )
            // InternalMath.g:527:1: ( () )
            {
            // InternalMath.g:527:1: ( () )
            // InternalMath.g:528:2: ()
            {
             before(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0()); 
            // InternalMath.g:529:2: ()
            // InternalMath.g:529:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getPlusLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_0__1"
    // InternalMath.g:537:1: rule__Addition__Group_1_0__1 : rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 ;
    public final void rule__Addition__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:541:1: ( rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2 )
            // InternalMath.g:542:2: rule__Addition__Group_1_0__1__Impl rule__Addition__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Addition__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__1"


    // $ANTLR start "rule__Addition__Group_1_0__1__Impl"
    // InternalMath.g:549:1: rule__Addition__Group_1_0__1__Impl : ( '+' ) ;
    public final void rule__Addition__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:553:1: ( ( '+' ) )
            // InternalMath.g:554:1: ( '+' )
            {
            // InternalMath.g:554:1: ( '+' )
            // InternalMath.g:555:2: '+'
            {
             before(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_1()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getPlusSignKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_0__2"
    // InternalMath.g:564:1: rule__Addition__Group_1_0__2 : rule__Addition__Group_1_0__2__Impl ;
    public final void rule__Addition__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:568:1: ( rule__Addition__Group_1_0__2__Impl )
            // InternalMath.g:569:2: rule__Addition__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__2"


    // $ANTLR start "rule__Addition__Group_1_0__2__Impl"
    // InternalMath.g:575:1: rule__Addition__Group_1_0__2__Impl : ( ( rule__Addition__RightAssignment_1_0_2 ) ) ;
    public final void rule__Addition__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:579:1: ( ( ( rule__Addition__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:580:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:580:1: ( ( rule__Addition__RightAssignment_1_0_2 ) )
            // InternalMath.g:581:2: ( rule__Addition__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:582:2: ( rule__Addition__RightAssignment_1_0_2 )
            // InternalMath.g:582:3: rule__Addition__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_0__2__Impl"


    // $ANTLR start "rule__Addition__Group_1_1__0"
    // InternalMath.g:591:1: rule__Addition__Group_1_1__0 : rule__Addition__Group_1_1__0__Impl rule__Addition__Group_1_1__1 ;
    public final void rule__Addition__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:595:1: ( rule__Addition__Group_1_1__0__Impl rule__Addition__Group_1_1__1 )
            // InternalMath.g:596:2: rule__Addition__Group_1_1__0__Impl rule__Addition__Group_1_1__1
            {
            pushFollow(FOLLOW_8);
            rule__Addition__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_1__0"


    // $ANTLR start "rule__Addition__Group_1_1__0__Impl"
    // InternalMath.g:603:1: rule__Addition__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Addition__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:607:1: ( ( () ) )
            // InternalMath.g:608:1: ( () )
            {
            // InternalMath.g:608:1: ( () )
            // InternalMath.g:609:2: ()
            {
             before(grammarAccess.getAdditionAccess().getMinusLeftAction_1_1_0()); 
            // InternalMath.g:610:2: ()
            // InternalMath.g:610:3: 
            {
            }

             after(grammarAccess.getAdditionAccess().getMinusLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_1__0__Impl"


    // $ANTLR start "rule__Addition__Group_1_1__1"
    // InternalMath.g:618:1: rule__Addition__Group_1_1__1 : rule__Addition__Group_1_1__1__Impl rule__Addition__Group_1_1__2 ;
    public final void rule__Addition__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:622:1: ( rule__Addition__Group_1_1__1__Impl rule__Addition__Group_1_1__2 )
            // InternalMath.g:623:2: rule__Addition__Group_1_1__1__Impl rule__Addition__Group_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Addition__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_1__1"


    // $ANTLR start "rule__Addition__Group_1_1__1__Impl"
    // InternalMath.g:630:1: rule__Addition__Group_1_1__1__Impl : ( '-' ) ;
    public final void rule__Addition__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:634:1: ( ( '-' ) )
            // InternalMath.g:635:1: ( '-' )
            {
            // InternalMath.g:635:1: ( '-' )
            // InternalMath.g:636:2: '-'
            {
             before(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getAdditionAccess().getHyphenMinusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_1__1__Impl"


    // $ANTLR start "rule__Addition__Group_1_1__2"
    // InternalMath.g:645:1: rule__Addition__Group_1_1__2 : rule__Addition__Group_1_1__2__Impl ;
    public final void rule__Addition__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:649:1: ( rule__Addition__Group_1_1__2__Impl )
            // InternalMath.g:650:2: rule__Addition__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Addition__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_1__2"


    // $ANTLR start "rule__Addition__Group_1_1__2__Impl"
    // InternalMath.g:656:1: rule__Addition__Group_1_1__2__Impl : ( ( rule__Addition__RightAssignment_1_1_2 ) ) ;
    public final void rule__Addition__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:660:1: ( ( ( rule__Addition__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:661:1: ( ( rule__Addition__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:661:1: ( ( rule__Addition__RightAssignment_1_1_2 ) )
            // InternalMath.g:662:2: ( rule__Addition__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getAdditionAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:663:2: ( rule__Addition__RightAssignment_1_1_2 )
            // InternalMath.g:663:3: rule__Addition__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Addition__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getAdditionAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__Group_1_1__2__Impl"


    // $ANTLR start "rule__Multiplication__Group__0"
    // InternalMath.g:672:1: rule__Multiplication__Group__0 : rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 ;
    public final void rule__Multiplication__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:676:1: ( rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1 )
            // InternalMath.g:677:2: rule__Multiplication__Group__0__Impl rule__Multiplication__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Multiplication__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0"


    // $ANTLR start "rule__Multiplication__Group__0__Impl"
    // InternalMath.g:684:1: rule__Multiplication__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__Multiplication__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:688:1: ( ( rulePrimary ) )
            // InternalMath.g:689:1: ( rulePrimary )
            {
            // InternalMath.g:689:1: ( rulePrimary )
            // InternalMath.g:690:2: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getPrimaryParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__0__Impl"


    // $ANTLR start "rule__Multiplication__Group__1"
    // InternalMath.g:699:1: rule__Multiplication__Group__1 : rule__Multiplication__Group__1__Impl ;
    public final void rule__Multiplication__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:703:1: ( rule__Multiplication__Group__1__Impl )
            // InternalMath.g:704:2: rule__Multiplication__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1"


    // $ANTLR start "rule__Multiplication__Group__1__Impl"
    // InternalMath.g:710:1: rule__Multiplication__Group__1__Impl : ( ( rule__Multiplication__Alternatives_1 )* ) ;
    public final void rule__Multiplication__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:714:1: ( ( ( rule__Multiplication__Alternatives_1 )* ) )
            // InternalMath.g:715:1: ( ( rule__Multiplication__Alternatives_1 )* )
            {
            // InternalMath.g:715:1: ( ( rule__Multiplication__Alternatives_1 )* )
            // InternalMath.g:716:2: ( rule__Multiplication__Alternatives_1 )*
            {
             before(grammarAccess.getMultiplicationAccess().getAlternatives_1()); 
            // InternalMath.g:717:2: ( rule__Multiplication__Alternatives_1 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=15 && LA6_0<=16)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMath.g:717:3: rule__Multiplication__Alternatives_1
            	    {
            	    pushFollow(FOLLOW_12);
            	    rule__Multiplication__Alternatives_1();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getMultiplicationAccess().getAlternatives_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0__0"
    // InternalMath.g:726:1: rule__Multiplication__Group_1_0__0 : rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 ;
    public final void rule__Multiplication__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:730:1: ( rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1 )
            // InternalMath.g:731:2: rule__Multiplication__Group_1_0__0__Impl rule__Multiplication__Group_1_0__1
            {
            pushFollow(FOLLOW_13);
            rule__Multiplication__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__0"


    // $ANTLR start "rule__Multiplication__Group_1_0__0__Impl"
    // InternalMath.g:738:1: rule__Multiplication__Group_1_0__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:742:1: ( ( () ) )
            // InternalMath.g:743:1: ( () )
            {
            // InternalMath.g:743:1: ( () )
            // InternalMath.g:744:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getMultLeftAction_1_0_0()); 
            // InternalMath.g:745:2: ()
            // InternalMath.g:745:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getMultLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0__1"
    // InternalMath.g:753:1: rule__Multiplication__Group_1_0__1 : rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 ;
    public final void rule__Multiplication__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:757:1: ( rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2 )
            // InternalMath.g:758:2: rule__Multiplication__Group_1_0__1__Impl rule__Multiplication__Group_1_0__2
            {
            pushFollow(FOLLOW_5);
            rule__Multiplication__Group_1_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__1"


    // $ANTLR start "rule__Multiplication__Group_1_0__1__Impl"
    // InternalMath.g:765:1: rule__Multiplication__Group_1_0__1__Impl : ( '*' ) ;
    public final void rule__Multiplication__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:769:1: ( ( '*' ) )
            // InternalMath.g:770:1: ( '*' )
            {
            // InternalMath.g:770:1: ( '*' )
            // InternalMath.g:771:2: '*'
            {
             before(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getAsteriskKeyword_1_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_0__2"
    // InternalMath.g:780:1: rule__Multiplication__Group_1_0__2 : rule__Multiplication__Group_1_0__2__Impl ;
    public final void rule__Multiplication__Group_1_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:784:1: ( rule__Multiplication__Group_1_0__2__Impl )
            // InternalMath.g:785:2: rule__Multiplication__Group_1_0__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__2"


    // $ANTLR start "rule__Multiplication__Group_1_0__2__Impl"
    // InternalMath.g:791:1: rule__Multiplication__Group_1_0__2__Impl : ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) ;
    public final void rule__Multiplication__Group_1_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:795:1: ( ( ( rule__Multiplication__RightAssignment_1_0_2 ) ) )
            // InternalMath.g:796:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            {
            // InternalMath.g:796:1: ( ( rule__Multiplication__RightAssignment_1_0_2 ) )
            // InternalMath.g:797:2: ( rule__Multiplication__RightAssignment_1_0_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_0_2()); 
            // InternalMath.g:798:2: ( rule__Multiplication__RightAssignment_1_0_2 )
            // InternalMath.g:798:3: rule__Multiplication__RightAssignment_1_0_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_0_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_0__2__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_1__0"
    // InternalMath.g:807:1: rule__Multiplication__Group_1_1__0 : rule__Multiplication__Group_1_1__0__Impl rule__Multiplication__Group_1_1__1 ;
    public final void rule__Multiplication__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:811:1: ( rule__Multiplication__Group_1_1__0__Impl rule__Multiplication__Group_1_1__1 )
            // InternalMath.g:812:2: rule__Multiplication__Group_1_1__0__Impl rule__Multiplication__Group_1_1__1
            {
            pushFollow(FOLLOW_11);
            rule__Multiplication__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_1__0"


    // $ANTLR start "rule__Multiplication__Group_1_1__0__Impl"
    // InternalMath.g:819:1: rule__Multiplication__Group_1_1__0__Impl : ( () ) ;
    public final void rule__Multiplication__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:823:1: ( ( () ) )
            // InternalMath.g:824:1: ( () )
            {
            // InternalMath.g:824:1: ( () )
            // InternalMath.g:825:2: ()
            {
             before(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_1_0()); 
            // InternalMath.g:826:2: ()
            // InternalMath.g:826:3: 
            {
            }

             after(grammarAccess.getMultiplicationAccess().getDivLeftAction_1_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_1__0__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_1__1"
    // InternalMath.g:834:1: rule__Multiplication__Group_1_1__1 : rule__Multiplication__Group_1_1__1__Impl rule__Multiplication__Group_1_1__2 ;
    public final void rule__Multiplication__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:838:1: ( rule__Multiplication__Group_1_1__1__Impl rule__Multiplication__Group_1_1__2 )
            // InternalMath.g:839:2: rule__Multiplication__Group_1_1__1__Impl rule__Multiplication__Group_1_1__2
            {
            pushFollow(FOLLOW_5);
            rule__Multiplication__Group_1_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_1__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_1__1"


    // $ANTLR start "rule__Multiplication__Group_1_1__1__Impl"
    // InternalMath.g:846:1: rule__Multiplication__Group_1_1__1__Impl : ( '/' ) ;
    public final void rule__Multiplication__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:850:1: ( ( '/' ) )
            // InternalMath.g:851:1: ( '/' )
            {
            // InternalMath.g:851:1: ( '/' )
            // InternalMath.g:852:2: '/'
            {
             before(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getMultiplicationAccess().getSolidusKeyword_1_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_1__1__Impl"


    // $ANTLR start "rule__Multiplication__Group_1_1__2"
    // InternalMath.g:861:1: rule__Multiplication__Group_1_1__2 : rule__Multiplication__Group_1_1__2__Impl ;
    public final void rule__Multiplication__Group_1_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:865:1: ( rule__Multiplication__Group_1_1__2__Impl )
            // InternalMath.g:866:2: rule__Multiplication__Group_1_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__Group_1_1__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_1__2"


    // $ANTLR start "rule__Multiplication__Group_1_1__2__Impl"
    // InternalMath.g:872:1: rule__Multiplication__Group_1_1__2__Impl : ( ( rule__Multiplication__RightAssignment_1_1_2 ) ) ;
    public final void rule__Multiplication__Group_1_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:876:1: ( ( ( rule__Multiplication__RightAssignment_1_1_2 ) ) )
            // InternalMath.g:877:1: ( ( rule__Multiplication__RightAssignment_1_1_2 ) )
            {
            // InternalMath.g:877:1: ( ( rule__Multiplication__RightAssignment_1_1_2 ) )
            // InternalMath.g:878:2: ( rule__Multiplication__RightAssignment_1_1_2 )
            {
             before(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1_2()); 
            // InternalMath.g:879:2: ( rule__Multiplication__RightAssignment_1_1_2 )
            // InternalMath.g:879:3: rule__Multiplication__RightAssignment_1_1_2
            {
            pushFollow(FOLLOW_2);
            rule__Multiplication__RightAssignment_1_1_2();

            state._fsp--;


            }

             after(grammarAccess.getMultiplicationAccess().getRightAssignment_1_1_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__Group_1_1__2__Impl"


    // $ANTLR start "rule__Parenthesis__Group__0"
    // InternalMath.g:888:1: rule__Parenthesis__Group__0 : rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 ;
    public final void rule__Parenthesis__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:892:1: ( rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1 )
            // InternalMath.g:893:2: rule__Parenthesis__Group__0__Impl rule__Parenthesis__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Parenthesis__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0"


    // $ANTLR start "rule__Parenthesis__Group__0__Impl"
    // InternalMath.g:900:1: rule__Parenthesis__Group__0__Impl : ( '(' ) ;
    public final void rule__Parenthesis__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:904:1: ( ( '(' ) )
            // InternalMath.g:905:1: ( '(' )
            {
            // InternalMath.g:905:1: ( '(' )
            // InternalMath.g:906:2: '('
            {
             before(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getLeftParenthesisKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__0__Impl"


    // $ANTLR start "rule__Parenthesis__Group__1"
    // InternalMath.g:915:1: rule__Parenthesis__Group__1 : rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 ;
    public final void rule__Parenthesis__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:919:1: ( rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2 )
            // InternalMath.g:920:2: rule__Parenthesis__Group__1__Impl rule__Parenthesis__Group__2
            {
            pushFollow(FOLLOW_14);
            rule__Parenthesis__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1"


    // $ANTLR start "rule__Parenthesis__Group__1__Impl"
    // InternalMath.g:927:1: rule__Parenthesis__Group__1__Impl : ( ( rule__Parenthesis__ExpAssignment_1 ) ) ;
    public final void rule__Parenthesis__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:931:1: ( ( ( rule__Parenthesis__ExpAssignment_1 ) ) )
            // InternalMath.g:932:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            {
            // InternalMath.g:932:1: ( ( rule__Parenthesis__ExpAssignment_1 ) )
            // InternalMath.g:933:2: ( rule__Parenthesis__ExpAssignment_1 )
            {
             before(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 
            // InternalMath.g:934:2: ( rule__Parenthesis__ExpAssignment_1 )
            // InternalMath.g:934:3: rule__Parenthesis__ExpAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__ExpAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getParenthesisAccess().getExpAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__1__Impl"


    // $ANTLR start "rule__Parenthesis__Group__2"
    // InternalMath.g:942:1: rule__Parenthesis__Group__2 : rule__Parenthesis__Group__2__Impl ;
    public final void rule__Parenthesis__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:946:1: ( rule__Parenthesis__Group__2__Impl )
            // InternalMath.g:947:2: rule__Parenthesis__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Parenthesis__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2"


    // $ANTLR start "rule__Parenthesis__Group__2__Impl"
    // InternalMath.g:953:1: rule__Parenthesis__Group__2__Impl : ( ')' ) ;
    public final void rule__Parenthesis__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:957:1: ( ( ')' ) )
            // InternalMath.g:958:1: ( ')' )
            {
            // InternalMath.g:958:1: ( ')' )
            // InternalMath.g:959:2: ')'
            {
             before(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getParenthesisAccess().getRightParenthesisKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__Group__2__Impl"


    // $ANTLR start "rule__MathExp__NameAssignment_1"
    // InternalMath.g:969:1: rule__MathExp__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__MathExp__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:973:1: ( ( RULE_ID ) )
            // InternalMath.g:974:2: ( RULE_ID )
            {
            // InternalMath.g:974:2: ( RULE_ID )
            // InternalMath.g:975:3: RULE_ID
            {
             before(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getMathExpAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__NameAssignment_1"


    // $ANTLR start "rule__MathExp__ExpAssignment_3"
    // InternalMath.g:984:1: rule__MathExp__ExpAssignment_3 : ( ruleExp ) ;
    public final void rule__MathExp__ExpAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:988:1: ( ( ruleExp ) )
            // InternalMath.g:989:2: ( ruleExp )
            {
            // InternalMath.g:989:2: ( ruleExp )
            // InternalMath.g:990:3: ruleExp
            {
             before(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getExpExpParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__ExpAssignment_3"


    // $ANTLR start "rule__MathExp__VarsAssignment_4"
    // InternalMath.g:999:1: rule__MathExp__VarsAssignment_4 : ( ruleMathExp ) ;
    public final void rule__MathExp__VarsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1003:1: ( ( ruleMathExp ) )
            // InternalMath.g:1004:2: ( ruleMathExp )
            {
            // InternalMath.g:1004:2: ( ruleMathExp )
            // InternalMath.g:1005:3: ruleMathExp
            {
             before(grammarAccess.getMathExpAccess().getVarsMathExpParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getVarsMathExpParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MathExp__VarsAssignment_4"


    // $ANTLR start "rule__Addition__RightAssignment_1_0_2"
    // InternalMath.g:1014:1: rule__Addition__RightAssignment_1_0_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1018:1: ( ( ruleMultiplication ) )
            // InternalMath.g:1019:2: ( ruleMultiplication )
            {
            // InternalMath.g:1019:2: ( ruleMultiplication )
            // InternalMath.g:1020:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_0_2"


    // $ANTLR start "rule__Addition__RightAssignment_1_1_2"
    // InternalMath.g:1029:1: rule__Addition__RightAssignment_1_1_2 : ( ruleMultiplication ) ;
    public final void rule__Addition__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1033:1: ( ( ruleMultiplication ) )
            // InternalMath.g:1034:2: ( ruleMultiplication )
            {
            // InternalMath.g:1034:2: ( ruleMultiplication )
            // InternalMath.g:1035:3: ruleMultiplication
            {
             before(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            ruleMultiplication();

            state._fsp--;

             after(grammarAccess.getAdditionAccess().getRightMultiplicationParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Addition__RightAssignment_1_1_2"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_0_2"
    // InternalMath.g:1044:1: rule__Multiplication__RightAssignment_1_0_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_0_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1048:1: ( ( rulePrimary ) )
            // InternalMath.g:1049:2: ( rulePrimary )
            {
            // InternalMath.g:1049:2: ( rulePrimary )
            // InternalMath.g:1050:3: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_0_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_0_2"


    // $ANTLR start "rule__Multiplication__RightAssignment_1_1_2"
    // InternalMath.g:1059:1: rule__Multiplication__RightAssignment_1_1_2 : ( rulePrimary ) ;
    public final void rule__Multiplication__RightAssignment_1_1_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1063:1: ( ( rulePrimary ) )
            // InternalMath.g:1064:2: ( rulePrimary )
            {
            // InternalMath.g:1064:2: ( rulePrimary )
            // InternalMath.g:1065:3: rulePrimary
            {
             before(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMultiplicationAccess().getRightPrimaryParserRuleCall_1_1_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Multiplication__RightAssignment_1_1_2"


    // $ANTLR start "rule__Parenthesis__ExpAssignment_1"
    // InternalMath.g:1074:1: rule__Parenthesis__ExpAssignment_1 : ( ruleExp ) ;
    public final void rule__Parenthesis__ExpAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1078:1: ( ( ruleExp ) )
            // InternalMath.g:1079:2: ( ruleExp )
            {
            // InternalMath.g:1079:2: ( ruleExp )
            // InternalMath.g:1080:3: ruleExp
            {
             before(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleExp();

            state._fsp--;

             after(grammarAccess.getParenthesisAccess().getExpExpParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Parenthesis__ExpAssignment_1"


    // $ANTLR start "rule__Number__ValueAssignment"
    // InternalMath.g:1089:1: rule__Number__ValueAssignment : ( RULE_INT ) ;
    public final void rule__Number__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1093:1: ( ( RULE_INT ) )
            // InternalMath.g:1094:2: ( RULE_INT )
            {
            // InternalMath.g:1094:2: ( RULE_INT )
            // InternalMath.g:1095:3: RULE_INT
            {
             before(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberAccess().getValueINTTerminalRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__ValueAssignment"


    // $ANTLR start "rule__VariableUse__RefAssignment"
    // InternalMath.g:1104:1: rule__VariableUse__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VariableUse__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1108:1: ( ( ( RULE_ID ) ) )
            // InternalMath.g:1109:2: ( ( RULE_ID ) )
            {
            // InternalMath.g:1109:2: ( ( RULE_ID ) )
            // InternalMath.g:1110:3: ( RULE_ID )
            {
             before(grammarAccess.getVariableUseAccess().getRefMathExpCrossReference_0()); 
            // InternalMath.g:1111:3: ( RULE_ID )
            // InternalMath.g:1112:4: RULE_ID
            {
             before(grammarAccess.getVariableUseAccess().getRefMathExpIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableUseAccess().getRefMathExpIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVariableUseAccess().getRefMathExpCrossReference_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VariableUse__RefAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000020030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000802L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000018002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000040000L});

}