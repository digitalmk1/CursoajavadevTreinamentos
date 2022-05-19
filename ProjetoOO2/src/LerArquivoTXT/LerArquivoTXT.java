package LerArquivoTXT;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivoTXT {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		FileInputStream entradaArquivo = new FileInputStream(new File("C:\\Users\\Suporte_DigitalMK\\git\\CursoajavadevTreinamentos\\ProjetoOO2\\arquivo.txt"));
        Scanner lerarquivo = new Scanner(entradaArquivo,"UTF-8");
        
        
       while(lerarquivo.hasNext()) {
    	   
    	   String linha = lerarquivo.nextLine();
    	   
    	   
    	   /********Tratando para não imprimir linhas em brando *******/
    	   if(linha != null && !linha.isEmpty()) { //tratamento para não ler linhas em branco ou vazia
    		   System.out.println(linha);
    	  
    	   }
    	   
       }
	}

}
