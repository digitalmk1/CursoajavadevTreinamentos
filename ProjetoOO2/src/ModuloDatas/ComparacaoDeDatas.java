package ModuloDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ComparacaoDeDatas {
	public static void main(String[] args) throws ParseException {

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

		Date dataVencimentoBoleto = simpleDateFormat.parse("17/05/2022");
		Date dataAtualHoje = simpleDateFormat.parse("17/05/2022");
		

		if (dataVencimentoBoleto.before(dataAtualHoje)) { // After significa posteriomente ou deposi do vencimento da
			// data atual
			// before compara datas

			System.out.println("Boleto vencido URGENTE!!");
		} else {
			System.out.println("Boleto não vencido!! ");

		
		}

	}

}
