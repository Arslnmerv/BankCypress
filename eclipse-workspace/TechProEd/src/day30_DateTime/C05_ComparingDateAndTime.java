package day30_DateTime;

import java.time.LocalDate;

public class C05_ComparingDateAndTime {

	public static void main(String[] args) {
		LocalDate bugun=LocalDate.now();
		LocalDate date=LocalDate.of(2021, 8, 1);
     int fark=bugun.compareTo(date);
     System.out.println(bugun);
     System.out.println(date);
     
     System.out.println(fark); //karþýlaþtýrýlan iki tarihin en buyuk parcasýnýn farkýný verir.
     
     
     
	}

}
