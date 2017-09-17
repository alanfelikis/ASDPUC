<%@ page import="sistemaacademico.Aluno" %>



<div class="fieldcontain ${hasErrors(bean: alunoInstance, field: 'nome', 'error')} required">
	<label for="nome">
		<g:message code="aluno.nome.label" default="Nome" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="nome" required="" value="${alunoInstance?.nome}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: alunoInstance, field: 'nascimento', 'error')} required">
	<label for="nascimento">
		<g:message code="aluno.nascimento.label" default="Nascimento" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="nascimento" precision="day"  value="${alunoInstance?.nascimento}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: alunoInstance, field: 'sexo', 'error')} required">
	<label for="sexo">
		<g:message code="aluno.sexo.label" default="Sexo" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="sexo" from="${alunoInstance.constraints.sexo.inList}" required="" value="${alunoInstance?.sexo}" valueMessagePrefix="aluno.sexo"/>

</div>

<div class="fieldcontain ${hasErrors(bean: alunoInstance, field: 'cpf', 'error')} required">
	<label for="cpf">
		<g:message code="aluno.cpf.label" default="CPF" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="cpf" required="" value="${alunoInstance?.cpf}"/>
	<span style="font-size: 12px;font-weight: bold;">999.999.999-99</span>
</div>

<div class="fieldcontain ${hasErrors(bean: alunoInstance, field: 'telefone', 'error')} required">
	<label for="telefone">
		<g:message code="aluno.telefone.label" default="Telefone" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="telefone" required="" value="${alunoInstance?.telefone}"/>
<span style="font-size: 12px;font-weight: bold;">(99) 9999-9999</span>
</div>

<div class="fieldcontain ${hasErrors(bean: alunoInstance, field: 'celular', 'error')} required">
	<label for="celular">
		<g:message code="aluno.celular.label" default="Celular" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="celular" required="" value="${alunoInstance?.celular}"/>
	<span style="font-size: 12px;font-weight: bold;">(99) 99999-9999</span>
</div>

<div class="fieldcontain ${hasErrors(bean: alunoInstance, field: 'mail', 'error')} required">
	<label for="mail">
		<g:message code="aluno.mail.label" default="E-mail" />
		<span class="required-indicator">*</span>
	</label>
	<g:field type="email" name="mail" required="" value="${alunoInstance?.mail}"/>
	<span style="font-size: 12px;font-weight: bold;">jsilva@ucs.edu.br</span>
</div>

<div class="fieldcontain ${hasErrors(bean: alunoInstance, field: 'escolaridade', 'error')} required">
	<label for="escolaridade">
		<g:message code="aluno.escolaridade.label" default="Escolaridade" />
		<span class="required-indicator">*</span>
	</label>
	<g:select name="escolaridade" from="${alunoInstance.constraints.escolaridade.inList}" required="" value="${alunoInstance?.escolaridade}" valueMessagePrefix="aluno.escolaridade"/>

</div>

