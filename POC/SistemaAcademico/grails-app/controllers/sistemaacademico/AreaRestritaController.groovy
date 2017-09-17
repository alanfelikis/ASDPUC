package sistemaacademico

class AreaRestritaController {

	def logar(){
		render(view: "login/index")
	}
	
	def index(){
		render(view: "/areaRestrita/index")
	}
}
