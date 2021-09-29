package day03_datacasting_increment;

import java.util.Scanner;

public class C01_Scanner {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("lütfen isminizi ve soyisminizi yazýnýz,\nisminizi yazdýktan sonra enter a basýnýz ");
		
		String name=scan.nextLine();
		String surname=scan.nextLine();
		
		System.out.println("isminiz : "+ name + "\nSoyisminiz : "+ surname +"\nKursumuza kaydýnýz alýnmýþtýr. teþekkür ederiz.");
		
		scan.close();
		

	}

}
