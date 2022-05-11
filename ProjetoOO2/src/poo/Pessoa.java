package poo;

public abstract class Pessoa {
	
	
	
protected String nome;
protected int idade;
protected String numRg;
protected String numCPF;
protected String nomePai;
protected String nomeMae;

/*METODO ABSTRATO É OBRIGATORIO PARA AS CLASSES FILHAS*/
public abstract double salario();
public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}
public int getIdade() {
	return idade;
}
public void setIdade(int idade) {
	this.idade = idade;
}
public String getNumRg() {
	return numRg;
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
public String getNomePai() {
	return nomePai;
}
public void setNomePai(String nomePai) {
	this.nomePai = nomePai;
}
public String getNomeMae() {
	return nomeMae;
}
public void setNomeMae(String nomeMae) {
	this.nomeMae = nomeMae;
}

 public boolean pessoaMaiorIdade() {
	 
	 return idade >=18;
 }

}
