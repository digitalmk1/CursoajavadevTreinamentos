package Arquivos;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.plaf.basic.BasicScrollPaneUI.HSBChangeListener;

import org.apache.poi.hssf.usermodel.HSSFAnchor;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;

public class ApachePoi {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\Suporte_DigitalMK\\git\\CursoajavadevTreinamentos\\ProjetoOO2\\arquivo_Excel.xls");
		
		if(!file.exists()) {
			
			file.createNewFile();
			
			 Pessoa pessoa1 = new Pessoa();
		       pessoa1.setNome("MARCIO SILVA DE OLIVEIRA");
		       pessoa1.setEmail("marcio@digitalmk.com.br");
		       pessoa1.setIdade(Integer.valueOf(42));
		       
		       Pessoa pessoa2 = new Pessoa();
		       pessoa2.setNome("VALQUIRIA FLORENTINO");
		       pessoa2.setEmail("marcio@digitalmk.com.br");
		       pessoa2.setIdade(Integer.valueOf(4));
		       
		       Pessoa pessoa3 = new Pessoa();
		       pessoa3.setNome("MICKAEL MARCIO");
		       pessoa3.setEmail("marcio@digitalmk.com.br");
		       pessoa3.setIdade(Integer.valueOf(14));
		       
		       Pessoa pessoa4 = new Pessoa();
		       pessoa4.setNome("MILENA MISAELY");
		       pessoa4.setEmail("marcio@digitalmk.com.br");
		       pessoa4.setIdade(Integer.valueOf(2));
		       
		       Pessoa pessoa5 = new Pessoa();
		       pessoa5.setNome("MISAEL MARCIO");
		       pessoa5.setEmail("marcio@digitalmk.com.br");
		       pessoa5.setIdade(Integer.valueOf(4));
		   
				List<Pessoa> pessoas = new ArrayList<Pessoa>();
				
				pessoas.add(pessoa1);
				pessoas.add(pessoa2);
				pessoas.add(pessoa3);
				pessoas.add(pessoa4);
				pessoas.add(pessoa5);
				
				
				// lembrar de baixar a biblioteca poi 5.00
				HSSFWorkbook hssfworkbook = new HSSFWorkbook(); // usado para escrever a planilha
				HSSFSheet linhasPessoa = hssfworkbook.createSheet("Planilha de pessoas DigitalMK Treinamento"); // vai criar a planilha.
				
				// agora pegar a lista de pessoas
				
				int numeroLinha = 0;
				for (Pessoa p : pessoas) {
					
					Row linha = linhasPessoa.createRow(numeroLinha ++);
					int celula = 0;
					
					Cell celNome = linha.createCell(celula ++);
					celNome.setCellValue(p.getNome());
					
					Cell celEmail = linha.createCell(celula ++);
					celEmail.setCellValue(p.getEmail());
					
					Cell celIdade = linha.createCell(celula ++);
					celIdade.setCellValue(p.getIdade());
					
					
				}
				
				FileOutputStream saida = new FileOutputStream(file);
				hssfworkbook.write(saida); // Escreve a planilha
				saida.flush();
				saida.close();
				
				System.out.println("Planilha foi criada"); //só para apresentar mensagem no console
		}

	}

}
