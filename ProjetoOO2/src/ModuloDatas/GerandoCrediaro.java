package ModuloDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GerandoCrediaro {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Date dataInicial = new SimpleDateFormat("dd/MM/yyyy").parse("18/05/2022");
		
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(dataInicial);
		
		for(int parcela = 1; parcela<=12; parcela++) {
			calendar.add(Calendar.MONTH, 1);
			
			System.out.println(" Parcelas numero :  " + parcela + " Vencimento : " 
			+ new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()) + " R$ 150,00");
			
		}
		 

	}

}
