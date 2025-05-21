package org.xtext.example.mydsl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.example.mydsl.services.MyDslGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMyDslParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'system'", "'type'", "'='", "'{'", "','", "'}'", "':'", "'[]'", "'|'", "'string'", "'number'", "'var'", "'['", "']'"
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

        public InternalMyDslParser(TokenStream input, MyDslGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Model";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleModel"
    // InternalMyDsl.g:64:1: entryRuleModel returns [EObject current=null] : iv_ruleModel= ruleModel EOF ;
    public final EObject entryRuleModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleModel = null;


        try {
            // InternalMyDsl.g:64:46: (iv_ruleModel= ruleModel EOF )
            // InternalMyDsl.g:65:2: iv_ruleModel= ruleModel EOF
            {
             newCompositeNode(grammarAccess.getModelRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleModel=ruleModel();

            state._fsp--;

             current =iv_ruleModel; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleModel"


    // $ANTLR start "ruleModel"
    // InternalMyDsl.g:71:1: ruleModel returns [EObject current=null] : (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleTypeDef ) )* ( (lv_vars_3_0= ruleVarDef ) )* ) ;
    public final EObject ruleModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        EObject lv_types_2_0 = null;

        EObject lv_vars_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleTypeDef ) )* ( (lv_vars_3_0= ruleVarDef ) )* ) )
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleTypeDef ) )* ( (lv_vars_3_0= ruleVarDef ) )* )
            {
            // InternalMyDsl.g:78:2: (otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleTypeDef ) )* ( (lv_vars_3_0= ruleVarDef ) )* )
            // InternalMyDsl.g:79:3: otherlv_0= 'system' ( (lv_name_1_0= RULE_ID ) ) ( (lv_types_2_0= ruleTypeDef ) )* ( (lv_vars_3_0= ruleVarDef ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getModelAccess().getSystemKeyword_0());
            		
            // InternalMyDsl.g:83:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:84:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:85:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_name_1_0, grammarAccess.getModelAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getModelRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMyDsl.g:101:3: ( (lv_types_2_0= ruleTypeDef ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==12) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMyDsl.g:102:4: (lv_types_2_0= ruleTypeDef )
            	    {
            	    // InternalMyDsl.g:102:4: (lv_types_2_0= ruleTypeDef )
            	    // InternalMyDsl.g:103:5: lv_types_2_0= ruleTypeDef
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getTypesTypeDefParserRuleCall_2_0());
            	    				
            	    pushFollow(FOLLOW_4);
            	    lv_types_2_0=ruleTypeDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"types",
            	    						lv_types_2_0,
            	    						"org.xtext.example.mydsl.MyDsl.TypeDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            // InternalMyDsl.g:120:3: ( (lv_vars_3_0= ruleVarDef ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==22) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMyDsl.g:121:4: (lv_vars_3_0= ruleVarDef )
            	    {
            	    // InternalMyDsl.g:121:4: (lv_vars_3_0= ruleVarDef )
            	    // InternalMyDsl.g:122:5: lv_vars_3_0= ruleVarDef
            	    {

            	    					newCompositeNode(grammarAccess.getModelAccess().getVarsVarDefParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_vars_3_0=ruleVarDef();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getModelRule());
            	    					}
            	    					add(
            	    						current,
            	    						"vars",
            	    						lv_vars_3_0,
            	    						"org.xtext.example.mydsl.MyDsl.VarDef");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleModel"


    // $ANTLR start "entryRuleTypeDef"
    // InternalMyDsl.g:143:1: entryRuleTypeDef returns [EObject current=null] : iv_ruleTypeDef= ruleTypeDef EOF ;
    public final EObject entryRuleTypeDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTypeDef = null;


        try {
            // InternalMyDsl.g:143:48: (iv_ruleTypeDef= ruleTypeDef EOF )
            // InternalMyDsl.g:144:2: iv_ruleTypeDef= ruleTypeDef EOF
            {
             newCompositeNode(grammarAccess.getTypeDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleTypeDef=ruleTypeDef();

            state._fsp--;

             current =iv_ruleTypeDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleTypeDef"


    // $ANTLR start "ruleTypeDef"
    // InternalMyDsl.g:150:1: ruleTypeDef returns [EObject current=null] : (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* )? otherlv_7= '}' ) ;
    public final EObject ruleTypeDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_fields_4_0 = null;

        EObject lv_fields_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:156:2: ( (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* )? otherlv_7= '}' ) )
            // InternalMyDsl.g:157:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:157:2: (otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* )? otherlv_7= '}' )
            // InternalMyDsl.g:158:3: otherlv_0= 'type' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' otherlv_3= '{' ( ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* )? otherlv_7= '}'
            {
            otherlv_0=(Token)match(input,12,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getTypeDefAccess().getTypeKeyword_0());
            		
            // InternalMyDsl.g:162:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:163:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:163:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:164:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(lv_name_1_0, grammarAccess.getTypeDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getTypeDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_2, grammarAccess.getTypeDefAccess().getEqualsSignKeyword_2());
            		
            otherlv_3=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getTypeDefAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:188:3: ( ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )* )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:189:4: ( (lv_fields_4_0= ruleField ) ) (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )*
                    {
                    // InternalMyDsl.g:189:4: ( (lv_fields_4_0= ruleField ) )
                    // InternalMyDsl.g:190:5: (lv_fields_4_0= ruleField )
                    {
                    // InternalMyDsl.g:190:5: (lv_fields_4_0= ruleField )
                    // InternalMyDsl.g:191:6: lv_fields_4_0= ruleField
                    {

                    						newCompositeNode(grammarAccess.getTypeDefAccess().getFieldsFieldParserRuleCall_4_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_fields_4_0=ruleField();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    						}
                    						add(
                    							current,
                    							"fields",
                    							lv_fields_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Field");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:208:4: (otherlv_5= ',' ( (lv_fields_6_0= ruleField ) ) )*
                    loop3:
                    do {
                        int alt3=2;
                        int LA3_0 = input.LA(1);

                        if ( (LA3_0==15) ) {
                            alt3=1;
                        }


                        switch (alt3) {
                    	case 1 :
                    	    // InternalMyDsl.g:209:5: otherlv_5= ',' ( (lv_fields_6_0= ruleField ) )
                    	    {
                    	    otherlv_5=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_5, grammarAccess.getTypeDefAccess().getCommaKeyword_4_1_0());
                    	    				
                    	    // InternalMyDsl.g:213:5: ( (lv_fields_6_0= ruleField ) )
                    	    // InternalMyDsl.g:214:6: (lv_fields_6_0= ruleField )
                    	    {
                    	    // InternalMyDsl.g:214:6: (lv_fields_6_0= ruleField )
                    	    // InternalMyDsl.g:215:7: lv_fields_6_0= ruleField
                    	    {

                    	    							newCompositeNode(grammarAccess.getTypeDefAccess().getFieldsFieldParserRuleCall_4_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_fields_6_0=ruleField();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getTypeDefRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"fields",
                    	    								lv_fields_6_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Field");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop3;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getTypeDefAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDef"


    // $ANTLR start "entryRuleField"
    // InternalMyDsl.g:242:1: entryRuleField returns [EObject current=null] : iv_ruleField= ruleField EOF ;
    public final EObject entryRuleField() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleField = null;


        try {
            // InternalMyDsl.g:242:46: (iv_ruleField= ruleField EOF )
            // InternalMyDsl.g:243:2: iv_ruleField= ruleField EOF
            {
             newCompositeNode(grammarAccess.getFieldRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleField=ruleField();

            state._fsp--;

             current =iv_ruleField; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleField"


    // $ANTLR start "ruleField"
    // InternalMyDsl.g:249:1: ruleField returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleFieldType ) ) ) ;
    public final EObject ruleField() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_type_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:255:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleFieldType ) ) ) )
            // InternalMyDsl.g:256:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleFieldType ) ) )
            {
            // InternalMyDsl.g:256:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleFieldType ) ) )
            // InternalMyDsl.g:257:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_type_2_0= ruleFieldType ) )
            {
            // InternalMyDsl.g:257:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:258:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:258:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:259:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFieldAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_11); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:279:3: ( (lv_type_2_0= ruleFieldType ) )
            // InternalMyDsl.g:280:4: (lv_type_2_0= ruleFieldType )
            {
            // InternalMyDsl.g:280:4: (lv_type_2_0= ruleFieldType )
            // InternalMyDsl.g:281:5: lv_type_2_0= ruleFieldType
            {

            					newCompositeNode(grammarAccess.getFieldAccess().getTypeFieldTypeParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_2_0=ruleFieldType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_2_0,
            						"org.xtext.example.mydsl.MyDsl.FieldType");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleField"


    // $ANTLR start "entryRuleFieldType"
    // InternalMyDsl.g:302:1: entryRuleFieldType returns [EObject current=null] : iv_ruleFieldType= ruleFieldType EOF ;
    public final EObject entryRuleFieldType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldType = null;


        try {
            // InternalMyDsl.g:302:50: (iv_ruleFieldType= ruleFieldType EOF )
            // InternalMyDsl.g:303:2: iv_ruleFieldType= ruleFieldType EOF
            {
             newCompositeNode(grammarAccess.getFieldTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldType=ruleFieldType();

            state._fsp--;

             current =iv_ruleFieldType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldType"


    // $ANTLR start "ruleFieldType"
    // InternalMyDsl.g:309:1: ruleFieldType returns [EObject current=null] : ( ( (lv_union_0_0= ruleUnionType ) ) ( (lv_array_1_0= '[]' ) )? ) ;
    public final EObject ruleFieldType() throws RecognitionException {
        EObject current = null;

        Token lv_array_1_0=null;
        EObject lv_union_0_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:315:2: ( ( ( (lv_union_0_0= ruleUnionType ) ) ( (lv_array_1_0= '[]' ) )? ) )
            // InternalMyDsl.g:316:2: ( ( (lv_union_0_0= ruleUnionType ) ) ( (lv_array_1_0= '[]' ) )? )
            {
            // InternalMyDsl.g:316:2: ( ( (lv_union_0_0= ruleUnionType ) ) ( (lv_array_1_0= '[]' ) )? )
            // InternalMyDsl.g:317:3: ( (lv_union_0_0= ruleUnionType ) ) ( (lv_array_1_0= '[]' ) )?
            {
            // InternalMyDsl.g:317:3: ( (lv_union_0_0= ruleUnionType ) )
            // InternalMyDsl.g:318:4: (lv_union_0_0= ruleUnionType )
            {
            // InternalMyDsl.g:318:4: (lv_union_0_0= ruleUnionType )
            // InternalMyDsl.g:319:5: lv_union_0_0= ruleUnionType
            {

            					newCompositeNode(grammarAccess.getFieldTypeAccess().getUnionUnionTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_12);
            lv_union_0_0=ruleUnionType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldTypeRule());
            					}
            					set(
            						current,
            						"union",
            						lv_union_0_0,
            						"org.xtext.example.mydsl.MyDsl.UnionType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:336:3: ( (lv_array_1_0= '[]' ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==18) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:337:4: (lv_array_1_0= '[]' )
                    {
                    // InternalMyDsl.g:337:4: (lv_array_1_0= '[]' )
                    // InternalMyDsl.g:338:5: lv_array_1_0= '[]'
                    {
                    lv_array_1_0=(Token)match(input,18,FOLLOW_2); 

                    					newLeafNode(lv_array_1_0, grammarAccess.getFieldTypeAccess().getArrayLeftSquareBracketRightSquareBracketKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getFieldTypeRule());
                    					}
                    					setWithLastConsumed(current, "array", lv_array_1_0 != null, "[]");
                    				

                    }


                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldType"


    // $ANTLR start "entryRuleUnionType"
    // InternalMyDsl.g:354:1: entryRuleUnionType returns [EObject current=null] : iv_ruleUnionType= ruleUnionType EOF ;
    public final EObject entryRuleUnionType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleUnionType = null;


        try {
            // InternalMyDsl.g:354:50: (iv_ruleUnionType= ruleUnionType EOF )
            // InternalMyDsl.g:355:2: iv_ruleUnionType= ruleUnionType EOF
            {
             newCompositeNode(grammarAccess.getUnionTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleUnionType=ruleUnionType();

            state._fsp--;

             current =iv_ruleUnionType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleUnionType"


    // $ANTLR start "ruleUnionType"
    // InternalMyDsl.g:361:1: ruleUnionType returns [EObject current=null] : ( ( (lv_types_0_0= ruleSimpleType ) ) (otherlv_1= '|' ( (lv_types_2_0= ruleSimpleType ) ) )* ) ;
    public final EObject ruleUnionType() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_types_0_0 = null;

        EObject lv_types_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:367:2: ( ( ( (lv_types_0_0= ruleSimpleType ) ) (otherlv_1= '|' ( (lv_types_2_0= ruleSimpleType ) ) )* ) )
            // InternalMyDsl.g:368:2: ( ( (lv_types_0_0= ruleSimpleType ) ) (otherlv_1= '|' ( (lv_types_2_0= ruleSimpleType ) ) )* )
            {
            // InternalMyDsl.g:368:2: ( ( (lv_types_0_0= ruleSimpleType ) ) (otherlv_1= '|' ( (lv_types_2_0= ruleSimpleType ) ) )* )
            // InternalMyDsl.g:369:3: ( (lv_types_0_0= ruleSimpleType ) ) (otherlv_1= '|' ( (lv_types_2_0= ruleSimpleType ) ) )*
            {
            // InternalMyDsl.g:369:3: ( (lv_types_0_0= ruleSimpleType ) )
            // InternalMyDsl.g:370:4: (lv_types_0_0= ruleSimpleType )
            {
            // InternalMyDsl.g:370:4: (lv_types_0_0= ruleSimpleType )
            // InternalMyDsl.g:371:5: lv_types_0_0= ruleSimpleType
            {

            					newCompositeNode(grammarAccess.getUnionTypeAccess().getTypesSimpleTypeParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_types_0_0=ruleSimpleType();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getUnionTypeRule());
            					}
            					add(
            						current,
            						"types",
            						lv_types_0_0,
            						"org.xtext.example.mydsl.MyDsl.SimpleType");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalMyDsl.g:388:3: (otherlv_1= '|' ( (lv_types_2_0= ruleSimpleType ) ) )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==19) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalMyDsl.g:389:4: otherlv_1= '|' ( (lv_types_2_0= ruleSimpleType ) )
            	    {
            	    otherlv_1=(Token)match(input,19,FOLLOW_11); 

            	    				newLeafNode(otherlv_1, grammarAccess.getUnionTypeAccess().getVerticalLineKeyword_1_0());
            	    			
            	    // InternalMyDsl.g:393:4: ( (lv_types_2_0= ruleSimpleType ) )
            	    // InternalMyDsl.g:394:5: (lv_types_2_0= ruleSimpleType )
            	    {
            	    // InternalMyDsl.g:394:5: (lv_types_2_0= ruleSimpleType )
            	    // InternalMyDsl.g:395:6: lv_types_2_0= ruleSimpleType
            	    {

            	    						newCompositeNode(grammarAccess.getUnionTypeAccess().getTypesSimpleTypeParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    lv_types_2_0=ruleSimpleType();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getUnionTypeRule());
            	    						}
            	    						add(
            	    							current,
            	    							"types",
            	    							lv_types_2_0,
            	    							"org.xtext.example.mydsl.MyDsl.SimpleType");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleUnionType"


    // $ANTLR start "entryRuleSimpleType"
    // InternalMyDsl.g:417:1: entryRuleSimpleType returns [EObject current=null] : iv_ruleSimpleType= ruleSimpleType EOF ;
    public final EObject entryRuleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSimpleType = null;


        try {
            // InternalMyDsl.g:417:51: (iv_ruleSimpleType= ruleSimpleType EOF )
            // InternalMyDsl.g:418:2: iv_ruleSimpleType= ruleSimpleType EOF
            {
             newCompositeNode(grammarAccess.getSimpleTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSimpleType=ruleSimpleType();

            state._fsp--;

             current =iv_ruleSimpleType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSimpleType"


    // $ANTLR start "ruleSimpleType"
    // InternalMyDsl.g:424:1: ruleSimpleType returns [EObject current=null] : (this_PrimitiveType_0= rulePrimitiveType | this_RefType_1= ruleRefType ) ;
    public final EObject ruleSimpleType() throws RecognitionException {
        EObject current = null;

        EObject this_PrimitiveType_0 = null;

        EObject this_RefType_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:430:2: ( (this_PrimitiveType_0= rulePrimitiveType | this_RefType_1= ruleRefType ) )
            // InternalMyDsl.g:431:2: (this_PrimitiveType_0= rulePrimitiveType | this_RefType_1= ruleRefType )
            {
            // InternalMyDsl.g:431:2: (this_PrimitiveType_0= rulePrimitiveType | this_RefType_1= ruleRefType )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:432:3: this_PrimitiveType_0= rulePrimitiveType
                    {

                    			newCompositeNode(grammarAccess.getSimpleTypeAccess().getPrimitiveTypeParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PrimitiveType_0=rulePrimitiveType();

                    state._fsp--;


                    			current = this_PrimitiveType_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:441:3: this_RefType_1= ruleRefType
                    {

                    			newCompositeNode(grammarAccess.getSimpleTypeAccess().getRefTypeParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_RefType_1=ruleRefType();

                    state._fsp--;


                    			current = this_RefType_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSimpleType"


    // $ANTLR start "entryRulePrimitiveType"
    // InternalMyDsl.g:453:1: entryRulePrimitiveType returns [EObject current=null] : iv_rulePrimitiveType= rulePrimitiveType EOF ;
    public final EObject entryRulePrimitiveType() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimitiveType = null;


        try {
            // InternalMyDsl.g:453:54: (iv_rulePrimitiveType= rulePrimitiveType EOF )
            // InternalMyDsl.g:454:2: iv_rulePrimitiveType= rulePrimitiveType EOF
            {
             newCompositeNode(grammarAccess.getPrimitiveTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimitiveType=rulePrimitiveType();

            state._fsp--;

             current =iv_rulePrimitiveType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePrimitiveType"


    // $ANTLR start "rulePrimitiveType"
    // InternalMyDsl.g:460:1: rulePrimitiveType returns [EObject current=null] : ( ( (lv_value_0_1= 'string' | lv_value_0_2= 'number' ) ) ) ;
    public final EObject rulePrimitiveType() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_1=null;
        Token lv_value_0_2=null;


        	enterRule();

        try {
            // InternalMyDsl.g:466:2: ( ( ( (lv_value_0_1= 'string' | lv_value_0_2= 'number' ) ) ) )
            // InternalMyDsl.g:467:2: ( ( (lv_value_0_1= 'string' | lv_value_0_2= 'number' ) ) )
            {
            // InternalMyDsl.g:467:2: ( ( (lv_value_0_1= 'string' | lv_value_0_2= 'number' ) ) )
            // InternalMyDsl.g:468:3: ( (lv_value_0_1= 'string' | lv_value_0_2= 'number' ) )
            {
            // InternalMyDsl.g:468:3: ( (lv_value_0_1= 'string' | lv_value_0_2= 'number' ) )
            // InternalMyDsl.g:469:4: (lv_value_0_1= 'string' | lv_value_0_2= 'number' )
            {
            // InternalMyDsl.g:469:4: (lv_value_0_1= 'string' | lv_value_0_2= 'number' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==20) ) {
                alt8=1;
            }
            else if ( (LA8_0==21) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // InternalMyDsl.g:470:5: lv_value_0_1= 'string'
                    {
                    lv_value_0_1=(Token)match(input,20,FOLLOW_2); 

                    					newLeafNode(lv_value_0_1, grammarAccess.getPrimitiveTypeAccess().getValueStringKeyword_0_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_1, null);
                    				

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:481:5: lv_value_0_2= 'number'
                    {
                    lv_value_0_2=(Token)match(input,21,FOLLOW_2); 

                    					newLeafNode(lv_value_0_2, grammarAccess.getPrimitiveTypeAccess().getValueNumberKeyword_0_1());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPrimitiveTypeRule());
                    					}
                    					setWithLastConsumed(current, "value", lv_value_0_2, null);
                    				

                    }
                    break;

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePrimitiveType"


    // $ANTLR start "entryRuleRefType"
    // InternalMyDsl.g:497:1: entryRuleRefType returns [EObject current=null] : iv_ruleRefType= ruleRefType EOF ;
    public final EObject entryRuleRefType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRefType = null;


        try {
            // InternalMyDsl.g:497:48: (iv_ruleRefType= ruleRefType EOF )
            // InternalMyDsl.g:498:2: iv_ruleRefType= ruleRefType EOF
            {
             newCompositeNode(grammarAccess.getRefTypeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRefType=ruleRefType();

            state._fsp--;

             current =iv_ruleRefType; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRefType"


    // $ANTLR start "ruleRefType"
    // InternalMyDsl.g:504:1: ruleRefType returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleRefType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:510:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyDsl.g:511:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyDsl.g:511:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:512:3: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:512:3: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:513:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getRefTypeRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getRefTypeAccess().getTypeTypeDefCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRefType"


    // $ANTLR start "entryRuleVarDef"
    // InternalMyDsl.g:527:1: entryRuleVarDef returns [EObject current=null] : iv_ruleVarDef= ruleVarDef EOF ;
    public final EObject entryRuleVarDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarDef = null;


        try {
            // InternalMyDsl.g:527:47: (iv_ruleVarDef= ruleVarDef EOF )
            // InternalMyDsl.g:528:2: iv_ruleVarDef= ruleVarDef EOF
            {
             newCompositeNode(grammarAccess.getVarDefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarDef=ruleVarDef();

            state._fsp--;

             current =iv_ruleVarDef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarDef"


    // $ANTLR start "ruleVarDef"
    // InternalMyDsl.g:534:1: ruleVarDef returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleStructValue ) ) ) ;
    public final EObject ruleVarDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        EObject lv_value_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:540:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleStructValue ) ) ) )
            // InternalMyDsl.g:541:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleStructValue ) ) )
            {
            // InternalMyDsl.g:541:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleStructValue ) ) )
            // InternalMyDsl.g:542:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= ':' ( (otherlv_3= RULE_ID ) ) otherlv_4= '=' ( (lv_value_5_0= ruleStructValue ) )
            {
            otherlv_0=(Token)match(input,22,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarDefAccess().getVarKeyword_0());
            		
            // InternalMyDsl.g:546:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMyDsl.g:547:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMyDsl.g:547:4: (lv_name_1_0= RULE_ID )
            // InternalMyDsl.g:548:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarDefAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDefRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getVarDefAccess().getColonKeyword_2());
            		
            // InternalMyDsl.g:568:3: ( (otherlv_3= RULE_ID ) )
            // InternalMyDsl.g:569:4: (otherlv_3= RULE_ID )
            {
            // InternalMyDsl.g:569:4: (otherlv_3= RULE_ID )
            // InternalMyDsl.g:570:5: otherlv_3= RULE_ID
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarDefRule());
            					}
            				
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_6); 

            					newLeafNode(otherlv_3, grammarAccess.getVarDefAccess().getTypeTypeDefCrossReference_3_0());
            				

            }


            }

            otherlv_4=(Token)match(input,13,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getVarDefAccess().getEqualsSignKeyword_4());
            		
            // InternalMyDsl.g:585:3: ( (lv_value_5_0= ruleStructValue ) )
            // InternalMyDsl.g:586:4: (lv_value_5_0= ruleStructValue )
            {
            // InternalMyDsl.g:586:4: (lv_value_5_0= ruleStructValue )
            // InternalMyDsl.g:587:5: lv_value_5_0= ruleStructValue
            {

            					newCompositeNode(grammarAccess.getVarDefAccess().getValueStructValueParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_5_0=ruleStructValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarDefRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_5_0,
            						"org.xtext.example.mydsl.MyDsl.StructValue");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarDef"


    // $ANTLR start "entryRuleStructValue"
    // InternalMyDsl.g:608:1: entryRuleStructValue returns [EObject current=null] : iv_ruleStructValue= ruleStructValue EOF ;
    public final EObject entryRuleStructValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStructValue = null;


        try {
            // InternalMyDsl.g:608:52: (iv_ruleStructValue= ruleStructValue EOF )
            // InternalMyDsl.g:609:2: iv_ruleStructValue= ruleStructValue EOF
            {
             newCompositeNode(grammarAccess.getStructValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStructValue=ruleStructValue();

            state._fsp--;

             current =iv_ruleStructValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStructValue"


    // $ANTLR start "ruleStructValue"
    // InternalMyDsl.g:615:1: ruleStructValue returns [EObject current=null] : (otherlv_0= '{' ( ( (lv_entries_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleFieldValue ) ) )* )? otherlv_4= '}' ) ;
    public final EObject ruleStructValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_entries_1_0 = null;

        EObject lv_entries_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:621:2: ( (otherlv_0= '{' ( ( (lv_entries_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleFieldValue ) ) )* )? otherlv_4= '}' ) )
            // InternalMyDsl.g:622:2: (otherlv_0= '{' ( ( (lv_entries_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleFieldValue ) ) )* )? otherlv_4= '}' )
            {
            // InternalMyDsl.g:622:2: (otherlv_0= '{' ( ( (lv_entries_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleFieldValue ) ) )* )? otherlv_4= '}' )
            // InternalMyDsl.g:623:3: otherlv_0= '{' ( ( (lv_entries_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleFieldValue ) ) )* )? otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getStructValueAccess().getLeftCurlyBracketKeyword_0());
            		
            // InternalMyDsl.g:627:3: ( ( (lv_entries_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleFieldValue ) ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalMyDsl.g:628:4: ( (lv_entries_1_0= ruleFieldValue ) ) (otherlv_2= ',' ( (lv_entries_3_0= ruleFieldValue ) ) )*
                    {
                    // InternalMyDsl.g:628:4: ( (lv_entries_1_0= ruleFieldValue ) )
                    // InternalMyDsl.g:629:5: (lv_entries_1_0= ruleFieldValue )
                    {
                    // InternalMyDsl.g:629:5: (lv_entries_1_0= ruleFieldValue )
                    // InternalMyDsl.g:630:6: lv_entries_1_0= ruleFieldValue
                    {

                    						newCompositeNode(grammarAccess.getStructValueAccess().getEntriesFieldValueParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_9);
                    lv_entries_1_0=ruleFieldValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getStructValueRule());
                    						}
                    						add(
                    							current,
                    							"entries",
                    							lv_entries_1_0,
                    							"org.xtext.example.mydsl.MyDsl.FieldValue");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:647:4: (otherlv_2= ',' ( (lv_entries_3_0= ruleFieldValue ) ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==15) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // InternalMyDsl.g:648:5: otherlv_2= ',' ( (lv_entries_3_0= ruleFieldValue ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_3); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getStructValueAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMyDsl.g:652:5: ( (lv_entries_3_0= ruleFieldValue ) )
                    	    // InternalMyDsl.g:653:6: (lv_entries_3_0= ruleFieldValue )
                    	    {
                    	    // InternalMyDsl.g:653:6: (lv_entries_3_0= ruleFieldValue )
                    	    // InternalMyDsl.g:654:7: lv_entries_3_0= ruleFieldValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getStructValueAccess().getEntriesFieldValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_9);
                    	    lv_entries_3_0=ruleFieldValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getStructValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"entries",
                    	    								lv_entries_3_0,
                    	    								"org.xtext.example.mydsl.MyDsl.FieldValue");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,16,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getStructValueAccess().getRightCurlyBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStructValue"


    // $ANTLR start "entryRuleFieldValue"
    // InternalMyDsl.g:681:1: entryRuleFieldValue returns [EObject current=null] : iv_ruleFieldValue= ruleFieldValue EOF ;
    public final EObject entryRuleFieldValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFieldValue = null;


        try {
            // InternalMyDsl.g:681:51: (iv_ruleFieldValue= ruleFieldValue EOF )
            // InternalMyDsl.g:682:2: iv_ruleFieldValue= ruleFieldValue EOF
            {
             newCompositeNode(grammarAccess.getFieldValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFieldValue=ruleFieldValue();

            state._fsp--;

             current =iv_ruleFieldValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleFieldValue"


    // $ANTLR start "ruleFieldValue"
    // InternalMyDsl.g:688:1: ruleFieldValue returns [EObject current=null] : ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) ;
    public final EObject ruleFieldValue() throws RecognitionException {
        EObject current = null;

        Token lv_name_0_0=null;
        Token otherlv_1=null;
        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:694:2: ( ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) ) )
            // InternalMyDsl.g:695:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            {
            // InternalMyDsl.g:695:2: ( ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) ) )
            // InternalMyDsl.g:696:3: ( (lv_name_0_0= RULE_ID ) ) otherlv_1= ':' ( (lv_value_2_0= ruleValue ) )
            {
            // InternalMyDsl.g:696:3: ( (lv_name_0_0= RULE_ID ) )
            // InternalMyDsl.g:697:4: (lv_name_0_0= RULE_ID )
            {
            // InternalMyDsl.g:697:4: (lv_name_0_0= RULE_ID )
            // InternalMyDsl.g:698:5: lv_name_0_0= RULE_ID
            {
            lv_name_0_0=(Token)match(input,RULE_ID,FOLLOW_10); 

            					newLeafNode(lv_name_0_0, grammarAccess.getFieldValueAccess().getNameIDTerminalRuleCall_0_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getFieldValueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_0_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_1=(Token)match(input,17,FOLLOW_14); 

            			newLeafNode(otherlv_1, grammarAccess.getFieldValueAccess().getColonKeyword_1());
            		
            // InternalMyDsl.g:718:3: ( (lv_value_2_0= ruleValue ) )
            // InternalMyDsl.g:719:4: (lv_value_2_0= ruleValue )
            {
            // InternalMyDsl.g:719:4: (lv_value_2_0= ruleValue )
            // InternalMyDsl.g:720:5: lv_value_2_0= ruleValue
            {

            					newCompositeNode(grammarAccess.getFieldValueAccess().getValueValueParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleValue();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getFieldValueRule());
            					}
            					set(
            						current,
            						"value",
            						lv_value_2_0,
            						"org.xtext.example.mydsl.MyDsl.Value");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleFieldValue"


    // $ANTLR start "entryRuleValue"
    // InternalMyDsl.g:741:1: entryRuleValue returns [EObject current=null] : iv_ruleValue= ruleValue EOF ;
    public final EObject entryRuleValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleValue = null;


        try {
            // InternalMyDsl.g:741:46: (iv_ruleValue= ruleValue EOF )
            // InternalMyDsl.g:742:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // InternalMyDsl.g:748:1: ruleValue returns [EObject current=null] : (this_Literal_0= ruleLiteral | this_VarRef_1= ruleVarRef | this_ArrayValue_2= ruleArrayValue | this_StructValue_3= ruleStructValue ) ;
    public final EObject ruleValue() throws RecognitionException {
        EObject current = null;

        EObject this_Literal_0 = null;

        EObject this_VarRef_1 = null;

        EObject this_ArrayValue_2 = null;

        EObject this_StructValue_3 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:754:2: ( (this_Literal_0= ruleLiteral | this_VarRef_1= ruleVarRef | this_ArrayValue_2= ruleArrayValue | this_StructValue_3= ruleStructValue ) )
            // InternalMyDsl.g:755:2: (this_Literal_0= ruleLiteral | this_VarRef_1= ruleVarRef | this_ArrayValue_2= ruleArrayValue | this_StructValue_3= ruleStructValue )
            {
            // InternalMyDsl.g:755:2: (this_Literal_0= ruleLiteral | this_VarRef_1= ruleVarRef | this_ArrayValue_2= ruleArrayValue | this_StructValue_3= ruleStructValue )
            int alt11=4;
            switch ( input.LA(1) ) {
            case RULE_STRING:
            case RULE_INT:
                {
                alt11=1;
                }
                break;
            case RULE_ID:
                {
                alt11=2;
                }
                break;
            case 23:
                {
                alt11=3;
                }
                break;
            case 14:
                {
                alt11=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // InternalMyDsl.g:756:3: this_Literal_0= ruleLiteral
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_Literal_0=ruleLiteral();

                    state._fsp--;


                    			current = this_Literal_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:765:3: this_VarRef_1= ruleVarRef
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getVarRefParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_VarRef_1=ruleVarRef();

                    state._fsp--;


                    			current = this_VarRef_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 3 :
                    // InternalMyDsl.g:774:3: this_ArrayValue_2= ruleArrayValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getArrayValueParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_ArrayValue_2=ruleArrayValue();

                    state._fsp--;


                    			current = this_ArrayValue_2;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMyDsl.g:783:3: this_StructValue_3= ruleStructValue
                    {

                    			newCompositeNode(grammarAccess.getValueAccess().getStructValueParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_StructValue_3=ruleStructValue();

                    state._fsp--;


                    			current = this_StructValue_3;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleVarRef"
    // InternalMyDsl.g:795:1: entryRuleVarRef returns [EObject current=null] : iv_ruleVarRef= ruleVarRef EOF ;
    public final EObject entryRuleVarRef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarRef = null;


        try {
            // InternalMyDsl.g:795:47: (iv_ruleVarRef= ruleVarRef EOF )
            // InternalMyDsl.g:796:2: iv_ruleVarRef= ruleVarRef EOF
            {
             newCompositeNode(grammarAccess.getVarRefRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarRef=ruleVarRef();

            state._fsp--;

             current =iv_ruleVarRef; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVarRef"


    // $ANTLR start "ruleVarRef"
    // InternalMyDsl.g:802:1: ruleVarRef returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVarRef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:808:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMyDsl.g:809:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMyDsl.g:809:2: ( (otherlv_0= RULE_ID ) )
            // InternalMyDsl.g:810:3: (otherlv_0= RULE_ID )
            {
            // InternalMyDsl.g:810:3: (otherlv_0= RULE_ID )
            // InternalMyDsl.g:811:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVarRefRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVarRefAccess().getRefVarDefCrossReference_0());
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVarRef"


    // $ANTLR start "entryRuleArrayValue"
    // InternalMyDsl.g:825:1: entryRuleArrayValue returns [EObject current=null] : iv_ruleArrayValue= ruleArrayValue EOF ;
    public final EObject entryRuleArrayValue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArrayValue = null;


        try {
            // InternalMyDsl.g:825:51: (iv_ruleArrayValue= ruleArrayValue EOF )
            // InternalMyDsl.g:826:2: iv_ruleArrayValue= ruleArrayValue EOF
            {
             newCompositeNode(grammarAccess.getArrayValueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleArrayValue=ruleArrayValue();

            state._fsp--;

             current =iv_ruleArrayValue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleArrayValue"


    // $ANTLR start "ruleArrayValue"
    // InternalMyDsl.g:832:1: ruleArrayValue returns [EObject current=null] : (otherlv_0= '[' ( ( (lv_elements_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleValue ) ) )* )? otherlv_4= ']' ) ;
    public final EObject ruleArrayValue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_elements_1_0 = null;

        EObject lv_elements_3_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:838:2: ( (otherlv_0= '[' ( ( (lv_elements_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleValue ) ) )* )? otherlv_4= ']' ) )
            // InternalMyDsl.g:839:2: (otherlv_0= '[' ( ( (lv_elements_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleValue ) ) )* )? otherlv_4= ']' )
            {
            // InternalMyDsl.g:839:2: (otherlv_0= '[' ( ( (lv_elements_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleValue ) ) )* )? otherlv_4= ']' )
            // InternalMyDsl.g:840:3: otherlv_0= '[' ( ( (lv_elements_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleValue ) ) )* )? otherlv_4= ']'
            {
            otherlv_0=(Token)match(input,23,FOLLOW_15); 

            			newLeafNode(otherlv_0, grammarAccess.getArrayValueAccess().getLeftSquareBracketKeyword_0());
            		
            // InternalMyDsl.g:844:3: ( ( (lv_elements_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleValue ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( ((LA13_0>=RULE_ID && LA13_0<=RULE_INT)||LA13_0==14||LA13_0==23) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalMyDsl.g:845:4: ( (lv_elements_1_0= ruleValue ) ) (otherlv_2= ',' ( (lv_elements_3_0= ruleValue ) ) )*
                    {
                    // InternalMyDsl.g:845:4: ( (lv_elements_1_0= ruleValue ) )
                    // InternalMyDsl.g:846:5: (lv_elements_1_0= ruleValue )
                    {
                    // InternalMyDsl.g:846:5: (lv_elements_1_0= ruleValue )
                    // InternalMyDsl.g:847:6: lv_elements_1_0= ruleValue
                    {

                    						newCompositeNode(grammarAccess.getArrayValueAccess().getElementsValueParserRuleCall_1_0_0());
                    					
                    pushFollow(FOLLOW_16);
                    lv_elements_1_0=ruleValue();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    						}
                    						add(
                    							current,
                    							"elements",
                    							lv_elements_1_0,
                    							"org.xtext.example.mydsl.MyDsl.Value");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalMyDsl.g:864:4: (otherlv_2= ',' ( (lv_elements_3_0= ruleValue ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==15) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // InternalMyDsl.g:865:5: otherlv_2= ',' ( (lv_elements_3_0= ruleValue ) )
                    	    {
                    	    otherlv_2=(Token)match(input,15,FOLLOW_14); 

                    	    					newLeafNode(otherlv_2, grammarAccess.getArrayValueAccess().getCommaKeyword_1_1_0());
                    	    				
                    	    // InternalMyDsl.g:869:5: ( (lv_elements_3_0= ruleValue ) )
                    	    // InternalMyDsl.g:870:6: (lv_elements_3_0= ruleValue )
                    	    {
                    	    // InternalMyDsl.g:870:6: (lv_elements_3_0= ruleValue )
                    	    // InternalMyDsl.g:871:7: lv_elements_3_0= ruleValue
                    	    {

                    	    							newCompositeNode(grammarAccess.getArrayValueAccess().getElementsValueParserRuleCall_1_1_1_0());
                    	    						
                    	    pushFollow(FOLLOW_16);
                    	    lv_elements_3_0=ruleValue();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getArrayValueRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"elements",
                    	    								lv_elements_3_0,
                    	    								"org.xtext.example.mydsl.MyDsl.Value");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_4=(Token)match(input,24,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getArrayValueAccess().getRightSquareBracketKeyword_2());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleArrayValue"


    // $ANTLR start "entryRuleLiteral"
    // InternalMyDsl.g:898:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // InternalMyDsl.g:898:48: (iv_ruleLiteral= ruleLiteral EOF )
            // InternalMyDsl.g:899:2: iv_ruleLiteral= ruleLiteral EOF
            {
             newCompositeNode(grammarAccess.getLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;

             current =iv_ruleLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleLiteral"


    // $ANTLR start "ruleLiteral"
    // InternalMyDsl.g:905:1: ruleLiteral returns [EObject current=null] : (this_StringLiteral_0= ruleStringLiteral | this_NumberLiteral_1= ruleNumberLiteral ) ;
    public final EObject ruleLiteral() throws RecognitionException {
        EObject current = null;

        EObject this_StringLiteral_0 = null;

        EObject this_NumberLiteral_1 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:911:2: ( (this_StringLiteral_0= ruleStringLiteral | this_NumberLiteral_1= ruleNumberLiteral ) )
            // InternalMyDsl.g:912:2: (this_StringLiteral_0= ruleStringLiteral | this_NumberLiteral_1= ruleNumberLiteral )
            {
            // InternalMyDsl.g:912:2: (this_StringLiteral_0= ruleStringLiteral | this_NumberLiteral_1= ruleNumberLiteral )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_STRING) ) {
                alt14=1;
            }
            else if ( (LA14_0==RULE_INT) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // InternalMyDsl.g:913:3: this_StringLiteral_0= ruleStringLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getStringLiteralParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_StringLiteral_0=ruleStringLiteral();

                    state._fsp--;


                    			current = this_StringLiteral_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:922:3: this_NumberLiteral_1= ruleNumberLiteral
                    {

                    			newCompositeNode(grammarAccess.getLiteralAccess().getNumberLiteralParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_NumberLiteral_1=ruleNumberLiteral();

                    state._fsp--;


                    			current = this_NumberLiteral_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleLiteral"


    // $ANTLR start "entryRuleStringLiteral"
    // InternalMyDsl.g:934:1: entryRuleStringLiteral returns [EObject current=null] : iv_ruleStringLiteral= ruleStringLiteral EOF ;
    public final EObject entryRuleStringLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStringLiteral = null;


        try {
            // InternalMyDsl.g:934:54: (iv_ruleStringLiteral= ruleStringLiteral EOF )
            // InternalMyDsl.g:935:2: iv_ruleStringLiteral= ruleStringLiteral EOF
            {
             newCompositeNode(grammarAccess.getStringLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleStringLiteral=ruleStringLiteral();

            state._fsp--;

             current =iv_ruleStringLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStringLiteral"


    // $ANTLR start "ruleStringLiteral"
    // InternalMyDsl.g:941:1: ruleStringLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_STRING ) ) ;
    public final EObject ruleStringLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:947:2: ( ( (lv_value_0_0= RULE_STRING ) ) )
            // InternalMyDsl.g:948:2: ( (lv_value_0_0= RULE_STRING ) )
            {
            // InternalMyDsl.g:948:2: ( (lv_value_0_0= RULE_STRING ) )
            // InternalMyDsl.g:949:3: (lv_value_0_0= RULE_STRING )
            {
            // InternalMyDsl.g:949:3: (lv_value_0_0= RULE_STRING )
            // InternalMyDsl.g:950:4: lv_value_0_0= RULE_STRING
            {
            lv_value_0_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getStringLiteralAccess().getValueSTRINGTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getStringLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.STRING");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStringLiteral"


    // $ANTLR start "entryRuleNumberLiteral"
    // InternalMyDsl.g:969:1: entryRuleNumberLiteral returns [EObject current=null] : iv_ruleNumberLiteral= ruleNumberLiteral EOF ;
    public final EObject entryRuleNumberLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNumberLiteral = null;


        try {
            // InternalMyDsl.g:969:54: (iv_ruleNumberLiteral= ruleNumberLiteral EOF )
            // InternalMyDsl.g:970:2: iv_ruleNumberLiteral= ruleNumberLiteral EOF
            {
             newCompositeNode(grammarAccess.getNumberLiteralRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleNumberLiteral=ruleNumberLiteral();

            state._fsp--;

             current =iv_ruleNumberLiteral; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleNumberLiteral"


    // $ANTLR start "ruleNumberLiteral"
    // InternalMyDsl.g:976:1: ruleNumberLiteral returns [EObject current=null] : ( (lv_value_0_0= RULE_INT ) ) ;
    public final EObject ruleNumberLiteral() throws RecognitionException {
        EObject current = null;

        Token lv_value_0_0=null;


        	enterRule();

        try {
            // InternalMyDsl.g:982:2: ( ( (lv_value_0_0= RULE_INT ) ) )
            // InternalMyDsl.g:983:2: ( (lv_value_0_0= RULE_INT ) )
            {
            // InternalMyDsl.g:983:2: ( (lv_value_0_0= RULE_INT ) )
            // InternalMyDsl.g:984:3: (lv_value_0_0= RULE_INT )
            {
            // InternalMyDsl.g:984:3: (lv_value_0_0= RULE_INT )
            // InternalMyDsl.g:985:4: lv_value_0_0= RULE_INT
            {
            lv_value_0_0=(Token)match(input,RULE_INT,FOLLOW_2); 

            				newLeafNode(lv_value_0_0, grammarAccess.getNumberLiteralAccess().getValueINTTerminalRuleCall_0());
            			

            				if (current==null) {
            					current = createModelElement(grammarAccess.getNumberLiteralRule());
            				}
            				setWithLastConsumed(
            					current,
            					"value",
            					lv_value_0_0,
            					"org.eclipse.xtext.common.Terminals.INT");
            			

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleNumberLiteral"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000401002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000300010L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000040002L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000080002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000804070L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000001804070L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001008000L});

}