package ModuloDatas;

import java.time.Duration;
import java.time.Instant;

import CursoJavaTrheds.threads;

public class ProcessoComInstant {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
        Instant inicio = Instant.now();
        
        Thread.sleep(2000);
        
        Instant ifinal = Instant.now();
        
        Duration duracao = Duration.between(inicio, ifinal);
        
        
        System.out.println("Dura��o em Nano segundos : " + duracao.toNanos());
        
        System.out.println("Dura��o em Minutos  : " + duracao.toMinutes());
        
        System.out.println("Dura��o em Nano segundos : " + duracao.toMillis());
        
        System.out.println("Dura��o em Horas : " + duracao.toHours());
        
	}

}
