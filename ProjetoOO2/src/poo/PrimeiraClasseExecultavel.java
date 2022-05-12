package poo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import ClassesAuxiliares.FuncaoAutenticacao;
import br.projeto.constantes.StatusAluno;
import cursoJavaInterfaces.permitirAcesso;

public class PrimeiraClasseExecultavel {

	public static void main(String[] args) {
		String login = JOptionPane.showInputDialog("Informe o Login:");
		String senha = JOptionPane.showInputDialog("Informe a Senha:");
		//Secretario secretario = new Secretario();
		//permitirAcesso secretario = new Secretario();
		/*Nesse modelo de permitirAcesso com referencia a interface nesse modelo 
		 * não conseguimos trabalhar aqui com o s setLogin e senhq 
		 * 
		secretario.setLogin(login);
		secretario.setSenha(senha);
		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("1")) */
		
	
	//	FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
		
	//	permitirAcesso permitirAcesso = new Secretario();
		
		//if(autenticacao.autenticarCursoJava( permitirAcesso)) {
		
		    
		  /*if( new Secretario().autenticar(login ,senha)){ //vaLidação fica por conta do autenticar
			   //trabalhando diretamente o autenticar no objeto
			   // instanciar o objeto dentro do if new secretario() para diminuir o codigo
			    * 
			    */

			List<Aluno> alunos = new ArrayList<Aluno>();
			HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
			List<Disciplina> disciplinas = new ArrayList<Disciplina>();

			// HashMap substitui os lists abaixo comentados

			// List<Aluno> alunosAprovados = new ArrayList<Aluno>();
			// List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
			// List<Aluno> alunosReprovados = new ArrayList<Aluno>();

			for (int qtd = 1; qtd <= 1; qtd++) {

				String nome = JOptionPane.showInputDialog(null, "Informe o nome do Aluno?");
				String dataNascimento = JOptionPane.showInputDialog(null, "Ano de nascimento?: ");
				String anoAtual = JOptionPane.showInputDialog(null, "Informe ano atual?: ");
				String escola = JOptionPane.showInputDialog(null, "Informe o nome da escola? ");
				String numCPF = JOptionPane.showInputDialog(" Informe o CPF do aluno ");

				Aluno aluno1 = new Aluno();
				aluno1.setNome(nome);
				aluno1.setAnoAtual(Integer.parseInt(anoAtual));
				aluno1.setDataNascimento(Integer.parseInt(dataNascimento));
				aluno1.setNomeEscola(escola);
				aluno1.setNumCPF(numCPF);

				for (int pos = 1; pos <= 4; pos++) {

					String nomeDisciplina = JOptionPane.showInputDialog("Informe a diciplina " + pos + " ? ");
					String nota = JOptionPane.showInputDialog("Informe a Nota" + pos + " ? ");

					Disciplina disciplina = new Disciplina();
					disciplina.setDisciplina(nomeDisciplina);
				//	disciplina.set(Double.parseDouble(nota));

					aluno1.getDisciplinas().add(disciplina);

				}

				int escolha = JOptionPane.showConfirmDialog(null, "Deseja remover alguma disciplina ?");

				if (escolha == 0) {
					int continuarRemover = 0;
					int posicao = 1;
					while (continuarRemover == 0) {
						String disciplinaRemover = JOptionPane.showInputDialog("Qual a Disciplina 1,2,3 ou 4 ?");
						aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() - posicao);
						posicao++;
						continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar Remover? ");
					}

				}
				alunos.add(aluno1);
			}

			maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
			maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
			maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());

			for (Aluno aluno : alunos) {

				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {

					maps.get(StatusAluno.APROVADO).add(aluno);

				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);

				} else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);

				}

			}

			for (int dis = 0; dis < disciplinas.size(); dis++) {
				System.out.println("disciplina " + dis + disciplinas);
			}

			System.out.println("=========================Lista de Aprovados =============================");

			for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {

				System.out.println("APROVADOS =  " + aluno.getAlunoAprovado2() + "Aluno =  " + aluno.getNome()
						+ " MEDIA =  " + aluno.getMediaNota());
				System.out.println("Idade : " + aluno.getIdadeAluno());
				System.out.println("CPF : " + aluno.getNumCPF());
				System.out.println("Escola : " + aluno.getNomeEscola());
				System.out.println("Disciplinas : " + aluno.getDisciplinas());

			}
			System.out.println("==================Lista de Alunos em Recuperação =============================");

			for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {

				System.out.println("Resultado = " + aluno.getAlunoAprovado2() + "Aluno = " + aluno.getNome());
				System.out.println(" Media = " + aluno.getMediaNota());
				System.out.println(" Idade = " + aluno.getIdadeAluno());
			}

			System.out.println("================== Lista de Alunos em Reprovado =============================");

			for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {

				System.out.println("Reprovados = " + aluno.getAlunoAprovado2() + " Aluno " + aluno.getNome());
				System.out.println(" Media = " + aluno.getMediaNota());
				System.out.println(" Idade = " + aluno.getIdadeAluno());

			}
		}
		  /* else {
			   
			   JOptionPane.showConfirmDialog(null, "Atenção!! Acesso não permitido");
		   }  
		   */    
	
}
