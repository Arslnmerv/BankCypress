package day30_DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class C03_LocalDateTime {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println("Aktuel tarih ve zaman : "+ldt);

		LocalDate d=LocalDate.of(2016, 1, 10);
		LocalTime t=LocalTime.of(13, 30);
		
		LocalDateTime ldt1=LocalDateTime.of(d, t)		;
		System.out.println(d);
		System.out.println(t);
		System.out.println(ldt1);	
	}

}
