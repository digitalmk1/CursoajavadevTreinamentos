package EscrevendoEmArquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Aula1_TXT {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Marcio Silva de Oliveira");
		pessoa1.setIdade(42);
		pessoa1.setEmail("marcio@digitalmk.com.br");
		
		Pessoa pessoa2 = new Pessoa();
		pessoa2.setNome("Mickael Marcio Florentino Oliveira");
		pessoa2.setIdade(14);
		pessoa2.setEmail("mickaelmarcio@digitalmk.com.br");
		
		Pessoa pessoa3 = new Pessoa();
		pessoa3.setNome("VALQUIRIA FLORENTINO OLIVEIRA");
		pessoa3.setIdade(40);
		pessoa3.setEmail("val@digitalmk.com.br");
		
		
		List<Pessoa>pessoas = new ArrayList<Pessoa>();
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		

		File arquivo = new File("C:\\Users\\Suporte_DigitalMK\\git\\CursoajavadevTreinamentos\\ProjetoOO2\\arquivo.txt");
		
		if(!arquivo.exists()) {
			
			arquivo.createNewFile();
			
		}
		FileWriter escrever_no_arquivo = new FileWriter(arquivo);
		/*
		for(int i = 1; i<= 10; i++) {
			
			escrever_no_arquivo.write(" texto da minha linha "+i+"\n" );
		}
		*/
		for (Pessoa p : pessoas) {
			escrever_no_arquivo.write(p.getNome()+";"+" \n" + p.getIdade() 
			+" Anos" + ";" + "\n" + p.getEmail()+"\n"+"=========================="+"\n");
			
		}
		escrever_no_arquivo.flush();
		escrever_no_arquivo.close();
	}

}
