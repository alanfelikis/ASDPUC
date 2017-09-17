import sistemaacademico.Matricula
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_sistemaAcademico_matricula_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/matricula/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: matriculaInstance, field: 'cpf', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("matricula.cpf.label"),'default':("CPF")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("cpf"),'required':(""),'value':(matriculaInstance?.cpf)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: matriculaInstance, field: 'curso', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("matricula.curso.label"),'default':("Curso")],-1)
printHtmlPart(2)
invokeTag('select','g',19,['name':("curso"),'from':(matriculaInstance.constraints.curso.inList),'required':(""),'value':(matriculaInstance?.curso),'valueMessagePrefix':("matricula.curso")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: matriculaInstance, field: 'periodo', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("matricula.periodo.label"),'default':("Periodo")],-1)
printHtmlPart(2)
invokeTag('select','g',28,['name':("periodo"),'from':(matriculaInstance.constraints.periodo.inList),'required':(""),'value':(matriculaInstance?.periodo),'valueMessagePrefix':("matricula.periodo")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: matriculaInstance, field: 'unidade', 'error'))
printHtmlPart(6)
invokeTag('message','g',34,['code':("matricula.unidade.label"),'default':("Unidade")],-1)
printHtmlPart(2)
invokeTag('select','g',37,['name':("unidade"),'from':(matriculaInstance.constraints.unidade.inList),'required':(""),'value':(matriculaInstance?.unidade),'valueMessagePrefix':("matricula.unidade")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: matriculaInstance, field: 'data', 'error'))
printHtmlPart(7)
invokeTag('message','g',43,['code':("matricula.data.label"),'default':("Data")],-1)
printHtmlPart(2)
invokeTag('datePicker','g',46,['name':("data"),'precision':("day"),'value':(matriculaInstance?.data)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: matriculaInstance, field: 'desconto', 'error'))
printHtmlPart(8)
invokeTag('message','g',52,['code':("matricula.desconto.label"),'default':("Desconto")],-1)
printHtmlPart(2)
invokeTag('field','g',55,['name':("desconto"),'type':("number"),'value':(matriculaInstance.desconto),'required':("")],-1)
printHtmlPart(9)
expressionOut.print(hasErrors(bean: matriculaInstance, field: 'status', 'error'))
printHtmlPart(10)
invokeTag('message','g',61,['code':("matricula.status.label"),'default':("Status")],-1)
printHtmlPart(2)
invokeTag('select','g',64,['name':("status"),'from':(matriculaInstance.constraints.status.inList),'required':(""),'value':(matriculaInstance?.status),'valueMessagePrefix':("matricula.status")],-1)
printHtmlPart(11)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1503282096487L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 5, 5, 7, 7, 10, 10, 14, 14, 16, 16, 19, 19, 23, 23, 25, 25, 28, 28, 32, 32, 34, 34, 37, 37, 41, 41, 43, 43, 46, 46, 50, 50, 52, 52, 55, 55, 59, 59, 61, 61, 64, 64, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "_form.gsp"
)
class ___LineNumberPlaceholder { }
