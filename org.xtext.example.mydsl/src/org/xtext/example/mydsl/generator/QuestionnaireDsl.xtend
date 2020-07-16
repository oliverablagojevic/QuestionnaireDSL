package org.xtext.example.mydsl.generator

import questionnaireModel.PollSystem
import java.util.List
import questionnaireModel.PollSystem

class QuestionnaireDsl {
	PollSystem pollsystem;
	
	new (PollSystem pollsystem) {
		this.pollsystem = pollsystem;
	}
	def pollSystemToHtml() ''' 
	<html>
	<body>
	«FOR p : polls»
	«IF p.name != null»
	<h1>«p.name»</h1>
	«ENDIF»
	«FOR q : p.questions»
	<p>
	<h2>«q.text»</h2>
	<ul>
	«FOR o : q.options»
	<li>« q.text»</li>
	«ENDFOR»
	</ul>
	</p>
	«ENDFOR»
	«ENDFOR»
	</body>
	</html>
	
	'''
}