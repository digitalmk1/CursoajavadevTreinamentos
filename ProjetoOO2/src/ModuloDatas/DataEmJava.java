package ModuloDatas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataEmJava {

	public static void main(String[] args) throws ParseException {
		
	Date date = new Date();
	Calendar calendar = Calendar.getInstance();
    System.out.println("Data em milesimos segundos " + calendar.getTimeInMillis());
	
   System.out.println("Data Em milesegundos : " + date.getTime());
   System.out.println("Dia do mês :  " + date.getDate());
   System.out.println("Calendar mês --- : " + calendar.get(calendar.DAY_OF_MONTH) );
   System.out.println(" Dia da semana : ----" + calendar.get(calendar.DAY_OF_WEEK ));
   System.out.println("Dia da semana " + date.getDay());
   System.out.println("Hora do dia :  " + date.getHours());
   System.out.println("Hora do dia calendario **** : " + calendar.get(calendar.HOUR_OF_DAY));
   System.out.println("Minutos da hora " +  date.getMinutes());
   System.out.println("Calendar ---- Minutos da hora " + calendar.get(calendar.MINUTE));
   System.out.println("Segundos " + date.getSeconds());
   System.out.println("Ano tada  " + (date.getYear()+ 1900));
   
   /* --------------------------simples Date format----------------------*/
   
   SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm.ss");
   System.out.println( " Data atual em formato padrão e String :" + simpleDateFormat.format(date));
   
   //iniciar um novo objeto que ler no formato gravado no banco de dados
   
   simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm.ss");
   System.out.println("Data em Formato para Banco de dados : " + simpleDateFormat.format(date));
   
   simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
   System.out.println("Objeto Date : " + simpleDateFormat.parse("1978-11-05"));
   
   simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
   System.out.println("Objeto Date : " + simpleDateFormat.parse("05/11/1978"));
  
	}

}
