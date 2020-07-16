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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PollSystem'", "'{'", "'}'", "'polls'", "'Poll'", "'questions'", "'Question'", "'text'", "'options'", "'Option'", "'id'"
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



    // $ANTLR start "entryRulePollSystem"
    // InternalMyDsl.g:53:1: entryRulePollSystem : rulePollSystem EOF ;
    public final void entryRulePollSystem() throws RecognitionException {
        try {
            // InternalMyDsl.g:54:1: ( rulePollSystem EOF )
            // InternalMyDsl.g:55:1: rulePollSystem EOF
            {
             before(grammarAccess.getPollSystemRule()); 
            pushFollow(FOLLOW_1);
            rulePollSystem();

            state._fsp--;

             after(grammarAccess.getPollSystemRule()); 
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
    // $ANTLR end "entryRulePollSystem"


    // $ANTLR start "rulePollSystem"
    // InternalMyDsl.g:62:1: rulePollSystem : ( ( rule__PollSystem__Group__0 ) ) ;
    public final void rulePollSystem() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:66:2: ( ( ( rule__PollSystem__Group__0 ) ) )
            // InternalMyDsl.g:67:2: ( ( rule__PollSystem__Group__0 ) )
            {
            // InternalMyDsl.g:67:2: ( ( rule__PollSystem__Group__0 ) )
            // InternalMyDsl.g:68:3: ( rule__PollSystem__Group__0 )
            {
             before(grammarAccess.getPollSystemAccess().getGroup()); 
            // InternalMyDsl.g:69:3: ( rule__PollSystem__Group__0 )
            // InternalMyDsl.g:69:4: rule__PollSystem__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PollSystem__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPollSystemAccess().getGroup()); 

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
    // $ANTLR end "rulePollSystem"


    // $ANTLR start "entryRulePoll"
    // InternalMyDsl.g:78:1: entryRulePoll : rulePoll EOF ;
    public final void entryRulePoll() throws RecognitionException {
        try {
            // InternalMyDsl.g:79:1: ( rulePoll EOF )
            // InternalMyDsl.g:80:1: rulePoll EOF
            {
             before(grammarAccess.getPollRule()); 
            pushFollow(FOLLOW_1);
            rulePoll();

            state._fsp--;

             after(grammarAccess.getPollRule()); 
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
    // $ANTLR end "entryRulePoll"


    // $ANTLR start "rulePoll"
    // InternalMyDsl.g:87:1: rulePoll : ( ( rule__Poll__Group__0 ) ) ;
    public final void rulePoll() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:91:2: ( ( ( rule__Poll__Group__0 ) ) )
            // InternalMyDsl.g:92:2: ( ( rule__Poll__Group__0 ) )
            {
            // InternalMyDsl.g:92:2: ( ( rule__Poll__Group__0 ) )
            // InternalMyDsl.g:93:3: ( rule__Poll__Group__0 )
            {
             before(grammarAccess.getPollAccess().getGroup()); 
            // InternalMyDsl.g:94:3: ( rule__Poll__Group__0 )
            // InternalMyDsl.g:94:4: rule__Poll__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Poll__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPollAccess().getGroup()); 

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
    // $ANTLR end "rulePoll"


    // $ANTLR start "entryRuleEString"
    // InternalMyDsl.g:103:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalMyDsl.g:104:1: ( ruleEString EOF )
            // InternalMyDsl.g:105:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
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
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalMyDsl.g:112:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:116:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalMyDsl.g:117:2: ( ( rule__EString__Alternatives ) )
            // InternalMyDsl.g:118:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalMyDsl.g:119:3: ( rule__EString__Alternatives )
            // InternalMyDsl.g:119:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

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
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleQuestion"
    // InternalMyDsl.g:128:1: entryRuleQuestion : ruleQuestion EOF ;
    public final void entryRuleQuestion() throws RecognitionException {
        try {
            // InternalMyDsl.g:129:1: ( ruleQuestion EOF )
            // InternalMyDsl.g:130:1: ruleQuestion EOF
            {
             before(grammarAccess.getQuestionRule()); 
            pushFollow(FOLLOW_1);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getQuestionRule()); 
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
    // $ANTLR end "entryRuleQuestion"


    // $ANTLR start "ruleQuestion"
    // InternalMyDsl.g:137:1: ruleQuestion : ( ( rule__Question__Group__0 ) ) ;
    public final void ruleQuestion() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:141:2: ( ( ( rule__Question__Group__0 ) ) )
            // InternalMyDsl.g:142:2: ( ( rule__Question__Group__0 ) )
            {
            // InternalMyDsl.g:142:2: ( ( rule__Question__Group__0 ) )
            // InternalMyDsl.g:143:3: ( rule__Question__Group__0 )
            {
             before(grammarAccess.getQuestionAccess().getGroup()); 
            // InternalMyDsl.g:144:3: ( rule__Question__Group__0 )
            // InternalMyDsl.g:144:4: rule__Question__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getGroup()); 

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
    // $ANTLR end "ruleQuestion"


    // $ANTLR start "entryRuleOption"
    // InternalMyDsl.g:153:1: entryRuleOption : ruleOption EOF ;
    public final void entryRuleOption() throws RecognitionException {
        try {
            // InternalMyDsl.g:154:1: ( ruleOption EOF )
            // InternalMyDsl.g:155:1: ruleOption EOF
            {
             before(grammarAccess.getOptionRule()); 
            pushFollow(FOLLOW_1);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getOptionRule()); 
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
    // $ANTLR end "entryRuleOption"


    // $ANTLR start "ruleOption"
    // InternalMyDsl.g:162:1: ruleOption : ( ( rule__Option__Group__0 ) ) ;
    public final void ruleOption() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:166:2: ( ( ( rule__Option__Group__0 ) ) )
            // InternalMyDsl.g:167:2: ( ( rule__Option__Group__0 ) )
            {
            // InternalMyDsl.g:167:2: ( ( rule__Option__Group__0 ) )
            // InternalMyDsl.g:168:3: ( rule__Option__Group__0 )
            {
             before(grammarAccess.getOptionAccess().getGroup()); 
            // InternalMyDsl.g:169:3: ( rule__Option__Group__0 )
            // InternalMyDsl.g:169:4: rule__Option__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getGroup()); 

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
    // $ANTLR end "ruleOption"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalMyDsl.g:177:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:181:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==RULE_STRING) ) {
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
                    // InternalMyDsl.g:182:2: ( RULE_STRING )
                    {
                    // InternalMyDsl.g:182:2: ( RULE_STRING )
                    // InternalMyDsl.g:183:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMyDsl.g:188:2: ( RULE_ID )
                    {
                    // InternalMyDsl.g:188:2: ( RULE_ID )
                    // InternalMyDsl.g:189:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

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
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__PollSystem__Group__0"
    // InternalMyDsl.g:198:1: rule__PollSystem__Group__0 : rule__PollSystem__Group__0__Impl rule__PollSystem__Group__1 ;
    public final void rule__PollSystem__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:202:1: ( rule__PollSystem__Group__0__Impl rule__PollSystem__Group__1 )
            // InternalMyDsl.g:203:2: rule__PollSystem__Group__0__Impl rule__PollSystem__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__PollSystem__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PollSystem__Group__1();

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
    // $ANTLR end "rule__PollSystem__Group__0"


    // $ANTLR start "rule__PollSystem__Group__0__Impl"
    // InternalMyDsl.g:210:1: rule__PollSystem__Group__0__Impl : ( () ) ;
    public final void rule__PollSystem__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:214:1: ( ( () ) )
            // InternalMyDsl.g:215:1: ( () )
            {
            // InternalMyDsl.g:215:1: ( () )
            // InternalMyDsl.g:216:2: ()
            {
             before(grammarAccess.getPollSystemAccess().getPollSystemAction_0()); 
            // InternalMyDsl.g:217:2: ()
            // InternalMyDsl.g:217:3: 
            {
            }

             after(grammarAccess.getPollSystemAccess().getPollSystemAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PollSystem__Group__0__Impl"


    // $ANTLR start "rule__PollSystem__Group__1"
    // InternalMyDsl.g:225:1: rule__PollSystem__Group__1 : rule__PollSystem__Group__1__Impl rule__PollSystem__Group__2 ;
    public final void rule__PollSystem__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:229:1: ( rule__PollSystem__Group__1__Impl rule__PollSystem__Group__2 )
            // InternalMyDsl.g:230:2: rule__PollSystem__Group__1__Impl rule__PollSystem__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__PollSystem__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PollSystem__Group__2();

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
    // $ANTLR end "rule__PollSystem__Group__1"


    // $ANTLR start "rule__PollSystem__Group__1__Impl"
    // InternalMyDsl.g:237:1: rule__PollSystem__Group__1__Impl : ( 'PollSystem' ) ;
    public final void rule__PollSystem__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:241:1: ( ( 'PollSystem' ) )
            // InternalMyDsl.g:242:1: ( 'PollSystem' )
            {
            // InternalMyDsl.g:242:1: ( 'PollSystem' )
            // InternalMyDsl.g:243:2: 'PollSystem'
            {
             before(grammarAccess.getPollSystemAccess().getPollSystemKeyword_1()); 
            match(input,11,FOLLOW_2); 
             after(grammarAccess.getPollSystemAccess().getPollSystemKeyword_1()); 

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
    // $ANTLR end "rule__PollSystem__Group__1__Impl"


    // $ANTLR start "rule__PollSystem__Group__2"
    // InternalMyDsl.g:252:1: rule__PollSystem__Group__2 : rule__PollSystem__Group__2__Impl rule__PollSystem__Group__3 ;
    public final void rule__PollSystem__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:256:1: ( rule__PollSystem__Group__2__Impl rule__PollSystem__Group__3 )
            // InternalMyDsl.g:257:2: rule__PollSystem__Group__2__Impl rule__PollSystem__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__PollSystem__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PollSystem__Group__3();

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
    // $ANTLR end "rule__PollSystem__Group__2"


    // $ANTLR start "rule__PollSystem__Group__2__Impl"
    // InternalMyDsl.g:264:1: rule__PollSystem__Group__2__Impl : ( '{' ) ;
    public final void rule__PollSystem__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:268:1: ( ( '{' ) )
            // InternalMyDsl.g:269:1: ( '{' )
            {
            // InternalMyDsl.g:269:1: ( '{' )
            // InternalMyDsl.g:270:2: '{'
            {
             before(grammarAccess.getPollSystemAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPollSystemAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__PollSystem__Group__2__Impl"


    // $ANTLR start "rule__PollSystem__Group__3"
    // InternalMyDsl.g:279:1: rule__PollSystem__Group__3 : rule__PollSystem__Group__3__Impl rule__PollSystem__Group__4 ;
    public final void rule__PollSystem__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:283:1: ( rule__PollSystem__Group__3__Impl rule__PollSystem__Group__4 )
            // InternalMyDsl.g:284:2: rule__PollSystem__Group__3__Impl rule__PollSystem__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PollSystem__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PollSystem__Group__4();

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
    // $ANTLR end "rule__PollSystem__Group__3"


    // $ANTLR start "rule__PollSystem__Group__3__Impl"
    // InternalMyDsl.g:291:1: rule__PollSystem__Group__3__Impl : ( ( rule__PollSystem__Group_3__0 )? ) ;
    public final void rule__PollSystem__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:295:1: ( ( ( rule__PollSystem__Group_3__0 )? ) )
            // InternalMyDsl.g:296:1: ( ( rule__PollSystem__Group_3__0 )? )
            {
            // InternalMyDsl.g:296:1: ( ( rule__PollSystem__Group_3__0 )? )
            // InternalMyDsl.g:297:2: ( rule__PollSystem__Group_3__0 )?
            {
             before(grammarAccess.getPollSystemAccess().getGroup_3()); 
            // InternalMyDsl.g:298:2: ( rule__PollSystem__Group_3__0 )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==14) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalMyDsl.g:298:3: rule__PollSystem__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PollSystem__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPollSystemAccess().getGroup_3()); 

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
    // $ANTLR end "rule__PollSystem__Group__3__Impl"


    // $ANTLR start "rule__PollSystem__Group__4"
    // InternalMyDsl.g:306:1: rule__PollSystem__Group__4 : rule__PollSystem__Group__4__Impl ;
    public final void rule__PollSystem__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:310:1: ( rule__PollSystem__Group__4__Impl )
            // InternalMyDsl.g:311:2: rule__PollSystem__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PollSystem__Group__4__Impl();

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
    // $ANTLR end "rule__PollSystem__Group__4"


    // $ANTLR start "rule__PollSystem__Group__4__Impl"
    // InternalMyDsl.g:317:1: rule__PollSystem__Group__4__Impl : ( '}' ) ;
    public final void rule__PollSystem__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:321:1: ( ( '}' ) )
            // InternalMyDsl.g:322:1: ( '}' )
            {
            // InternalMyDsl.g:322:1: ( '}' )
            // InternalMyDsl.g:323:2: '}'
            {
             before(grammarAccess.getPollSystemAccess().getRightCurlyBracketKeyword_4()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPollSystemAccess().getRightCurlyBracketKeyword_4()); 

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
    // $ANTLR end "rule__PollSystem__Group__4__Impl"


    // $ANTLR start "rule__PollSystem__Group_3__0"
    // InternalMyDsl.g:333:1: rule__PollSystem__Group_3__0 : rule__PollSystem__Group_3__0__Impl rule__PollSystem__Group_3__1 ;
    public final void rule__PollSystem__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:337:1: ( rule__PollSystem__Group_3__0__Impl rule__PollSystem__Group_3__1 )
            // InternalMyDsl.g:338:2: rule__PollSystem__Group_3__0__Impl rule__PollSystem__Group_3__1
            {
            pushFollow(FOLLOW_6);
            rule__PollSystem__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PollSystem__Group_3__1();

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
    // $ANTLR end "rule__PollSystem__Group_3__0"


    // $ANTLR start "rule__PollSystem__Group_3__0__Impl"
    // InternalMyDsl.g:345:1: rule__PollSystem__Group_3__0__Impl : ( 'polls' ) ;
    public final void rule__PollSystem__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:349:1: ( ( 'polls' ) )
            // InternalMyDsl.g:350:1: ( 'polls' )
            {
            // InternalMyDsl.g:350:1: ( 'polls' )
            // InternalMyDsl.g:351:2: 'polls'
            {
             before(grammarAccess.getPollSystemAccess().getPollsKeyword_3_0()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPollSystemAccess().getPollsKeyword_3_0()); 

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
    // $ANTLR end "rule__PollSystem__Group_3__0__Impl"


    // $ANTLR start "rule__PollSystem__Group_3__1"
    // InternalMyDsl.g:360:1: rule__PollSystem__Group_3__1 : rule__PollSystem__Group_3__1__Impl ;
    public final void rule__PollSystem__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:364:1: ( rule__PollSystem__Group_3__1__Impl )
            // InternalMyDsl.g:365:2: rule__PollSystem__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PollSystem__Group_3__1__Impl();

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
    // $ANTLR end "rule__PollSystem__Group_3__1"


    // $ANTLR start "rule__PollSystem__Group_3__1__Impl"
    // InternalMyDsl.g:371:1: rule__PollSystem__Group_3__1__Impl : ( ( rule__PollSystem__PollsAssignment_3_1 ) ) ;
    public final void rule__PollSystem__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:375:1: ( ( ( rule__PollSystem__PollsAssignment_3_1 ) ) )
            // InternalMyDsl.g:376:1: ( ( rule__PollSystem__PollsAssignment_3_1 ) )
            {
            // InternalMyDsl.g:376:1: ( ( rule__PollSystem__PollsAssignment_3_1 ) )
            // InternalMyDsl.g:377:2: ( rule__PollSystem__PollsAssignment_3_1 )
            {
             before(grammarAccess.getPollSystemAccess().getPollsAssignment_3_1()); 
            // InternalMyDsl.g:378:2: ( rule__PollSystem__PollsAssignment_3_1 )
            // InternalMyDsl.g:378:3: rule__PollSystem__PollsAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__PollSystem__PollsAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getPollSystemAccess().getPollsAssignment_3_1()); 

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
    // $ANTLR end "rule__PollSystem__Group_3__1__Impl"


    // $ANTLR start "rule__Poll__Group__0"
    // InternalMyDsl.g:387:1: rule__Poll__Group__0 : rule__Poll__Group__0__Impl rule__Poll__Group__1 ;
    public final void rule__Poll__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:391:1: ( rule__Poll__Group__0__Impl rule__Poll__Group__1 )
            // InternalMyDsl.g:392:2: rule__Poll__Group__0__Impl rule__Poll__Group__1
            {
            pushFollow(FOLLOW_6);
            rule__Poll__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poll__Group__1();

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
    // $ANTLR end "rule__Poll__Group__0"


    // $ANTLR start "rule__Poll__Group__0__Impl"
    // InternalMyDsl.g:399:1: rule__Poll__Group__0__Impl : ( () ) ;
    public final void rule__Poll__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:403:1: ( ( () ) )
            // InternalMyDsl.g:404:1: ( () )
            {
            // InternalMyDsl.g:404:1: ( () )
            // InternalMyDsl.g:405:2: ()
            {
             before(grammarAccess.getPollAccess().getPollAction_0()); 
            // InternalMyDsl.g:406:2: ()
            // InternalMyDsl.g:406:3: 
            {
            }

             after(grammarAccess.getPollAccess().getPollAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Poll__Group__0__Impl"


    // $ANTLR start "rule__Poll__Group__1"
    // InternalMyDsl.g:414:1: rule__Poll__Group__1 : rule__Poll__Group__1__Impl rule__Poll__Group__2 ;
    public final void rule__Poll__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:418:1: ( rule__Poll__Group__1__Impl rule__Poll__Group__2 )
            // InternalMyDsl.g:419:2: rule__Poll__Group__1__Impl rule__Poll__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__Poll__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poll__Group__2();

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
    // $ANTLR end "rule__Poll__Group__1"


    // $ANTLR start "rule__Poll__Group__1__Impl"
    // InternalMyDsl.g:426:1: rule__Poll__Group__1__Impl : ( 'Poll' ) ;
    public final void rule__Poll__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:430:1: ( ( 'Poll' ) )
            // InternalMyDsl.g:431:1: ( 'Poll' )
            {
            // InternalMyDsl.g:431:1: ( 'Poll' )
            // InternalMyDsl.g:432:2: 'Poll'
            {
             before(grammarAccess.getPollAccess().getPollKeyword_1()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getPollAccess().getPollKeyword_1()); 

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
    // $ANTLR end "rule__Poll__Group__1__Impl"


    // $ANTLR start "rule__Poll__Group__2"
    // InternalMyDsl.g:441:1: rule__Poll__Group__2 : rule__Poll__Group__2__Impl rule__Poll__Group__3 ;
    public final void rule__Poll__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:445:1: ( rule__Poll__Group__2__Impl rule__Poll__Group__3 )
            // InternalMyDsl.g:446:2: rule__Poll__Group__2__Impl rule__Poll__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__Poll__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poll__Group__3();

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
    // $ANTLR end "rule__Poll__Group__2"


    // $ANTLR start "rule__Poll__Group__2__Impl"
    // InternalMyDsl.g:453:1: rule__Poll__Group__2__Impl : ( ( rule__Poll__NameAssignment_2 ) ) ;
    public final void rule__Poll__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:457:1: ( ( ( rule__Poll__NameAssignment_2 ) ) )
            // InternalMyDsl.g:458:1: ( ( rule__Poll__NameAssignment_2 ) )
            {
            // InternalMyDsl.g:458:1: ( ( rule__Poll__NameAssignment_2 ) )
            // InternalMyDsl.g:459:2: ( rule__Poll__NameAssignment_2 )
            {
             before(grammarAccess.getPollAccess().getNameAssignment_2()); 
            // InternalMyDsl.g:460:2: ( rule__Poll__NameAssignment_2 )
            // InternalMyDsl.g:460:3: rule__Poll__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Poll__NameAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPollAccess().getNameAssignment_2()); 

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
    // $ANTLR end "rule__Poll__Group__2__Impl"


    // $ANTLR start "rule__Poll__Group__3"
    // InternalMyDsl.g:468:1: rule__Poll__Group__3 : rule__Poll__Group__3__Impl rule__Poll__Group__4 ;
    public final void rule__Poll__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:472:1: ( rule__Poll__Group__3__Impl rule__Poll__Group__4 )
            // InternalMyDsl.g:473:2: rule__Poll__Group__3__Impl rule__Poll__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Poll__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poll__Group__4();

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
    // $ANTLR end "rule__Poll__Group__3"


    // $ANTLR start "rule__Poll__Group__3__Impl"
    // InternalMyDsl.g:480:1: rule__Poll__Group__3__Impl : ( '{' ) ;
    public final void rule__Poll__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:484:1: ( ( '{' ) )
            // InternalMyDsl.g:485:1: ( '{' )
            {
            // InternalMyDsl.g:485:1: ( '{' )
            // InternalMyDsl.g:486:2: '{'
            {
             before(grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_3()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getPollAccess().getLeftCurlyBracketKeyword_3()); 

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
    // $ANTLR end "rule__Poll__Group__3__Impl"


    // $ANTLR start "rule__Poll__Group__4"
    // InternalMyDsl.g:495:1: rule__Poll__Group__4 : rule__Poll__Group__4__Impl rule__Poll__Group__5 ;
    public final void rule__Poll__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:499:1: ( rule__Poll__Group__4__Impl rule__Poll__Group__5 )
            // InternalMyDsl.g:500:2: rule__Poll__Group__4__Impl rule__Poll__Group__5
            {
            pushFollow(FOLLOW_8);
            rule__Poll__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poll__Group__5();

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
    // $ANTLR end "rule__Poll__Group__4"


    // $ANTLR start "rule__Poll__Group__4__Impl"
    // InternalMyDsl.g:507:1: rule__Poll__Group__4__Impl : ( ( rule__Poll__Group_4__0 )? ) ;
    public final void rule__Poll__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:511:1: ( ( ( rule__Poll__Group_4__0 )? ) )
            // InternalMyDsl.g:512:1: ( ( rule__Poll__Group_4__0 )? )
            {
            // InternalMyDsl.g:512:1: ( ( rule__Poll__Group_4__0 )? )
            // InternalMyDsl.g:513:2: ( rule__Poll__Group_4__0 )?
            {
             before(grammarAccess.getPollAccess().getGroup_4()); 
            // InternalMyDsl.g:514:2: ( rule__Poll__Group_4__0 )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==16) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalMyDsl.g:514:3: rule__Poll__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Poll__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPollAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Poll__Group__4__Impl"


    // $ANTLR start "rule__Poll__Group__5"
    // InternalMyDsl.g:522:1: rule__Poll__Group__5 : rule__Poll__Group__5__Impl ;
    public final void rule__Poll__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:526:1: ( rule__Poll__Group__5__Impl )
            // InternalMyDsl.g:527:2: rule__Poll__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Poll__Group__5__Impl();

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
    // $ANTLR end "rule__Poll__Group__5"


    // $ANTLR start "rule__Poll__Group__5__Impl"
    // InternalMyDsl.g:533:1: rule__Poll__Group__5__Impl : ( '}' ) ;
    public final void rule__Poll__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:537:1: ( ( '}' ) )
            // InternalMyDsl.g:538:1: ( '}' )
            {
            // InternalMyDsl.g:538:1: ( '}' )
            // InternalMyDsl.g:539:2: '}'
            {
             before(grammarAccess.getPollAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getPollAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Poll__Group__5__Impl"


    // $ANTLR start "rule__Poll__Group_4__0"
    // InternalMyDsl.g:549:1: rule__Poll__Group_4__0 : rule__Poll__Group_4__0__Impl rule__Poll__Group_4__1 ;
    public final void rule__Poll__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:553:1: ( rule__Poll__Group_4__0__Impl rule__Poll__Group_4__1 )
            // InternalMyDsl.g:554:2: rule__Poll__Group_4__0__Impl rule__Poll__Group_4__1
            {
            pushFollow(FOLLOW_9);
            rule__Poll__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Poll__Group_4__1();

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
    // $ANTLR end "rule__Poll__Group_4__0"


    // $ANTLR start "rule__Poll__Group_4__0__Impl"
    // InternalMyDsl.g:561:1: rule__Poll__Group_4__0__Impl : ( 'questions' ) ;
    public final void rule__Poll__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:565:1: ( ( 'questions' ) )
            // InternalMyDsl.g:566:1: ( 'questions' )
            {
            // InternalMyDsl.g:566:1: ( 'questions' )
            // InternalMyDsl.g:567:2: 'questions'
            {
             before(grammarAccess.getPollAccess().getQuestionsKeyword_4_0()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getPollAccess().getQuestionsKeyword_4_0()); 

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
    // $ANTLR end "rule__Poll__Group_4__0__Impl"


    // $ANTLR start "rule__Poll__Group_4__1"
    // InternalMyDsl.g:576:1: rule__Poll__Group_4__1 : rule__Poll__Group_4__1__Impl ;
    public final void rule__Poll__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:580:1: ( rule__Poll__Group_4__1__Impl )
            // InternalMyDsl.g:581:2: rule__Poll__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Poll__Group_4__1__Impl();

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
    // $ANTLR end "rule__Poll__Group_4__1"


    // $ANTLR start "rule__Poll__Group_4__1__Impl"
    // InternalMyDsl.g:587:1: rule__Poll__Group_4__1__Impl : ( ( rule__Poll__QuestionsAssignment_4_1 ) ) ;
    public final void rule__Poll__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:591:1: ( ( ( rule__Poll__QuestionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:592:1: ( ( rule__Poll__QuestionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:592:1: ( ( rule__Poll__QuestionsAssignment_4_1 ) )
            // InternalMyDsl.g:593:2: ( rule__Poll__QuestionsAssignment_4_1 )
            {
             before(grammarAccess.getPollAccess().getQuestionsAssignment_4_1()); 
            // InternalMyDsl.g:594:2: ( rule__Poll__QuestionsAssignment_4_1 )
            // InternalMyDsl.g:594:3: rule__Poll__QuestionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Poll__QuestionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getPollAccess().getQuestionsAssignment_4_1()); 

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
    // $ANTLR end "rule__Poll__Group_4__1__Impl"


    // $ANTLR start "rule__Question__Group__0"
    // InternalMyDsl.g:603:1: rule__Question__Group__0 : rule__Question__Group__0__Impl rule__Question__Group__1 ;
    public final void rule__Question__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:607:1: ( rule__Question__Group__0__Impl rule__Question__Group__1 )
            // InternalMyDsl.g:608:2: rule__Question__Group__0__Impl rule__Question__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__Question__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__1();

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
    // $ANTLR end "rule__Question__Group__0"


    // $ANTLR start "rule__Question__Group__0__Impl"
    // InternalMyDsl.g:615:1: rule__Question__Group__0__Impl : ( () ) ;
    public final void rule__Question__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:619:1: ( ( () ) )
            // InternalMyDsl.g:620:1: ( () )
            {
            // InternalMyDsl.g:620:1: ( () )
            // InternalMyDsl.g:621:2: ()
            {
             before(grammarAccess.getQuestionAccess().getQuestionAction_0()); 
            // InternalMyDsl.g:622:2: ()
            // InternalMyDsl.g:622:3: 
            {
            }

             after(grammarAccess.getQuestionAccess().getQuestionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Question__Group__0__Impl"


    // $ANTLR start "rule__Question__Group__1"
    // InternalMyDsl.g:630:1: rule__Question__Group__1 : rule__Question__Group__1__Impl rule__Question__Group__2 ;
    public final void rule__Question__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:634:1: ( rule__Question__Group__1__Impl rule__Question__Group__2 )
            // InternalMyDsl.g:635:2: rule__Question__Group__1__Impl rule__Question__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Question__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__2();

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
    // $ANTLR end "rule__Question__Group__1"


    // $ANTLR start "rule__Question__Group__1__Impl"
    // InternalMyDsl.g:642:1: rule__Question__Group__1__Impl : ( 'Question' ) ;
    public final void rule__Question__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:646:1: ( ( 'Question' ) )
            // InternalMyDsl.g:647:1: ( 'Question' )
            {
            // InternalMyDsl.g:647:1: ( 'Question' )
            // InternalMyDsl.g:648:2: 'Question'
            {
             before(grammarAccess.getQuestionAccess().getQuestionKeyword_1()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getQuestionKeyword_1()); 

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
    // $ANTLR end "rule__Question__Group__1__Impl"


    // $ANTLR start "rule__Question__Group__2"
    // InternalMyDsl.g:657:1: rule__Question__Group__2 : rule__Question__Group__2__Impl rule__Question__Group__3 ;
    public final void rule__Question__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:661:1: ( rule__Question__Group__2__Impl rule__Question__Group__3 )
            // InternalMyDsl.g:662:2: rule__Question__Group__2__Impl rule__Question__Group__3
            {
            pushFollow(FOLLOW_10);
            rule__Question__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__3();

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
    // $ANTLR end "rule__Question__Group__2"


    // $ANTLR start "rule__Question__Group__2__Impl"
    // InternalMyDsl.g:669:1: rule__Question__Group__2__Impl : ( '{' ) ;
    public final void rule__Question__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:673:1: ( ( '{' ) )
            // InternalMyDsl.g:674:1: ( '{' )
            {
            // InternalMyDsl.g:674:1: ( '{' )
            // InternalMyDsl.g:675:2: '{'
            {
             before(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Question__Group__2__Impl"


    // $ANTLR start "rule__Question__Group__3"
    // InternalMyDsl.g:684:1: rule__Question__Group__3 : rule__Question__Group__3__Impl rule__Question__Group__4 ;
    public final void rule__Question__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:688:1: ( rule__Question__Group__3__Impl rule__Question__Group__4 )
            // InternalMyDsl.g:689:2: rule__Question__Group__3__Impl rule__Question__Group__4
            {
            pushFollow(FOLLOW_10);
            rule__Question__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__4();

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
    // $ANTLR end "rule__Question__Group__3"


    // $ANTLR start "rule__Question__Group__3__Impl"
    // InternalMyDsl.g:696:1: rule__Question__Group__3__Impl : ( ( rule__Question__Group_3__0 )? ) ;
    public final void rule__Question__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:700:1: ( ( ( rule__Question__Group_3__0 )? ) )
            // InternalMyDsl.g:701:1: ( ( rule__Question__Group_3__0 )? )
            {
            // InternalMyDsl.g:701:1: ( ( rule__Question__Group_3__0 )? )
            // InternalMyDsl.g:702:2: ( rule__Question__Group_3__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_3()); 
            // InternalMyDsl.g:703:2: ( rule__Question__Group_3__0 )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalMyDsl.g:703:3: rule__Question__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Question__Group__3__Impl"


    // $ANTLR start "rule__Question__Group__4"
    // InternalMyDsl.g:711:1: rule__Question__Group__4 : rule__Question__Group__4__Impl rule__Question__Group__5 ;
    public final void rule__Question__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:715:1: ( rule__Question__Group__4__Impl rule__Question__Group__5 )
            // InternalMyDsl.g:716:2: rule__Question__Group__4__Impl rule__Question__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__Question__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group__5();

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
    // $ANTLR end "rule__Question__Group__4"


    // $ANTLR start "rule__Question__Group__4__Impl"
    // InternalMyDsl.g:723:1: rule__Question__Group__4__Impl : ( ( rule__Question__Group_4__0 )? ) ;
    public final void rule__Question__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:727:1: ( ( ( rule__Question__Group_4__0 )? ) )
            // InternalMyDsl.g:728:1: ( ( rule__Question__Group_4__0 )? )
            {
            // InternalMyDsl.g:728:1: ( ( rule__Question__Group_4__0 )? )
            // InternalMyDsl.g:729:2: ( rule__Question__Group_4__0 )?
            {
             before(grammarAccess.getQuestionAccess().getGroup_4()); 
            // InternalMyDsl.g:730:2: ( rule__Question__Group_4__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==19) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalMyDsl.g:730:3: rule__Question__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Question__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getQuestionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Question__Group__4__Impl"


    // $ANTLR start "rule__Question__Group__5"
    // InternalMyDsl.g:738:1: rule__Question__Group__5 : rule__Question__Group__5__Impl ;
    public final void rule__Question__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:742:1: ( rule__Question__Group__5__Impl )
            // InternalMyDsl.g:743:2: rule__Question__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group__5__Impl();

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
    // $ANTLR end "rule__Question__Group__5"


    // $ANTLR start "rule__Question__Group__5__Impl"
    // InternalMyDsl.g:749:1: rule__Question__Group__5__Impl : ( '}' ) ;
    public final void rule__Question__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:753:1: ( ( '}' ) )
            // InternalMyDsl.g:754:1: ( '}' )
            {
            // InternalMyDsl.g:754:1: ( '}' )
            // InternalMyDsl.g:755:2: '}'
            {
             before(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Question__Group__5__Impl"


    // $ANTLR start "rule__Question__Group_3__0"
    // InternalMyDsl.g:765:1: rule__Question__Group_3__0 : rule__Question__Group_3__0__Impl rule__Question__Group_3__1 ;
    public final void rule__Question__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:769:1: ( rule__Question__Group_3__0__Impl rule__Question__Group_3__1 )
            // InternalMyDsl.g:770:2: rule__Question__Group_3__0__Impl rule__Question__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Question__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_3__1();

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
    // $ANTLR end "rule__Question__Group_3__0"


    // $ANTLR start "rule__Question__Group_3__0__Impl"
    // InternalMyDsl.g:777:1: rule__Question__Group_3__0__Impl : ( 'text' ) ;
    public final void rule__Question__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:781:1: ( ( 'text' ) )
            // InternalMyDsl.g:782:1: ( 'text' )
            {
            // InternalMyDsl.g:782:1: ( 'text' )
            // InternalMyDsl.g:783:2: 'text'
            {
             before(grammarAccess.getQuestionAccess().getTextKeyword_3_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getTextKeyword_3_0()); 

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
    // $ANTLR end "rule__Question__Group_3__0__Impl"


    // $ANTLR start "rule__Question__Group_3__1"
    // InternalMyDsl.g:792:1: rule__Question__Group_3__1 : rule__Question__Group_3__1__Impl ;
    public final void rule__Question__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:796:1: ( rule__Question__Group_3__1__Impl )
            // InternalMyDsl.g:797:2: rule__Question__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_3__1__Impl();

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
    // $ANTLR end "rule__Question__Group_3__1"


    // $ANTLR start "rule__Question__Group_3__1__Impl"
    // InternalMyDsl.g:803:1: rule__Question__Group_3__1__Impl : ( ( rule__Question__TextAssignment_3_1 ) ) ;
    public final void rule__Question__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:807:1: ( ( ( rule__Question__TextAssignment_3_1 ) ) )
            // InternalMyDsl.g:808:1: ( ( rule__Question__TextAssignment_3_1 ) )
            {
            // InternalMyDsl.g:808:1: ( ( rule__Question__TextAssignment_3_1 ) )
            // InternalMyDsl.g:809:2: ( rule__Question__TextAssignment_3_1 )
            {
             before(grammarAccess.getQuestionAccess().getTextAssignment_3_1()); 
            // InternalMyDsl.g:810:2: ( rule__Question__TextAssignment_3_1 )
            // InternalMyDsl.g:810:3: rule__Question__TextAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__TextAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getTextAssignment_3_1()); 

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
    // $ANTLR end "rule__Question__Group_3__1__Impl"


    // $ANTLR start "rule__Question__Group_4__0"
    // InternalMyDsl.g:819:1: rule__Question__Group_4__0 : rule__Question__Group_4__0__Impl rule__Question__Group_4__1 ;
    public final void rule__Question__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:823:1: ( rule__Question__Group_4__0__Impl rule__Question__Group_4__1 )
            // InternalMyDsl.g:824:2: rule__Question__Group_4__0__Impl rule__Question__Group_4__1
            {
            pushFollow(FOLLOW_11);
            rule__Question__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Question__Group_4__1();

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
    // $ANTLR end "rule__Question__Group_4__0"


    // $ANTLR start "rule__Question__Group_4__0__Impl"
    // InternalMyDsl.g:831:1: rule__Question__Group_4__0__Impl : ( 'options' ) ;
    public final void rule__Question__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:835:1: ( ( 'options' ) )
            // InternalMyDsl.g:836:1: ( 'options' )
            {
            // InternalMyDsl.g:836:1: ( 'options' )
            // InternalMyDsl.g:837:2: 'options'
            {
             before(grammarAccess.getQuestionAccess().getOptionsKeyword_4_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getQuestionAccess().getOptionsKeyword_4_0()); 

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
    // $ANTLR end "rule__Question__Group_4__0__Impl"


    // $ANTLR start "rule__Question__Group_4__1"
    // InternalMyDsl.g:846:1: rule__Question__Group_4__1 : rule__Question__Group_4__1__Impl ;
    public final void rule__Question__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:850:1: ( rule__Question__Group_4__1__Impl )
            // InternalMyDsl.g:851:2: rule__Question__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Question__Group_4__1__Impl();

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
    // $ANTLR end "rule__Question__Group_4__1"


    // $ANTLR start "rule__Question__Group_4__1__Impl"
    // InternalMyDsl.g:857:1: rule__Question__Group_4__1__Impl : ( ( rule__Question__OptionsAssignment_4_1 ) ) ;
    public final void rule__Question__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:861:1: ( ( ( rule__Question__OptionsAssignment_4_1 ) ) )
            // InternalMyDsl.g:862:1: ( ( rule__Question__OptionsAssignment_4_1 ) )
            {
            // InternalMyDsl.g:862:1: ( ( rule__Question__OptionsAssignment_4_1 ) )
            // InternalMyDsl.g:863:2: ( rule__Question__OptionsAssignment_4_1 )
            {
             before(grammarAccess.getQuestionAccess().getOptionsAssignment_4_1()); 
            // InternalMyDsl.g:864:2: ( rule__Question__OptionsAssignment_4_1 )
            // InternalMyDsl.g:864:3: rule__Question__OptionsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Question__OptionsAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getQuestionAccess().getOptionsAssignment_4_1()); 

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
    // $ANTLR end "rule__Question__Group_4__1__Impl"


    // $ANTLR start "rule__Option__Group__0"
    // InternalMyDsl.g:873:1: rule__Option__Group__0 : rule__Option__Group__0__Impl rule__Option__Group__1 ;
    public final void rule__Option__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:877:1: ( rule__Option__Group__0__Impl rule__Option__Group__1 )
            // InternalMyDsl.g:878:2: rule__Option__Group__0__Impl rule__Option__Group__1
            {
            pushFollow(FOLLOW_11);
            rule__Option__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__1();

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
    // $ANTLR end "rule__Option__Group__0"


    // $ANTLR start "rule__Option__Group__0__Impl"
    // InternalMyDsl.g:885:1: rule__Option__Group__0__Impl : ( () ) ;
    public final void rule__Option__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:889:1: ( ( () ) )
            // InternalMyDsl.g:890:1: ( () )
            {
            // InternalMyDsl.g:890:1: ( () )
            // InternalMyDsl.g:891:2: ()
            {
             before(grammarAccess.getOptionAccess().getOptionAction_0()); 
            // InternalMyDsl.g:892:2: ()
            // InternalMyDsl.g:892:3: 
            {
            }

             after(grammarAccess.getOptionAccess().getOptionAction_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Option__Group__0__Impl"


    // $ANTLR start "rule__Option__Group__1"
    // InternalMyDsl.g:900:1: rule__Option__Group__1 : rule__Option__Group__1__Impl rule__Option__Group__2 ;
    public final void rule__Option__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:904:1: ( rule__Option__Group__1__Impl rule__Option__Group__2 )
            // InternalMyDsl.g:905:2: rule__Option__Group__1__Impl rule__Option__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Option__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__2();

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
    // $ANTLR end "rule__Option__Group__1"


    // $ANTLR start "rule__Option__Group__1__Impl"
    // InternalMyDsl.g:912:1: rule__Option__Group__1__Impl : ( 'Option' ) ;
    public final void rule__Option__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:916:1: ( ( 'Option' ) )
            // InternalMyDsl.g:917:1: ( 'Option' )
            {
            // InternalMyDsl.g:917:1: ( 'Option' )
            // InternalMyDsl.g:918:2: 'Option'
            {
             before(grammarAccess.getOptionAccess().getOptionKeyword_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getOptionKeyword_1()); 

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
    // $ANTLR end "rule__Option__Group__1__Impl"


    // $ANTLR start "rule__Option__Group__2"
    // InternalMyDsl.g:927:1: rule__Option__Group__2 : rule__Option__Group__2__Impl rule__Option__Group__3 ;
    public final void rule__Option__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:931:1: ( rule__Option__Group__2__Impl rule__Option__Group__3 )
            // InternalMyDsl.g:932:2: rule__Option__Group__2__Impl rule__Option__Group__3
            {
            pushFollow(FOLLOW_12);
            rule__Option__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__3();

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
    // $ANTLR end "rule__Option__Group__2"


    // $ANTLR start "rule__Option__Group__2__Impl"
    // InternalMyDsl.g:939:1: rule__Option__Group__2__Impl : ( '{' ) ;
    public final void rule__Option__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:943:1: ( ( '{' ) )
            // InternalMyDsl.g:944:1: ( '{' )
            {
            // InternalMyDsl.g:944:1: ( '{' )
            // InternalMyDsl.g:945:2: '{'
            {
             before(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,12,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getLeftCurlyBracketKeyword_2()); 

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
    // $ANTLR end "rule__Option__Group__2__Impl"


    // $ANTLR start "rule__Option__Group__3"
    // InternalMyDsl.g:954:1: rule__Option__Group__3 : rule__Option__Group__3__Impl rule__Option__Group__4 ;
    public final void rule__Option__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:958:1: ( rule__Option__Group__3__Impl rule__Option__Group__4 )
            // InternalMyDsl.g:959:2: rule__Option__Group__3__Impl rule__Option__Group__4
            {
            pushFollow(FOLLOW_12);
            rule__Option__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__4();

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
    // $ANTLR end "rule__Option__Group__3"


    // $ANTLR start "rule__Option__Group__3__Impl"
    // InternalMyDsl.g:966:1: rule__Option__Group__3__Impl : ( ( rule__Option__Group_3__0 )? ) ;
    public final void rule__Option__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:970:1: ( ( ( rule__Option__Group_3__0 )? ) )
            // InternalMyDsl.g:971:1: ( ( rule__Option__Group_3__0 )? )
            {
            // InternalMyDsl.g:971:1: ( ( rule__Option__Group_3__0 )? )
            // InternalMyDsl.g:972:2: ( rule__Option__Group_3__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_3()); 
            // InternalMyDsl.g:973:2: ( rule__Option__Group_3__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==21) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalMyDsl.g:973:3: rule__Option__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Option__Group_3__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionAccess().getGroup_3()); 

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
    // $ANTLR end "rule__Option__Group__3__Impl"


    // $ANTLR start "rule__Option__Group__4"
    // InternalMyDsl.g:981:1: rule__Option__Group__4 : rule__Option__Group__4__Impl rule__Option__Group__5 ;
    public final void rule__Option__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:985:1: ( rule__Option__Group__4__Impl rule__Option__Group__5 )
            // InternalMyDsl.g:986:2: rule__Option__Group__4__Impl rule__Option__Group__5
            {
            pushFollow(FOLLOW_12);
            rule__Option__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group__5();

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
    // $ANTLR end "rule__Option__Group__4"


    // $ANTLR start "rule__Option__Group__4__Impl"
    // InternalMyDsl.g:993:1: rule__Option__Group__4__Impl : ( ( rule__Option__Group_4__0 )? ) ;
    public final void rule__Option__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:997:1: ( ( ( rule__Option__Group_4__0 )? ) )
            // InternalMyDsl.g:998:1: ( ( rule__Option__Group_4__0 )? )
            {
            // InternalMyDsl.g:998:1: ( ( rule__Option__Group_4__0 )? )
            // InternalMyDsl.g:999:2: ( rule__Option__Group_4__0 )?
            {
             before(grammarAccess.getOptionAccess().getGroup_4()); 
            // InternalMyDsl.g:1000:2: ( rule__Option__Group_4__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==18) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalMyDsl.g:1000:3: rule__Option__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Option__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionAccess().getGroup_4()); 

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
    // $ANTLR end "rule__Option__Group__4__Impl"


    // $ANTLR start "rule__Option__Group__5"
    // InternalMyDsl.g:1008:1: rule__Option__Group__5 : rule__Option__Group__5__Impl ;
    public final void rule__Option__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1012:1: ( rule__Option__Group__5__Impl )
            // InternalMyDsl.g:1013:2: rule__Option__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group__5__Impl();

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
    // $ANTLR end "rule__Option__Group__5"


    // $ANTLR start "rule__Option__Group__5__Impl"
    // InternalMyDsl.g:1019:1: rule__Option__Group__5__Impl : ( '}' ) ;
    public final void rule__Option__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1023:1: ( ( '}' ) )
            // InternalMyDsl.g:1024:1: ( '}' )
            {
            // InternalMyDsl.g:1024:1: ( '}' )
            // InternalMyDsl.g:1025:2: '}'
            {
             before(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_5()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getRightCurlyBracketKeyword_5()); 

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
    // $ANTLR end "rule__Option__Group__5__Impl"


    // $ANTLR start "rule__Option__Group_3__0"
    // InternalMyDsl.g:1035:1: rule__Option__Group_3__0 : rule__Option__Group_3__0__Impl rule__Option__Group_3__1 ;
    public final void rule__Option__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1039:1: ( rule__Option__Group_3__0__Impl rule__Option__Group_3__1 )
            // InternalMyDsl.g:1040:2: rule__Option__Group_3__0__Impl rule__Option__Group_3__1
            {
            pushFollow(FOLLOW_7);
            rule__Option__Group_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group_3__1();

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
    // $ANTLR end "rule__Option__Group_3__0"


    // $ANTLR start "rule__Option__Group_3__0__Impl"
    // InternalMyDsl.g:1047:1: rule__Option__Group_3__0__Impl : ( 'id' ) ;
    public final void rule__Option__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1051:1: ( ( 'id' ) )
            // InternalMyDsl.g:1052:1: ( 'id' )
            {
            // InternalMyDsl.g:1052:1: ( 'id' )
            // InternalMyDsl.g:1053:2: 'id'
            {
             before(grammarAccess.getOptionAccess().getIdKeyword_3_0()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getIdKeyword_3_0()); 

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
    // $ANTLR end "rule__Option__Group_3__0__Impl"


    // $ANTLR start "rule__Option__Group_3__1"
    // InternalMyDsl.g:1062:1: rule__Option__Group_3__1 : rule__Option__Group_3__1__Impl ;
    public final void rule__Option__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1066:1: ( rule__Option__Group_3__1__Impl )
            // InternalMyDsl.g:1067:2: rule__Option__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group_3__1__Impl();

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
    // $ANTLR end "rule__Option__Group_3__1"


    // $ANTLR start "rule__Option__Group_3__1__Impl"
    // InternalMyDsl.g:1073:1: rule__Option__Group_3__1__Impl : ( ( rule__Option__IdAssignment_3_1 ) ) ;
    public final void rule__Option__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1077:1: ( ( ( rule__Option__IdAssignment_3_1 ) ) )
            // InternalMyDsl.g:1078:1: ( ( rule__Option__IdAssignment_3_1 ) )
            {
            // InternalMyDsl.g:1078:1: ( ( rule__Option__IdAssignment_3_1 ) )
            // InternalMyDsl.g:1079:2: ( rule__Option__IdAssignment_3_1 )
            {
             before(grammarAccess.getOptionAccess().getIdAssignment_3_1()); 
            // InternalMyDsl.g:1080:2: ( rule__Option__IdAssignment_3_1 )
            // InternalMyDsl.g:1080:3: rule__Option__IdAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Option__IdAssignment_3_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getIdAssignment_3_1()); 

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
    // $ANTLR end "rule__Option__Group_3__1__Impl"


    // $ANTLR start "rule__Option__Group_4__0"
    // InternalMyDsl.g:1089:1: rule__Option__Group_4__0 : rule__Option__Group_4__0__Impl rule__Option__Group_4__1 ;
    public final void rule__Option__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1093:1: ( rule__Option__Group_4__0__Impl rule__Option__Group_4__1 )
            // InternalMyDsl.g:1094:2: rule__Option__Group_4__0__Impl rule__Option__Group_4__1
            {
            pushFollow(FOLLOW_7);
            rule__Option__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Option__Group_4__1();

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
    // $ANTLR end "rule__Option__Group_4__0"


    // $ANTLR start "rule__Option__Group_4__0__Impl"
    // InternalMyDsl.g:1101:1: rule__Option__Group_4__0__Impl : ( 'text' ) ;
    public final void rule__Option__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1105:1: ( ( 'text' ) )
            // InternalMyDsl.g:1106:1: ( 'text' )
            {
            // InternalMyDsl.g:1106:1: ( 'text' )
            // InternalMyDsl.g:1107:2: 'text'
            {
             before(grammarAccess.getOptionAccess().getTextKeyword_4_0()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getOptionAccess().getTextKeyword_4_0()); 

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
    // $ANTLR end "rule__Option__Group_4__0__Impl"


    // $ANTLR start "rule__Option__Group_4__1"
    // InternalMyDsl.g:1116:1: rule__Option__Group_4__1 : rule__Option__Group_4__1__Impl ;
    public final void rule__Option__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1120:1: ( rule__Option__Group_4__1__Impl )
            // InternalMyDsl.g:1121:2: rule__Option__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Option__Group_4__1__Impl();

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
    // $ANTLR end "rule__Option__Group_4__1"


    // $ANTLR start "rule__Option__Group_4__1__Impl"
    // InternalMyDsl.g:1127:1: rule__Option__Group_4__1__Impl : ( ( rule__Option__TextAssignment_4_1 ) ) ;
    public final void rule__Option__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1131:1: ( ( ( rule__Option__TextAssignment_4_1 ) ) )
            // InternalMyDsl.g:1132:1: ( ( rule__Option__TextAssignment_4_1 ) )
            {
            // InternalMyDsl.g:1132:1: ( ( rule__Option__TextAssignment_4_1 ) )
            // InternalMyDsl.g:1133:2: ( rule__Option__TextAssignment_4_1 )
            {
             before(grammarAccess.getOptionAccess().getTextAssignment_4_1()); 
            // InternalMyDsl.g:1134:2: ( rule__Option__TextAssignment_4_1 )
            // InternalMyDsl.g:1134:3: rule__Option__TextAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__Option__TextAssignment_4_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionAccess().getTextAssignment_4_1()); 

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
    // $ANTLR end "rule__Option__Group_4__1__Impl"


    // $ANTLR start "rule__PollSystem__PollsAssignment_3_1"
    // InternalMyDsl.g:1143:1: rule__PollSystem__PollsAssignment_3_1 : ( rulePoll ) ;
    public final void rule__PollSystem__PollsAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1147:1: ( ( rulePoll ) )
            // InternalMyDsl.g:1148:2: ( rulePoll )
            {
            // InternalMyDsl.g:1148:2: ( rulePoll )
            // InternalMyDsl.g:1149:3: rulePoll
            {
             before(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            rulePoll();

            state._fsp--;

             after(grammarAccess.getPollSystemAccess().getPollsPollParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__PollSystem__PollsAssignment_3_1"


    // $ANTLR start "rule__Poll__NameAssignment_2"
    // InternalMyDsl.g:1158:1: rule__Poll__NameAssignment_2 : ( ruleEString ) ;
    public final void rule__Poll__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1162:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1163:2: ( ruleEString )
            {
            // InternalMyDsl.g:1163:2: ( ruleEString )
            // InternalMyDsl.g:1164:3: ruleEString
            {
             before(grammarAccess.getPollAccess().getNameEStringParserRuleCall_2_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPollAccess().getNameEStringParserRuleCall_2_0()); 

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
    // $ANTLR end "rule__Poll__NameAssignment_2"


    // $ANTLR start "rule__Poll__QuestionsAssignment_4_1"
    // InternalMyDsl.g:1173:1: rule__Poll__QuestionsAssignment_4_1 : ( ruleQuestion ) ;
    public final void rule__Poll__QuestionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1177:1: ( ( ruleQuestion ) )
            // InternalMyDsl.g:1178:2: ( ruleQuestion )
            {
            // InternalMyDsl.g:1178:2: ( ruleQuestion )
            // InternalMyDsl.g:1179:3: ruleQuestion
            {
             before(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleQuestion();

            state._fsp--;

             after(grammarAccess.getPollAccess().getQuestionsQuestionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Poll__QuestionsAssignment_4_1"


    // $ANTLR start "rule__Question__TextAssignment_3_1"
    // InternalMyDsl.g:1188:1: rule__Question__TextAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Question__TextAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1192:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1193:2: ( ruleEString )
            {
            // InternalMyDsl.g:1193:2: ( ruleEString )
            // InternalMyDsl.g:1194:3: ruleEString
            {
             before(grammarAccess.getQuestionAccess().getTextEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getTextEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Question__TextAssignment_3_1"


    // $ANTLR start "rule__Question__OptionsAssignment_4_1"
    // InternalMyDsl.g:1203:1: rule__Question__OptionsAssignment_4_1 : ( ruleOption ) ;
    public final void rule__Question__OptionsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1207:1: ( ( ruleOption ) )
            // InternalMyDsl.g:1208:2: ( ruleOption )
            {
            // InternalMyDsl.g:1208:2: ( ruleOption )
            // InternalMyDsl.g:1209:3: ruleOption
            {
             before(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleOption();

            state._fsp--;

             after(grammarAccess.getQuestionAccess().getOptionsOptionParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Question__OptionsAssignment_4_1"


    // $ANTLR start "rule__Option__IdAssignment_3_1"
    // InternalMyDsl.g:1218:1: rule__Option__IdAssignment_3_1 : ( ruleEString ) ;
    public final void rule__Option__IdAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1222:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1223:2: ( ruleEString )
            {
            // InternalMyDsl.g:1223:2: ( ruleEString )
            // InternalMyDsl.g:1224:3: ruleEString
            {
             before(grammarAccess.getOptionAccess().getIdEStringParserRuleCall_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getIdEStringParserRuleCall_3_1_0()); 

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
    // $ANTLR end "rule__Option__IdAssignment_3_1"


    // $ANTLR start "rule__Option__TextAssignment_4_1"
    // InternalMyDsl.g:1233:1: rule__Option__TextAssignment_4_1 : ( ruleEString ) ;
    public final void rule__Option__TextAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMyDsl.g:1237:1: ( ( ruleEString ) )
            // InternalMyDsl.g:1238:2: ( ruleEString )
            {
            // InternalMyDsl.g:1238:2: ( ruleEString )
            // InternalMyDsl.g:1239:3: ruleEString
            {
             before(grammarAccess.getOptionAccess().getTextEStringParserRuleCall_4_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getOptionAccess().getTextEStringParserRuleCall_4_1_0()); 

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
    // $ANTLR end "rule__Option__TextAssignment_4_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000012000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C2000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000242000L});

}