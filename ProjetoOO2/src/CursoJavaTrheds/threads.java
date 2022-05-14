package CursoJavaTrheds;

import javax.swing.JOptionPane;

public class threads {
	public static void main(String[] args) throws InterruptedException {

		Thread threadEmail = new Thread(thread1);
		threadEmail.start();

		Thread theadNFCe = new Thread(Thread2);
		theadNFCe.start();

	}

	private static Runnable Thread2 = new Runnable() {

		@Override
		public void run() {

			// codigo da rotina executa o que queremos

			for (int pos = 0; pos < 10; pos++) {

				/* Quero executar esse envio com tempo parada ou com um tempo determinado */
				System.out.println("Executando alguma rotina envio de Nota fiscal: ");
				try {
					Thread.sleep(5000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /* Da um tempo */

			}

			System.out.println("Chegou ao final do codigo teste");
			JOptionPane.showMessageDialog(null, "Sistema continua executlado para o usuario");

		}
	};

	public static Runnable thread1 = new Runnable() {

		@Override
		public void run() {
			// codigo da rotina executa o que queremos

			for (int pos = 0; pos < 10; pos++) {

				/* Quero executar esse envio com tempo parada ou com um tempo determinado */
				System.out.println("Executando alguma rotina envio de e-mail: ");
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} /* Da um tempo */

			}
			System.out.println("Chegou ao final");
			JOptionPane.showMessageDialog(null, "Sistema continua executlado para o usuario");

		}
	};
}
