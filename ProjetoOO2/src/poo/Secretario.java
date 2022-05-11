package poo;


import cursoJavaInterfaces.permitirAcesso;

public class Secretario  extends Pessoa implements permitirAcesso {
	
	private String registro;
	private String nivelCargo;
	private String experiencia;
	private String login;
	private String senha;
	

	

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getRegistro() {
		return registro;
	}
	public void setRegistro(String registro) {
		this.registro = registro;
	}
	public String getNivelCargo() {
		return nivelCargo;
	}
	public void setNivelCargo(String nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	public String getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(String experiencia) {
		this.experiencia = experiencia;
	}
	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1800.80 * 0.9;
	}
	@Override
	public boolean autenticar(String login, String senha) {
		
		this.login = login;
		this.senha = senha;
		//return login.equals("admin") && senha.equals("admin");
		return autenticar();
	}
	@Override
	public boolean autenticar() {
		
		return login.equals("admin") && senha.equals("admin");
	}
	
	
	
	

}
