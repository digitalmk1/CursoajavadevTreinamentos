package poo;

import java.util.ArrayList;
import java.util.List;

import br.projeto.constantes.StatusAluno;

public class Aluno extends Pessoa{
	
	//private String nome;
	private int anoAtual;
	private int dataNascimento;
	private String nomeEscola;
	private String serieMatriculado;
	private String dataMatricula;

    
  private List<Disciplina>disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
    
    public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
    
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public String getDataMatriculula() {
		return dataMatricula;
	}

	public void setDataMatriculula(String dataMatriculula) {
		this.dataMatricula = dataMatriculula;
	}

	public String getNumRg() {
		return numRg;
	}
	public int getAnoAtual() {
		return anoAtual;
	}
	public void setAnoAtual(int anoAtual) {
		this.anoAtual = anoAtual;
	}
	public void setDataNascimento(int dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public void setNumRg(String numRg) {
		this.numRg = numRg;
	}
	public String getNumCPF() {
		return numCPF;
	}
	public void setNumCPF(String numCPF) {
		this.numCPF = numCPF;
	}
	public String getNomeEscola() {
		return nomeEscola;
	}
	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}
	
	public int setIdadeAtual()
	{
		
		return (anoAtual - dataNascimento);
	}
	
	public int  getIdadeAluno() {
		
		int idade = this.setIdadeAtual();
		
		return idade;
		
		
	}
	
	public double getMediaNota() {
 		double somaNotas = 0.0;
		
		for(Disciplina disciplina : disciplinas) {
		    somaNotas += disciplina.getNota();
	
		}
		return somaNotas /disciplinas.size();
		
	}
    public boolean getAlunoAprovado() {
    	
    	double media = this.getMediaNota();
    	
    	if(media >= 70) {
    		return true;
    		
    	}else {
    		return false;
    	}
 }
    
    public String getAlunoAprovado2(){
    	
    	double media = this.getMediaNota();
    	if(media >=60) {
    		if(media >=70) {
    			
    			return StatusAluno.APROVADO;
    		} else {
    			 return StatusAluno.RECUPERACAO;
    		}
    		
    	}
    	else {
    		 return StatusAluno.REPROVADO;
    	}
    	
    }
     
    @Override
    public boolean pessoaMaiorIdade() {
    	
    	return idade >=21;
    }
    
    public String msgMaiorIdade() {
    	
    	return this.pessoaMaiorIdade() ? "Obaa Maior de Idade" : "Não é maior de idade";
    }
    
	@Override
	public String toString() {
		return "Aluno [anoAtual=" + anoAtual + ", dataNascimento=" + dataNascimento + ", nomeEscola=" + nomeEscola
				+ ", serieMatriculado=" + serieMatriculado + ", dataMatricula=" + dataMatricula + ", disciplinas="
				+ disciplinas + "]";
	}

	@Override
	public double salario() {
		// TODO Auto-generated method stub
		return 1300;
	}
	

	
	
}
