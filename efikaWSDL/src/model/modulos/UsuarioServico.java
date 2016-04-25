package model.modulos;


import webservices.EfikaUsersProxy;
import webservices.Usuario;

public class UsuarioServico {
	
	private EfikaUsersProxy efika;
	
	public UsuarioServico() {
		this.efika = new EfikaUsersProxy();
	}
	
	
	public Usuario autenticaLogin(String login, String senha) throws Exception {

			Usuario usuario = this.efika.consultarUsuario(login);
			
			if (usuario == null) {
				throw new Exception("Usu�rio n�o possui acesso.");
			}
			
			Boolean auth = efika.autenticarUsuario(login, senha);
			if (!auth) {
				throw new Exception("Usu�rio e/ou senha incorreto(s), para recuperar a sua senha utilize a op��o \"Esqueci minha senha\" na pagina http://efika/web/");
			}
			
			
			return usuario;
	}


}
