package day02_variablesScanner;

import java.util.Scanner;

public class C03_Scanner02 {

	public static void main(String[] args) {
	 
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Lütfen isminizi giriniz");

		String name=scan.next();
		
		System.out.println("Lütfen soyisminizi giriniz");
	    
		String surname=scan.next();
		
		System.out.println("Isim - Soyisim : "+name+" "+surname);
	scan.close();
	
	
	}

}
