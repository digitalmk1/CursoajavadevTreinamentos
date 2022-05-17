package ModuloDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.Calendar;

public class APIDateTime {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Calendar calendar = Calendar.getInstance();
		
		calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("17-05-2022")); //Definindo uma data	qualquer
        
		
		calendar.add(Calendar.DAY_OF_MONTH, -40); //DAY_OF_WEEK - DIA DA CEMANA
		//DAY_OF_MONTH DIA DO MES
		
		
		System.out.println(new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(Calendar.MONTH, 3);
		System.out.println("Somando o mês : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
		
		calendar.add(calendar.YEAR, 1);
		
		System.out.println("Somando 1 ano : " + new SimpleDateFormat("dd-MM-yyyy").format(calendar.getTime()));
	}

}
