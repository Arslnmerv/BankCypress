package day02_variablesScanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
		
		// kullanicidan iki tam sayi alip toplamlarini yazdirin
		
		//kullanicidan deger almak icin 3 adim atmaliyiz
        // 1. scanner objesi olusturalim
		
		Scanner scan= new Scanner(System.in);
		
		// 2. kullanicidan ne istedigimizi yazdiralim
		
		System.out.println("Lutfen 2 tam sayi giriniz");
		
		// 3. next metodunu kullanarak girilen degerleri alip 
		// olusturacagimiz variabllera atayalým
		
		int sayi1= scan.nextInt();
		int sayi2= scan.nextInt();
		
		System.out.println("Girdiginiz sayilarýn toplamý : " +(sayi1+sayi2));
		scan.close();

	}

}
