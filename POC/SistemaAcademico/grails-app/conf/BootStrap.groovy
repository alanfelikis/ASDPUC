import comum.Permissao;
import comum.Usuario;
import comum.UsuarioPermissao;

class BootStrap {

    def init = { servletContext ->
		
		Permissao admin = Permissao.findByAuthority("ROLE_ADMIN")
		if (admin == null){
			admin = new Permissao(authority: "ROLE_ADMIN").save(flush:true)
		}
		Permissao func = Permissao.findByAuthority("ROLE_FUNCIONARIO")
		if (func == null){
			func = new Permissao(authority: "ROLE_FUNCIONARIO").save(flush:true)
		}
		
		Usuario administrador = Usuario.findByUsername("administrador")
		if (administrador == null){
			administrador = new Usuario(username: "administrador", password: "123", 
				enabled: true, accountExpired: false, accountLocked: false, 
				passwordExpired: false).save(flush:true)
		}
		Usuario funcionario = Usuario.findByUsername("funcionario")
		if (funcionario == null){
			funcionario = new Usuario(username: "funcionario", password: "123",
				enabled: true, accountExpired: false, accountLocked: false,
				passwordExpired: false).save(flush:true)
		}
		
		if (UsuarioPermissao.findByUsuarioAndPermissao(administrador,admin) == null)
		{
			new UsuarioPermissao(usuario: administrador, permissao: admin).save(flush:true)
		}
		if (UsuarioPermissao.findByUsuarioAndPermissao(funcionario,func) == null)
		{
			new UsuarioPermissao(usuario: funcionario, permissao: func).save(flush:true)
		}
		
    }
	
    def destroy = {
    }
}
