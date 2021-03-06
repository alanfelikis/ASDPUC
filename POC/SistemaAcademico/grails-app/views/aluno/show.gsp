
<%@ page import="sistemaacademico.Aluno" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'aluno.label', default: 'Aluno')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-aluno" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/areaRestrita')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-aluno" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list aluno">
			
				<g:if test="${alunoInstance?.nome}">
				<li class="fieldcontain">
					<span id="nome-label" class="property-label"><g:message code="aluno.nome.label" default="Nome" /></span>
					
						<span class="property-value" aria-labelledby="nome-label"><g:fieldValue bean="${alunoInstance}" field="nome"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${alunoInstance?.nascimento}">
				<li class="fieldcontain">
					<span id="nascimento-label" class="property-label"><g:message code="aluno.nascimento.label" default="Nascimento" /></span>
					
						<span class="property-value" aria-labelledby="nascimento-label"><g:formatDate format="dd/MM/yyyy" date="${alunoInstance.nascimento}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${alunoInstance?.sexo}">
				<li class="fieldcontain">
					<span id="sexo-label" class="property-label"><g:message code="aluno.sexo.label" default="Sexo" /></span>
					
						<span class="property-value" aria-labelledby="sexo-label"><g:fieldValue bean="${alunoInstance}" field="sexo"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${alunoInstance?.cpf}">
				<li class="fieldcontain">
					<span id="cpf-label" class="property-label"><g:message code="aluno.cpf.label" default="CPF" /></span>
					
						<span class="property-value" aria-labelledby="cpf-label"><g:formatCpf format="999.999.999-99" cpf="${fieldValue(bean: alunoInstance, field: "cpf")}" /></span>
					
				</li>
				</g:if>
			
				<g:if test="${alunoInstance?.telefone}">
				<li class="fieldcontain">
					<span id="telefone-label" class="property-label"><g:message code="aluno.telefone.label" default="Telefone" /></span>
					
						<span class="property-value" aria-labelledby="telefone-label"><g:fieldValue bean="${alunoInstance}" field="telefone"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${alunoInstance?.celular}">
				<li class="fieldcontain">
					<span id="celular-label" class="property-label"><g:message code="aluno.celular.label" default="Celular" /></span>
					
						<span class="property-value" aria-labelledby="celular-label"><g:fieldValue bean="${alunoInstance}" field="celular"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${alunoInstance?.mail}">
				<li class="fieldcontain">
					<span id="mail-label" class="property-label"><g:message code="aluno.mail.label" default="E-mail" /></span>
					
						<span class="property-value" aria-labelledby="mail-label"><g:fieldValue bean="${alunoInstance}" field="mail"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${alunoInstance?.escolaridade}">
				<li class="fieldcontain">
					<span id="escolaridade-label" class="property-label"><g:message code="aluno.escolaridade.label" default="Escolaridade" /></span>
					
						<span class="property-value" aria-labelledby="escolaridade-label"><g:fieldValue bean="${alunoInstance}" field="escolaridade"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:alunoInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${alunoInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
