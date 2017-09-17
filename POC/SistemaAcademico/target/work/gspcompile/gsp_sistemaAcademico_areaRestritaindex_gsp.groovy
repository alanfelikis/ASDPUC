import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_sistemaAcademico_areaRestritaindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/areaRestrita/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',5,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',5,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',82,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(5)
invokeTag('message','g',84,['code':("default.link.skip.label"),'default':("Skip to content&hellip;")],-1)
printHtmlPart(6)
for( c in (grailsApplication.controllerClasses.sort { it.name }) ) {
printHtmlPart(7)
if(true && ((c.name == 'Aluno') || (c.name == 'Matricula'))) {
printHtmlPart(8)
createTagBody(4, {->
expressionOut.print(c.name)
})
invokeTag('link','g',90,['controller':(c.logicalPropertyName)],4)
printHtmlPart(9)
}
printHtmlPart(10)
}
printHtmlPart(11)
invokeTag('image','asset',98,['src':("green.jpg"),'alt':("Grails")],-1)
printHtmlPart(12)
for( c in (grailsApplication.controllerClasses.sort { it.name }) ) {
printHtmlPart(13)
if(true && ((c.name == 'Aluno') || (c.name == 'Matricula'))) {
printHtmlPart(14)
createTagBody(4, {->
expressionOut.print(c.name)
})
invokeTag('link','g',106,['controller':(c.logicalPropertyName)],4)
printHtmlPart(15)
}
printHtmlPart(7)
}
printHtmlPart(16)
})
invokeTag('captureBody','sitemesh',112,[:],1)
printHtmlPart(17)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1505575054530L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
