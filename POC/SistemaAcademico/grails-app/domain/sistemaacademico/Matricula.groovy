package sistemaacademico

class Matricula {
	String cpf
	String curso
	String periodo
	String unidade
	Date data
	int desconto
	String status
	
    static constraints = {
		cpf unique: true
		cpf(cpf:true)
		curso inList: ['Sistemas de Informacao', 'Ciencias da Computacao', 'Engenharia da Computacao', 'Tecnologia de banco de dados', 'Tecnologia de sistemas Web'] 
		periodo inList: ['Manha', 'Tarde', 'Noite'] 
		unidade inList: ['Maua', 'Santo Andre', 'Sao Caetano do Sul', 'Sao Bernado do Campo', 'Diadema']
		data nullable: false
		desconto nullable: false, maxSize: 70
		status inList: ['Cursando', 'Trancado', 'Encerrado', 'Cancelado']
    }
	
	static mapping ={
		table 'Matricula'
		cpf column: 'cpf'
		curso column: 'curso'
		periodo column: 'periodo'
		unidade column: 'unidade'
		data column: 'data'
		desconto column: 'desconto'
		status column: 'status'
	}
}
