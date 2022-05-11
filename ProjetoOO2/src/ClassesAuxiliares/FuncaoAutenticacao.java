package ClassesAuxiliares;

import cursoJavaInterfaces.permitirAcesso;

public class FuncaoAutenticacao {
	
	private permitirAcesso permitirAcesso;
	
public boolean autenticarCursoJava(permitirAcesso acesso) {
	
	return acesso.autenticar();
}
public FuncaoAutenticacao(permitirAcesso acesso) {
	
	this.permitirAcesso = acesso;
	
 }
}
