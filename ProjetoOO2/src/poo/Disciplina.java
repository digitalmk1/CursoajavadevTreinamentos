package poo;
/*Cada  disciplina vai ter quatro notas durante o ano inteiro */
public class Disciplina {

	private double[] nota = new double[4];
	private String disciplina;
	

	

	public double[] getNota() {
		return nota;
	}

	public void setNota(double[] nota) {
		this.nota = nota;
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public double getMediaNota() {
		double somaTotal = 0.0;
		
		for(int pos =0; pos<nota.length; pos++) {
			
			somaTotal += nota[pos];
		}
		return somaTotal/ 4;
	}
	@Override
	public String toString() {
		return "Disciplina [nota=" + nota + ", disciplina=" + disciplina + "]";
	}

}
