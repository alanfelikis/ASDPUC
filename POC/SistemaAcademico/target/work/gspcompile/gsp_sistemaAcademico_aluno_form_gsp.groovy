import sistemaacademico.Aluno
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_sistemaAcademico_aluno_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/aluno/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: alunoInstance, field: 'nome', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("aluno.nome.label"),'default':("Nome")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("nome"),'required':(""),'value':(alunoInstance?.nome)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: alunoInstance, field: 'nascimento', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("aluno.nascimento.label"),'default':("Nascimento")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',19,['name':("nascimento"),'precision':("day"),'value':(alunoInstance?.nascimento)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: alunoInstance, field: 'sexo', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("aluno.sexo.label"),'default':("Sexo")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['name':("sexo"),'from':(alunoInstance.constraints.sexo.inList),'required':(""),'value':(alunoInstance?.sexo),'valueMessagePrefix':("aluno.sexo")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: alunoInstance, field: 'cpf', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("aluno.cpf.label"),'default':("CPF")],-1)
printHtmlPart(2)
invokeTag('textField','g',37,['name':("cpf"),'required':(""),'value':(alunoInstance?.cpf)],-1)
printHtmlPart(7)
expressionOut.print(hasErrors(bean: alunoInstance, field: 'telefone', 'error'))
printHtmlPart(8)
invokeTag('message','g',43,['code':("aluno.telefone.label"),'default':("Telefone")],-1)
printHtmlPart(2)
invokeTag('textField','g',46,['name':("telefone"),'required':(""),'value':(alunoInstance?.telefone)],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: alunoInstance, field: 'celular', 'error'))
printHtmlPart(10)
invokeTag('message','g',52,['code':("aluno.celular.label"),'default':("Celular")],-1)
printHtmlPart(2)
invokeTag('textField','g',55,['name':("celular"),'required':(""),'value':(alunoInstance?.celular)],-1)
printHtmlPart(11)
expressionOut.print(hasErrors(bean: alunoInstance, field: 'mail', 'error'))
printHtmlPart(12)
invokeTag('message','g',61,['code':("aluno.mail.label"),'default':("E-mail")],-1)
printHtmlPart(2)
invokeTag('field','g',64,['type':("email"),'name':("mail"),'required':(""),'value':(alunoInstance?.mail)],-1)
printHtmlPart(13)
expressionOut.print(hasErrors(bean: alunoInstance, field: 'escolaridade', 'error'))
printHtmlPart(14)
invokeTag('message','g',70,['code':("aluno.escolaridade.label"),'default':("Escolaridade")],-1)
printHtmlPart(2)
invokeTag('select','g',73,['name':("escolaridade"),'from':(alunoInstance.constraints.escolaridade.inList),'required':(""),'value':(alunoInstance?.escolaridade),'valueMessagePrefix':("aluno.escolaridade")],-1)
printHtmlPart(15)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1503282677070L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 7, 7, 10, 10, 14, 14, 16, 16, 19, 19, 23, 23, 25, 25, 28, 28, 32, 32, 34, 34, 37, 37, 41, 41, 43, 43, 46, 46, 50, 50, 52, 52, 55, 55, 59, 59, 61, 61, 64, 64, 68, 68, 70, 70, 73, 73, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
