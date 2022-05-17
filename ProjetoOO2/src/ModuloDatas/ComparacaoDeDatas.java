package ModuloDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparacaoDeDatas {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimentoBoleto = simpleDateFormat.parse("17/05/2022");
		Date dataAtualHoje = simpleDateFormat.parse("17/05/2022");
		

		if (dataVencimentoBoleto.before(dataAtualHoje)) { //  O método after() é usado para verificar se uma determinada data é posterior a outra data.
			// O método before() é usado para verificar se uma determinada data é anterior a outra data
			
			//AFTER :SE DATA 1 É MAIOR  QUE DATA 2;
			//BEFORE  : SE DATA 2 É MENOR QUE DATA 1

			System.out.println("Boleto vencido URGENTE!!");
		} else {
			System.out.println("Boleto não vencido!! ");

		
		}

	}

}
