package poo;

import javax.swing.JOptionPane;

public class ArrayVertor {

	public static void main(String[] args) {
		double[] nota = { 7.1, 9.1, 7.6, 6.8 };
		double[] notasLogica = { 7.1, 5.7, 9.6, 7.8 };

		Aluno aluno = new Aluno();
		aluno.setNome("Márcio Silva de Oliveira");
		aluno.setNomeEscola("DIGITAL MK TREINAMENTOS");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("JAVA WEB");
		disciplina.setNota(nota);

		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Banco de dados ");
		disciplina2.setNota(notasLogica);

		aluno.getDisciplinas().add(disciplina2);
		
		System.out.println("Aluno = " + aluno.getNome() + " Inscrito no curso : " + aluno.getNomeEscola());
		System.out.println("Media notas do aluno :  " + aluno.getMediaNota());
		System.out.println("----------------DISCIPLINA ALUNO--------------");
        
		
		for (Disciplina d : aluno.getDisciplinas()) {

			System.out.println("Disciplina : " + d.getDisciplina());
			System.out.println("--------NOTAS DA DISCIPLINA---------");
			
			double maxNota = 0.0;
			for (int pos = 0; pos < d.getNota().length; pos++) {
				System.out.println("Nota " + pos + " é igual = " + d.getNota()[pos]);
			
               if(pos == 0) {
            	   
            	   maxNota = d.getNota()[pos];
            	   
               } else {
            	   
            	   if(d.getNota()[pos] > maxNota) {
            		   
            		   maxNota = d.getNota()[pos];
            	   }
               }
			}
			   System.out.println("A maior nota é " + d.getNota() + "e de valor ");
		}
	}
}
