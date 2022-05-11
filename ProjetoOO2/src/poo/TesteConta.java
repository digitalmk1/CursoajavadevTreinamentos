package poo;

import principio.responsabilidade.ContaBancaria;

public class TesteConta {

	public static void main(String[] args) {
		
		ContaBancaria contabancaria = new ContaBancaria();
		contabancaria.setDescricao("CONTA MARCIO SILVA DE OLIVERIA");
		
		System.out.println("Conta:" + contabancaria);
		
	     contabancaria.diminuir();
	     System.out.println(contabancaria);
	     
	     contabancaria.diminuir();
	     System.out.println(contabancaria);
          
	     contabancaria.depositarDinheiro(1000);
	     System.out.println(contabancaria);
	     
	     contabancaria.sacarDinheiro(7900);
	     System.out.println(contabancaria);
	     contabancaria.getSaldo();
	     System.out.println(contabancaria);
	     contabancaria.sacarDinheiro(900);
	     System.out.println(contabancaria);
	     

	}

}
