package day30_DateTime;

import java.text.DateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C04_DateTimeFormatter {

	public static void main(String[] args) {
		
		/*
		         * yy: YILIN SON iKi RAKAMI
		         * yyyy : yýlýn tamamýný
		         * y : yýlýn tamamýný
		         * M : ay sýrasýný verir TEMMUZ için : 7
		         * MM:  ay sýrasýný veriri TEMMUZ için : 07
		         * MMM . ay isminin ilkuc harfini verir. JUL
		         * MMMM : ay isminin tamamýný verir
		         */
		
		LocalDate bugun=LocalDate.now();
		LocalDate date=LocalDate.of(2020, 5, 15);
		
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/M/yy");
		DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("dd/MMMM/yy");
		DateTimeFormatter dtf3=DateTimeFormatter.ofPattern("dd$M$yyyy");
		
		System.out.println(dtf.format(date));
		System.out.println(dtf1.format(date));
		System.out.println(dtf2.format(date));
		System.out.println(dtf3.format(date));
		
		System.out.println(dtf.format(bugun));
		System.out.println(dtf1.format(bugun));
		System.out.println(dtf2.format(bugun));
		System.out.println(dtf3.format(bugun));

		  
        //kac yasýndayiz
        
      LocalDate dt=LocalDate.of(2005, 03, 05);
        System.out.println("bugunun tarihi : "+bugun);
        System.out.println("faruk dt :"+dt);
      Period yasim=Period.between(dt, bugun);
        System.out.println("faruk beyin yasi : "+yasim);
        System.out.println(yasim.getYears());
	
	}

}
