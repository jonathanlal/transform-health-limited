package wd_admin_models;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class GetDate {
	public static String now(){
		   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		   Date now = new Date();
		   return dateFormat.format(now);
	}
	public String uniqueNumbers(){
		   return Long.toString(System.currentTimeMillis());
	}
	 public String getFormattedDate(String input) throws ParseException{
		   DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		   Date date = dateFormat.parse(input);
       Calendar cal=Calendar.getInstance();
       cal.setTime(date);
       //2nd of march 2015
       int day=cal.get(Calendar.DATE);

       if(!((day>10) && (day<19)))
       switch (day % 10) {
       case 1:  
           return new SimpleDateFormat("d'st' 'of' MMMM yyyy").format(date);
       case 2:  
           return new SimpleDateFormat("d'nd' 'of' MMMM yyyy").format(date);
       case 3:  
           return new SimpleDateFormat("d'rd' 'of' MMMM yyyy").format(date);
       default: 
           return new SimpleDateFormat("d'th' 'of' MMMM yyyy").format(date);
   }
   return new SimpleDateFormat("d'th' 'of' MMMM yyyy").format(date);
}
	
}
