<%@ page import="sistemaacademico.Matricula" %>



<div class="fieldcontain ${hasErrors(bean: matriculaInstance, field: 'cpf', 'error')} required">
	<label for="cpf">
		<g:message code="matricula.cpf.label" default="CPF" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cpf" required="" value="${matriculaInstance?.cpf}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: matriculaInstance, field: 'curso', 'error')} required">
	<label for="curso">
		<g:message code="matricula.curso.label" default="Curso" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="curso" from="${matriculaInstance.constraints.curso.inList}" required="" value="${matriculaInstance?.curso}" valueMessagePrefix="matricula.curso"/>

</div>

<div class="fieldcontain ${hasErrors(bean: matriculaInstance, field: 'periodo', 'error')} required">
	<label for="periodo">
		<g:message code="matricula.periodo.label" default="Periodo" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="periodo" from="${matriculaInstance.constraints.periodo.inList}" required="" value="${matriculaInstance?.periodo}" valueMessagePrefix="matricula.periodo"/>

</div>

<div class="fieldcontain ${hasErrors(bean: matriculaInstance, field: 'unidade', 'error')} required">
	<label for="unidade">
		<g:message code="matricula.unidade.label" default="Unidade" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="unidade" from="${matriculaInstance.constraints.unidade.inList}" required="" value="${matriculaInstance?.unidade}" valueMessagePrefix="matricula.unidade"/>

</div>

<div class="fieldcontain ${hasErrors(bean: matriculaInstance, field: 'data', 'error')} required">
	<label for="data">
		<g:message code="matricula.data.label" default="Data" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="data" precision="day"  value="${matriculaInstance?.data}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: matriculaInstance, field: 'desconto', 'error')} required">
	<label for="desconto">
		<g:message code="matricula.desconto.label" default="Desconto" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="desconto" type="number" value="${matriculaInstance.desconto}" required=""/>
	<span>%</span>
</div>

<div class="fieldcontain ${hasErrors(bean: matriculaInstance, field: 'status', 'error')} required">
	<label for="status">
		<g:message code="matricula.status.label" default="Status" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="status" from="${matriculaInstance.constraints.status.inList}" required="" value="${matriculaInstance?.status}" valueMessagePrefix="matricula.status"/>
	
</div>

