package LerArquivoTXT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import EscrevendoEmArquivos.Pessoa;

public class LerArquivosColocarNaLista {

	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream entradaArquivo = new FileInputStream(
				new File("C:\\Users\\Suporte_DigitalMK\\git\\CursoajavadevTreinamentos\\ProjetoOO2\\arquivo.txt"));
		Scanner lerarquivo = new Scanner(entradaArquivo, "UTF-8");

		List<Pessoa> pessoas = new ArrayList<Pessoa>();
		while (lerarquivo.hasNext()) {

			String linha = lerarquivo.nextLine();

			/******** Tratando para não imprimir linhas em brando *******/
			if (linha != null && !linha.isEmpty()) { // tratamento para não ler linhas em branco ou vazia
				// System.out.println(linha);
				String[] dados = linha.split("\\ ;");
				
				Pessoa pessoa = new Pessoa();
				pessoa.setNome(dados[0]);
				pessoa.setEmail(dados[1]);
				pessoa.setIdade(Integer.parseInt(dados[2]));
				
				pessoas.add(pessoa);
				
				System.out.println(pessoa);

			}
		}
	}
}
