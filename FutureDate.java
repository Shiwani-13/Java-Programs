package stringclass;

import java.util.Date;

public class FutureDate {

	public static void main(String[] args) {
	     Date d1 =new Date();
	     Date d2 = new Date(d1.getTime()+(1000*60*60*24*2)); //calculation of future date
         System.out.println(d2);
   
         String formate1 = d2.toString();
         
         String month = formate1.substring(4,7);
         System.out.println(month);
         String date = formate1.substring(8,10);
         System.out.println(date);
         String year = formate1.substring(formate1.length()-4);
         System.out.println(year);
         
         //print DD-MM-YYYY
         String formate2 = date.concat("-").concat(month).concat("-").concat(year);
         System.out.println(formate2);
         
        
         

	}

}
