package dk.sdu.mmmi.mdsd.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'program'", "'external'", "'sqrt(int)'", "'pi()'", "'pow(int,int)'", "'var'", "'='", "'+'", "'-'", "'*'", "'/'", "'('", "')'", "'sqrt('", "'pow('", "','", "'let'", "'in'", "'end'"
    };
    public static final int RULE_STRING=6;
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
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

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

        public InternalMathParser(TokenStream input, MathGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Program";
       	}

       	@Override
       	protected MathGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleProgram"
    // InternalMath.g:64:1: entryRuleProgram returns [EObject current=null] : iv_ruleProgram= ruleProgram EOF ;
    public final EObject entryRuleProgram() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleProgram = null;


        try {
            // InternalMath.g:64:48: (iv_ruleProgram= ruleProgram EOF )
            // InternalMath.g:65:2: iv_ruleProgram= ruleProgram EOF
            {
             newCompositeNode(grammarAccess.getProgramRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleProgram=ruleProgram();

            state._fsp--;

             current =iv_ruleProgram; 
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
    // $ANTLR end "entryRuleProgram"


    // $ANTLR start "ruleProgram"
    // InternalMath.g:71:1: ruleProgram returns [EObject current=null] : (otherlv_0= 'program' ( (lv_program_1_0= RULE_ID ) ) (otherlv_2= 'external' ( ( (lv_external_3_0= 'sqrt(int)' ) ) | ( (lv_external_4_0= 'pi()' ) ) | ( (lv_external_5_0= 'pow(int,int)' ) ) ) )* ( (lv_math_6_0= ruleMathExp ) ) ) ;
    public final EObject ruleProgram() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_program_1_0=null;
        Token otherlv_2=null;
        Token lv_external_3_0=null;
        Token lv_external_4_0=null;
        Token lv_external_5_0=null;
        EObject lv_math_6_0 = null;



        	enterRule();

        try {
            // InternalMath.g:77:2: ( (otherlv_0= 'program' ( (lv_program_1_0= RULE_ID ) ) (otherlv_2= 'external' ( ( (lv_external_3_0= 'sqrt(int)' ) ) | ( (lv_external_4_0= 'pi()' ) ) | ( (lv_external_5_0= 'pow(int,int)' ) ) ) )* ( (lv_math_6_0= ruleMathExp ) ) ) )
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_program_1_0= RULE_ID ) ) (otherlv_2= 'external' ( ( (lv_external_3_0= 'sqrt(int)' ) ) | ( (lv_external_4_0= 'pi()' ) ) | ( (lv_external_5_0= 'pow(int,int)' ) ) ) )* ( (lv_math_6_0= ruleMathExp ) ) )
            {
            // InternalMath.g:78:2: (otherlv_0= 'program' ( (lv_program_1_0= RULE_ID ) ) (otherlv_2= 'external' ( ( (lv_external_3_0= 'sqrt(int)' ) ) | ( (lv_external_4_0= 'pi()' ) ) | ( (lv_external_5_0= 'pow(int,int)' ) ) ) )* ( (lv_math_6_0= ruleMathExp ) ) )
            // InternalMath.g:79:3: otherlv_0= 'program' ( (lv_program_1_0= RULE_ID ) ) (otherlv_2= 'external' ( ( (lv_external_3_0= 'sqrt(int)' ) ) | ( (lv_external_4_0= 'pi()' ) ) | ( (lv_external_5_0= 'pow(int,int)' ) ) ) )* ( (lv_math_6_0= ruleMathExp ) )
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getProgramAccess().getProgramKeyword_0());
            		
            // InternalMath.g:83:3: ( (lv_program_1_0= RULE_ID ) )
            // InternalMath.g:84:4: (lv_program_1_0= RULE_ID )
            {
            // InternalMath.g:84:4: (lv_program_1_0= RULE_ID )
            // InternalMath.g:85:5: lv_program_1_0= RULE_ID
            {
            lv_program_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_program_1_0, grammarAccess.getProgramAccess().getProgramIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getProgramRule());
            					}
            					setWithLastConsumed(
            						current,
            						"program",
            						lv_program_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            // InternalMath.g:101:3: (otherlv_2= 'external' ( ( (lv_external_3_0= 'sqrt(int)' ) ) | ( (lv_external_4_0= 'pi()' ) ) | ( (lv_external_5_0= 'pow(int,int)' ) ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==12) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalMath.g:102:4: otherlv_2= 'external' ( ( (lv_external_3_0= 'sqrt(int)' ) ) | ( (lv_external_4_0= 'pi()' ) ) | ( (lv_external_5_0= 'pow(int,int)' ) ) )
            	    {
            	    otherlv_2=(Token)match(input,12,FOLLOW_5); 

            	    				newLeafNode(otherlv_2, grammarAccess.getProgramAccess().getExternalKeyword_2_0());
            	    			
            	    // InternalMath.g:106:4: ( ( (lv_external_3_0= 'sqrt(int)' ) ) | ( (lv_external_4_0= 'pi()' ) ) | ( (lv_external_5_0= 'pow(int,int)' ) ) )
            	    int alt1=3;
            	    switch ( input.LA(1) ) {
            	    case 13:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 14:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 15:
            	        {
            	        alt1=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // InternalMath.g:107:5: ( (lv_external_3_0= 'sqrt(int)' ) )
            	            {
            	            // InternalMath.g:107:5: ( (lv_external_3_0= 'sqrt(int)' ) )
            	            // InternalMath.g:108:6: (lv_external_3_0= 'sqrt(int)' )
            	            {
            	            // InternalMath.g:108:6: (lv_external_3_0= 'sqrt(int)' )
            	            // InternalMath.g:109:7: lv_external_3_0= 'sqrt(int)'
            	            {
            	            lv_external_3_0=(Token)match(input,13,FOLLOW_4); 

            	            							newLeafNode(lv_external_3_0, grammarAccess.getProgramAccess().getExternalSqrtIntKeyword_2_1_0_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getProgramRule());
            	            							}
            	            							setWithLastConsumed(current, "external", lv_external_3_0, "sqrt(int)");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:122:5: ( (lv_external_4_0= 'pi()' ) )
            	            {
            	            // InternalMath.g:122:5: ( (lv_external_4_0= 'pi()' ) )
            	            // InternalMath.g:123:6: (lv_external_4_0= 'pi()' )
            	            {
            	            // InternalMath.g:123:6: (lv_external_4_0= 'pi()' )
            	            // InternalMath.g:124:7: lv_external_4_0= 'pi()'
            	            {
            	            lv_external_4_0=(Token)match(input,14,FOLLOW_4); 

            	            							newLeafNode(lv_external_4_0, grammarAccess.getProgramAccess().getExternalPiKeyword_2_1_1_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getProgramRule());
            	            							}
            	            							setWithLastConsumed(current, "external", lv_external_4_0, "pi()");
            	            						

            	            }


            	            }


            	            }
            	            break;
            	        case 3 :
            	            // InternalMath.g:137:5: ( (lv_external_5_0= 'pow(int,int)' ) )
            	            {
            	            // InternalMath.g:137:5: ( (lv_external_5_0= 'pow(int,int)' ) )
            	            // InternalMath.g:138:6: (lv_external_5_0= 'pow(int,int)' )
            	            {
            	            // InternalMath.g:138:6: (lv_external_5_0= 'pow(int,int)' )
            	            // InternalMath.g:139:7: lv_external_5_0= 'pow(int,int)'
            	            {
            	            lv_external_5_0=(Token)match(input,15,FOLLOW_4); 

            	            							newLeafNode(lv_external_5_0, grammarAccess.getProgramAccess().getExternalPowIntIntKeyword_2_1_2_0());
            	            						

            	            							if (current==null) {
            	            								current = createModelElement(grammarAccess.getProgramRule());
            	            							}
            	            							setWithLastConsumed(current, "external", lv_external_5_0, "pow(int,int)");
            	            						

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalMath.g:153:3: ( (lv_math_6_0= ruleMathExp ) )
            // InternalMath.g:154:4: (lv_math_6_0= ruleMathExp )
            {
            // InternalMath.g:154:4: (lv_math_6_0= ruleMathExp )
            // InternalMath.g:155:5: lv_math_6_0= ruleMathExp
            {

            					newCompositeNode(grammarAccess.getProgramAccess().getMathMathExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_math_6_0=ruleMathExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getProgramRule());
            					}
            					add(
            						current,
            						"math",
            						lv_math_6_0,
            						"dk.sdu.mmmi.mdsd.Math.MathExp");
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
    // $ANTLR end "ruleProgram"


    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:176:1: entryRuleMathExp returns [EObject current=null] : iv_ruleMathExp= ruleMathExp EOF ;
    public final EObject entryRuleMathExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMathExp = null;


        try {
            // InternalMath.g:176:48: (iv_ruleMathExp= ruleMathExp EOF )
            // InternalMath.g:177:2: iv_ruleMathExp= ruleMathExp EOF
            {
             newCompositeNode(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleMathExp=ruleMathExp();

            state._fsp--;

             current =iv_ruleMathExp; 
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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:183:1: ruleMathExp returns [EObject current=null] : ( () ( (lv_variables_1_0= ruleVarBinding ) )* ) ;
    public final EObject ruleMathExp() throws RecognitionException {
        EObject current = null;

        EObject lv_variables_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:189:2: ( ( () ( (lv_variables_1_0= ruleVarBinding ) )* ) )
            // InternalMath.g:190:2: ( () ( (lv_variables_1_0= ruleVarBinding ) )* )
            {
            // InternalMath.g:190:2: ( () ( (lv_variables_1_0= ruleVarBinding ) )* )
            // InternalMath.g:191:3: () ( (lv_variables_1_0= ruleVarBinding ) )*
            {
            // InternalMath.g:191:3: ()
            // InternalMath.g:192:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getMathExpAccess().getMathExpAction_0(),
            					current);
            			

            }

            // InternalMath.g:198:3: ( (lv_variables_1_0= ruleVarBinding ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalMath.g:199:4: (lv_variables_1_0= ruleVarBinding )
            	    {
            	    // InternalMath.g:199:4: (lv_variables_1_0= ruleVarBinding )
            	    // InternalMath.g:200:5: lv_variables_1_0= ruleVarBinding
            	    {

            	    					newCompositeNode(grammarAccess.getMathExpAccess().getVariablesVarBindingParserRuleCall_1_0());
            	    				
            	    pushFollow(FOLLOW_6);
            	    lv_variables_1_0=ruleVarBinding();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getMathExpRule());
            	    					}
            	    					add(
            	    						current,
            	    						"variables",
            	    						lv_variables_1_0,
            	    						"dk.sdu.mmmi.mdsd.Math.VarBinding");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleVarBinding"
    // InternalMath.g:221:1: entryRuleVarBinding returns [EObject current=null] : iv_ruleVarBinding= ruleVarBinding EOF ;
    public final EObject entryRuleVarBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVarBinding = null;


        try {
            // InternalMath.g:221:51: (iv_ruleVarBinding= ruleVarBinding EOF )
            // InternalMath.g:222:2: iv_ruleVarBinding= ruleVarBinding EOF
            {
             newCompositeNode(grammarAccess.getVarBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVarBinding=ruleVarBinding();

            state._fsp--;

             current =iv_ruleVarBinding; 
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
    // $ANTLR end "entryRuleVarBinding"


    // $ANTLR start "ruleVarBinding"
    // InternalMath.g:228:1: ruleVarBinding returns [EObject current=null] : (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) ;
    public final EObject ruleVarBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        EObject lv_expression_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:234:2: ( (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) ) )
            // InternalMath.g:235:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            {
            // InternalMath.g:235:2: (otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) ) )
            // InternalMath.g:236:3: otherlv_0= 'var' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_expression_3_0= ruleExp ) )
            {
            otherlv_0=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getVarBindingAccess().getVarKeyword_0());
            		
            // InternalMath.g:240:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:241:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:241:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:242:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getVarBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getVarBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getVarBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:262:3: ( (lv_expression_3_0= ruleExp ) )
            // InternalMath.g:263:4: (lv_expression_3_0= ruleExp )
            {
            // InternalMath.g:263:4: (lv_expression_3_0= ruleExp )
            // InternalMath.g:264:5: lv_expression_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getVarBindingAccess().getExpressionExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_2);
            lv_expression_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getVarBindingRule());
            					}
            					set(
            						current,
            						"expression",
            						lv_expression_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
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
    // $ANTLR end "ruleVarBinding"


    // $ANTLR start "entryRuleExp"
    // InternalMath.g:285:1: entryRuleExp returns [EObject current=null] : iv_ruleExp= ruleExp EOF ;
    public final EObject entryRuleExp() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExp = null;


        try {
            // InternalMath.g:285:44: (iv_ruleExp= ruleExp EOF )
            // InternalMath.g:286:2: iv_ruleExp= ruleExp EOF
            {
             newCompositeNode(grammarAccess.getExpRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleExp=ruleExp();

            state._fsp--;

             current =iv_ruleExp; 
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
    // $ANTLR end "entryRuleExp"


    // $ANTLR start "ruleExp"
    // InternalMath.g:292:1: ruleExp returns [EObject current=null] : (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) ;
    public final EObject ruleExp() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Factor_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:298:2: ( (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* ) )
            // InternalMath.g:299:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            {
            // InternalMath.g:299:2: (this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )* )
            // InternalMath.g:300:3: this_Factor_0= ruleFactor ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            {

            			newCompositeNode(grammarAccess.getExpAccess().getFactorParserRuleCall_0());
            		
            pushFollow(FOLLOW_9);
            this_Factor_0=ruleFactor();

            state._fsp--;


            			current = this_Factor_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:308:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) ) )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>=18 && LA5_0<=19)) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalMath.g:309:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleFactor ) )
            	    {
            	    // InternalMath.g:309:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt4=2;
            	    int LA4_0 = input.LA(1);

            	    if ( (LA4_0==18) ) {
            	        alt4=1;
            	    }
            	    else if ( (LA4_0==19) ) {
            	        alt4=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 4, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt4) {
            	        case 1 :
            	            // InternalMath.g:310:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalMath.g:310:5: ( () otherlv_2= '+' )
            	            // InternalMath.g:311:6: () otherlv_2= '+'
            	            {
            	            // InternalMath.g:311:6: ()
            	            // InternalMath.g:312:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getPlusLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,18,FOLLOW_8); 

            	            						newLeafNode(otherlv_2, grammarAccess.getExpAccess().getPlusSignKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:324:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalMath.g:324:5: ( () otherlv_4= '-' )
            	            // InternalMath.g:325:6: () otherlv_4= '-'
            	            {
            	            // InternalMath.g:325:6: ()
            	            // InternalMath.g:326:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getExpAccess().getMinusLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,19,FOLLOW_8); 

            	            						newLeafNode(otherlv_4, grammarAccess.getExpAccess().getHyphenMinusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:338:4: ( (lv_right_5_0= ruleFactor ) )
            	    // InternalMath.g:339:5: (lv_right_5_0= ruleFactor )
            	    {
            	    // InternalMath.g:339:5: (lv_right_5_0= ruleFactor )
            	    // InternalMath.g:340:6: lv_right_5_0= ruleFactor
            	    {

            	    						newCompositeNode(grammarAccess.getExpAccess().getRightFactorParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_9);
            	    lv_right_5_0=ruleFactor();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getExpRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Factor");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop5;
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
    // $ANTLR end "ruleExp"


    // $ANTLR start "entryRuleFactor"
    // InternalMath.g:362:1: entryRuleFactor returns [EObject current=null] : iv_ruleFactor= ruleFactor EOF ;
    public final EObject entryRuleFactor() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFactor = null;


        try {
            // InternalMath.g:362:47: (iv_ruleFactor= ruleFactor EOF )
            // InternalMath.g:363:2: iv_ruleFactor= ruleFactor EOF
            {
             newCompositeNode(grammarAccess.getFactorRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleFactor=ruleFactor();

            state._fsp--;

             current =iv_ruleFactor; 
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
    // $ANTLR end "entryRuleFactor"


    // $ANTLR start "ruleFactor"
    // InternalMath.g:369:1: ruleFactor returns [EObject current=null] : (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) ;
    public final EObject ruleFactor() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Primary_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:375:2: ( (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* ) )
            // InternalMath.g:376:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            {
            // InternalMath.g:376:2: (this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )* )
            // InternalMath.g:377:3: this_Primary_0= rulePrimary ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            {

            			newCompositeNode(grammarAccess.getFactorAccess().getPrimaryParserRuleCall_0());
            		
            pushFollow(FOLLOW_10);
            this_Primary_0=rulePrimary();

            state._fsp--;


            			current = this_Primary_0;
            			afterParserOrEnumRuleCall();
            		
            // InternalMath.g:385:3: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) ) )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>=20 && LA7_0<=21)) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMath.g:386:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimary ) )
            	    {
            	    // InternalMath.g:386:4: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==20) ) {
            	        alt6=1;
            	    }
            	    else if ( (LA6_0==21) ) {
            	        alt6=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // InternalMath.g:387:5: ( () otherlv_2= '*' )
            	            {
            	            // InternalMath.g:387:5: ( () otherlv_2= '*' )
            	            // InternalMath.g:388:6: () otherlv_2= '*'
            	            {
            	            // InternalMath.g:388:6: ()
            	            // InternalMath.g:389:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getMultLeftAction_1_0_0_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_2=(Token)match(input,20,FOLLOW_8); 

            	            						newLeafNode(otherlv_2, grammarAccess.getFactorAccess().getAsteriskKeyword_1_0_0_1());
            	            					

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalMath.g:401:5: ( () otherlv_4= '/' )
            	            {
            	            // InternalMath.g:401:5: ( () otherlv_4= '/' )
            	            // InternalMath.g:402:6: () otherlv_4= '/'
            	            {
            	            // InternalMath.g:402:6: ()
            	            // InternalMath.g:403:7: 
            	            {

            	            							current = forceCreateModelElementAndSet(
            	            								grammarAccess.getFactorAccess().getDivLeftAction_1_0_1_0(),
            	            								current);
            	            						

            	            }

            	            otherlv_4=(Token)match(input,21,FOLLOW_8); 

            	            						newLeafNode(otherlv_4, grammarAccess.getFactorAccess().getSolidusKeyword_1_0_1_1());
            	            					

            	            }


            	            }
            	            break;

            	    }

            	    // InternalMath.g:415:4: ( (lv_right_5_0= rulePrimary ) )
            	    // InternalMath.g:416:5: (lv_right_5_0= rulePrimary )
            	    {
            	    // InternalMath.g:416:5: (lv_right_5_0= rulePrimary )
            	    // InternalMath.g:417:6: lv_right_5_0= rulePrimary
            	    {

            	    						newCompositeNode(grammarAccess.getFactorAccess().getRightPrimaryParserRuleCall_1_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
            	    lv_right_5_0=rulePrimary();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getFactorRule());
            	    						}
            	    						set(
            	    							current,
            	    							"right",
            	    							lv_right_5_0,
            	    							"dk.sdu.mmmi.mdsd.Math.Primary");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop7;
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
    // $ANTLR end "ruleFactor"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:439:1: entryRulePrimary returns [EObject current=null] : iv_rulePrimary= rulePrimary EOF ;
    public final EObject entryRulePrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimary = null;


        try {
            // InternalMath.g:439:48: (iv_rulePrimary= rulePrimary EOF )
            // InternalMath.g:440:2: iv_rulePrimary= rulePrimary EOF
            {
             newCompositeNode(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePrimary=rulePrimary();

            state._fsp--;

             current =iv_rulePrimary; 
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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:446:1: rulePrimary returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) | this_VariableUse_5= ruleVariableUse | this_LetBinding_6= ruleLetBinding | this_SquareRoot_7= ruleSquareRoot | this_Power_8= rulePower | ( () rulePI ) ) ;
    public final EObject rulePrimary() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_Exp_3 = null;

        EObject this_VariableUse_5 = null;

        EObject this_LetBinding_6 = null;

        EObject this_SquareRoot_7 = null;

        EObject this_Power_8 = null;



        	enterRule();

        try {
            // InternalMath.g:452:2: ( ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) | this_VariableUse_5= ruleVariableUse | this_LetBinding_6= ruleLetBinding | this_SquareRoot_7= ruleSquareRoot | this_Power_8= rulePower | ( () rulePI ) ) )
            // InternalMath.g:453:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) | this_VariableUse_5= ruleVariableUse | this_LetBinding_6= ruleLetBinding | this_SquareRoot_7= ruleSquareRoot | this_Power_8= rulePower | ( () rulePI ) )
            {
            // InternalMath.g:453:2: ( ( () ( (lv_value_1_0= RULE_INT ) ) ) | (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' ) | this_VariableUse_5= ruleVariableUse | this_LetBinding_6= ruleLetBinding | this_SquareRoot_7= ruleSquareRoot | this_Power_8= rulePower | ( () rulePI ) )
            int alt8=7;
            switch ( input.LA(1) ) {
            case RULE_INT:
                {
                alt8=1;
                }
                break;
            case 22:
                {
                alt8=2;
                }
                break;
            case RULE_ID:
                {
                alt8=3;
                }
                break;
            case 27:
                {
                alt8=4;
                }
                break;
            case 24:
                {
                alt8=5;
                }
                break;
            case 25:
                {
                alt8=6;
                }
                break;
            case 14:
                {
                alt8=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // InternalMath.g:454:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    {
                    // InternalMath.g:454:3: ( () ( (lv_value_1_0= RULE_INT ) ) )
                    // InternalMath.g:455:4: () ( (lv_value_1_0= RULE_INT ) )
                    {
                    // InternalMath.g:455:4: ()
                    // InternalMath.g:456:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_0_0(),
                    						current);
                    				

                    }

                    // InternalMath.g:462:4: ( (lv_value_1_0= RULE_INT ) )
                    // InternalMath.g:463:5: (lv_value_1_0= RULE_INT )
                    {
                    // InternalMath.g:463:5: (lv_value_1_0= RULE_INT )
                    // InternalMath.g:464:6: lv_value_1_0= RULE_INT
                    {
                    lv_value_1_0=(Token)match(input,RULE_INT,FOLLOW_2); 

                    						newLeafNode(lv_value_1_0, grammarAccess.getPrimaryAccess().getValueINTTerminalRuleCall_0_1_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPrimaryRule());
                    						}
                    						setWithLastConsumed(
                    							current,
                    							"value",
                    							lv_value_1_0,
                    							"org.eclipse.xtext.common.Terminals.INT");
                    					

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:482:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    {
                    // InternalMath.g:482:3: (otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')' )
                    // InternalMath.g:483:4: otherlv_2= '(' this_Exp_3= ruleExp otherlv_4= ')'
                    {
                    otherlv_2=(Token)match(input,22,FOLLOW_8); 

                    				newLeafNode(otherlv_2, grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0());
                    			

                    				newCompositeNode(grammarAccess.getPrimaryAccess().getExpParserRuleCall_1_1());
                    			
                    pushFollow(FOLLOW_11);
                    this_Exp_3=ruleExp();

                    state._fsp--;


                    				current = this_Exp_3;
                    				afterParserOrEnumRuleCall();
                    			
                    otherlv_4=(Token)match(input,23,FOLLOW_2); 

                    				newLeafNode(otherlv_4, grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:501:3: this_VariableUse_5= ruleVariableUse
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getVariableUseParserRuleCall_2());
                    		
                    pushFollow(FOLLOW_2);
                    this_VariableUse_5=ruleVariableUse();

                    state._fsp--;


                    			current = this_VariableUse_5;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 4 :
                    // InternalMath.g:510:3: this_LetBinding_6= ruleLetBinding
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getLetBindingParserRuleCall_3());
                    		
                    pushFollow(FOLLOW_2);
                    this_LetBinding_6=ruleLetBinding();

                    state._fsp--;


                    			current = this_LetBinding_6;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 5 :
                    // InternalMath.g:519:3: this_SquareRoot_7= ruleSquareRoot
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getSquareRootParserRuleCall_4());
                    		
                    pushFollow(FOLLOW_2);
                    this_SquareRoot_7=ruleSquareRoot();

                    state._fsp--;


                    			current = this_SquareRoot_7;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 6 :
                    // InternalMath.g:528:3: this_Power_8= rulePower
                    {

                    			newCompositeNode(grammarAccess.getPrimaryAccess().getPowerParserRuleCall_5());
                    		
                    pushFollow(FOLLOW_2);
                    this_Power_8=rulePower();

                    state._fsp--;


                    			current = this_Power_8;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 7 :
                    // InternalMath.g:537:3: ( () rulePI )
                    {
                    // InternalMath.g:537:3: ( () rulePI )
                    // InternalMath.g:538:4: () rulePI
                    {
                    // InternalMath.g:538:4: ()
                    // InternalMath.g:539:5: 
                    {

                    					current = forceCreateModelElement(
                    						grammarAccess.getPrimaryAccess().getMathNumberAction_6_0(),
                    						current);
                    				

                    }


                    				newCompositeNode(grammarAccess.getPrimaryAccess().getPIParserRuleCall_6_1());
                    			
                    pushFollow(FOLLOW_2);
                    rulePI();

                    state._fsp--;


                    				afterParserOrEnumRuleCall();
                    			

                    }


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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleSquareRoot"
    // InternalMath.g:557:1: entryRuleSquareRoot returns [EObject current=null] : iv_ruleSquareRoot= ruleSquareRoot EOF ;
    public final EObject entryRuleSquareRoot() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSquareRoot = null;


        try {
            // InternalMath.g:557:51: (iv_ruleSquareRoot= ruleSquareRoot EOF )
            // InternalMath.g:558:2: iv_ruleSquareRoot= ruleSquareRoot EOF
            {
             newCompositeNode(grammarAccess.getSquareRootRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleSquareRoot=ruleSquareRoot();

            state._fsp--;

             current =iv_ruleSquareRoot; 
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
    // $ANTLR end "entryRuleSquareRoot"


    // $ANTLR start "ruleSquareRoot"
    // InternalMath.g:564:1: ruleSquareRoot returns [EObject current=null] : (otherlv_0= 'sqrt(' ( (lv_n_1_0= ruleExp ) ) otherlv_2= ')' ) ;
    public final EObject ruleSquareRoot() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_n_1_0 = null;



        	enterRule();

        try {
            // InternalMath.g:570:2: ( (otherlv_0= 'sqrt(' ( (lv_n_1_0= ruleExp ) ) otherlv_2= ')' ) )
            // InternalMath.g:571:2: (otherlv_0= 'sqrt(' ( (lv_n_1_0= ruleExp ) ) otherlv_2= ')' )
            {
            // InternalMath.g:571:2: (otherlv_0= 'sqrt(' ( (lv_n_1_0= ruleExp ) ) otherlv_2= ')' )
            // InternalMath.g:572:3: otherlv_0= 'sqrt(' ( (lv_n_1_0= ruleExp ) ) otherlv_2= ')'
            {
            otherlv_0=(Token)match(input,24,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getSquareRootAccess().getSqrtKeyword_0());
            		
            // InternalMath.g:576:3: ( (lv_n_1_0= ruleExp ) )
            // InternalMath.g:577:4: (lv_n_1_0= ruleExp )
            {
            // InternalMath.g:577:4: (lv_n_1_0= ruleExp )
            // InternalMath.g:578:5: lv_n_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getSquareRootAccess().getNExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
            lv_n_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getSquareRootRule());
            					}
            					set(
            						current,
            						"n",
            						lv_n_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_2, grammarAccess.getSquareRootAccess().getRightParenthesisKeyword_2());
            		

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
    // $ANTLR end "ruleSquareRoot"


    // $ANTLR start "entryRulePI"
    // InternalMath.g:603:1: entryRulePI returns [String current=null] : iv_rulePI= rulePI EOF ;
    public final String entryRulePI() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePI = null;


        try {
            // InternalMath.g:603:42: (iv_rulePI= rulePI EOF )
            // InternalMath.g:604:2: iv_rulePI= rulePI EOF
            {
             newCompositeNode(grammarAccess.getPIRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePI=rulePI();

            state._fsp--;

             current =iv_rulePI.getText(); 
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
    // $ANTLR end "entryRulePI"


    // $ANTLR start "rulePI"
    // InternalMath.g:610:1: rulePI returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= 'pi()' ;
    public final AntlrDatatypeRuleToken rulePI() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalMath.g:616:2: (kw= 'pi()' )
            // InternalMath.g:617:2: kw= 'pi()'
            {
            kw=(Token)match(input,14,FOLLOW_2); 

            		current.merge(kw);
            		newLeafNode(kw, grammarAccess.getPIAccess().getPiKeyword());
            	

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
    // $ANTLR end "rulePI"


    // $ANTLR start "entryRulePower"
    // InternalMath.g:625:1: entryRulePower returns [EObject current=null] : iv_rulePower= rulePower EOF ;
    public final EObject entryRulePower() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePower = null;


        try {
            // InternalMath.g:625:46: (iv_rulePower= rulePower EOF )
            // InternalMath.g:626:2: iv_rulePower= rulePower EOF
            {
             newCompositeNode(grammarAccess.getPowerRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePower=rulePower();

            state._fsp--;

             current =iv_rulePower; 
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
    // $ANTLR end "entryRulePower"


    // $ANTLR start "rulePower"
    // InternalMath.g:632:1: rulePower returns [EObject current=null] : (otherlv_0= 'pow(' ( (lv_n_1_0= ruleExp ) ) otherlv_2= ',' ( (lv_m_3_0= ruleExp ) ) otherlv_4= ')' ) ;
    public final EObject rulePower() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_n_1_0 = null;

        EObject lv_m_3_0 = null;



        	enterRule();

        try {
            // InternalMath.g:638:2: ( (otherlv_0= 'pow(' ( (lv_n_1_0= ruleExp ) ) otherlv_2= ',' ( (lv_m_3_0= ruleExp ) ) otherlv_4= ')' ) )
            // InternalMath.g:639:2: (otherlv_0= 'pow(' ( (lv_n_1_0= ruleExp ) ) otherlv_2= ',' ( (lv_m_3_0= ruleExp ) ) otherlv_4= ')' )
            {
            // InternalMath.g:639:2: (otherlv_0= 'pow(' ( (lv_n_1_0= ruleExp ) ) otherlv_2= ',' ( (lv_m_3_0= ruleExp ) ) otherlv_4= ')' )
            // InternalMath.g:640:3: otherlv_0= 'pow(' ( (lv_n_1_0= ruleExp ) ) otherlv_2= ',' ( (lv_m_3_0= ruleExp ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPowerAccess().getPowKeyword_0());
            		
            // InternalMath.g:644:3: ( (lv_n_1_0= ruleExp ) )
            // InternalMath.g:645:4: (lv_n_1_0= ruleExp )
            {
            // InternalMath.g:645:4: (lv_n_1_0= ruleExp )
            // InternalMath.g:646:5: lv_n_1_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getPowerAccess().getNExpParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_12);
            lv_n_1_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowerRule());
            					}
            					set(
            						current,
            						"n",
            						lv_n_1_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getPowerAccess().getCommaKeyword_2());
            		
            // InternalMath.g:667:3: ( (lv_m_3_0= ruleExp ) )
            // InternalMath.g:668:4: (lv_m_3_0= ruleExp )
            {
            // InternalMath.g:668:4: (lv_m_3_0= ruleExp )
            // InternalMath.g:669:5: lv_m_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getPowerAccess().getMExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_11);
            lv_m_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPowerRule());
            					}
            					set(
            						current,
            						"m",
            						lv_m_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,23,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getPowerAccess().getRightParenthesisKeyword_4());
            		

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
    // $ANTLR end "rulePower"


    // $ANTLR start "entryRuleLetBinding"
    // InternalMath.g:694:1: entryRuleLetBinding returns [EObject current=null] : iv_ruleLetBinding= ruleLetBinding EOF ;
    public final EObject entryRuleLetBinding() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLetBinding = null;


        try {
            // InternalMath.g:694:51: (iv_ruleLetBinding= ruleLetBinding EOF )
            // InternalMath.g:695:2: iv_ruleLetBinding= ruleLetBinding EOF
            {
             newCompositeNode(grammarAccess.getLetBindingRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleLetBinding=ruleLetBinding();

            state._fsp--;

             current =iv_ruleLetBinding; 
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
    // $ANTLR end "entryRuleLetBinding"


    // $ANTLR start "ruleLetBinding"
    // InternalMath.g:701:1: ruleLetBinding returns [EObject current=null] : (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) ;
    public final EObject ruleLetBinding() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_binding_3_0 = null;

        EObject lv_body_5_0 = null;



        	enterRule();

        try {
            // InternalMath.g:707:2: ( (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' ) )
            // InternalMath.g:708:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            {
            // InternalMath.g:708:2: (otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end' )
            // InternalMath.g:709:3: otherlv_0= 'let' ( (lv_name_1_0= RULE_ID ) ) otherlv_2= '=' ( (lv_binding_3_0= ruleExp ) ) otherlv_4= 'in' ( (lv_body_5_0= ruleExp ) ) otherlv_6= 'end'
            {
            otherlv_0=(Token)match(input,27,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getLetBindingAccess().getLetKeyword_0());
            		
            // InternalMath.g:713:3: ( (lv_name_1_0= RULE_ID ) )
            // InternalMath.g:714:4: (lv_name_1_0= RULE_ID )
            {
            // InternalMath.g:714:4: (lv_name_1_0= RULE_ID )
            // InternalMath.g:715:5: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_7); 

            					newLeafNode(lv_name_1_0, grammarAccess.getLetBindingAccess().getNameIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getLetBindingRule());
            					}
            					setWithLastConsumed(
            						current,
            						"name",
            						lv_name_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_2, grammarAccess.getLetBindingAccess().getEqualsSignKeyword_2());
            		
            // InternalMath.g:735:3: ( (lv_binding_3_0= ruleExp ) )
            // InternalMath.g:736:4: (lv_binding_3_0= ruleExp )
            {
            // InternalMath.g:736:4: (lv_binding_3_0= ruleExp )
            // InternalMath.g:737:5: lv_binding_3_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBindingExpParserRuleCall_3_0());
            				
            pushFollow(FOLLOW_13);
            lv_binding_3_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"binding",
            						lv_binding_3_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,28,FOLLOW_8); 

            			newLeafNode(otherlv_4, grammarAccess.getLetBindingAccess().getInKeyword_4());
            		
            // InternalMath.g:758:3: ( (lv_body_5_0= ruleExp ) )
            // InternalMath.g:759:4: (lv_body_5_0= ruleExp )
            {
            // InternalMath.g:759:4: (lv_body_5_0= ruleExp )
            // InternalMath.g:760:5: lv_body_5_0= ruleExp
            {

            					newCompositeNode(grammarAccess.getLetBindingAccess().getBodyExpParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_14);
            lv_body_5_0=ruleExp();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getLetBindingRule());
            					}
            					set(
            						current,
            						"body",
            						lv_body_5_0,
            						"dk.sdu.mmmi.mdsd.Math.Exp");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_6=(Token)match(input,29,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getLetBindingAccess().getEndKeyword_6());
            		

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
    // $ANTLR end "ruleLetBinding"


    // $ANTLR start "entryRuleVariableUse"
    // InternalMath.g:785:1: entryRuleVariableUse returns [EObject current=null] : iv_ruleVariableUse= ruleVariableUse EOF ;
    public final EObject entryRuleVariableUse() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVariableUse = null;


        try {
            // InternalMath.g:785:52: (iv_ruleVariableUse= ruleVariableUse EOF )
            // InternalMath.g:786:2: iv_ruleVariableUse= ruleVariableUse EOF
            {
             newCompositeNode(grammarAccess.getVariableUseRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleVariableUse=ruleVariableUse();

            state._fsp--;

             current =iv_ruleVariableUse; 
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
    // $ANTLR end "entryRuleVariableUse"


    // $ANTLR start "ruleVariableUse"
    // InternalMath.g:792:1: ruleVariableUse returns [EObject current=null] : ( (otherlv_0= RULE_ID ) ) ;
    public final EObject ruleVariableUse() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;


        	enterRule();

        try {
            // InternalMath.g:798:2: ( ( (otherlv_0= RULE_ID ) ) )
            // InternalMath.g:799:2: ( (otherlv_0= RULE_ID ) )
            {
            // InternalMath.g:799:2: ( (otherlv_0= RULE_ID ) )
            // InternalMath.g:800:3: (otherlv_0= RULE_ID )
            {
            // InternalMath.g:800:3: (otherlv_0= RULE_ID )
            // InternalMath.g:801:4: otherlv_0= RULE_ID
            {

            				if (current==null) {
            					current = createModelElement(grammarAccess.getVariableUseRule());
            				}
            			
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_2); 

            				newLeafNode(otherlv_0, grammarAccess.getVariableUseAccess().getRefBindingCrossReference_0());
            			

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
    // $ANTLR end "ruleVariableUse"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000011000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x000000000000E000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x000000000B404030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000300002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000020000000L});

}