package day30_DateTime;

import java.time.LocalDate;

public class C01_LocalDate {

	public static void main(String[] args) {
	LocalDate tarih = LocalDate.now(); // tarih isminde obj creat ettik
		System.out.println("Bugünün tarihi : " + tarih);
		System.out.println("Bugünden 21 gün sonrasý " + tarih.plusDays(21));
		System.out.println("Bugünden 3 yýl sonrasý " + tarih.plusYears(3));
		System.out.println("Bugünden 3 gün 5 ay 2 yil sonrasi : " + tarih.plusDays(3).plusMonths(5).plusYears(2));
	    System.out.println("Bugünden 40 gün öncesi : "+tarih.minusDays(40));
	    System.out.println("Bugünün 5 yil öncesinin 2 ay sonrasinin 3 hafta ertesi : "+tarih.minusYears(5).plusMonths(2).plusWeeks(3));
	
	    System.out.println(tarih.getDayOfMonth());   //2
	    System.out.println(tarih.getDayOfYear());   //214. gün
	    System.out.println(tarih.getDayOfWeek());   //monday
	    System.out.println(tarih.getMonthValue());  //8. ay
	    System.out.println(tarih.getMonth());       //august
	
	LocalDate dogumGunDate= LocalDate.of(1974, 4, 3);
	System.out.println("dogum tarihi "+dogumGunDate);
	System.out.println("dogum günü "+dogumGunDate.getDayOfWeek());//wednesday
	System.out.println(dogumGunDate.isAfter(tarih));//false
	System.out.println(dogumGunDate.isBefore(tarih));//true
	System.out.println(dogumGunDate.equals(tarih));//false
	
	


	}
	

}
