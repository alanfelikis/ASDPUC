package sistemaacademico

import org.codehaus.groovy.grails.validation.MaxSizeConstraint;

class Aluno {
	String nome
	Date nascimento
	String sexo
	String cpf
	String telefone
	String celular
	String mail
	String escolaridade
	

	static constraints = {
		nome nullable: false, maxLength: 50
		nascimento nullable: false
		sexo inList:["Masculino", "Feminino"]
		cpf(cpf:true)
		cpf unique: true, maxLength:14
		telefone nullable: false, maxLength: 14
		celular nullable: false, maxLength: 15
		mail email: true
		escolaridade inList:["Ensino Medio", "Graduacao", "Pos Graduacao"]
	}
	static mapping ={
		table 'Aluno'
		nome column: 'nome'
		nascimento column: 'nascimento'
		sexo column: 'sexo'
		cpf column: 'cpf'
		telefone column: 'telefone'
		celular column: 'celular'
		mail column: 'email'
		escolaridade column: 'escolaridade'
	}
	
}
