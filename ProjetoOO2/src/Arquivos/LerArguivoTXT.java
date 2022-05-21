package Arquivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArguivoTXT {

	public static void main(String[] args) throws FileNotFoundException {
		// Entrada de dados FileInputStream
         List<Pessoa>pessoas = new ArrayList<Pessoa>();
		FileInputStream entradaArquivo = new FileInputStream("C:\\Users\\Suporte_DigitalMK\\git\\CursoajavadevTreinamentos\\ProjetoOO2\\arquivo.csv");

		Scanner lerArquivo = new Scanner(entradaArquivo, "UTF-8"); // CODIGOFICAÇÃO

		// WHILE ENQUANTO TIVER ARQUIVOS TIVER DADOS PEGUE A STRING LINHA

		while (lerArquivo.hasNext()) {
			String linha = lerArquivo.nextLine();
		

			// PARA INGINORAR LINHAS EM BRANCO PARA NÃO IMPRIMIR

			if (linha != null && !linha.isEmpty()) {

				//System.out.println(linha);
				String[] dados = linha.split("\\;");
				Pessoa pessoa = new Pessoa();
				
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				pessoas.add(pessoa);
			}
			
		}
		 
		//System.out.println(pessoas);
		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);
		}
		
	}

}
