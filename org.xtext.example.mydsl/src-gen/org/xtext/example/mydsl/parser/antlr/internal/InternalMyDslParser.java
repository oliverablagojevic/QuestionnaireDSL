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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PollSystem'", "'{'", "'polls'", "'}'", "'Poll'", "'questions'", "'Question'", "'text'", "'options'", "'Option'", "'id'"
    };
    public static final int RULE_STRING=4;
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
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=6;
    public static final int RULE_ML_COMMENT=7;
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
        	return "PollSystem";
       	}

       	@Override
       	protected MyDslGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRulePollSystem"
    // InternalMyDsl.g:64:1: entryRulePollSystem returns [EObject current=null] : iv_rulePollSystem= rulePollSystem EOF ;
    public final EObject entryRulePollSystem() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePollSystem = null;


        try {
            // InternalMyDsl.g:64:51: (iv_rulePollSystem= rulePollSystem EOF )
            // InternalMyDsl.g:65:2: iv_rulePollSystem= rulePollSystem EOF
            {
             newCompositeNode(grammarAccess.getPollSystemRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePollSystem=rulePollSystem();

            state._fsp--;

             current =iv_rulePollSystem; 
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
    // $ANTLR end "entryRulePollSystem"


    // $ANTLR start "rulePollSystem"
    // InternalMyDsl.g:71:1: rulePollSystem returns [EObject current=null] : ( () otherlv_1= 'PollSystem' otherlv_2= '{' (otherlv_3= 'polls' ( (lv_polls_4_0= rulePoll ) ) )? otherlv_5= '}' ) ;
    public final EObject rulePollSystem() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_polls_4_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:77:2: ( ( () otherlv_1= 'PollSystem' otherlv_2= '{' (otherlv_3= 'polls' ( (lv_polls_4_0= rulePoll ) ) )? otherlv_5= '}' ) )
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'PollSystem' otherlv_2= '{' (otherlv_3= 'polls' ( (lv_polls_4_0= rulePoll ) ) )? otherlv_5= '}' )
            {
            // InternalMyDsl.g:78:2: ( () otherlv_1= 'PollSystem' otherlv_2= '{' (otherlv_3= 'polls' ( (lv_polls_4_0= rulePoll ) ) )? otherlv_5= '}' )
            // InternalMyDsl.g:79:3: () otherlv_1= 'PollSystem' otherlv_2= '{' (otherlv_3= 'polls' ( (lv_polls_4_0= rulePoll ) ) )? otherlv_5= '}'
            {
            // InternalMyDsl.g:79:3: ()
            // InternalMyDsl.g:80:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPollSystemAccess().getPollSystemAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getPollSystemAccess().getPollSystemKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_2, grammarAccess.getPollSystemAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:94:3: (otherlv_3= 'polls' ( (lv_polls_4_0= rulePoll ) ) )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalMyDsl.g:95:4: otherlv_3= 'polls' ( (lv_polls_4_0= rulePoll ) )
                    {
                    otherlv_3=(Token)match(input,13,FOLLOW_5); 

                    				newLeafNode(otherlv_3, grammarAccess.getPollSystemAccess().getPollsKeyword_3_0());
                    			
                    // InternalMyDsl.g:99:4: ( (lv_polls_4_0= rulePoll ) )
                    // InternalMyDsl.g:100:5: (lv_polls_4_0= rulePoll )
                    {
                    // InternalMyDsl.g:100:5: (lv_polls_4_0= rulePoll )
                    // InternalMyDsl.g:101:6: lv_polls_4_0= rulePoll
                    {

                    						newCompositeNode(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_polls_4_0=rulePoll();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPollSystemRule());
                    						}
                    						set(
                    							current,
                    							"polls",
                    							lv_polls_4_0,
                    							"org.xtext.example.mydsl.MyDsl.Poll");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getPollSystemAccess().getRightCurlyBracketKeyword_4());
            		

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
    // $ANTLR end "rulePollSystem"


    // $ANTLR start "entryRulePoll"
    // InternalMyDsl.g:127:1: entryRulePoll returns [EObject current=null] : iv_rulePoll= rulePoll EOF ;
    public final EObject entryRulePoll() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePoll = null;


        try {
            // InternalMyDsl.g:127:45: (iv_rulePoll= rulePoll EOF )
            // InternalMyDsl.g:128:2: iv_rulePoll= rulePoll EOF
            {
             newCompositeNode(grammarAccess.getPollRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePoll=rulePoll();

            state._fsp--;

             current =iv_rulePoll; 
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
    // $ANTLR end "entryRulePoll"


    // $ANTLR start "rulePoll"
    // InternalMyDsl.g:134:1: rulePoll returns [EObject current=null] : ( () otherlv_1= 'Poll' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'questions' ( (lv_questions_5_0= ruleQuestion ) ) )? otherlv_6= '}' ) ;
    public final EObject rulePoll() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_questions_5_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:140:2: ( ( () otherlv_1= 'Poll' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'questions' ( (lv_questions_5_0= ruleQuestion ) ) )? otherlv_6= '}' ) )
            // InternalMyDsl.g:141:2: ( () otherlv_1= 'Poll' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'questions' ( (lv_questions_5_0= ruleQuestion ) ) )? otherlv_6= '}' )
            {
            // InternalMyDsl.g:141:2: ( () otherlv_1= 'Poll' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'questions' ( (lv_questions_5_0= ruleQuestion ) ) )? otherlv_6= '}' )
            // InternalMyDsl.g:142:3: () otherlv_1= 'Poll' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'questions' ( (lv_questions_5_0= ruleQuestion ) ) )? otherlv_6= '}'
            {
            // InternalMyDsl.g:142:3: ()
            // InternalMyDsl.g:143:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getPollAccess().getPollAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getPollAccess().getPollKeyword_1());
            		
            // InternalMyDsl.g:153:3: ( (lv_name_2_0= ruleEString ) )
            // InternalMyDsl.g:154:4: (lv_name_2_0= ruleEString )
            {
            // InternalMyDsl.g:154:4: (lv_name_2_0= ruleEString )
            // InternalMyDsl.g:155:5: lv_name_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPollAccess().getNameEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPollRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_2_0,
            						"org.xtext.example.mydsl.MyDsl.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalMyDsl.g:176:3: (otherlv_4= 'questions' ( (lv_questions_5_0= ruleQuestion ) ) )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==16) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:177:4: otherlv_4= 'questions' ( (lv_questions_5_0= ruleQuestion ) )
                    {
                    otherlv_4=(Token)match(input,16,FOLLOW_9); 

                    				newLeafNode(otherlv_4, grammarAccess.getPollAccess().getQuestionsKeyword_4_0());
                    			
                    // InternalMyDsl.g:181:4: ( (lv_questions_5_0= ruleQuestion ) )
                    // InternalMyDsl.g:182:5: (lv_questions_5_0= ruleQuestion )
                    {
                    // InternalMyDsl.g:182:5: (lv_questions_5_0= ruleQuestion )
                    // InternalMyDsl.g:183:6: lv_questions_5_0= ruleQuestion
                    {

                    						newCompositeNode(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_questions_5_0=ruleQuestion();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getPollRule());
                    						}
                    						set(
                    							current,
                    							"questions",
                    							lv_questions_5_0,
                    							"org.xtext.example.mydsl.MyDsl.Question");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_6, grammarAccess.getPollAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "rulePoll"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:209:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalMyDsl.g:209:47: (iv_ruleEString= ruleEString EOF )
            // InternalMyDsl.g:210:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:216:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalMyDsl.g:222:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalMyDsl.g:223:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalMyDsl.g:223:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==RULE_STRING) ) {
                alt3=1;
            }
            else if ( (LA3_0==RULE_ID) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:224:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:232:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQuestion"
    // InternalMyDsl.g:243:1: entryRuleQuestion returns [EObject current=null] : iv_ruleQuestion= ruleQuestion EOF ;
    public final EObject entryRuleQuestion() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleQuestion = null;


        try {
            // InternalMyDsl.g:243:49: (iv_ruleQuestion= ruleQuestion EOF )
            // InternalMyDsl.g:244:2: iv_ruleQuestion= ruleQuestion EOF
            {
             newCompositeNode(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleQuestion=ruleQuestion();

            state._fsp--;

             current =iv_ruleQuestion; 
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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalMyDsl.g:250:1: ruleQuestion returns [EObject current=null] : ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'options' ( (lv_options_6_0= ruleOption ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleQuestion() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_text_4_0 = null;

        EObject lv_options_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:256:2: ( ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'options' ( (lv_options_6_0= ruleOption ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:257:2: ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'options' ( (lv_options_6_0= ruleOption ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:257:2: ( () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'options' ( (lv_options_6_0= ruleOption ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:258:3: () otherlv_1= 'Question' otherlv_2= '{' (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )? (otherlv_5= 'options' ( (lv_options_6_0= ruleOption ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:258:3: ()
            // InternalMyDsl.g:259:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getQuestionAccess().getQuestionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,17,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getQuestionAccess().getQuestionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_2, grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:273:3: (otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:274:4: otherlv_3= 'text' ( (lv_text_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getQuestionAccess().getTextKeyword_3_0());
                    			
                    // InternalMyDsl.g:278:4: ( (lv_text_4_0= ruleEString ) )
                    // InternalMyDsl.g:279:5: (lv_text_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:279:5: (lv_text_4_0= ruleEString )
                    // InternalMyDsl.g:280:6: lv_text_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getTextEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_11);
                    lv_text_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:298:3: (otherlv_5= 'options' ( (lv_options_6_0= ruleOption ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:299:4: otherlv_5= 'options' ( (lv_options_6_0= ruleOption ) )
                    {
                    otherlv_5=(Token)match(input,19,FOLLOW_12); 

                    				newLeafNode(otherlv_5, grammarAccess.getQuestionAccess().getOptionsKeyword_4_0());
                    			
                    // InternalMyDsl.g:303:4: ( (lv_options_6_0= ruleOption ) )
                    // InternalMyDsl.g:304:5: (lv_options_6_0= ruleOption )
                    {
                    // InternalMyDsl.g:304:5: (lv_options_6_0= ruleOption )
                    // InternalMyDsl.g:305:6: lv_options_6_0= ruleOption
                    {

                    						newCompositeNode(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_options_6_0=ruleOption();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getQuestionRule());
                    						}
                    						set(
                    							current,
                    							"options",
                    							lv_options_6_0,
                    							"org.xtext.example.mydsl.MyDsl.Option");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleOption"
    // InternalMyDsl.g:331:1: entryRuleOption returns [EObject current=null] : iv_ruleOption= ruleOption EOF ;
    public final EObject entryRuleOption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOption = null;


        try {
            // InternalMyDsl.g:331:47: (iv_ruleOption= ruleOption EOF )
            // InternalMyDsl.g:332:2: iv_ruleOption= ruleOption EOF
            {
             newCompositeNode(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleOption=ruleOption();

            state._fsp--;

             current =iv_ruleOption; 
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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalMyDsl.g:338:1: ruleOption returns [EObject current=null] : ( () otherlv_1= 'Option' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'text' ( (lv_text_6_0= ruleEString ) ) )? otherlv_7= '}' ) ;
    public final EObject ruleOption() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        AntlrDatatypeRuleToken lv_id_4_0 = null;

        AntlrDatatypeRuleToken lv_text_6_0 = null;



        	enterRule();

        try {
            // InternalMyDsl.g:344:2: ( ( () otherlv_1= 'Option' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'text' ( (lv_text_6_0= ruleEString ) ) )? otherlv_7= '}' ) )
            // InternalMyDsl.g:345:2: ( () otherlv_1= 'Option' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'text' ( (lv_text_6_0= ruleEString ) ) )? otherlv_7= '}' )
            {
            // InternalMyDsl.g:345:2: ( () otherlv_1= 'Option' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'text' ( (lv_text_6_0= ruleEString ) ) )? otherlv_7= '}' )
            // InternalMyDsl.g:346:3: () otherlv_1= 'Option' otherlv_2= '{' (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )? (otherlv_5= 'text' ( (lv_text_6_0= ruleEString ) ) )? otherlv_7= '}'
            {
            // InternalMyDsl.g:346:3: ()
            // InternalMyDsl.g:347:4: 
            {

            				current = forceCreateModelElement(
            					grammarAccess.getOptionAccess().getOptionAction_0(),
            					current);
            			

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_1, grammarAccess.getOptionAccess().getOptionKeyword_1());
            		
            otherlv_2=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_2, grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalMyDsl.g:361:3: (otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:362:4: otherlv_3= 'id' ( (lv_id_4_0= ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,21,FOLLOW_7); 

                    				newLeafNode(otherlv_3, grammarAccess.getOptionAccess().getIdKeyword_3_0());
                    			
                    // InternalMyDsl.g:366:4: ( (lv_id_4_0= ruleEString ) )
                    // InternalMyDsl.g:367:5: (lv_id_4_0= ruleEString )
                    {
                    // InternalMyDsl.g:367:5: (lv_id_4_0= ruleEString )
                    // InternalMyDsl.g:368:6: lv_id_4_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getIdEStringParserRuleCall_3_1_0());
                    					
                    pushFollow(FOLLOW_14);
                    lv_id_4_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"id",
                    							lv_id_4_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            // InternalMyDsl.g:386:3: (otherlv_5= 'text' ( (lv_text_6_0= ruleEString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:387:4: otherlv_5= 'text' ( (lv_text_6_0= ruleEString ) )
                    {
                    otherlv_5=(Token)match(input,18,FOLLOW_7); 

                    				newLeafNode(otherlv_5, grammarAccess.getOptionAccess().getTextKeyword_4_0());
                    			
                    // InternalMyDsl.g:391:4: ( (lv_text_6_0= ruleEString ) )
                    // InternalMyDsl.g:392:5: (lv_text_6_0= ruleEString )
                    {
                    // InternalMyDsl.g:392:5: (lv_text_6_0= ruleEString )
                    // InternalMyDsl.g:393:6: lv_text_6_0= ruleEString
                    {

                    						newCompositeNode(grammarAccess.getOptionAccess().getTextEStringParserRuleCall_4_1_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_text_6_0=ruleEString();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getOptionRule());
                    						}
                    						set(
                    							current,
                    							"text",
                    							lv_text_6_0,
                    							"org.xtext.example.mydsl.MyDsl.EString");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_7=(Token)match(input,14,FOLLOW_2); 

            			newLeafNode(otherlv_7, grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_5());
            		

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
    // $ANTLR end "ruleOption"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000014000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C4000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000084000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000244000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000044000L});

}