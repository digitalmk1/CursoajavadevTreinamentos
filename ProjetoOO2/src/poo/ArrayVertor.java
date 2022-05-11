package poo;

import javax.swing.JOptionPane;

public class ArrayVertor {

	public static void main(String[] args) {
		
		//double[] valores = {9.5 , 8.9 , 8.5, 100};
		String[] valores = {"Marcio ","44", "Curso Java Web","contato@digitalmk.com.br", "80"};
		
		for( int pos = 0; pos< valores.length; pos ++) {
			
			System.out.println(" Valores na posição " + pos +" "+ valores[pos]);
		}
		
		
		

		
	/*	
		
    String posicoes = JOptionPane.showInputDialog("Quantas possições o Array deve ter? ");
		double[] notas = new double[Integer.parseInt(posicoes)];
		
		 for(int pos=0; pos<notas.length; pos++) {
			 
			 String valor = JOptionPane.showInputDialog("Nota " + (pos +1 )+ "e " + notas[pos]);
			 notas[pos] = Double.valueOf(valor);
		 }
		 
		 
		for(int pos=0; pos<notas.length; pos++) {
			System.out.println("Nota " + (pos +1) + " é = " + notas[pos]);
			
		
			
		}

		
		*/
	}

}
