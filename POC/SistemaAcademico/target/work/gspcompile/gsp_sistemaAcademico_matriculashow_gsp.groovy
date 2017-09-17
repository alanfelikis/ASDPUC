import sistemaacademico.Matricula
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_sistemaAcademico_matriculashow_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/matricula/show.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(2)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("layout"),'content':("main")],-1)
printHtmlPart(2)
invokeTag('set','g',7,['var':("entityName"),'value':(message(code: 'matricula.label', default: 'Matricula'))],-1)
printHtmlPart(2)
createTagBody(2, {->
createTagBody(3, {->
invokeTag('message','g',8,['code':("default.show.label"),'args':([entityName])],-1)
})
invokeTag('captureTitle','sitemesh',8,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',8,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',9,[:],1)
printHtmlPart(3)
createTagBody(1, {->
printHtmlPart(4)
invokeTag('message','g',11,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(5)
expressionOut.print(createLink(uri: '/areaRestrita'))
printHtmlPart(6)
invokeTag('message','g',14,['code':("default.home.label")],-1)
printHtmlPart(7)
createTagBody(2, {->
invokeTag('message','g',15,['code':("default.list.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("list"),'action':("index")],2)
printHtmlPart(8)
createTagBody(2, {->
invokeTag('message','g',16,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',16,['class':("create"),'action':("create")],2)
printHtmlPart(9)
invokeTag('message','g',20,['code':("default.show.label"),'args':([entityName])],-1)
printHtmlPart(10)
if(true && (flash.message)) {
printHtmlPart(11)
expressionOut.print(flash.message)
printHtmlPart(12)
}
printHtmlPart(13)
if(true && (matriculaInstance?.cpf)) {
printHtmlPart(14)
invokeTag('message','g',28,['code':("matricula.cpf.label"),'default':("CPF")],-1)
printHtmlPart(15)
invokeTag('formatCpf','g',30,['format':("999.999.999-99"),'cpf':(fieldValue(bean: matriculaInstance, field: "cpf"))],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (matriculaInstance?.curso)) {
printHtmlPart(18)
invokeTag('message','g',37,['code':("matricula.curso.label"),'default':("Curso")],-1)
printHtmlPart(19)
invokeTag('fieldValue','g',39,['bean':(matriculaInstance),'field':("curso")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (matriculaInstance?.periodo)) {
printHtmlPart(20)
invokeTag('message','g',46,['code':("matricula.periodo.label"),'default':("Periodo")],-1)
printHtmlPart(21)
invokeTag('fieldValue','g',48,['bean':(matriculaInstance),'field':("periodo")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (matriculaInstance?.unidade)) {
printHtmlPart(22)
invokeTag('message','g',55,['code':("matricula.unidade.label"),'default':("Unidade")],-1)
printHtmlPart(23)
invokeTag('fieldValue','g',57,['bean':(matriculaInstance),'field':("unidade")],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (matriculaInstance?.data)) {
printHtmlPart(24)
invokeTag('message','g',64,['code':("matricula.data.label"),'default':("Data")],-1)
printHtmlPart(25)
invokeTag('formatDate','g',66,['format':("dd/MM/yyyy"),'date':(matriculaInstance.data)],-1)
printHtmlPart(16)
}
printHtmlPart(17)
if(true && (matriculaInstance?.desconto)) {
printHtmlPart(26)
invokeTag('message','g',73,['code':("matricula.desconto.label"),'default':("Desconto")],-1)
printHtmlPart(27)
invokeTag('fieldValue','g',75,['bean':(matriculaInstance),'field':("desconto")],-1)
printHtmlPart(28)
}
printHtmlPart(17)
if(true && (matriculaInstance?.status)) {
printHtmlPart(29)
invokeTag('message','g',82,['code':("matricula.status.label"),'default':("Status")],-1)
printHtmlPart(30)
invokeTag('fieldValue','g',84,['bean':(matriculaInstance),'field':("status")],-1)
printHtmlPart(16)
}
printHtmlPart(31)
createTagBody(2, {->
printHtmlPart(32)
createTagBody(3, {->
invokeTag('message','g',92,['code':("default.button.edit.label"),'default':("Edit")],-1)
})
invokeTag('link','g',92,['class':("edit"),'action':("edit"),'resource':(matriculaInstance)],3)
printHtmlPart(33)
invokeTag('actionSubmit','g',93,['class':("delete"),'action':("delete"),'value':(message(code: 'default.button.delete.label', default: 'Delete')),'onclick':("return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');")],-1)
printHtmlPart(34)
})
invokeTag('form','g',95,['url':([resource:matriculaInstance, action:'delete']),'method':("DELETE")],2)
printHtmlPart(35)
})
invokeTag('captureBody','sitemesh',97,[:],1)
printHtmlPart(36)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1505579903603L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
