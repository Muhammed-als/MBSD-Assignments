package org.xtext.example.mydsl.ide.contentassist.antlr.internal;

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
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'string'", "'number'", "'system'", "'type'", "'='", "'{'", "'}'", "','", "':'", "'|'", "'var'", "'['", "']'", "'[]'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMyDslParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMyDslParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMyDslParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMyDsl.g"; }


    	private MyDslGrammarAccess grammarAccess;

    	public void setGrammarAccess(MyDslGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:53:1: entryRuleModel : ruleModel EOF ;
    public final void entryRuleModel() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( ruleModel EOF )
            // InternalMyDsl.g:55:1: ruleModel EOF
            {
             before(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            ruleModel();

            state._fsp--;

             after(grammarAccess.getModelRule()); 
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
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:62:1: ruleModel : ( ( rule__Model__Group__0 ) ) ;
    public final void ruleModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__Model__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__Model__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__Model__Group__0 )
            {
             before(grammarAccess.getModelAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__Model__Group__0 )
            // InternalMyDsl.g:69:4: rule__Model__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getGroup()); 

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
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTypeDef"
    // InternalMyDsl.g:78:1: entryRuleTypeDef : ruleTypeDef EOF ;
    public final void entryRuleTypeDef() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( ruleTypeDef EOF )
            // InternalMyDsl.g:80:1: ruleTypeDef EOF
            {
             before(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_1);
            ruleTypeDef();

            state._fsp--;

             after(grammarAccess.getTypeDefRule()); 
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
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalMyDsl.g:87:1: ruleTypeDef : ( ( rule__TypeDef__Group__0 ) ) ;
    public final void ruleTypeDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__TypeDef__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__TypeDef__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__TypeDef__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__TypeDef__Group__0 )
            {
             before(grammarAccess.getTypeDefAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__TypeDef__Group__0 )
            // InternalMyDsl.g:94:4: rule__TypeDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getGroup()); 

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
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleField"
    // InternalMyDsl.g:103:1: entryRuleField : ruleField EOF ;
    public final void entryRuleField() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleField EOF )
            // InternalMyDsl.g:105:1: ruleField EOF
            {
             before(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            ruleField();

            state._fsp--;

             after(grammarAccess.getFieldRule()); 
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
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMyDsl.g:112:1: ruleField : ( ( rule__Field__Group__0 ) ) ;
    public final void ruleField() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__Field__Group__0 ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__Field__Group__0 ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__Field__Group__0 ) )
            // InternalMyDsl.g:118:3: ( rule__Field__Group__0 )
            {
             before(grammarAccess.getFieldAccess().getGroup()); 
            // InternalMyDsl.g:119:3: ( rule__Field__Group__0 )
            // InternalMyDsl.g:119:4: rule__Field__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getGroup()); 

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
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldType"
    // InternalMyDsl.g:128:1: entryRuleFieldType : ruleFieldType EOF ;
    public final void entryRuleFieldType() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleFieldType EOF )
            // InternalMyDsl.g:130:1: ruleFieldType EOF
            {
             before(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldTypeRule()); 
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
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // InternalMyDsl.g:137:1: ruleFieldType : ( ( rule__FieldType__Group__0 ) ) ;
    public final void ruleFieldType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__FieldType__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__FieldType__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__FieldType__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__FieldType__Group__0 )
            {
             before(grammarAccess.getFieldTypeAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__FieldType__Group__0 )
            // InternalMyDsl.g:144:4: rule__FieldType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "entryRuleUnionType"
    // InternalMyDsl.g:153:1: entryRuleUnionType : ruleUnionType EOF ;
    public final void entryRuleUnionType() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleUnionType EOF )
            // InternalMyDsl.g:155:1: ruleUnionType EOF
            {
             before(grammarAccess.getUnionTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleUnionType();

            state._fsp--;

             after(grammarAccess.getUnionTypeRule()); 
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
    // $ANTLR end "entryRuleUnionType"


    // $ANTLR start "ruleUnionType"
    // InternalMyDsl.g:162:1: ruleUnionType : ( ( rule__UnionType__Group__0 ) ) ;
    public final void ruleUnionType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__UnionType__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__UnionType__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__UnionType__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__UnionType__Group__0 )
            {
             before(grammarAccess.getUnionTypeAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__UnionType__Group__0 )
            // InternalMyDsl.g:169:4: rule__UnionType__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__UnionType__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getGroup()); 

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
    // $ANTLR end "ruleUnionType"


    // $ANTLR start "entryRuleSimpleType"
    // InternalMyDsl.g:178:1: entryRuleSimpleType : ruleSimpleType EOF ;
    public final void entryRuleSimpleType() throws RecognitionException {
        try {
            // InternalMyDsl.g:179:1: ( ruleSimpleType EOF )
            // InternalMyDsl.g:180:1: ruleSimpleType EOF
            {
             before(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getSimpleTypeRule()); 
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
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalMyDsl.g:187:1: ruleSimpleType : ( ( rule__SimpleType__Alternatives ) ) ;
    public final void ruleSimpleType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:191:2: ( ( ( rule__SimpleType__Alternatives ) ) )
            // InternalMyDsl.g:192:2: ( ( rule__SimpleType__Alternatives ) )
            {
            // InternalMyDsl.g:192:2: ( ( rule__SimpleType__Alternatives ) )
            // InternalMyDsl.g:193:3: ( rule__SimpleType__Alternatives )
            {
             before(grammarAccess.getSimpleTypeAccess().getAlternatives()); 
            // InternalMyDsl.g:194:3: ( rule__SimpleType__Alternatives )
            // InternalMyDsl.g:194:4: rule__SimpleType__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__SimpleType__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getSimpleTypeAccess().getAlternatives()); 

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
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMyDsl.g:203:1: entryRulePrimitiveType : rulePrimitiveType EOF ;
    public final void entryRulePrimitiveType() throws RecognitionException {
        try {
            // InternalMyDsl.g:204:1: ( rulePrimitiveType EOF )
            // InternalMyDsl.g:205:1: rulePrimitiveType EOF
            {
             before(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            rulePrimitiveType();

            state._fsp--;

             after(grammarAccess.getPrimitiveTypeRule()); 
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
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMyDsl.g:212:1: rulePrimitiveType : ( ( rule__PrimitiveType__ValueAssignment ) ) ;
    public final void rulePrimitiveType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:216:2: ( ( ( rule__PrimitiveType__ValueAssignment ) ) )
            // InternalMyDsl.g:217:2: ( ( rule__PrimitiveType__ValueAssignment ) )
            {
            // InternalMyDsl.g:217:2: ( ( rule__PrimitiveType__ValueAssignment ) )
            // InternalMyDsl.g:218:3: ( rule__PrimitiveType__ValueAssignment )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getValueAssignment()); 
            // InternalMyDsl.g:219:3: ( rule__PrimitiveType__ValueAssignment )
            // InternalMyDsl.g:219:4: rule__PrimitiveType__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getValueAssignment()); 

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
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleRefType"
    // InternalMyDsl.g:228:1: entryRuleRefType : ruleRefType EOF ;
    public final void entryRuleRefType() throws RecognitionException {
        try {
            // InternalMyDsl.g:229:1: ( ruleRefType EOF )
            // InternalMyDsl.g:230:1: ruleRefType EOF
            {
             before(grammarAccess.getRefTypeRule()); 
            pushFollow(FOLLOW_1);
            ruleRefType();

            state._fsp--;

             after(grammarAccess.getRefTypeRule()); 
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
    // $ANTLR end "entryRuleRefType"


    // $ANTLR start "ruleRefType"
    // InternalMyDsl.g:237:1: ruleRefType : ( ( rule__RefType__TypeAssignment ) ) ;
    public final void ruleRefType() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:2: ( ( ( rule__RefType__TypeAssignment ) ) )
            // InternalMyDsl.g:242:2: ( ( rule__RefType__TypeAssignment ) )
            {
            // InternalMyDsl.g:242:2: ( ( rule__RefType__TypeAssignment ) )
            // InternalMyDsl.g:243:3: ( rule__RefType__TypeAssignment )
            {
             before(grammarAccess.getRefTypeAccess().getTypeAssignment()); 
            // InternalMyDsl.g:244:3: ( rule__RefType__TypeAssignment )
            // InternalMyDsl.g:244:4: rule__RefType__TypeAssignment
            {
            pushFollow(FOLLOW_2);
            rule__RefType__TypeAssignment();

            state._fsp--;


            }

             after(grammarAccess.getRefTypeAccess().getTypeAssignment()); 

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
    // $ANTLR end "ruleRefType"


    // $ANTLR start "entryRuleVarDef"
    // InternalMyDsl.g:253:1: entryRuleVarDef : ruleVarDef EOF ;
    public final void entryRuleVarDef() throws RecognitionException {
        try {
            // InternalMyDsl.g:254:1: ( ruleVarDef EOF )
            // InternalMyDsl.g:255:1: ruleVarDef EOF
            {
             before(grammarAccess.getVarDefRule()); 
            pushFollow(FOLLOW_1);
            ruleVarDef();

            state._fsp--;

             after(grammarAccess.getVarDefRule()); 
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
    // $ANTLR end "entryRuleVarDef"


    // $ANTLR start "ruleVarDef"
    // InternalMyDsl.g:262:1: ruleVarDef : ( ( rule__VarDef__Group__0 ) ) ;
    public final void ruleVarDef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:266:2: ( ( ( rule__VarDef__Group__0 ) ) )
            // InternalMyDsl.g:267:2: ( ( rule__VarDef__Group__0 ) )
            {
            // InternalMyDsl.g:267:2: ( ( rule__VarDef__Group__0 ) )
            // InternalMyDsl.g:268:3: ( rule__VarDef__Group__0 )
            {
             before(grammarAccess.getVarDefAccess().getGroup()); 
            // InternalMyDsl.g:269:3: ( rule__VarDef__Group__0 )
            // InternalMyDsl.g:269:4: rule__VarDef__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__VarDef__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVarDefAccess().getGroup()); 

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
    // $ANTLR end "ruleVarDef"


    // $ANTLR start "entryRuleStructValue"
    // InternalMyDsl.g:278:1: entryRuleStructValue : ruleStructValue EOF ;
    public final void entryRuleStructValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:279:1: ( ruleStructValue EOF )
            // InternalMyDsl.g:280:1: ruleStructValue EOF
            {
             before(grammarAccess.getStructValueRule()); 
            pushFollow(FOLLOW_1);
            ruleStructValue();

            state._fsp--;

             after(grammarAccess.getStructValueRule()); 
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
    // $ANTLR end "entryRuleStructValue"


    // $ANTLR start "ruleStructValue"
    // InternalMyDsl.g:287:1: ruleStructValue : ( ( rule__StructValue__Group__0 ) ) ;
    public final void ruleStructValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:291:2: ( ( ( rule__StructValue__Group__0 ) ) )
            // InternalMyDsl.g:292:2: ( ( rule__StructValue__Group__0 ) )
            {
            // InternalMyDsl.g:292:2: ( ( rule__StructValue__Group__0 ) )
            // InternalMyDsl.g:293:3: ( rule__StructValue__Group__0 )
            {
             before(grammarAccess.getStructValueAccess().getGroup()); 
            // InternalMyDsl.g:294:3: ( rule__StructValue__Group__0 )
            // InternalMyDsl.g:294:4: rule__StructValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__StructValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getStructValueAccess().getGroup()); 

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
    // $ANTLR end "ruleStructValue"


    // $ANTLR start "entryRuleFieldValue"
    // InternalMyDsl.g:303:1: entryRuleFieldValue : ruleFieldValue EOF ;
    public final void entryRuleFieldValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:304:1: ( ruleFieldValue EOF )
            // InternalMyDsl.g:305:1: ruleFieldValue EOF
            {
             before(grammarAccess.getFieldValueRule()); 
            pushFollow(FOLLOW_1);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getFieldValueRule()); 
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
    // $ANTLR end "entryRuleFieldValue"


    // $ANTLR start "ruleFieldValue"
    // InternalMyDsl.g:312:1: ruleFieldValue : ( ( rule__FieldValue__Group__0 ) ) ;
    public final void ruleFieldValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:316:2: ( ( ( rule__FieldValue__Group__0 ) ) )
            // InternalMyDsl.g:317:2: ( ( rule__FieldValue__Group__0 ) )
            {
            // InternalMyDsl.g:317:2: ( ( rule__FieldValue__Group__0 ) )
            // InternalMyDsl.g:318:3: ( rule__FieldValue__Group__0 )
            {
             before(grammarAccess.getFieldValueAccess().getGroup()); 
            // InternalMyDsl.g:319:3: ( rule__FieldValue__Group__0 )
            // InternalMyDsl.g:319:4: rule__FieldValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getFieldValueAccess().getGroup()); 

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
    // $ANTLR end "ruleFieldValue"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:328:1: entryRuleValue : ruleValue EOF ;
    public final void entryRuleValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:329:1: ( ruleValue EOF )
            // InternalMyDsl.g:330:1: ruleValue EOF
            {
             before(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getValueRule()); 
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
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:337:1: ruleValue : ( ( rule__Value__Alternatives ) ) ;
    public final void ruleValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:341:2: ( ( ( rule__Value__Alternatives ) ) )
            // InternalMyDsl.g:342:2: ( ( rule__Value__Alternatives ) )
            {
            // InternalMyDsl.g:342:2: ( ( rule__Value__Alternatives ) )
            // InternalMyDsl.g:343:3: ( rule__Value__Alternatives )
            {
             before(grammarAccess.getValueAccess().getAlternatives()); 
            // InternalMyDsl.g:344:3: ( rule__Value__Alternatives )
            // InternalMyDsl.g:344:4: rule__Value__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Value__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getValueAccess().getAlternatives()); 

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleVarRef"
    // InternalMyDsl.g:353:1: entryRuleVarRef : ruleVarRef EOF ;
    public final void entryRuleVarRef() throws RecognitionException {
        try {
            // InternalMyDsl.g:354:1: ( ruleVarRef EOF )
            // InternalMyDsl.g:355:1: ruleVarRef EOF
            {
             before(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_1);
            ruleVarRef();

            state._fsp--;

             after(grammarAccess.getVarRefRule()); 
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
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // InternalMyDsl.g:362:1: ruleVarRef : ( ( rule__VarRef__RefAssignment ) ) ;
    public final void ruleVarRef() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:366:2: ( ( ( rule__VarRef__RefAssignment ) ) )
            // InternalMyDsl.g:367:2: ( ( rule__VarRef__RefAssignment ) )
            {
            // InternalMyDsl.g:367:2: ( ( rule__VarRef__RefAssignment ) )
            // InternalMyDsl.g:368:3: ( rule__VarRef__RefAssignment )
            {
             before(grammarAccess.getVarRefAccess().getRefAssignment()); 
            // InternalMyDsl.g:369:3: ( rule__VarRef__RefAssignment )
            // InternalMyDsl.g:369:4: rule__VarRef__RefAssignment
            {
            pushFollow(FOLLOW_2);
            rule__VarRef__RefAssignment();

            state._fsp--;


            }

             after(grammarAccess.getVarRefAccess().getRefAssignment()); 

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
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleArrayValue"
    // InternalMyDsl.g:378:1: entryRuleArrayValue : ruleArrayValue EOF ;
    public final void entryRuleArrayValue() throws RecognitionException {
        try {
            // InternalMyDsl.g:379:1: ( ruleArrayValue EOF )
            // InternalMyDsl.g:380:1: ruleArrayValue EOF
            {
             before(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_1);
            ruleArrayValue();

            state._fsp--;

             after(grammarAccess.getArrayValueRule()); 
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
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalMyDsl.g:387:1: ruleArrayValue : ( ( rule__ArrayValue__Group__0 ) ) ;
    public final void ruleArrayValue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:2: ( ( ( rule__ArrayValue__Group__0 ) ) )
            // InternalMyDsl.g:392:2: ( ( rule__ArrayValue__Group__0 ) )
            {
            // InternalMyDsl.g:392:2: ( ( rule__ArrayValue__Group__0 ) )
            // InternalMyDsl.g:393:3: ( rule__ArrayValue__Group__0 )
            {
             before(grammarAccess.getArrayValueAccess().getGroup()); 
            // InternalMyDsl.g:394:3: ( rule__ArrayValue__Group__0 )
            // InternalMyDsl.g:394:4: rule__ArrayValue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getGroup()); 

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
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleLiteral"
    // InternalMyDsl.g:403:1: entryRuleLiteral : ruleLiteral EOF ;
    public final void entryRuleLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:404:1: ( ruleLiteral EOF )
            // InternalMyDsl.g:405:1: ruleLiteral EOF
            {
             before(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleLiteral();

            state._fsp--;

             after(grammarAccess.getLiteralRule()); 
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
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMyDsl.g:412:1: ruleLiteral : ( ( rule__Literal__Alternatives ) ) ;
    public final void ruleLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:416:2: ( ( ( rule__Literal__Alternatives ) ) )
            // InternalMyDsl.g:417:2: ( ( rule__Literal__Alternatives ) )
            {
            // InternalMyDsl.g:417:2: ( ( rule__Literal__Alternatives ) )
            // InternalMyDsl.g:418:3: ( rule__Literal__Alternatives )
            {
             before(grammarAccess.getLiteralAccess().getAlternatives()); 
            // InternalMyDsl.g:419:3: ( rule__Literal__Alternatives )
            // InternalMyDsl.g:419:4: rule__Literal__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Literal__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getLiteralAccess().getAlternatives()); 

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
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMyDsl.g:428:1: entryRuleStringLiteral : ruleStringLiteral EOF ;
    public final void entryRuleStringLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:429:1: ( ruleStringLiteral EOF )
            // InternalMyDsl.g:430:1: ruleStringLiteral EOF
            {
             before(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleStringLiteral();

            state._fsp--;

             after(grammarAccess.getStringLiteralRule()); 
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
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMyDsl.g:437:1: ruleStringLiteral : ( ( rule__StringLiteral__ValueAssignment ) ) ;
    public final void ruleStringLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:441:2: ( ( ( rule__StringLiteral__ValueAssignment ) ) )
            // InternalMyDsl.g:442:2: ( ( rule__StringLiteral__ValueAssignment ) )
            {
            // InternalMyDsl.g:442:2: ( ( rule__StringLiteral__ValueAssignment ) )
            // InternalMyDsl.g:443:3: ( rule__StringLiteral__ValueAssignment )
            {
             before(grammarAccess.getStringLiteralAccess().getValueAssignment()); 
            // InternalMyDsl.g:444:3: ( rule__StringLiteral__ValueAssignment )
            // InternalMyDsl.g:444:4: rule__StringLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__StringLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getStringLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMyDsl.g:453:1: entryRuleNumberLiteral : ruleNumberLiteral EOF ;
    public final void entryRuleNumberLiteral() throws RecognitionException {
        try {
            // InternalMyDsl.g:454:1: ( ruleNumberLiteral EOF )
            // InternalMyDsl.g:455:1: ruleNumberLiteral EOF
            {
             before(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            ruleNumberLiteral();

            state._fsp--;

             after(grammarAccess.getNumberLiteralRule()); 
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
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMyDsl.g:462:1: ruleNumberLiteral : ( ( rule__NumberLiteral__ValueAssignment ) ) ;
    public final void ruleNumberLiteral() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:466:2: ( ( ( rule__NumberLiteral__ValueAssignment ) ) )
            // InternalMyDsl.g:467:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            {
            // InternalMyDsl.g:467:2: ( ( rule__NumberLiteral__ValueAssignment ) )
            // InternalMyDsl.g:468:3: ( rule__NumberLiteral__ValueAssignment )
            {
             before(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 
            // InternalMyDsl.g:469:3: ( rule__NumberLiteral__ValueAssignment )
            // InternalMyDsl.g:469:4: rule__NumberLiteral__ValueAssignment
            {
            pushFollow(FOLLOW_2);
            rule__NumberLiteral__ValueAssignment();

            state._fsp--;


            }

             after(grammarAccess.getNumberLiteralAccess().getValueAssignment()); 

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
    // $ANTLR end "ruleNumberLiteral"


    // $ANTLR start "rule__SimpleType__Alternatives"
    // InternalMyDsl.g:477:1: rule__SimpleType__Alternatives : ( ( rulePrimitiveType ) | ( ruleRefType ) );
    public final void rule__SimpleType__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:481:1: ( ( rulePrimitiveType ) | ( ruleRefType ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( ((LA1_0>=11 && LA1_0<=12)) ) {
                alt1=1;
            }
            else if ( (LA1_0==RULE_ID) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:482:2: ( rulePrimitiveType )
                    {
                    // InternalMyDsl.g:482:2: ( rulePrimitiveType )
                    // InternalMyDsl.g:483:3: rulePrimitiveType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getPrimitiveTypeParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePrimitiveType();

                    state._fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getPrimitiveTypeParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:488:2: ( ruleRefType )
                    {
                    // InternalMyDsl.g:488:2: ( ruleRefType )
                    // InternalMyDsl.g:489:3: ruleRefType
                    {
                     before(grammarAccess.getSimpleTypeAccess().getRefTypeParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleRefType();

                    state._fsp--;

                     after(grammarAccess.getSimpleTypeAccess().getRefTypeParserRuleCall_1()); 

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
    // $ANTLR end "rule__SimpleType__Alternatives"


    // $ANTLR start "rule__PrimitiveType__ValueAlternatives_0"
    // InternalMyDsl.g:498:1: rule__PrimitiveType__ValueAlternatives_0 : ( ( 'string' ) | ( 'number' ) );
    public final void rule__PrimitiveType__ValueAlternatives_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:502:1: ( ( 'string' ) | ( 'number' ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            else if ( (LA2_0==12) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:503:2: ( 'string' )
                    {
                    // InternalMyDsl.g:503:2: ( 'string' )
                    // InternalMyDsl.g:504:3: 'string'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getValueStringKeyword_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getValueStringKeyword_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:509:2: ( 'number' )
                    {
                    // InternalMyDsl.g:509:2: ( 'number' )
                    // InternalMyDsl.g:510:3: 'number'
                    {
                     before(grammarAccess.getPrimitiveTypeAccess().getValueNumberKeyword_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getPrimitiveTypeAccess().getValueNumberKeyword_0_1()); 

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
    // $ANTLR end "rule__PrimitiveType__ValueAlternatives_0"


    // $ANTLR start "rule__Value__Alternatives"
    // InternalMyDsl.g:519:1: rule__Value__Alternatives : ( ( ruleLiteral ) | ( ruleVarRef ) | ( ruleArrayValue ) | ( ruleStructValue ) );
    public final void rule__Value__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:523:1: ( ( ruleLiteral ) | ( ruleVarRef ) | ( ruleArrayValue ) | ( ruleStructValue ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
                {
                alt3=1;
                }
                break;
            case RULE_ID:
                {
                alt3=2;
                }
                break;
            case 22:
                {
                alt3=3;
                }
                break;
            case 16:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:524:2: ( ruleLiteral )
                    {
                    // InternalMyDsl.g:524:2: ( ruleLiteral )
                    // InternalMyDsl.g:525:3: ruleLiteral
                    {
                     before(grammarAccess.getValueAccess().getLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleLiteral();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:530:2: ( ruleVarRef )
                    {
                    // InternalMyDsl.g:530:2: ( ruleVarRef )
                    // InternalMyDsl.g:531:3: ruleVarRef
                    {
                     before(grammarAccess.getValueAccess().getVarRefParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleVarRef();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getVarRefParserRuleCall_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:536:2: ( ruleArrayValue )
                    {
                    // InternalMyDsl.g:536:2: ( ruleArrayValue )
                    // InternalMyDsl.g:537:3: ruleArrayValue
                    {
                     before(grammarAccess.getValueAccess().getArrayValueParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleArrayValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getArrayValueParserRuleCall_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:542:2: ( ruleStructValue )
                    {
                    // InternalMyDsl.g:542:2: ( ruleStructValue )
                    // InternalMyDsl.g:543:3: ruleStructValue
                    {
                     before(grammarAccess.getValueAccess().getStructValueParserRuleCall_3()); 
                    pushFollow(FOLLOW_2);
                    ruleStructValue();

                    state._fsp--;

                     after(grammarAccess.getValueAccess().getStructValueParserRuleCall_3()); 

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
    // $ANTLR end "rule__Value__Alternatives"


    // $ANTLR start "rule__Literal__Alternatives"
    // InternalMyDsl.g:552:1: rule__Literal__Alternatives : ( ( ruleStringLiteral ) | ( ruleNumberLiteral ) );
    public final void rule__Literal__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:556:1: ( ( ruleStringLiteral ) | ( ruleNumberLiteral ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_STRING) ) {
                alt4=1;
            }
            else if ( (LA4_0==RULE_INT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:557:2: ( ruleStringLiteral )
                    {
                    // InternalMyDsl.g:557:2: ( ruleStringLiteral )
                    // InternalMyDsl.g:558:3: ruleStringLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleStringLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:563:2: ( ruleNumberLiteral )
                    {
                    // InternalMyDsl.g:563:2: ( ruleNumberLiteral )
                    // InternalMyDsl.g:564:3: ruleNumberLiteral
                    {
                     before(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleNumberLiteral();

                    state._fsp--;

                     after(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1()); 

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
    // $ANTLR end "rule__Literal__Alternatives"


    // $ANTLR start "rule__Model__Group__0"
    // InternalMyDsl.g:573:1: rule__Model__Group__0 : rule__Model__Group__0__Impl rule__Model__Group__1 ;
    public final void rule__Model__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:577:1: ( rule__Model__Group__0__Impl rule__Model__Group__1 )
            // InternalMyDsl.g:578:2: rule__Model__Group__0__Impl rule__Model__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Model__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__1();

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
    // $ANTLR end "rule__Model__Group__0"


    // $ANTLR start "rule__Model__Group__0__Impl"
    // InternalMyDsl.g:585:1: rule__Model__Group__0__Impl : ( 'system' ) ;
    public final void rule__Model__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:589:1: ( ( 'system' ) )
            // InternalMyDsl.g:590:1: ( 'system' )
            {
            // InternalMyDsl.g:590:1: ( 'system' )
            // InternalMyDsl.g:591:2: 'system'
            {
             before(grammarAccess.getModelAccess().getSystemKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getSystemKeyword_0()); 

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
    // $ANTLR end "rule__Model__Group__0__Impl"


    // $ANTLR start "rule__Model__Group__1"
    // InternalMyDsl.g:600:1: rule__Model__Group__1 : rule__Model__Group__1__Impl rule__Model__Group__2 ;
    public final void rule__Model__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:604:1: ( rule__Model__Group__1__Impl rule__Model__Group__2 )
            // InternalMyDsl.g:605:2: rule__Model__Group__1__Impl rule__Model__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__2();

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
    // $ANTLR end "rule__Model__Group__1"


    // $ANTLR start "rule__Model__Group__1__Impl"
    // InternalMyDsl.g:612:1: rule__Model__Group__1__Impl : ( ( rule__Model__NameAssignment_1 ) ) ;
    public final void rule__Model__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:616:1: ( ( ( rule__Model__NameAssignment_1 ) ) )
            // InternalMyDsl.g:617:1: ( ( rule__Model__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:617:1: ( ( rule__Model__NameAssignment_1 ) )
            // InternalMyDsl.g:618:2: ( rule__Model__NameAssignment_1 )
            {
             before(grammarAccess.getModelAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:619:2: ( rule__Model__NameAssignment_1 )
            // InternalMyDsl.g:619:3: rule__Model__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Model__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getModelAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Model__Group__1__Impl"


    // $ANTLR start "rule__Model__Group__2"
    // InternalMyDsl.g:627:1: rule__Model__Group__2 : rule__Model__Group__2__Impl rule__Model__Group__3 ;
    public final void rule__Model__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:631:1: ( rule__Model__Group__2__Impl rule__Model__Group__3 )
            // InternalMyDsl.g:632:2: rule__Model__Group__2__Impl rule__Model__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Model__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Model__Group__3();

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
    // $ANTLR end "rule__Model__Group__2"


    // $ANTLR start "rule__Model__Group__2__Impl"
    // InternalMyDsl.g:639:1: rule__Model__Group__2__Impl : ( ( rule__Model__TypesAssignment_2 )* ) ;
    public final void rule__Model__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:643:1: ( ( ( rule__Model__TypesAssignment_2 )* ) )
            // InternalMyDsl.g:644:1: ( ( rule__Model__TypesAssignment_2 )* )
            {
            // InternalMyDsl.g:644:1: ( ( rule__Model__TypesAssignment_2 )* )
            // InternalMyDsl.g:645:2: ( rule__Model__TypesAssignment_2 )*
            {
             before(grammarAccess.getModelAccess().getTypesAssignment_2()); 
            // InternalMyDsl.g:646:2: ( rule__Model__TypesAssignment_2 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==14) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMyDsl.g:646:3: rule__Model__TypesAssignment_2
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__Model__TypesAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getTypesAssignment_2()); 

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
    // $ANTLR end "rule__Model__Group__2__Impl"


    // $ANTLR start "rule__Model__Group__3"
    // InternalMyDsl.g:654:1: rule__Model__Group__3 : rule__Model__Group__3__Impl ;
    public final void rule__Model__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:658:1: ( rule__Model__Group__3__Impl )
            // InternalMyDsl.g:659:2: rule__Model__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Model__Group__3__Impl();

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
    // $ANTLR end "rule__Model__Group__3"


    // $ANTLR start "rule__Model__Group__3__Impl"
    // InternalMyDsl.g:665:1: rule__Model__Group__3__Impl : ( ( rule__Model__VarsAssignment_3 )* ) ;
    public final void rule__Model__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:669:1: ( ( ( rule__Model__VarsAssignment_3 )* ) )
            // InternalMyDsl.g:670:1: ( ( rule__Model__VarsAssignment_3 )* )
            {
            // InternalMyDsl.g:670:1: ( ( rule__Model__VarsAssignment_3 )* )
            // InternalMyDsl.g:671:2: ( rule__Model__VarsAssignment_3 )*
            {
             before(grammarAccess.getModelAccess().getVarsAssignment_3()); 
            // InternalMyDsl.g:672:2: ( rule__Model__VarsAssignment_3 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==21) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:672:3: rule__Model__VarsAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Model__VarsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getModelAccess().getVarsAssignment_3()); 

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
    // $ANTLR end "rule__Model__Group__3__Impl"


    // $ANTLR start "rule__TypeDef__Group__0"
    // InternalMyDsl.g:681:1: rule__TypeDef__Group__0 : rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 ;
    public final void rule__TypeDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:685:1: ( rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1 )
            // InternalMyDsl.g:686:2: rule__TypeDef__Group__0__Impl rule__TypeDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__1();

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
    // $ANTLR end "rule__TypeDef__Group__0"


    // $ANTLR start "rule__TypeDef__Group__0__Impl"
    // InternalMyDsl.g:693:1: rule__TypeDef__Group__0__Impl : ( 'type' ) ;
    public final void rule__TypeDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:697:1: ( ( 'type' ) )
            // InternalMyDsl.g:698:1: ( 'type' )
            {
            // InternalMyDsl.g:698:1: ( 'type' )
            // InternalMyDsl.g:699:2: 'type'
            {
             before(grammarAccess.getTypeDefAccess().getTypeKeyword_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getTypeKeyword_0()); 

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
    // $ANTLR end "rule__TypeDef__Group__0__Impl"


    // $ANTLR start "rule__TypeDef__Group__1"
    // InternalMyDsl.g:708:1: rule__TypeDef__Group__1 : rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 ;
    public final void rule__TypeDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:712:1: ( rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2 )
            // InternalMyDsl.g:713:2: rule__TypeDef__Group__1__Impl rule__TypeDef__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__TypeDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__2();

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
    // $ANTLR end "rule__TypeDef__Group__1"


    // $ANTLR start "rule__TypeDef__Group__1__Impl"
    // InternalMyDsl.g:720:1: rule__TypeDef__Group__1__Impl : ( ( rule__TypeDef__NameAssignment_1 ) ) ;
    public final void rule__TypeDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:724:1: ( ( ( rule__TypeDef__NameAssignment_1 ) ) )
            // InternalMyDsl.g:725:1: ( ( rule__TypeDef__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:725:1: ( ( rule__TypeDef__NameAssignment_1 ) )
            // InternalMyDsl.g:726:2: ( rule__TypeDef__NameAssignment_1 )
            {
             before(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:727:2: ( rule__TypeDef__NameAssignment_1 )
            // InternalMyDsl.g:727:3: rule__TypeDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__TypeDef__Group__1__Impl"


    // $ANTLR start "rule__TypeDef__Group__2"
    // InternalMyDsl.g:735:1: rule__TypeDef__Group__2 : rule__TypeDef__Group__2__Impl rule__TypeDef__Group__3 ;
    public final void rule__TypeDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:739:1: ( rule__TypeDef__Group__2__Impl rule__TypeDef__Group__3 )
            // InternalMyDsl.g:740:2: rule__TypeDef__Group__2__Impl rule__TypeDef__Group__3
            {
            pushFollow(FOLLOW_8);
            rule__TypeDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__3();

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
    // $ANTLR end "rule__TypeDef__Group__2"


    // $ANTLR start "rule__TypeDef__Group__2__Impl"
    // InternalMyDsl.g:747:1: rule__TypeDef__Group__2__Impl : ( '=' ) ;
    public final void rule__TypeDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:751:1: ( ( '=' ) )
            // InternalMyDsl.g:752:1: ( '=' )
            {
            // InternalMyDsl.g:752:1: ( '=' )
            // InternalMyDsl.g:753:2: '='
            {
             before(grammarAccess.getTypeDefAccess().getEqualsSignKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__TypeDef__Group__2__Impl"


    // $ANTLR start "rule__TypeDef__Group__3"
    // InternalMyDsl.g:762:1: rule__TypeDef__Group__3 : rule__TypeDef__Group__3__Impl rule__TypeDef__Group__4 ;
    public final void rule__TypeDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:766:1: ( rule__TypeDef__Group__3__Impl rule__TypeDef__Group__4 )
            // InternalMyDsl.g:767:2: rule__TypeDef__Group__3__Impl rule__TypeDef__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__TypeDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__4();

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
    // $ANTLR end "rule__TypeDef__Group__3"


    // $ANTLR start "rule__TypeDef__Group__3__Impl"
    // InternalMyDsl.g:774:1: rule__TypeDef__Group__3__Impl : ( '{' ) ;
    public final void rule__TypeDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:778:1: ( ( '{' ) )
            // InternalMyDsl.g:779:1: ( '{' )
            {
            // InternalMyDsl.g:779:1: ( '{' )
            // InternalMyDsl.g:780:2: '{'
            {
             before(grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__TypeDef__Group__3__Impl"


    // $ANTLR start "rule__TypeDef__Group__4"
    // InternalMyDsl.g:789:1: rule__TypeDef__Group__4 : rule__TypeDef__Group__4__Impl rule__TypeDef__Group__5 ;
    public final void rule__TypeDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:793:1: ( rule__TypeDef__Group__4__Impl rule__TypeDef__Group__5 )
            // InternalMyDsl.g:794:2: rule__TypeDef__Group__4__Impl rule__TypeDef__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__TypeDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__5();

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
    // $ANTLR end "rule__TypeDef__Group__4"


    // $ANTLR start "rule__TypeDef__Group__4__Impl"
    // InternalMyDsl.g:801:1: rule__TypeDef__Group__4__Impl : ( ( rule__TypeDef__Group_4__0 )? ) ;
    public final void rule__TypeDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:805:1: ( ( ( rule__TypeDef__Group_4__0 )? ) )
            // InternalMyDsl.g:806:1: ( ( rule__TypeDef__Group_4__0 )? )
            {
            // InternalMyDsl.g:806:1: ( ( rule__TypeDef__Group_4__0 )? )
            // InternalMyDsl.g:807:2: ( rule__TypeDef__Group_4__0 )?
            {
             before(grammarAccess.getTypeDefAccess().getGroup_4()); 
            // InternalMyDsl.g:808:2: ( rule__TypeDef__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:808:3: rule__TypeDef__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__TypeDef__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getTypeDefAccess().getGroup_4()); 

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
    // $ANTLR end "rule__TypeDef__Group__4__Impl"


    // $ANTLR start "rule__TypeDef__Group__5"
    // InternalMyDsl.g:816:1: rule__TypeDef__Group__5 : rule__TypeDef__Group__5__Impl ;
    public final void rule__TypeDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:820:1: ( rule__TypeDef__Group__5__Impl )
            // InternalMyDsl.g:821:2: rule__TypeDef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group__5__Impl();

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
    // $ANTLR end "rule__TypeDef__Group__5"


    // $ANTLR start "rule__TypeDef__Group__5__Impl"
    // InternalMyDsl.g:827:1: rule__TypeDef__Group__5__Impl : ( '}' ) ;
    public final void rule__TypeDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:831:1: ( ( '}' ) )
            // InternalMyDsl.g:832:1: ( '}' )
            {
            // InternalMyDsl.g:832:1: ( '}' )
            // InternalMyDsl.g:833:2: '}'
            {
             before(grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__TypeDef__Group__5__Impl"


    // $ANTLR start "rule__TypeDef__Group_4__0"
    // InternalMyDsl.g:843:1: rule__TypeDef__Group_4__0 : rule__TypeDef__Group_4__0__Impl rule__TypeDef__Group_4__1 ;
    public final void rule__TypeDef__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:847:1: ( rule__TypeDef__Group_4__0__Impl rule__TypeDef__Group_4__1 )
            // InternalMyDsl.g:848:2: rule__TypeDef__Group_4__0__Impl rule__TypeDef__Group_4__1
            {
            pushFollow(FOLLOW_10);
            rule__TypeDef__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group_4__1();

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
    // $ANTLR end "rule__TypeDef__Group_4__0"


    // $ANTLR start "rule__TypeDef__Group_4__0__Impl"
    // InternalMyDsl.g:855:1: rule__TypeDef__Group_4__0__Impl : ( ( rule__TypeDef__FieldsAssignment_4_0 ) ) ;
    public final void rule__TypeDef__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:859:1: ( ( ( rule__TypeDef__FieldsAssignment_4_0 ) ) )
            // InternalMyDsl.g:860:1: ( ( rule__TypeDef__FieldsAssignment_4_0 ) )
            {
            // InternalMyDsl.g:860:1: ( ( rule__TypeDef__FieldsAssignment_4_0 ) )
            // InternalMyDsl.g:861:2: ( rule__TypeDef__FieldsAssignment_4_0 )
            {
             before(grammarAccess.getTypeDefAccess().getFieldsAssignment_4_0()); 
            // InternalMyDsl.g:862:2: ( rule__TypeDef__FieldsAssignment_4_0 )
            // InternalMyDsl.g:862:3: rule__TypeDef__FieldsAssignment_4_0
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__FieldsAssignment_4_0();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getFieldsAssignment_4_0()); 

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
    // $ANTLR end "rule__TypeDef__Group_4__0__Impl"


    // $ANTLR start "rule__TypeDef__Group_4__1"
    // InternalMyDsl.g:870:1: rule__TypeDef__Group_4__1 : rule__TypeDef__Group_4__1__Impl ;
    public final void rule__TypeDef__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:874:1: ( rule__TypeDef__Group_4__1__Impl )
            // InternalMyDsl.g:875:2: rule__TypeDef__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group_4__1__Impl();

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
    // $ANTLR end "rule__TypeDef__Group_4__1"


    // $ANTLR start "rule__TypeDef__Group_4__1__Impl"
    // InternalMyDsl.g:881:1: rule__TypeDef__Group_4__1__Impl : ( ( rule__TypeDef__Group_4_1__0 )* ) ;
    public final void rule__TypeDef__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:885:1: ( ( ( rule__TypeDef__Group_4_1__0 )* ) )
            // InternalMyDsl.g:886:1: ( ( rule__TypeDef__Group_4_1__0 )* )
            {
            // InternalMyDsl.g:886:1: ( ( rule__TypeDef__Group_4_1__0 )* )
            // InternalMyDsl.g:887:2: ( rule__TypeDef__Group_4_1__0 )*
            {
             before(grammarAccess.getTypeDefAccess().getGroup_4_1()); 
            // InternalMyDsl.g:888:2: ( rule__TypeDef__Group_4_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==18) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMyDsl.g:888:3: rule__TypeDef__Group_4_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__TypeDef__Group_4_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getTypeDefAccess().getGroup_4_1()); 

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
    // $ANTLR end "rule__TypeDef__Group_4__1__Impl"


    // $ANTLR start "rule__TypeDef__Group_4_1__0"
    // InternalMyDsl.g:897:1: rule__TypeDef__Group_4_1__0 : rule__TypeDef__Group_4_1__0__Impl rule__TypeDef__Group_4_1__1 ;
    public final void rule__TypeDef__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:901:1: ( rule__TypeDef__Group_4_1__0__Impl rule__TypeDef__Group_4_1__1 )
            // InternalMyDsl.g:902:2: rule__TypeDef__Group_4_1__0__Impl rule__TypeDef__Group_4_1__1
            {
            pushFollow(FOLLOW_3);
            rule__TypeDef__Group_4_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__TypeDef__Group_4_1__1();

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
    // $ANTLR end "rule__TypeDef__Group_4_1__0"


    // $ANTLR start "rule__TypeDef__Group_4_1__0__Impl"
    // InternalMyDsl.g:909:1: rule__TypeDef__Group_4_1__0__Impl : ( ',' ) ;
    public final void rule__TypeDef__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:913:1: ( ( ',' ) )
            // InternalMyDsl.g:914:1: ( ',' )
            {
            // InternalMyDsl.g:914:1: ( ',' )
            // InternalMyDsl.g:915:2: ','
            {
             before(grammarAccess.getTypeDefAccess().getCommaKeyword_4_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getCommaKeyword_4_1_0()); 

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
    // $ANTLR end "rule__TypeDef__Group_4_1__0__Impl"


    // $ANTLR start "rule__TypeDef__Group_4_1__1"
    // InternalMyDsl.g:924:1: rule__TypeDef__Group_4_1__1 : rule__TypeDef__Group_4_1__1__Impl ;
    public final void rule__TypeDef__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:928:1: ( rule__TypeDef__Group_4_1__1__Impl )
            // InternalMyDsl.g:929:2: rule__TypeDef__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__Group_4_1__1__Impl();

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
    // $ANTLR end "rule__TypeDef__Group_4_1__1"


    // $ANTLR start "rule__TypeDef__Group_4_1__1__Impl"
    // InternalMyDsl.g:935:1: rule__TypeDef__Group_4_1__1__Impl : ( ( rule__TypeDef__FieldsAssignment_4_1_1 ) ) ;
    public final void rule__TypeDef__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:939:1: ( ( ( rule__TypeDef__FieldsAssignment_4_1_1 ) ) )
            // InternalMyDsl.g:940:1: ( ( rule__TypeDef__FieldsAssignment_4_1_1 ) )
            {
            // InternalMyDsl.g:940:1: ( ( rule__TypeDef__FieldsAssignment_4_1_1 ) )
            // InternalMyDsl.g:941:2: ( rule__TypeDef__FieldsAssignment_4_1_1 )
            {
             before(grammarAccess.getTypeDefAccess().getFieldsAssignment_4_1_1()); 
            // InternalMyDsl.g:942:2: ( rule__TypeDef__FieldsAssignment_4_1_1 )
            // InternalMyDsl.g:942:3: rule__TypeDef__FieldsAssignment_4_1_1
            {
            pushFollow(FOLLOW_2);
            rule__TypeDef__FieldsAssignment_4_1_1();

            state._fsp--;


            }

             after(grammarAccess.getTypeDefAccess().getFieldsAssignment_4_1_1()); 

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
    // $ANTLR end "rule__TypeDef__Group_4_1__1__Impl"


    // $ANTLR start "rule__Field__Group__0"
    // InternalMyDsl.g:951:1: rule__Field__Group__0 : rule__Field__Group__0__Impl rule__Field__Group__1 ;
    public final void rule__Field__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:955:1: ( rule__Field__Group__0__Impl rule__Field__Group__1 )
            // InternalMyDsl.g:956:2: rule__Field__Group__0__Impl rule__Field__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__Field__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__1();

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
    // $ANTLR end "rule__Field__Group__0"


    // $ANTLR start "rule__Field__Group__0__Impl"
    // InternalMyDsl.g:963:1: rule__Field__Group__0__Impl : ( ( rule__Field__NameAssignment_0 ) ) ;
    public final void rule__Field__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:967:1: ( ( ( rule__Field__NameAssignment_0 ) ) )
            // InternalMyDsl.g:968:1: ( ( rule__Field__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:968:1: ( ( rule__Field__NameAssignment_0 ) )
            // InternalMyDsl.g:969:2: ( rule__Field__NameAssignment_0 )
            {
             before(grammarAccess.getFieldAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:970:2: ( rule__Field__NameAssignment_0 )
            // InternalMyDsl.g:970:3: rule__Field__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Field__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__Field__Group__0__Impl"


    // $ANTLR start "rule__Field__Group__1"
    // InternalMyDsl.g:978:1: rule__Field__Group__1 : rule__Field__Group__1__Impl rule__Field__Group__2 ;
    public final void rule__Field__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:982:1: ( rule__Field__Group__1__Impl rule__Field__Group__2 )
            // InternalMyDsl.g:983:2: rule__Field__Group__1__Impl rule__Field__Group__2
            {
            pushFollow(FOLLOW_13);
            rule__Field__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Field__Group__2();

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
    // $ANTLR end "rule__Field__Group__1"


    // $ANTLR start "rule__Field__Group__1__Impl"
    // InternalMyDsl.g:990:1: rule__Field__Group__1__Impl : ( ':' ) ;
    public final void rule__Field__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:994:1: ( ( ':' ) )
            // InternalMyDsl.g:995:1: ( ':' )
            {
            // InternalMyDsl.g:995:1: ( ':' )
            // InternalMyDsl.g:996:2: ':'
            {
             before(grammarAccess.getFieldAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__Field__Group__1__Impl"


    // $ANTLR start "rule__Field__Group__2"
    // InternalMyDsl.g:1005:1: rule__Field__Group__2 : rule__Field__Group__2__Impl ;
    public final void rule__Field__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1009:1: ( rule__Field__Group__2__Impl )
            // InternalMyDsl.g:1010:2: rule__Field__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Field__Group__2__Impl();

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
    // $ANTLR end "rule__Field__Group__2"


    // $ANTLR start "rule__Field__Group__2__Impl"
    // InternalMyDsl.g:1016:1: rule__Field__Group__2__Impl : ( ( rule__Field__TypeAssignment_2 ) ) ;
    public final void rule__Field__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1020:1: ( ( ( rule__Field__TypeAssignment_2 ) ) )
            // InternalMyDsl.g:1021:1: ( ( rule__Field__TypeAssignment_2 ) )
            {
            // InternalMyDsl.g:1021:1: ( ( rule__Field__TypeAssignment_2 ) )
            // InternalMyDsl.g:1022:2: ( rule__Field__TypeAssignment_2 )
            {
             before(grammarAccess.getFieldAccess().getTypeAssignment_2()); 
            // InternalMyDsl.g:1023:2: ( rule__Field__TypeAssignment_2 )
            // InternalMyDsl.g:1023:3: rule__Field__TypeAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Field__TypeAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldAccess().getTypeAssignment_2()); 

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
    // $ANTLR end "rule__Field__Group__2__Impl"


    // $ANTLR start "rule__FieldType__Group__0"
    // InternalMyDsl.g:1032:1: rule__FieldType__Group__0 : rule__FieldType__Group__0__Impl rule__FieldType__Group__1 ;
    public final void rule__FieldType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1036:1: ( rule__FieldType__Group__0__Impl rule__FieldType__Group__1 )
            // InternalMyDsl.g:1037:2: rule__FieldType__Group__0__Impl rule__FieldType__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__FieldType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldType__Group__1();

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
    // $ANTLR end "rule__FieldType__Group__0"


    // $ANTLR start "rule__FieldType__Group__0__Impl"
    // InternalMyDsl.g:1044:1: rule__FieldType__Group__0__Impl : ( ( rule__FieldType__UnionAssignment_0 ) ) ;
    public final void rule__FieldType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1048:1: ( ( ( rule__FieldType__UnionAssignment_0 ) ) )
            // InternalMyDsl.g:1049:1: ( ( rule__FieldType__UnionAssignment_0 ) )
            {
            // InternalMyDsl.g:1049:1: ( ( rule__FieldType__UnionAssignment_0 ) )
            // InternalMyDsl.g:1050:2: ( rule__FieldType__UnionAssignment_0 )
            {
             before(grammarAccess.getFieldTypeAccess().getUnionAssignment_0()); 
            // InternalMyDsl.g:1051:2: ( rule__FieldType__UnionAssignment_0 )
            // InternalMyDsl.g:1051:3: rule__FieldType__UnionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FieldType__UnionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldTypeAccess().getUnionAssignment_0()); 

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
    // $ANTLR end "rule__FieldType__Group__0__Impl"


    // $ANTLR start "rule__FieldType__Group__1"
    // InternalMyDsl.g:1059:1: rule__FieldType__Group__1 : rule__FieldType__Group__1__Impl ;
    public final void rule__FieldType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1063:1: ( rule__FieldType__Group__1__Impl )
            // InternalMyDsl.g:1064:2: rule__FieldType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldType__Group__1__Impl();

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
    // $ANTLR end "rule__FieldType__Group__1"


    // $ANTLR start "rule__FieldType__Group__1__Impl"
    // InternalMyDsl.g:1070:1: rule__FieldType__Group__1__Impl : ( ( rule__FieldType__ArrayAssignment_1 )? ) ;
    public final void rule__FieldType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1074:1: ( ( ( rule__FieldType__ArrayAssignment_1 )? ) )
            // InternalMyDsl.g:1075:1: ( ( rule__FieldType__ArrayAssignment_1 )? )
            {
            // InternalMyDsl.g:1075:1: ( ( rule__FieldType__ArrayAssignment_1 )? )
            // InternalMyDsl.g:1076:2: ( rule__FieldType__ArrayAssignment_1 )?
            {
             before(grammarAccess.getFieldTypeAccess().getArrayAssignment_1()); 
            // InternalMyDsl.g:1077:2: ( rule__FieldType__ArrayAssignment_1 )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==24) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalMyDsl.g:1077:3: rule__FieldType__ArrayAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__FieldType__ArrayAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getFieldTypeAccess().getArrayAssignment_1()); 

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
    // $ANTLR end "rule__FieldType__Group__1__Impl"


    // $ANTLR start "rule__UnionType__Group__0"
    // InternalMyDsl.g:1086:1: rule__UnionType__Group__0 : rule__UnionType__Group__0__Impl rule__UnionType__Group__1 ;
    public final void rule__UnionType__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1090:1: ( rule__UnionType__Group__0__Impl rule__UnionType__Group__1 )
            // InternalMyDsl.g:1091:2: rule__UnionType__Group__0__Impl rule__UnionType__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__UnionType__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionType__Group__1();

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
    // $ANTLR end "rule__UnionType__Group__0"


    // $ANTLR start "rule__UnionType__Group__0__Impl"
    // InternalMyDsl.g:1098:1: rule__UnionType__Group__0__Impl : ( ( rule__UnionType__TypesAssignment_0 ) ) ;
    public final void rule__UnionType__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1102:1: ( ( ( rule__UnionType__TypesAssignment_0 ) ) )
            // InternalMyDsl.g:1103:1: ( ( rule__UnionType__TypesAssignment_0 ) )
            {
            // InternalMyDsl.g:1103:1: ( ( rule__UnionType__TypesAssignment_0 ) )
            // InternalMyDsl.g:1104:2: ( rule__UnionType__TypesAssignment_0 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_0()); 
            // InternalMyDsl.g:1105:2: ( rule__UnionType__TypesAssignment_0 )
            // InternalMyDsl.g:1105:3: rule__UnionType__TypesAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__UnionType__TypesAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getTypesAssignment_0()); 

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
    // $ANTLR end "rule__UnionType__Group__0__Impl"


    // $ANTLR start "rule__UnionType__Group__1"
    // InternalMyDsl.g:1113:1: rule__UnionType__Group__1 : rule__UnionType__Group__1__Impl ;
    public final void rule__UnionType__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1117:1: ( rule__UnionType__Group__1__Impl )
            // InternalMyDsl.g:1118:2: rule__UnionType__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionType__Group__1__Impl();

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
    // $ANTLR end "rule__UnionType__Group__1"


    // $ANTLR start "rule__UnionType__Group__1__Impl"
    // InternalMyDsl.g:1124:1: rule__UnionType__Group__1__Impl : ( ( rule__UnionType__Group_1__0 )* ) ;
    public final void rule__UnionType__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1128:1: ( ( ( rule__UnionType__Group_1__0 )* ) )
            // InternalMyDsl.g:1129:1: ( ( rule__UnionType__Group_1__0 )* )
            {
            // InternalMyDsl.g:1129:1: ( ( rule__UnionType__Group_1__0 )* )
            // InternalMyDsl.g:1130:2: ( rule__UnionType__Group_1__0 )*
            {
             before(grammarAccess.getUnionTypeAccess().getGroup_1()); 
            // InternalMyDsl.g:1131:2: ( rule__UnionType__Group_1__0 )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==20) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // InternalMyDsl.g:1131:3: rule__UnionType__Group_1__0
            	    {
            	    pushFollow(FOLLOW_16);
            	    rule__UnionType__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);

             after(grammarAccess.getUnionTypeAccess().getGroup_1()); 

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
    // $ANTLR end "rule__UnionType__Group__1__Impl"


    // $ANTLR start "rule__UnionType__Group_1__0"
    // InternalMyDsl.g:1140:1: rule__UnionType__Group_1__0 : rule__UnionType__Group_1__0__Impl rule__UnionType__Group_1__1 ;
    public final void rule__UnionType__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1144:1: ( rule__UnionType__Group_1__0__Impl rule__UnionType__Group_1__1 )
            // InternalMyDsl.g:1145:2: rule__UnionType__Group_1__0__Impl rule__UnionType__Group_1__1
            {
            pushFollow(FOLLOW_13);
            rule__UnionType__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__UnionType__Group_1__1();

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
    // $ANTLR end "rule__UnionType__Group_1__0"


    // $ANTLR start "rule__UnionType__Group_1__0__Impl"
    // InternalMyDsl.g:1152:1: rule__UnionType__Group_1__0__Impl : ( '|' ) ;
    public final void rule__UnionType__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1156:1: ( ( '|' ) )
            // InternalMyDsl.g:1157:1: ( '|' )
            {
            // InternalMyDsl.g:1157:1: ( '|' )
            // InternalMyDsl.g:1158:2: '|'
            {
             before(grammarAccess.getUnionTypeAccess().getVerticalLineKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getUnionTypeAccess().getVerticalLineKeyword_1_0()); 

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
    // $ANTLR end "rule__UnionType__Group_1__0__Impl"


    // $ANTLR start "rule__UnionType__Group_1__1"
    // InternalMyDsl.g:1167:1: rule__UnionType__Group_1__1 : rule__UnionType__Group_1__1__Impl ;
    public final void rule__UnionType__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1171:1: ( rule__UnionType__Group_1__1__Impl )
            // InternalMyDsl.g:1172:2: rule__UnionType__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__UnionType__Group_1__1__Impl();

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
    // $ANTLR end "rule__UnionType__Group_1__1"


    // $ANTLR start "rule__UnionType__Group_1__1__Impl"
    // InternalMyDsl.g:1178:1: rule__UnionType__Group_1__1__Impl : ( ( rule__UnionType__TypesAssignment_1_1 ) ) ;
    public final void rule__UnionType__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1182:1: ( ( ( rule__UnionType__TypesAssignment_1_1 ) ) )
            // InternalMyDsl.g:1183:1: ( ( rule__UnionType__TypesAssignment_1_1 ) )
            {
            // InternalMyDsl.g:1183:1: ( ( rule__UnionType__TypesAssignment_1_1 ) )
            // InternalMyDsl.g:1184:2: ( rule__UnionType__TypesAssignment_1_1 )
            {
             before(grammarAccess.getUnionTypeAccess().getTypesAssignment_1_1()); 
            // InternalMyDsl.g:1185:2: ( rule__UnionType__TypesAssignment_1_1 )
            // InternalMyDsl.g:1185:3: rule__UnionType__TypesAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__UnionType__TypesAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getUnionTypeAccess().getTypesAssignment_1_1()); 

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
    // $ANTLR end "rule__UnionType__Group_1__1__Impl"


    // $ANTLR start "rule__VarDef__Group__0"
    // InternalMyDsl.g:1194:1: rule__VarDef__Group__0 : rule__VarDef__Group__0__Impl rule__VarDef__Group__1 ;
    public final void rule__VarDef__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1198:1: ( rule__VarDef__Group__0__Impl rule__VarDef__Group__1 )
            // InternalMyDsl.g:1199:2: rule__VarDef__Group__0__Impl rule__VarDef__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__VarDef__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDef__Group__1();

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
    // $ANTLR end "rule__VarDef__Group__0"


    // $ANTLR start "rule__VarDef__Group__0__Impl"
    // InternalMyDsl.g:1206:1: rule__VarDef__Group__0__Impl : ( 'var' ) ;
    public final void rule__VarDef__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1210:1: ( ( 'var' ) )
            // InternalMyDsl.g:1211:1: ( 'var' )
            {
            // InternalMyDsl.g:1211:1: ( 'var' )
            // InternalMyDsl.g:1212:2: 'var'
            {
             before(grammarAccess.getVarDefAccess().getVarKeyword_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getVarDefAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__VarDef__Group__0__Impl"


    // $ANTLR start "rule__VarDef__Group__1"
    // InternalMyDsl.g:1221:1: rule__VarDef__Group__1 : rule__VarDef__Group__1__Impl rule__VarDef__Group__2 ;
    public final void rule__VarDef__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1225:1: ( rule__VarDef__Group__1__Impl rule__VarDef__Group__2 )
            // InternalMyDsl.g:1226:2: rule__VarDef__Group__1__Impl rule__VarDef__Group__2
            {
            pushFollow(FOLLOW_12);
            rule__VarDef__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDef__Group__2();

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
    // $ANTLR end "rule__VarDef__Group__1"


    // $ANTLR start "rule__VarDef__Group__1__Impl"
    // InternalMyDsl.g:1233:1: rule__VarDef__Group__1__Impl : ( ( rule__VarDef__NameAssignment_1 ) ) ;
    public final void rule__VarDef__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1237:1: ( ( ( rule__VarDef__NameAssignment_1 ) ) )
            // InternalMyDsl.g:1238:1: ( ( rule__VarDef__NameAssignment_1 ) )
            {
            // InternalMyDsl.g:1238:1: ( ( rule__VarDef__NameAssignment_1 ) )
            // InternalMyDsl.g:1239:2: ( rule__VarDef__NameAssignment_1 )
            {
             before(grammarAccess.getVarDefAccess().getNameAssignment_1()); 
            // InternalMyDsl.g:1240:2: ( rule__VarDef__NameAssignment_1 )
            // InternalMyDsl.g:1240:3: rule__VarDef__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__VarDef__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVarDefAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__VarDef__Group__1__Impl"


    // $ANTLR start "rule__VarDef__Group__2"
    // InternalMyDsl.g:1248:1: rule__VarDef__Group__2 : rule__VarDef__Group__2__Impl rule__VarDef__Group__3 ;
    public final void rule__VarDef__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1252:1: ( rule__VarDef__Group__2__Impl rule__VarDef__Group__3 )
            // InternalMyDsl.g:1253:2: rule__VarDef__Group__2__Impl rule__VarDef__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__VarDef__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDef__Group__3();

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
    // $ANTLR end "rule__VarDef__Group__2"


    // $ANTLR start "rule__VarDef__Group__2__Impl"
    // InternalMyDsl.g:1260:1: rule__VarDef__Group__2__Impl : ( ':' ) ;
    public final void rule__VarDef__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1264:1: ( ( ':' ) )
            // InternalMyDsl.g:1265:1: ( ':' )
            {
            // InternalMyDsl.g:1265:1: ( ':' )
            // InternalMyDsl.g:1266:2: ':'
            {
             before(grammarAccess.getVarDefAccess().getColonKeyword_2()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getVarDefAccess().getColonKeyword_2()); 

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
    // $ANTLR end "rule__VarDef__Group__2__Impl"


    // $ANTLR start "rule__VarDef__Group__3"
    // InternalMyDsl.g:1275:1: rule__VarDef__Group__3 : rule__VarDef__Group__3__Impl rule__VarDef__Group__4 ;
    public final void rule__VarDef__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1279:1: ( rule__VarDef__Group__3__Impl rule__VarDef__Group__4 )
            // InternalMyDsl.g:1280:2: rule__VarDef__Group__3__Impl rule__VarDef__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__VarDef__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDef__Group__4();

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
    // $ANTLR end "rule__VarDef__Group__3"


    // $ANTLR start "rule__VarDef__Group__3__Impl"
    // InternalMyDsl.g:1287:1: rule__VarDef__Group__3__Impl : ( ( rule__VarDef__TypeAssignment_3 ) ) ;
    public final void rule__VarDef__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1291:1: ( ( ( rule__VarDef__TypeAssignment_3 ) ) )
            // InternalMyDsl.g:1292:1: ( ( rule__VarDef__TypeAssignment_3 ) )
            {
            // InternalMyDsl.g:1292:1: ( ( rule__VarDef__TypeAssignment_3 ) )
            // InternalMyDsl.g:1293:2: ( rule__VarDef__TypeAssignment_3 )
            {
             before(grammarAccess.getVarDefAccess().getTypeAssignment_3()); 
            // InternalMyDsl.g:1294:2: ( rule__VarDef__TypeAssignment_3 )
            // InternalMyDsl.g:1294:3: rule__VarDef__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__VarDef__TypeAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVarDefAccess().getTypeAssignment_3()); 

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
    // $ANTLR end "rule__VarDef__Group__3__Impl"


    // $ANTLR start "rule__VarDef__Group__4"
    // InternalMyDsl.g:1302:1: rule__VarDef__Group__4 : rule__VarDef__Group__4__Impl rule__VarDef__Group__5 ;
    public final void rule__VarDef__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1306:1: ( rule__VarDef__Group__4__Impl rule__VarDef__Group__5 )
            // InternalMyDsl.g:1307:2: rule__VarDef__Group__4__Impl rule__VarDef__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__VarDef__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__VarDef__Group__5();

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
    // $ANTLR end "rule__VarDef__Group__4"


    // $ANTLR start "rule__VarDef__Group__4__Impl"
    // InternalMyDsl.g:1314:1: rule__VarDef__Group__4__Impl : ( '=' ) ;
    public final void rule__VarDef__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1318:1: ( ( '=' ) )
            // InternalMyDsl.g:1319:1: ( '=' )
            {
            // InternalMyDsl.g:1319:1: ( '=' )
            // InternalMyDsl.g:1320:2: '='
            {
             before(grammarAccess.getVarDefAccess().getEqualsSignKeyword_4()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getVarDefAccess().getEqualsSignKeyword_4()); 

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
    // $ANTLR end "rule__VarDef__Group__4__Impl"


    // $ANTLR start "rule__VarDef__Group__5"
    // InternalMyDsl.g:1329:1: rule__VarDef__Group__5 : rule__VarDef__Group__5__Impl ;
    public final void rule__VarDef__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1333:1: ( rule__VarDef__Group__5__Impl )
            // InternalMyDsl.g:1334:2: rule__VarDef__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__VarDef__Group__5__Impl();

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
    // $ANTLR end "rule__VarDef__Group__5"


    // $ANTLR start "rule__VarDef__Group__5__Impl"
    // InternalMyDsl.g:1340:1: rule__VarDef__Group__5__Impl : ( ( rule__VarDef__ValueAssignment_5 ) ) ;
    public final void rule__VarDef__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1344:1: ( ( ( rule__VarDef__ValueAssignment_5 ) ) )
            // InternalMyDsl.g:1345:1: ( ( rule__VarDef__ValueAssignment_5 ) )
            {
            // InternalMyDsl.g:1345:1: ( ( rule__VarDef__ValueAssignment_5 ) )
            // InternalMyDsl.g:1346:2: ( rule__VarDef__ValueAssignment_5 )
            {
             before(grammarAccess.getVarDefAccess().getValueAssignment_5()); 
            // InternalMyDsl.g:1347:2: ( rule__VarDef__ValueAssignment_5 )
            // InternalMyDsl.g:1347:3: rule__VarDef__ValueAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__VarDef__ValueAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getVarDefAccess().getValueAssignment_5()); 

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
    // $ANTLR end "rule__VarDef__Group__5__Impl"


    // $ANTLR start "rule__StructValue__Group__0"
    // InternalMyDsl.g:1356:1: rule__StructValue__Group__0 : rule__StructValue__Group__0__Impl rule__StructValue__Group__1 ;
    public final void rule__StructValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1360:1: ( rule__StructValue__Group__0__Impl rule__StructValue__Group__1 )
            // InternalMyDsl.g:1361:2: rule__StructValue__Group__0__Impl rule__StructValue__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__StructValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructValue__Group__1();

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
    // $ANTLR end "rule__StructValue__Group__0"


    // $ANTLR start "rule__StructValue__Group__0__Impl"
    // InternalMyDsl.g:1368:1: rule__StructValue__Group__0__Impl : ( '{' ) ;
    public final void rule__StructValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1372:1: ( ( '{' ) )
            // InternalMyDsl.g:1373:1: ( '{' )
            {
            // InternalMyDsl.g:1373:1: ( '{' )
            // InternalMyDsl.g:1374:2: '{'
            {
             before(grammarAccess.getStructValueAccess().getLeftCurlyBracketKeyword_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getStructValueAccess().getLeftCurlyBracketKeyword_0()); 

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
    // $ANTLR end "rule__StructValue__Group__0__Impl"


    // $ANTLR start "rule__StructValue__Group__1"
    // InternalMyDsl.g:1383:1: rule__StructValue__Group__1 : rule__StructValue__Group__1__Impl rule__StructValue__Group__2 ;
    public final void rule__StructValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1387:1: ( rule__StructValue__Group__1__Impl rule__StructValue__Group__2 )
            // InternalMyDsl.g:1388:2: rule__StructValue__Group__1__Impl rule__StructValue__Group__2
            {
            pushFollow(FOLLOW_9);
            rule__StructValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructValue__Group__2();

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
    // $ANTLR end "rule__StructValue__Group__1"


    // $ANTLR start "rule__StructValue__Group__1__Impl"
    // InternalMyDsl.g:1395:1: rule__StructValue__Group__1__Impl : ( ( rule__StructValue__Group_1__0 )? ) ;
    public final void rule__StructValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1399:1: ( ( ( rule__StructValue__Group_1__0 )? ) )
            // InternalMyDsl.g:1400:1: ( ( rule__StructValue__Group_1__0 )? )
            {
            // InternalMyDsl.g:1400:1: ( ( rule__StructValue__Group_1__0 )? )
            // InternalMyDsl.g:1401:2: ( rule__StructValue__Group_1__0 )?
            {
             before(grammarAccess.getStructValueAccess().getGroup_1()); 
            // InternalMyDsl.g:1402:2: ( rule__StructValue__Group_1__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_ID) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:1402:3: rule__StructValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__StructValue__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getStructValueAccess().getGroup_1()); 

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
    // $ANTLR end "rule__StructValue__Group__1__Impl"


    // $ANTLR start "rule__StructValue__Group__2"
    // InternalMyDsl.g:1410:1: rule__StructValue__Group__2 : rule__StructValue__Group__2__Impl ;
    public final void rule__StructValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1414:1: ( rule__StructValue__Group__2__Impl )
            // InternalMyDsl.g:1415:2: rule__StructValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructValue__Group__2__Impl();

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
    // $ANTLR end "rule__StructValue__Group__2"


    // $ANTLR start "rule__StructValue__Group__2__Impl"
    // InternalMyDsl.g:1421:1: rule__StructValue__Group__2__Impl : ( '}' ) ;
    public final void rule__StructValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1425:1: ( ( '}' ) )
            // InternalMyDsl.g:1426:1: ( '}' )
            {
            // InternalMyDsl.g:1426:1: ( '}' )
            // InternalMyDsl.g:1427:2: '}'
            {
             before(grammarAccess.getStructValueAccess().getRightCurlyBracketKeyword_2()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getStructValueAccess().getRightCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__StructValue__Group__2__Impl"


    // $ANTLR start "rule__StructValue__Group_1__0"
    // InternalMyDsl.g:1437:1: rule__StructValue__Group_1__0 : rule__StructValue__Group_1__0__Impl rule__StructValue__Group_1__1 ;
    public final void rule__StructValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1441:1: ( rule__StructValue__Group_1__0__Impl rule__StructValue__Group_1__1 )
            // InternalMyDsl.g:1442:2: rule__StructValue__Group_1__0__Impl rule__StructValue__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__StructValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructValue__Group_1__1();

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
    // $ANTLR end "rule__StructValue__Group_1__0"


    // $ANTLR start "rule__StructValue__Group_1__0__Impl"
    // InternalMyDsl.g:1449:1: rule__StructValue__Group_1__0__Impl : ( ( rule__StructValue__EntriesAssignment_1_0 ) ) ;
    public final void rule__StructValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1453:1: ( ( ( rule__StructValue__EntriesAssignment_1_0 ) ) )
            // InternalMyDsl.g:1454:1: ( ( rule__StructValue__EntriesAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1454:1: ( ( rule__StructValue__EntriesAssignment_1_0 ) )
            // InternalMyDsl.g:1455:2: ( rule__StructValue__EntriesAssignment_1_0 )
            {
             before(grammarAccess.getStructValueAccess().getEntriesAssignment_1_0()); 
            // InternalMyDsl.g:1456:2: ( rule__StructValue__EntriesAssignment_1_0 )
            // InternalMyDsl.g:1456:3: rule__StructValue__EntriesAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__StructValue__EntriesAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getStructValueAccess().getEntriesAssignment_1_0()); 

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
    // $ANTLR end "rule__StructValue__Group_1__0__Impl"


    // $ANTLR start "rule__StructValue__Group_1__1"
    // InternalMyDsl.g:1464:1: rule__StructValue__Group_1__1 : rule__StructValue__Group_1__1__Impl ;
    public final void rule__StructValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1468:1: ( rule__StructValue__Group_1__1__Impl )
            // InternalMyDsl.g:1469:2: rule__StructValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructValue__Group_1__1__Impl();

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
    // $ANTLR end "rule__StructValue__Group_1__1"


    // $ANTLR start "rule__StructValue__Group_1__1__Impl"
    // InternalMyDsl.g:1475:1: rule__StructValue__Group_1__1__Impl : ( ( rule__StructValue__Group_1_1__0 )* ) ;
    public final void rule__StructValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1479:1: ( ( ( rule__StructValue__Group_1_1__0 )* ) )
            // InternalMyDsl.g:1480:1: ( ( rule__StructValue__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:1480:1: ( ( rule__StructValue__Group_1_1__0 )* )
            // InternalMyDsl.g:1481:2: ( rule__StructValue__Group_1_1__0 )*
            {
             before(grammarAccess.getStructValueAccess().getGroup_1_1()); 
            // InternalMyDsl.g:1482:2: ( rule__StructValue__Group_1_1__0 )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==18) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // InternalMyDsl.g:1482:3: rule__StructValue__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__StructValue__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);

             after(grammarAccess.getStructValueAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__StructValue__Group_1__1__Impl"


    // $ANTLR start "rule__StructValue__Group_1_1__0"
    // InternalMyDsl.g:1491:1: rule__StructValue__Group_1_1__0 : rule__StructValue__Group_1_1__0__Impl rule__StructValue__Group_1_1__1 ;
    public final void rule__StructValue__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1495:1: ( rule__StructValue__Group_1_1__0__Impl rule__StructValue__Group_1_1__1 )
            // InternalMyDsl.g:1496:2: rule__StructValue__Group_1_1__0__Impl rule__StructValue__Group_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__StructValue__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__StructValue__Group_1_1__1();

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
    // $ANTLR end "rule__StructValue__Group_1_1__0"


    // $ANTLR start "rule__StructValue__Group_1_1__0__Impl"
    // InternalMyDsl.g:1503:1: rule__StructValue__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__StructValue__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1507:1: ( ( ',' ) )
            // InternalMyDsl.g:1508:1: ( ',' )
            {
            // InternalMyDsl.g:1508:1: ( ',' )
            // InternalMyDsl.g:1509:2: ','
            {
             before(grammarAccess.getStructValueAccess().getCommaKeyword_1_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getStructValueAccess().getCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__StructValue__Group_1_1__0__Impl"


    // $ANTLR start "rule__StructValue__Group_1_1__1"
    // InternalMyDsl.g:1518:1: rule__StructValue__Group_1_1__1 : rule__StructValue__Group_1_1__1__Impl ;
    public final void rule__StructValue__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1522:1: ( rule__StructValue__Group_1_1__1__Impl )
            // InternalMyDsl.g:1523:2: rule__StructValue__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__StructValue__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__StructValue__Group_1_1__1"


    // $ANTLR start "rule__StructValue__Group_1_1__1__Impl"
    // InternalMyDsl.g:1529:1: rule__StructValue__Group_1_1__1__Impl : ( ( rule__StructValue__EntriesAssignment_1_1_1 ) ) ;
    public final void rule__StructValue__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1533:1: ( ( ( rule__StructValue__EntriesAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:1534:1: ( ( rule__StructValue__EntriesAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:1534:1: ( ( rule__StructValue__EntriesAssignment_1_1_1 ) )
            // InternalMyDsl.g:1535:2: ( rule__StructValue__EntriesAssignment_1_1_1 )
            {
             before(grammarAccess.getStructValueAccess().getEntriesAssignment_1_1_1()); 
            // InternalMyDsl.g:1536:2: ( rule__StructValue__EntriesAssignment_1_1_1 )
            // InternalMyDsl.g:1536:3: rule__StructValue__EntriesAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__StructValue__EntriesAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getStructValueAccess().getEntriesAssignment_1_1_1()); 

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
    // $ANTLR end "rule__StructValue__Group_1_1__1__Impl"


    // $ANTLR start "rule__FieldValue__Group__0"
    // InternalMyDsl.g:1545:1: rule__FieldValue__Group__0 : rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1 ;
    public final void rule__FieldValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1549:1: ( rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1 )
            // InternalMyDsl.g:1550:2: rule__FieldValue__Group__0__Impl rule__FieldValue__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__FieldValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__1();

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
    // $ANTLR end "rule__FieldValue__Group__0"


    // $ANTLR start "rule__FieldValue__Group__0__Impl"
    // InternalMyDsl.g:1557:1: rule__FieldValue__Group__0__Impl : ( ( rule__FieldValue__NameAssignment_0 ) ) ;
    public final void rule__FieldValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1561:1: ( ( ( rule__FieldValue__NameAssignment_0 ) ) )
            // InternalMyDsl.g:1562:1: ( ( rule__FieldValue__NameAssignment_0 ) )
            {
            // InternalMyDsl.g:1562:1: ( ( rule__FieldValue__NameAssignment_0 ) )
            // InternalMyDsl.g:1563:2: ( rule__FieldValue__NameAssignment_0 )
            {
             before(grammarAccess.getFieldValueAccess().getNameAssignment_0()); 
            // InternalMyDsl.g:1564:2: ( rule__FieldValue__NameAssignment_0 )
            // InternalMyDsl.g:1564:3: rule__FieldValue__NameAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__NameAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getFieldValueAccess().getNameAssignment_0()); 

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
    // $ANTLR end "rule__FieldValue__Group__0__Impl"


    // $ANTLR start "rule__FieldValue__Group__1"
    // InternalMyDsl.g:1572:1: rule__FieldValue__Group__1 : rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2 ;
    public final void rule__FieldValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1576:1: ( rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2 )
            // InternalMyDsl.g:1577:2: rule__FieldValue__Group__1__Impl rule__FieldValue__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__FieldValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__2();

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
    // $ANTLR end "rule__FieldValue__Group__1"


    // $ANTLR start "rule__FieldValue__Group__1__Impl"
    // InternalMyDsl.g:1584:1: rule__FieldValue__Group__1__Impl : ( ':' ) ;
    public final void rule__FieldValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1588:1: ( ( ':' ) )
            // InternalMyDsl.g:1589:1: ( ':' )
            {
            // InternalMyDsl.g:1589:1: ( ':' )
            // InternalMyDsl.g:1590:2: ':'
            {
             before(grammarAccess.getFieldValueAccess().getColonKeyword_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getFieldValueAccess().getColonKeyword_1()); 

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
    // $ANTLR end "rule__FieldValue__Group__1__Impl"


    // $ANTLR start "rule__FieldValue__Group__2"
    // InternalMyDsl.g:1599:1: rule__FieldValue__Group__2 : rule__FieldValue__Group__2__Impl ;
    public final void rule__FieldValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1603:1: ( rule__FieldValue__Group__2__Impl )
            // InternalMyDsl.g:1604:2: rule__FieldValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__Group__2__Impl();

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
    // $ANTLR end "rule__FieldValue__Group__2"


    // $ANTLR start "rule__FieldValue__Group__2__Impl"
    // InternalMyDsl.g:1610:1: rule__FieldValue__Group__2__Impl : ( ( rule__FieldValue__ValueAssignment_2 ) ) ;
    public final void rule__FieldValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1614:1: ( ( ( rule__FieldValue__ValueAssignment_2 ) ) )
            // InternalMyDsl.g:1615:1: ( ( rule__FieldValue__ValueAssignment_2 ) )
            {
            // InternalMyDsl.g:1615:1: ( ( rule__FieldValue__ValueAssignment_2 ) )
            // InternalMyDsl.g:1616:2: ( rule__FieldValue__ValueAssignment_2 )
            {
             before(grammarAccess.getFieldValueAccess().getValueAssignment_2()); 
            // InternalMyDsl.g:1617:2: ( rule__FieldValue__ValueAssignment_2 )
            // InternalMyDsl.g:1617:3: rule__FieldValue__ValueAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__FieldValue__ValueAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getFieldValueAccess().getValueAssignment_2()); 

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
    // $ANTLR end "rule__FieldValue__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group__0"
    // InternalMyDsl.g:1626:1: rule__ArrayValue__Group__0 : rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 ;
    public final void rule__ArrayValue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1630:1: ( rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1 )
            // InternalMyDsl.g:1631:2: rule__ArrayValue__Group__0__Impl rule__ArrayValue__Group__1
            {
            pushFollow(FOLLOW_18);
            rule__ArrayValue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__1();

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
    // $ANTLR end "rule__ArrayValue__Group__0"


    // $ANTLR start "rule__ArrayValue__Group__0__Impl"
    // InternalMyDsl.g:1638:1: rule__ArrayValue__Group__0__Impl : ( '[' ) ;
    public final void rule__ArrayValue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1642:1: ( ( '[' ) )
            // InternalMyDsl.g:1643:1: ( '[' )
            {
            // InternalMyDsl.g:1643:1: ( '[' )
            // InternalMyDsl.g:1644:2: '['
            {
             before(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0()); 

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
    // $ANTLR end "rule__ArrayValue__Group__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group__1"
    // InternalMyDsl.g:1653:1: rule__ArrayValue__Group__1 : rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 ;
    public final void rule__ArrayValue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1657:1: ( rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2 )
            // InternalMyDsl.g:1658:2: rule__ArrayValue__Group__1__Impl rule__ArrayValue__Group__2
            {
            pushFollow(FOLLOW_18);
            rule__ArrayValue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__2();

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
    // $ANTLR end "rule__ArrayValue__Group__1"


    // $ANTLR start "rule__ArrayValue__Group__1__Impl"
    // InternalMyDsl.g:1665:1: rule__ArrayValue__Group__1__Impl : ( ( rule__ArrayValue__Group_1__0 )? ) ;
    public final void rule__ArrayValue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1669:1: ( ( ( rule__ArrayValue__Group_1__0 )? ) )
            // InternalMyDsl.g:1670:1: ( ( rule__ArrayValue__Group_1__0 )? )
            {
            // InternalMyDsl.g:1670:1: ( ( rule__ArrayValue__Group_1__0 )? )
            // InternalMyDsl.g:1671:2: ( rule__ArrayValue__Group_1__0 )?
            {
             before(grammarAccess.getArrayValueAccess().getGroup_1()); 
            // InternalMyDsl.g:1672:2: ( rule__ArrayValue__Group_1__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==16||LA13_0==22) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:1672:3: rule__ArrayValue__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__ArrayValue__Group_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getArrayValueAccess().getGroup_1()); 

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
    // $ANTLR end "rule__ArrayValue__Group__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group__2"
    // InternalMyDsl.g:1680:1: rule__ArrayValue__Group__2 : rule__ArrayValue__Group__2__Impl ;
    public final void rule__ArrayValue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1684:1: ( rule__ArrayValue__Group__2__Impl )
            // InternalMyDsl.g:1685:2: rule__ArrayValue__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group__2__Impl();

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
    // $ANTLR end "rule__ArrayValue__Group__2"


    // $ANTLR start "rule__ArrayValue__Group__2__Impl"
    // InternalMyDsl.g:1691:1: rule__ArrayValue__Group__2__Impl : ( ']' ) ;
    public final void rule__ArrayValue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1695:1: ( ( ']' ) )
            // InternalMyDsl.g:1696:1: ( ']' )
            {
            // InternalMyDsl.g:1696:1: ( ']' )
            // InternalMyDsl.g:1697:2: ']'
            {
             before(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_2()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_2()); 

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
    // $ANTLR end "rule__ArrayValue__Group__2__Impl"


    // $ANTLR start "rule__ArrayValue__Group_1__0"
    // InternalMyDsl.g:1707:1: rule__ArrayValue__Group_1__0 : rule__ArrayValue__Group_1__0__Impl rule__ArrayValue__Group_1__1 ;
    public final void rule__ArrayValue__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1711:1: ( rule__ArrayValue__Group_1__0__Impl rule__ArrayValue__Group_1__1 )
            // InternalMyDsl.g:1712:2: rule__ArrayValue__Group_1__0__Impl rule__ArrayValue__Group_1__1
            {
            pushFollow(FOLLOW_10);
            rule__ArrayValue__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_1__1();

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
    // $ANTLR end "rule__ArrayValue__Group_1__0"


    // $ANTLR start "rule__ArrayValue__Group_1__0__Impl"
    // InternalMyDsl.g:1719:1: rule__ArrayValue__Group_1__0__Impl : ( ( rule__ArrayValue__ElementsAssignment_1_0 ) ) ;
    public final void rule__ArrayValue__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1723:1: ( ( ( rule__ArrayValue__ElementsAssignment_1_0 ) ) )
            // InternalMyDsl.g:1724:1: ( ( rule__ArrayValue__ElementsAssignment_1_0 ) )
            {
            // InternalMyDsl.g:1724:1: ( ( rule__ArrayValue__ElementsAssignment_1_0 ) )
            // InternalMyDsl.g:1725:2: ( rule__ArrayValue__ElementsAssignment_1_0 )
            {
             before(grammarAccess.getArrayValueAccess().getElementsAssignment_1_0()); 
            // InternalMyDsl.g:1726:2: ( rule__ArrayValue__ElementsAssignment_1_0 )
            // InternalMyDsl.g:1726:3: rule__ArrayValue__ElementsAssignment_1_0
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__ElementsAssignment_1_0();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getElementsAssignment_1_0()); 

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
    // $ANTLR end "rule__ArrayValue__Group_1__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group_1__1"
    // InternalMyDsl.g:1734:1: rule__ArrayValue__Group_1__1 : rule__ArrayValue__Group_1__1__Impl ;
    public final void rule__ArrayValue__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1738:1: ( rule__ArrayValue__Group_1__1__Impl )
            // InternalMyDsl.g:1739:2: rule__ArrayValue__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_1__1__Impl();

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
    // $ANTLR end "rule__ArrayValue__Group_1__1"


    // $ANTLR start "rule__ArrayValue__Group_1__1__Impl"
    // InternalMyDsl.g:1745:1: rule__ArrayValue__Group_1__1__Impl : ( ( rule__ArrayValue__Group_1_1__0 )* ) ;
    public final void rule__ArrayValue__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1749:1: ( ( ( rule__ArrayValue__Group_1_1__0 )* ) )
            // InternalMyDsl.g:1750:1: ( ( rule__ArrayValue__Group_1_1__0 )* )
            {
            // InternalMyDsl.g:1750:1: ( ( rule__ArrayValue__Group_1_1__0 )* )
            // InternalMyDsl.g:1751:2: ( rule__ArrayValue__Group_1_1__0 )*
            {
             before(grammarAccess.getArrayValueAccess().getGroup_1_1()); 
            // InternalMyDsl.g:1752:2: ( rule__ArrayValue__Group_1_1__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==18) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalMyDsl.g:1752:3: rule__ArrayValue__Group_1_1__0
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__ArrayValue__Group_1_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getArrayValueAccess().getGroup_1_1()); 

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
    // $ANTLR end "rule__ArrayValue__Group_1__1__Impl"


    // $ANTLR start "rule__ArrayValue__Group_1_1__0"
    // InternalMyDsl.g:1761:1: rule__ArrayValue__Group_1_1__0 : rule__ArrayValue__Group_1_1__0__Impl rule__ArrayValue__Group_1_1__1 ;
    public final void rule__ArrayValue__Group_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1765:1: ( rule__ArrayValue__Group_1_1__0__Impl rule__ArrayValue__Group_1_1__1 )
            // InternalMyDsl.g:1766:2: rule__ArrayValue__Group_1_1__0__Impl rule__ArrayValue__Group_1_1__1
            {
            pushFollow(FOLLOW_17);
            rule__ArrayValue__Group_1_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_1_1__1();

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
    // $ANTLR end "rule__ArrayValue__Group_1_1__0"


    // $ANTLR start "rule__ArrayValue__Group_1_1__0__Impl"
    // InternalMyDsl.g:1773:1: rule__ArrayValue__Group_1_1__0__Impl : ( ',' ) ;
    public final void rule__ArrayValue__Group_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1777:1: ( ( ',' ) )
            // InternalMyDsl.g:1778:1: ( ',' )
            {
            // InternalMyDsl.g:1778:1: ( ',' )
            // InternalMyDsl.g:1779:2: ','
            {
             before(grammarAccess.getArrayValueAccess().getCommaKeyword_1_1_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getArrayValueAccess().getCommaKeyword_1_1_0()); 

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
    // $ANTLR end "rule__ArrayValue__Group_1_1__0__Impl"


    // $ANTLR start "rule__ArrayValue__Group_1_1__1"
    // InternalMyDsl.g:1788:1: rule__ArrayValue__Group_1_1__1 : rule__ArrayValue__Group_1_1__1__Impl ;
    public final void rule__ArrayValue__Group_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1792:1: ( rule__ArrayValue__Group_1_1__1__Impl )
            // InternalMyDsl.g:1793:2: rule__ArrayValue__Group_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__Group_1_1__1__Impl();

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
    // $ANTLR end "rule__ArrayValue__Group_1_1__1"


    // $ANTLR start "rule__ArrayValue__Group_1_1__1__Impl"
    // InternalMyDsl.g:1799:1: rule__ArrayValue__Group_1_1__1__Impl : ( ( rule__ArrayValue__ElementsAssignment_1_1_1 ) ) ;
    public final void rule__ArrayValue__Group_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1803:1: ( ( ( rule__ArrayValue__ElementsAssignment_1_1_1 ) ) )
            // InternalMyDsl.g:1804:1: ( ( rule__ArrayValue__ElementsAssignment_1_1_1 ) )
            {
            // InternalMyDsl.g:1804:1: ( ( rule__ArrayValue__ElementsAssignment_1_1_1 ) )
            // InternalMyDsl.g:1805:2: ( rule__ArrayValue__ElementsAssignment_1_1_1 )
            {
             before(grammarAccess.getArrayValueAccess().getElementsAssignment_1_1_1()); 
            // InternalMyDsl.g:1806:2: ( rule__ArrayValue__ElementsAssignment_1_1_1 )
            // InternalMyDsl.g:1806:3: rule__ArrayValue__ElementsAssignment_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__ArrayValue__ElementsAssignment_1_1_1();

            state._fsp--;


            }

             after(grammarAccess.getArrayValueAccess().getElementsAssignment_1_1_1()); 

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
    // $ANTLR end "rule__ArrayValue__Group_1_1__1__Impl"


    // $ANTLR start "rule__Model__NameAssignment_1"
    // InternalMyDsl.g:1815:1: rule__Model__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Model__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1819:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1820:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1820:2: ( RULE_ID )
            // InternalMyDsl.g:1821:3: RULE_ID
            {
             before(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Model__NameAssignment_1"


    // $ANTLR start "rule__Model__TypesAssignment_2"
    // InternalMyDsl.g:1830:1: rule__Model__TypesAssignment_2 : ( ruleTypeDef ) ;
    public final void rule__Model__TypesAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1834:1: ( ( ruleTypeDef ) )
            // InternalMyDsl.g:1835:2: ( ruleTypeDef )
            {
            // InternalMyDsl.g:1835:2: ( ruleTypeDef )
            // InternalMyDsl.g:1836:3: ruleTypeDef
            {
             before(grammarAccess.getModelAccess().getTypesTypeDefParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getTypesTypeDefParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Model__TypesAssignment_2"


    // $ANTLR start "rule__Model__VarsAssignment_3"
    // InternalMyDsl.g:1845:1: rule__Model__VarsAssignment_3 : ( ruleVarDef ) ;
    public final void rule__Model__VarsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1849:1: ( ( ruleVarDef ) )
            // InternalMyDsl.g:1850:2: ( ruleVarDef )
            {
            // InternalMyDsl.g:1850:2: ( ruleVarDef )
            // InternalMyDsl.g:1851:3: ruleVarDef
            {
             before(grammarAccess.getModelAccess().getVarsVarDefParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleVarDef();

            state._fsp--;

             after(grammarAccess.getModelAccess().getVarsVarDefParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Model__VarsAssignment_3"


    // $ANTLR start "rule__TypeDef__NameAssignment_1"
    // InternalMyDsl.g:1860:1: rule__TypeDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__TypeDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1864:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1865:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1865:2: ( RULE_ID )
            // InternalMyDsl.g:1866:3: RULE_ID
            {
             before(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__TypeDef__NameAssignment_1"


    // $ANTLR start "rule__TypeDef__FieldsAssignment_4_0"
    // InternalMyDsl.g:1875:1: rule__TypeDef__FieldsAssignment_4_0 : ( ruleField ) ;
    public final void rule__TypeDef__FieldsAssignment_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1879:1: ( ( ruleField ) )
            // InternalMyDsl.g:1880:2: ( ruleField )
            {
            // InternalMyDsl.g:1880:2: ( ruleField )
            // InternalMyDsl.g:1881:3: ruleField
            {
             before(grammarAccess.getTypeDefAccess().getFieldsFieldParserRuleCall_4_0_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getFieldsFieldParserRuleCall_4_0_0()); 

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
    // $ANTLR end "rule__TypeDef__FieldsAssignment_4_0"


    // $ANTLR start "rule__TypeDef__FieldsAssignment_4_1_1"
    // InternalMyDsl.g:1890:1: rule__TypeDef__FieldsAssignment_4_1_1 : ( ruleField ) ;
    public final void rule__TypeDef__FieldsAssignment_4_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1894:1: ( ( ruleField ) )
            // InternalMyDsl.g:1895:2: ( ruleField )
            {
            // InternalMyDsl.g:1895:2: ( ruleField )
            // InternalMyDsl.g:1896:3: ruleField
            {
             before(grammarAccess.getTypeDefAccess().getFieldsFieldParserRuleCall_4_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleField();

            state._fsp--;

             after(grammarAccess.getTypeDefAccess().getFieldsFieldParserRuleCall_4_1_1_0()); 

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
    // $ANTLR end "rule__TypeDef__FieldsAssignment_4_1_1"


    // $ANTLR start "rule__Field__NameAssignment_0"
    // InternalMyDsl.g:1905:1: rule__Field__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__Field__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1909:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:1910:2: ( RULE_ID )
            {
            // InternalMyDsl.g:1910:2: ( RULE_ID )
            // InternalMyDsl.g:1911:3: RULE_ID
            {
             before(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__Field__NameAssignment_0"


    // $ANTLR start "rule__Field__TypeAssignment_2"
    // InternalMyDsl.g:1920:1: rule__Field__TypeAssignment_2 : ( ruleFieldType ) ;
    public final void rule__Field__TypeAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1924:1: ( ( ruleFieldType ) )
            // InternalMyDsl.g:1925:2: ( ruleFieldType )
            {
            // InternalMyDsl.g:1925:2: ( ruleFieldType )
            // InternalMyDsl.g:1926:3: ruleFieldType
            {
             before(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldType();

            state._fsp--;

             after(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Field__TypeAssignment_2"


    // $ANTLR start "rule__FieldType__UnionAssignment_0"
    // InternalMyDsl.g:1935:1: rule__FieldType__UnionAssignment_0 : ( ruleUnionType ) ;
    public final void rule__FieldType__UnionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1939:1: ( ( ruleUnionType ) )
            // InternalMyDsl.g:1940:2: ( ruleUnionType )
            {
            // InternalMyDsl.g:1940:2: ( ruleUnionType )
            // InternalMyDsl.g:1941:3: ruleUnionType
            {
             before(grammarAccess.getFieldTypeAccess().getUnionUnionTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleUnionType();

            state._fsp--;

             after(grammarAccess.getFieldTypeAccess().getUnionUnionTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__FieldType__UnionAssignment_0"


    // $ANTLR start "rule__FieldType__ArrayAssignment_1"
    // InternalMyDsl.g:1950:1: rule__FieldType__ArrayAssignment_1 : ( ( '[]' ) ) ;
    public final void rule__FieldType__ArrayAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1954:1: ( ( ( '[]' ) ) )
            // InternalMyDsl.g:1955:2: ( ( '[]' ) )
            {
            // InternalMyDsl.g:1955:2: ( ( '[]' ) )
            // InternalMyDsl.g:1956:3: ( '[]' )
            {
             before(grammarAccess.getFieldTypeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            // InternalMyDsl.g:1957:3: ( '[]' )
            // InternalMyDsl.g:1958:4: '[]'
            {
             before(grammarAccess.getFieldTypeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getFieldTypeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

            }

             after(grammarAccess.getFieldTypeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0()); 

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
    // $ANTLR end "rule__FieldType__ArrayAssignment_1"


    // $ANTLR start "rule__UnionType__TypesAssignment_0"
    // InternalMyDsl.g:1969:1: rule__UnionType__TypesAssignment_0 : ( ruleSimpleType ) ;
    public final void rule__UnionType__TypesAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1973:1: ( ( ruleSimpleType ) )
            // InternalMyDsl.g:1974:2: ( ruleSimpleType )
            {
            // InternalMyDsl.g:1974:2: ( ruleSimpleType )
            // InternalMyDsl.g:1975:3: ruleSimpleType
            {
             before(grammarAccess.getUnionTypeAccess().getTypesSimpleTypeParserRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getUnionTypeAccess().getTypesSimpleTypeParserRuleCall_0_0()); 

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
    // $ANTLR end "rule__UnionType__TypesAssignment_0"


    // $ANTLR start "rule__UnionType__TypesAssignment_1_1"
    // InternalMyDsl.g:1984:1: rule__UnionType__TypesAssignment_1_1 : ( ruleSimpleType ) ;
    public final void rule__UnionType__TypesAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1988:1: ( ( ruleSimpleType ) )
            // InternalMyDsl.g:1989:2: ( ruleSimpleType )
            {
            // InternalMyDsl.g:1989:2: ( ruleSimpleType )
            // InternalMyDsl.g:1990:3: ruleSimpleType
            {
             before(grammarAccess.getUnionTypeAccess().getTypesSimpleTypeParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleSimpleType();

            state._fsp--;

             after(grammarAccess.getUnionTypeAccess().getTypesSimpleTypeParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__UnionType__TypesAssignment_1_1"


    // $ANTLR start "rule__PrimitiveType__ValueAssignment"
    // InternalMyDsl.g:1999:1: rule__PrimitiveType__ValueAssignment : ( ( rule__PrimitiveType__ValueAlternatives_0 ) ) ;
    public final void rule__PrimitiveType__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2003:1: ( ( ( rule__PrimitiveType__ValueAlternatives_0 ) ) )
            // InternalMyDsl.g:2004:2: ( ( rule__PrimitiveType__ValueAlternatives_0 ) )
            {
            // InternalMyDsl.g:2004:2: ( ( rule__PrimitiveType__ValueAlternatives_0 ) )
            // InternalMyDsl.g:2005:3: ( rule__PrimitiveType__ValueAlternatives_0 )
            {
             before(grammarAccess.getPrimitiveTypeAccess().getValueAlternatives_0()); 
            // InternalMyDsl.g:2006:3: ( rule__PrimitiveType__ValueAlternatives_0 )
            // InternalMyDsl.g:2006:4: rule__PrimitiveType__ValueAlternatives_0
            {
            pushFollow(FOLLOW_2);
            rule__PrimitiveType__ValueAlternatives_0();

            state._fsp--;


            }

             after(grammarAccess.getPrimitiveTypeAccess().getValueAlternatives_0()); 

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
    // $ANTLR end "rule__PrimitiveType__ValueAssignment"


    // $ANTLR start "rule__RefType__TypeAssignment"
    // InternalMyDsl.g:2014:1: rule__RefType__TypeAssignment : ( ( RULE_ID ) ) ;
    public final void rule__RefType__TypeAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2018:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2019:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2019:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2020:3: ( RULE_ID )
            {
             before(grammarAccess.getRefTypeAccess().getTypeTypeDefCrossReference_0()); 
            // InternalMyDsl.g:2021:3: ( RULE_ID )
            // InternalMyDsl.g:2022:4: RULE_ID
            {
             before(grammarAccess.getRefTypeAccess().getTypeTypeDefIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getRefTypeAccess().getTypeTypeDefIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getRefTypeAccess().getTypeTypeDefCrossReference_0()); 

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
    // $ANTLR end "rule__RefType__TypeAssignment"


    // $ANTLR start "rule__VarDef__NameAssignment_1"
    // InternalMyDsl.g:2033:1: rule__VarDef__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__VarDef__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2037:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2038:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2038:2: ( RULE_ID )
            // InternalMyDsl.g:2039:3: RULE_ID
            {
             before(grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__VarDef__NameAssignment_1"


    // $ANTLR start "rule__VarDef__TypeAssignment_3"
    // InternalMyDsl.g:2048:1: rule__VarDef__TypeAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__VarDef__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2052:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2053:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2053:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2054:3: ( RULE_ID )
            {
             before(grammarAccess.getVarDefAccess().getTypeTypeDefCrossReference_3_0()); 
            // InternalMyDsl.g:2055:3: ( RULE_ID )
            // InternalMyDsl.g:2056:4: RULE_ID
            {
             before(grammarAccess.getVarDefAccess().getTypeTypeDefIDTerminalRuleCall_3_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarDefAccess().getTypeTypeDefIDTerminalRuleCall_3_0_1()); 

            }

             after(grammarAccess.getVarDefAccess().getTypeTypeDefCrossReference_3_0()); 

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
    // $ANTLR end "rule__VarDef__TypeAssignment_3"


    // $ANTLR start "rule__VarDef__ValueAssignment_5"
    // InternalMyDsl.g:2067:1: rule__VarDef__ValueAssignment_5 : ( ruleStructValue ) ;
    public final void rule__VarDef__ValueAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2071:1: ( ( ruleStructValue ) )
            // InternalMyDsl.g:2072:2: ( ruleStructValue )
            {
            // InternalMyDsl.g:2072:2: ( ruleStructValue )
            // InternalMyDsl.g:2073:3: ruleStructValue
            {
             before(grammarAccess.getVarDefAccess().getValueStructValueParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleStructValue();

            state._fsp--;

             after(grammarAccess.getVarDefAccess().getValueStructValueParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__VarDef__ValueAssignment_5"


    // $ANTLR start "rule__StructValue__EntriesAssignment_1_0"
    // InternalMyDsl.g:2082:1: rule__StructValue__EntriesAssignment_1_0 : ( ruleFieldValue ) ;
    public final void rule__StructValue__EntriesAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2086:1: ( ( ruleFieldValue ) )
            // InternalMyDsl.g:2087:2: ( ruleFieldValue )
            {
            // InternalMyDsl.g:2087:2: ( ruleFieldValue )
            // InternalMyDsl.g:2088:3: ruleFieldValue
            {
             before(grammarAccess.getStructValueAccess().getEntriesFieldValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getStructValueAccess().getEntriesFieldValueParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__StructValue__EntriesAssignment_1_0"


    // $ANTLR start "rule__StructValue__EntriesAssignment_1_1_1"
    // InternalMyDsl.g:2097:1: rule__StructValue__EntriesAssignment_1_1_1 : ( ruleFieldValue ) ;
    public final void rule__StructValue__EntriesAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2101:1: ( ( ruleFieldValue ) )
            // InternalMyDsl.g:2102:2: ( ruleFieldValue )
            {
            // InternalMyDsl.g:2102:2: ( ruleFieldValue )
            // InternalMyDsl.g:2103:3: ruleFieldValue
            {
             before(grammarAccess.getStructValueAccess().getEntriesFieldValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleFieldValue();

            state._fsp--;

             after(grammarAccess.getStructValueAccess().getEntriesFieldValueParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__StructValue__EntriesAssignment_1_1_1"


    // $ANTLR start "rule__FieldValue__NameAssignment_0"
    // InternalMyDsl.g:2112:1: rule__FieldValue__NameAssignment_0 : ( RULE_ID ) ;
    public final void rule__FieldValue__NameAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2116:1: ( ( RULE_ID ) )
            // InternalMyDsl.g:2117:2: ( RULE_ID )
            {
            // InternalMyDsl.g:2117:2: ( RULE_ID )
            // InternalMyDsl.g:2118:3: RULE_ID
            {
             before(grammarAccess.getFieldValueAccess().getNameIDTerminalRuleCall_0_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getFieldValueAccess().getNameIDTerminalRuleCall_0_0()); 

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
    // $ANTLR end "rule__FieldValue__NameAssignment_0"


    // $ANTLR start "rule__FieldValue__ValueAssignment_2"
    // InternalMyDsl.g:2127:1: rule__FieldValue__ValueAssignment_2 : ( ruleValue ) ;
    public final void rule__FieldValue__ValueAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2131:1: ( ( ruleValue ) )
            // InternalMyDsl.g:2132:2: ( ruleValue )
            {
            // InternalMyDsl.g:2132:2: ( ruleValue )
            // InternalMyDsl.g:2133:3: ruleValue
            {
             before(grammarAccess.getFieldValueAccess().getValueValueParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getFieldValueAccess().getValueValueParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__FieldValue__ValueAssignment_2"


    // $ANTLR start "rule__VarRef__RefAssignment"
    // InternalMyDsl.g:2142:1: rule__VarRef__RefAssignment : ( ( RULE_ID ) ) ;
    public final void rule__VarRef__RefAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2146:1: ( ( ( RULE_ID ) ) )
            // InternalMyDsl.g:2147:2: ( ( RULE_ID ) )
            {
            // InternalMyDsl.g:2147:2: ( ( RULE_ID ) )
            // InternalMyDsl.g:2148:3: ( RULE_ID )
            {
             before(grammarAccess.getVarRefAccess().getRefVarDefCrossReference_0()); 
            // InternalMyDsl.g:2149:3: ( RULE_ID )
            // InternalMyDsl.g:2150:4: RULE_ID
            {
             before(grammarAccess.getVarRefAccess().getRefVarDefIDTerminalRuleCall_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVarRefAccess().getRefVarDefIDTerminalRuleCall_0_1()); 

            }

             after(grammarAccess.getVarRefAccess().getRefVarDefCrossReference_0()); 

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
    // $ANTLR end "rule__VarRef__RefAssignment"


    // $ANTLR start "rule__ArrayValue__ElementsAssignment_1_0"
    // InternalMyDsl.g:2161:1: rule__ArrayValue__ElementsAssignment_1_0 : ( ruleValue ) ;
    public final void rule__ArrayValue__ElementsAssignment_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2165:1: ( ( ruleValue ) )
            // InternalMyDsl.g:2166:2: ( ruleValue )
            {
            // InternalMyDsl.g:2166:2: ( ruleValue )
            // InternalMyDsl.g:2167:3: ruleValue
            {
             before(grammarAccess.getArrayValueAccess().getElementsValueParserRuleCall_1_0_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayValueAccess().getElementsValueParserRuleCall_1_0_0()); 

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
    // $ANTLR end "rule__ArrayValue__ElementsAssignment_1_0"


    // $ANTLR start "rule__ArrayValue__ElementsAssignment_1_1_1"
    // InternalMyDsl.g:2176:1: rule__ArrayValue__ElementsAssignment_1_1_1 : ( ruleValue ) ;
    public final void rule__ArrayValue__ElementsAssignment_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2180:1: ( ( ruleValue ) )
            // InternalMyDsl.g:2181:2: ( ruleValue )
            {
            // InternalMyDsl.g:2181:2: ( ruleValue )
            // InternalMyDsl.g:2182:3: ruleValue
            {
             before(grammarAccess.getArrayValueAccess().getElementsValueParserRuleCall_1_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleValue();

            state._fsp--;

             after(grammarAccess.getArrayValueAccess().getElementsValueParserRuleCall_1_1_1_0()); 

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
    // $ANTLR end "rule__ArrayValue__ElementsAssignment_1_1_1"


    // $ANTLR start "rule__StringLiteral__ValueAssignment"
    // InternalMyDsl.g:2191:1: rule__StringLiteral__ValueAssignment : ( RULE_STRING ) ;
    public final void rule__StringLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2195:1: ( ( RULE_STRING ) )
            // InternalMyDsl.g:2196:2: ( RULE_STRING )
            {
            // InternalMyDsl.g:2196:2: ( RULE_STRING )
            // InternalMyDsl.g:2197:3: RULE_STRING
            {
             before(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__StringLiteral__ValueAssignment"


    // $ANTLR start "rule__NumberLiteral__ValueAssignment"
    // InternalMyDsl.g:2206:1: rule__NumberLiteral__ValueAssignment : ( RULE_INT ) ;
    public final void rule__NumberLiteral__ValueAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:2210:1: ( ( RULE_INT ) )
            // InternalMyDsl.g:2211:2: ( RULE_INT )
            {
            // InternalMyDsl.g:2211:2: ( RULE_INT )
            // InternalMyDsl.g:2212:3: RULE_INT
            {
             before(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0()); 

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
    // $ANTLR end "rule__NumberLiteral__ValueAssignment"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000204000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001810L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000100002L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000410070L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000C10070L});

}