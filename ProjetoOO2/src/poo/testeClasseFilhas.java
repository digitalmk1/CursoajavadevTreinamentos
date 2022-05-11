package poo;

public class testeClasseFilhas {

	public static void main(String[] args) {
		
	
		
	Aluno aluno = new Aluno();
	aluno.setNome("Marcio Silva de Oliveira");
	aluno.setIdade(20);
	
	Diretor diretor = new Diretor();
	diretor.setNome("MICKAEL FLORENTINO");
	diretor.setNumCPF("005698565");
	diretor.setIdade(18);
	
	Secretario secretario = new Secretario();
	secretario.setExperiencia("Administração");
	secretario.setNumCPF("0956958598");
	secretario.setIdade(50);
	
		System.out.println(aluno.pessoaMaiorIdade() + "-" + aluno.msgMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade()+ "-" + aluno.msgMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade()+ "-" + aluno.msgMaiorIdade());
		System.out.println(secretario.salario());
		System.out.println(aluno.salario());
		
		
		teste(aluno);
		teste(diretor);
		teste(secretario);

	}
	public static void teste (Pessoa pessoa) {
		System.out.println("Essa pessoa é demais = " + pessoa.getNome()
		 +  " e o salario é de =  " + pessoa.salario() );
		
	}

}
