/*
 * generated by Xtext 2.21.0
 */
package org.xtext.example.mydsl.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder.AbstractGrammarElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MyDslGrammarAccess extends AbstractGrammarElementFinder {
	
	public class PollSystemElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.PollSystem");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPollSystemAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPollSystemKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cPollsKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cPollsAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cPollsPollParserRuleCall_3_1_0 = (RuleCall)cPollsAssignment_3_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_4 = (Keyword)cGroup.eContents().get(4);
		
		//PollSystem:
		//	{PollSystem}
		//	'PollSystem'
		//	'{' ('polls' polls=Poll)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{PollSystem} 'PollSystem' '{' ('polls' polls=Poll)? '}'
		public Group getGroup() { return cGroup; }
		
		//{PollSystem}
		public Action getPollSystemAction_0() { return cPollSystemAction_0; }
		
		//'PollSystem'
		public Keyword getPollSystemKeyword_1() { return cPollSystemKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('polls' polls=Poll)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'polls'
		public Keyword getPollsKeyword_3_0() { return cPollsKeyword_3_0; }
		
		//polls=Poll
		public Assignment getPollsAssignment_3_1() { return cPollsAssignment_3_1; }
		
		//Poll
		public RuleCall getPollsPollParserRuleCall_3_1_0() { return cPollsPollParserRuleCall_3_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_4() { return cRightCurlyBracketKeyword_4; }
	}
	public class PollElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Poll");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cPollAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cPollKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Assignment cNameAssignment_2 = (Assignment)cGroup.eContents().get(2);
		private final RuleCall cNameEStringParserRuleCall_2_0 = (RuleCall)cNameAssignment_2.eContents().get(0);
		private final Keyword cLeftCurlyBracketKeyword_3 = (Keyword)cGroup.eContents().get(3);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cQuestionsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cQuestionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cQuestionsQuestionParserRuleCall_4_1_0 = (RuleCall)cQuestionsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Poll:
		//	{Poll}
		//	'Poll'
		//	name=EString
		//	'{' ('questions' questions=Question)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Poll} 'Poll' name=EString '{' ('questions' questions=Question)? '}'
		public Group getGroup() { return cGroup; }
		
		//{Poll}
		public Action getPollAction_0() { return cPollAction_0; }
		
		//'Poll'
		public Keyword getPollKeyword_1() { return cPollKeyword_1; }
		
		//name=EString
		public Assignment getNameAssignment_2() { return cNameAssignment_2; }
		
		//EString
		public RuleCall getNameEStringParserRuleCall_2_0() { return cNameEStringParserRuleCall_2_0; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_3() { return cLeftCurlyBracketKeyword_3; }
		
		//('questions' questions=Question)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'questions'
		public Keyword getQuestionsKeyword_4_0() { return cQuestionsKeyword_4_0; }
		
		//questions=Question
		public Assignment getQuestionsAssignment_4_1() { return cQuestionsAssignment_4_1; }
		
		//Question
		public RuleCall getQuestionsQuestionParserRuleCall_4_1_0() { return cQuestionsQuestionParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class EStringElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.EString");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cSTRINGTerminalRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cIDTerminalRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//EString:
		//	STRING | ID;
		@Override public ParserRule getRule() { return rule; }
		
		//STRING | ID
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//STRING
		public RuleCall getSTRINGTerminalRuleCall_0() { return cSTRINGTerminalRuleCall_0; }
		
		//ID
		public RuleCall getIDTerminalRuleCall_1() { return cIDTerminalRuleCall_1; }
	}
	public class QuestionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Question");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cQuestionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cQuestionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cTextKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cTextAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cTextEStringParserRuleCall_3_1_0 = (RuleCall)cTextAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cOptionsKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cOptionsAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cOptionsOptionParserRuleCall_4_1_0 = (RuleCall)cOptionsAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Question:
		//	{Question}
		//	'Question'
		//	'{' ('text' text=EString)? ('options' options=Option)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Question} 'Question' '{' ('text' text=EString)? ('options' options=Option)? '}'
		public Group getGroup() { return cGroup; }
		
		//{Question}
		public Action getQuestionAction_0() { return cQuestionAction_0; }
		
		//'Question'
		public Keyword getQuestionKeyword_1() { return cQuestionKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('text' text=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'text'
		public Keyword getTextKeyword_3_0() { return cTextKeyword_3_0; }
		
		//text=EString
		public Assignment getTextAssignment_3_1() { return cTextAssignment_3_1; }
		
		//EString
		public RuleCall getTextEStringParserRuleCall_3_1_0() { return cTextEStringParserRuleCall_3_1_0; }
		
		//('options' options=Option)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'options'
		public Keyword getOptionsKeyword_4_0() { return cOptionsKeyword_4_0; }
		
		//options=Option
		public Assignment getOptionsAssignment_4_1() { return cOptionsAssignment_4_1; }
		
		//Option
		public RuleCall getOptionsOptionParserRuleCall_4_1_0() { return cOptionsOptionParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	public class OptionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "org.xtext.example.mydsl.MyDsl.Option");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Action cOptionAction_0 = (Action)cGroup.eContents().get(0);
		private final Keyword cOptionKeyword_1 = (Keyword)cGroup.eContents().get(1);
		private final Keyword cLeftCurlyBracketKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Group cGroup_3 = (Group)cGroup.eContents().get(3);
		private final Keyword cIdKeyword_3_0 = (Keyword)cGroup_3.eContents().get(0);
		private final Assignment cIdAssignment_3_1 = (Assignment)cGroup_3.eContents().get(1);
		private final RuleCall cIdEStringParserRuleCall_3_1_0 = (RuleCall)cIdAssignment_3_1.eContents().get(0);
		private final Group cGroup_4 = (Group)cGroup.eContents().get(4);
		private final Keyword cTextKeyword_4_0 = (Keyword)cGroup_4.eContents().get(0);
		private final Assignment cTextAssignment_4_1 = (Assignment)cGroup_4.eContents().get(1);
		private final RuleCall cTextEStringParserRuleCall_4_1_0 = (RuleCall)cTextAssignment_4_1.eContents().get(0);
		private final Keyword cRightCurlyBracketKeyword_5 = (Keyword)cGroup.eContents().get(5);
		
		//Option:
		//	{Option}
		//	'Option'
		//	'{' ('id' id=EString)? ('text' text=EString)?
		//	'}';
		@Override public ParserRule getRule() { return rule; }
		
		//{Option} 'Option' '{' ('id' id=EString)? ('text' text=EString)? '}'
		public Group getGroup() { return cGroup; }
		
		//{Option}
		public Action getOptionAction_0() { return cOptionAction_0; }
		
		//'Option'
		public Keyword getOptionKeyword_1() { return cOptionKeyword_1; }
		
		//'{'
		public Keyword getLeftCurlyBracketKeyword_2() { return cLeftCurlyBracketKeyword_2; }
		
		//('id' id=EString)?
		public Group getGroup_3() { return cGroup_3; }
		
		//'id'
		public Keyword getIdKeyword_3_0() { return cIdKeyword_3_0; }
		
		//id=EString
		public Assignment getIdAssignment_3_1() { return cIdAssignment_3_1; }
		
		//EString
		public RuleCall getIdEStringParserRuleCall_3_1_0() { return cIdEStringParserRuleCall_3_1_0; }
		
		//('text' text=EString)?
		public Group getGroup_4() { return cGroup_4; }
		
		//'text'
		public Keyword getTextKeyword_4_0() { return cTextKeyword_4_0; }
		
		//text=EString
		public Assignment getTextAssignment_4_1() { return cTextAssignment_4_1; }
		
		//EString
		public RuleCall getTextEStringParserRuleCall_4_1_0() { return cTextEStringParserRuleCall_4_1_0; }
		
		//'}'
		public Keyword getRightCurlyBracketKeyword_5() { return cRightCurlyBracketKeyword_5; }
	}
	
	
	private final PollSystemElements pPollSystem;
	private final PollElements pPoll;
	private final EStringElements pEString;
	private final QuestionElements pQuestion;
	private final OptionElements pOption;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MyDslGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pPollSystem = new PollSystemElements();
		this.pPoll = new PollElements();
		this.pEString = new EStringElements();
		this.pQuestion = new QuestionElements();
		this.pOption = new OptionElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("org.xtext.example.mydsl.MyDsl".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//PollSystem:
	//	{PollSystem}
	//	'PollSystem'
	//	'{' ('polls' polls=Poll)?
	//	'}';
	public PollSystemElements getPollSystemAccess() {
		return pPollSystem;
	}
	
	public ParserRule getPollSystemRule() {
		return getPollSystemAccess().getRule();
	}
	
	//Poll:
	//	{Poll}
	//	'Poll'
	//	name=EString
	//	'{' ('questions' questions=Question)?
	//	'}';
	public PollElements getPollAccess() {
		return pPoll;
	}
	
	public ParserRule getPollRule() {
		return getPollAccess().getRule();
	}
	
	//EString:
	//	STRING | ID;
	public EStringElements getEStringAccess() {
		return pEString;
	}
	
	public ParserRule getEStringRule() {
		return getEStringAccess().getRule();
	}
	
	//Question:
	//	{Question}
	//	'Question'
	//	'{' ('text' text=EString)? ('options' options=Option)?
	//	'}';
	public QuestionElements getQuestionAccess() {
		return pQuestion;
	}
	
	public ParserRule getQuestionRule() {
		return getQuestionAccess().getRule();
	}
	
	//Option:
	//	{Option}
	//	'Option'
	//	'{' ('id' id=EString)? ('text' text=EString)?
	//	'}';
	public OptionElements getOptionAccess() {
		return pOption;
	}
	
	public ParserRule getOptionRule() {
		return getOptionAccess().getRule();
	}
	
	//terminal ID:
	//	'^'? ('a'..'z' | 'A'..'Z' | '_') ('a'..'z' | 'A'..'Z' | '_' | '0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt:
	//	'0'..'9'+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//	'"' ('\\' . | !('\\' | '"'))* '"' | "'" ('\\' . | !('\\' | "'"))* "'";
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT:
	//	'/*'->'*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT:
	//	'//' !('\n' | '\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS:
	//	' ' | '\t' | '\r' | '\n'+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER:
	//	.;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}
