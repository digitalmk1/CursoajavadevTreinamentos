package Arquivos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.imageio.stream.FileImageInputStream;
import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import org.apache.poi.hssf.usermodel.HSSFAnchor;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi_Leitura {

	public static void main(String[] args) throws IOException {

		FileInputStream entrada = new FileInputStream(new File(
				"C:\\Users\\Suporte_DigitalMK\\git\\CursoajavadevTreinamentos\\ProjetoOO2\\arquivo_Excel.xls"));
		// Passando o arquivo para HSSFWorkbook
		HSSFWorkbook hssworkbook = new HSSFWorkbook(entrada);// Prepaa a entrada do arquivo execl para ser lido.
		HSSFSheet planilha = hssworkbook.getSheetAt(0); // aqui o arquivo pode ter varias planilha estamos pegando a
														// primeira planilha;

		// Agora vamos percorrer a planilha

		Iterator<Row> linhaIterator = planilha.iterator();
		// agora vou percorrer minha planilha do execel vou colocar em uma lista de
		// pessoas

		List<Pessoa> pessoas = new ArrayList<Pessoa>();

		// Enquanto tiver linhas vou pergar linhaIterator

		while (linhaIterator.hasNext()) {
			Row linha = linhaIterator.next(); // pegando dados da pessoa na linha. sendo assim cada linha tem uma celula
												// presiso percorrer interator cell
			Iterator<Cell> celulas = linha.iterator();

			Pessoa pessoa = new Pessoa();

			while (celulas.hasNext())
				; // Percorrendo as celulas
			Cell cell = celulas.next();

			switch (cell.getColumnIndex()) { // caso seja 0 presiso de um objeto pessoa que foi instaciado
			case 0:
				pessoa.setNome(cell.getStringCellValue());
				break;
			case 1:
				pessoa.setEmail(cell.getStringCellValue());
				break;
			case 2:
				pessoa.setIdade(Double.valueOf(cell.getNumericCellValue()).intValue());
				break;
			// fim das celulas das linhas
			}

			pessoas.add(pessoa);

		}
		entrada.close(); // terminou de ler o arquivo

		for (Pessoa pessoa : pessoas) {
			System.out.println(pessoa);

		}
	}
	

}
