package ModuloDatas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DiaMesesAno {

	public static void main(String[] args) {


		LocalDate localDate = LocalDate.now();
		
		System.out.println("Data atual : " + localDate.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		
		System.out.println("Dia da Semana : " + localDate.getDayOfWeek().ordinal());
		System.out.println("Dia do Mes : " + localDate.getDayOfMonth());
		System.out.println("Dia do Ano : " + localDate.getDayOfYear());
		System.out.println("Ano atual : " + localDate.getYear());
	

	}

}
