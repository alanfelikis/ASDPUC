
<%@ page import="sistemaacademico.Matricula" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'matricula.label', default: 'Matricula')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-matricula" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/areaRestrita')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-matricula" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list matricula">
			
				<g:if test="${matriculaInstance?.cpf}">
				<li class="fieldcontain">
					<span id="cpf-label" class="property-label"><g:message code="matricula.cpf.label" default="CPF" /></span>
					
						<span class="property-value" aria-labelledby="cpf-label"><g:formatCpf format="999.999.999-99" cpf="${fieldValue(bean: matriculaInstance, field: "cpf")}"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${matriculaInstance?.curso}">
				<li class="fieldcontain">
					<span id="curso-label" class="property-label"><g:message code="matricula.curso.label" default="Curso" /></span>
					
						<span class="property-value" aria-labelledby="curso-label"><g:fieldValue bean="${matriculaInstance}" field="curso"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${matriculaInstance?.periodo}">
				<li class="fieldcontain">
					<span id="periodo-label" class="property-label"><g:message code="matricula.periodo.label" default="Periodo" /></span>
					
						<span class="property-value" aria-labelledby="periodo-label"><g:fieldValue bean="${matriculaInstance}" field="periodo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${matriculaInstance?.unidade}">
				<li class="fieldcontain">
					<span id="unidade-label" class="property-label"><g:message code="matricula.unidade.label" default="Unidade" /></span>
					
						<span class="property-value" aria-labelledby="unidade-label"><g:fieldValue bean="${matriculaInstance}" field="unidade"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${matriculaInstance?.data}">
				<li class="fieldcontain">
					<span id="data-label" class="property-label"><g:message code="matricula.data.label" default="Data" /></span>
					
						<span class="property-value" aria-labelledby="data-label"><g:formatDate format="dd/MM/yyyy" date="${matriculaInstance.data}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${matriculaInstance?.desconto}">
				<li class="fieldcontain">
					<span id="desconto-label" class="property-label"><g:message code="matricula.desconto.label" default="Desconto" /></span>
					
						<span class="property-value" aria-labelledby="desconto-label"><g:fieldValue bean="${matriculaInstance}" field="desconto"/>%</span>
					
				</li>
				</g:if>
			
				<g:if test="${matriculaInstance?.status}">
				<li class="fieldcontain">
					<span id="status-label" class="property-label"><g:message code="matricula.status.label" default="Status" /></span>
					
						<span class="property-value" aria-labelledby="status-label"><g:fieldValue bean="${matriculaInstance}" field="status"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:matriculaInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${matriculaInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
