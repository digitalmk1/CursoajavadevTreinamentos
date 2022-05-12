package poo;

public class ExercicioMaiorNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] nota = { 5.5, 6.8, 7.1, 9.9 };
		double[] notasMais = { 8.1, 6.5, 7.8, 8.9 };

		Aluno aluno = new Aluno();

		aluno.setNome("MÁRCIO SILVA DE OLIVEIRA");
		aluno.setNomeEscola("DIGITAL MK TREINAMENTOS");

		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("JAVA WEB");
		disciplina.setNota(nota);
		aluno.getDisciplinas().add(disciplina);

		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("BANCO DE DADOS");
		disciplina2.setNota(notasMais);
		aluno.getDisciplinas().add(disciplina2);

		System.out.println("Aluno : " + aluno.getNome());
		System.out.println("Curso : " + aluno.getNomeEscola());
		System.out.println("===================================");

		for (Disciplina d : aluno.getDisciplinas()) {

			System.out.println("DISCIPLINA " + d.getDisciplina());
              double MaiorValor = 0.0;
			for (int pos = 0; pos < d.getNota().length; pos++) {
				
				System.out.println("Notas : " + d.getNota()[pos]);
				
				if(pos == 0) {
					
					MaiorValor = d.getNota()[pos];
					
					
				} else {
					
					if(d.getNota()[pos] < MaiorValor){
						MaiorValor = d.getNota()[pos];
						
					}
				}

			}
			System.out.println(" A maior nota é : " + MaiorValor);
		}

	}
}
