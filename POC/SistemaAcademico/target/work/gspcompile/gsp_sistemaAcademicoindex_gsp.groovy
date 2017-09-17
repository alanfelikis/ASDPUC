import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_sistemaAcademicoindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/index.gsp" }
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
if(true && ((c.name == 'AreaRestrita'))) {
printHtmlPart(8)
createClosureForHtmlPart(9, 4)
invokeTag('link','g',90,['controller':(c.logicalPropertyName)],4)
printHtmlPart(10)
}
printHtmlPart(11)
}
printHtmlPart(12)
invokeTag('image','asset',98,['src':("green.jpg"),'alt':("Grails")],-1)
printHtmlPart(13)
for( c in (grailsApplication.controllerClasses.sort { it.name }) ) {
printHtmlPart(14)
if(true && ((c.name == 'Login'))) {
printHtmlPart(15)
createTagBody(4, {->
expressionOut.print(c.name)
})
invokeTag('link','g',106,['controller':(c.logicalPropertyName)],4)
printHtmlPart(16)
}
printHtmlPart(7)
}
printHtmlPart(17)
})
invokeTag('captureBody','sitemesh',112,[:],1)
printHtmlPart(18)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1504996972010L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}

@org.codehaus.groovy.grails.web.transform.LineNumber(
	lines = [1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 82, 82, 83, 84, 84, 84, 84, 88, 89, 89, 89, 90, 90, 90, 91, 92, 92, 92, 98, 98, 104, 105, 105, 105, 106, 106, 106, 106, 106, 107, 108, 108, 108, 112, 112, 112, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1],
	sourceName = "index.gsp"
)
class ___LineNumberPlaceholder { }
