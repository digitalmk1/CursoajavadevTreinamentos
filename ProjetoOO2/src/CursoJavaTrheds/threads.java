package CursoJavaTrheds;

import javax.swing.JOptionPane;

public class threads {
	public static void main(String[] args) throws InterruptedException {
		
		// thread processando em paralelo
		new Thread() {
			
			public void run() {
				
				//codigo da rotina executa o que queremos 
				
				for(int pos = 0; pos< 10; pos++) {
					
					/*Quero executar esse envio com tempo parada ou com um tempo determinado*/
					System.out.println("Executando alguma rotina envio de e-mail: ");
					try {
						Thread.sleep(5000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} /*Da um tempo*/
					
				}
				
			}
			
		}.start(); //Start liga a thread que fica processando paralelamente por traz
		/*codigo da rotina que eu quero executar em paralelo */
		
		
		System.out.println("Chegou ao final");
		JOptionPane.showMessageDialog(null,"Sistema continua executlado para o usuario");
	
	}
}
