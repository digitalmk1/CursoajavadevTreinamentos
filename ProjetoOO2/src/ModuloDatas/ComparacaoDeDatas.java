package ModuloDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparacaoDeDatas {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimentoBoleto = simpleDateFormat.parse("17/05/2022");
		Date dataAtualHoje = simpleDateFormat.parse("17/05/2022");
		

		if (dataVencimentoBoleto.before(dataAtualHoje)) { //  O m�todo after() � usado para verificar se uma determinada data � posterior a outra data.
			// O m�todo before() � usado para verificar se uma determinada data � anterior a outra data
			
			//AFTER :SE DATA 1 � MAIOR  QUE DATA 2;
			//BEFORE  : SE DATA 2 � MENOR QUE DATA 1

			System.out.println("Boleto vencido URGENTE!!");
		} else {
			System.out.println("Boleto n�o vencido!! ");

		
		}

	}

}
