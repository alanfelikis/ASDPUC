import sistemaacademico.Matricula
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_sistemaAcademico_matriculaindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/matricula/index.gsp" }
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
invokeTag('message','g',8,['code':("default.list.label"),'args':([entityName])],-1)
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
invokeTag('message','g',15,['code':("default.new.label"),'args':([entityName])],-1)
})
invokeTag('link','g',15,['class':("create"),'action':("create")],2)
printHtmlPart(8)
invokeTag('message','g',19,['code':("default.list.label"),'args':([entityName])],-1)
printHtmlPart(9)
if(true && (flash.message)) {
printHtmlPart(10)
expressionOut.print(flash.message)
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('sortableColumn','g',27,['property':("cpf"),'title':(message(code: 'matricula.cpf.label', default: 'CPF'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',29,['property':("curso"),'title':(message(code: 'matricula.curso.label', default: 'Curso'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',31,['property':("periodo"),'title':(message(code: 'matricula.periodo.label', default: 'Periodo'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',33,['property':("unidade"),'title':(message(code: 'matricula.unidade.label', default: 'Unidade'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',35,['property':("data"),'title':(message(code: 'matricula.data.label', default: 'Data'))],-1)
printHtmlPart(13)
invokeTag('sortableColumn','g',37,['property':("desconto"),'title':(message(code: 'matricula.desconto.label', default: 'Desconto'))],-1)
printHtmlPart(14)
loop:{
int i = 0
for( matriculaInstance in (matriculaInstanceList) ) {
printHtmlPart(15)
expressionOut.print((i % 2) == 0 ? 'even' : 'odd')
printHtmlPart(16)
createTagBody(3, {->
invokeTag('formatCpf','g',45,['format':("999.999.999-99"),'cpf':(fieldValue(bean: matriculaInstance, field: "cpf"))],-1)
})
invokeTag('link','g',45,['action':("show"),'id':(matriculaInstance.id)],3)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: matriculaInstance, field: "curso"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: matriculaInstance, field: "periodo"))
printHtmlPart(17)
expressionOut.print(fieldValue(bean: matriculaInstance, field: "unidade"))
printHtmlPart(17)
invokeTag('formatDate','g',53,['format':("dd/MM/yyyy"),'date':(matriculaInstance.data)],-1)
printHtmlPart(17)
expressionOut.print(fieldValue(bean: matriculaInstance, field: "desconto"))
printHtmlPart(18)
i++
}
}
printHtmlPart(19)
invokeTag('paginate','g',62,['total':(matriculaInstanceCount ?: 0)],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',65,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1505579903500L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
