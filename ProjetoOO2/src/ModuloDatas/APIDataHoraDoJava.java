package ModuloDatas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class APIDataHoraDoJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LocalDate dataAtual = LocalDate.now();
		// pegando data atual
		System.out.println("Data atual : " + dataAtual);
		
		LocalTime horaAtual = LocalTime.now();
		
		System.out.println("Hora certa : " + horaAtual);
		
		LocalDateTime dataHoraLocal = LocalDateTime.now();
		// Formatando data hora com API java
		System.out.println("Data e hora atual : " + dataHoraLocal.format(DateTimeFormatter.ofPattern("18/05/2022 HH:mm")));

	}

}
