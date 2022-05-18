package ModuloDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class AulaFaixaTempoChronoUnit {

	public static void main(String[] args) throws ParseException {

	//	Date dataPassada = new SimpleDateFormat("dd/MM/yyyy").parse("18/01/2022");
		 // localDate a data do dia  informando a data do  vencimento
		long  dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-05-18"), LocalDate.now());
		
	System.out.println("Possui " + dias + " Entre a faixa de datas ");

	}

}
