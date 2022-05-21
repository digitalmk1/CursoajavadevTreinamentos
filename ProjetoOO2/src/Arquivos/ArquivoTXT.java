package Arquivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ArquivoTXT {

	public static void main(String[] args) throws IOException {
      
       Pessoa pessoa1 = new Pessoa();
       pessoa1.setNome("MARCIO SILVA DE OLIVEIRA");
       pessoa1.setEmail("marcio@digitalmk.com.br");
       pessoa1.setIdade(Integer.valueOf(42));
       
       Pessoa pessoa2 = new Pessoa();
       pessoa2.setNome("VALQUIRIA FLORENTINO");
       pessoa2.setEmail("marcio@digitalmk.com.br");
       pessoa2.setIdade(Integer.valueOf(42));
       
       Pessoa pessoa3 = new Pessoa();
       pessoa3.setNome("MICKAEL MARCIO");
       pessoa3.setEmail("marcio@digitalmk.com.br");
       pessoa3.setIdade(Integer.valueOf(42));
   
		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		
		
		// configurando o caminho do arquivo
	File arquivo = new File("C:\\Users\\Suporte_DigitalMK\\git\\CursoajavadevTreinamentos\\ProjetoOO2\\arquivo.csv");

	
	 if(!arquivo.exists()) {
		 //se o arquivo não existir  arquivo.createNewFile cria o arquivo
		 
		 arquivo.createNewFile();
	 }
	 
	 
	 FileWriter escrever_no_arquvivo = new FileWriter(arquivo);
	 
	 
		
	 for (Pessoa p: pessoas) {
		
		 escrever_no_arquvivo.write(p.getNome() +";" + p.getEmail() +";"+ p.getIdade() + "\n");
	}
	 escrever_no_arquvivo.flush();
	 escrever_no_arquvivo.close();
	}

}
