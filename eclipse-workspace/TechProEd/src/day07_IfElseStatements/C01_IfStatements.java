package day07_IfElseStatements;

import java.util.Scanner;

public class C01_IfStatements {

	public static void main(String[] args) {
		// kullanicidan gün ismini alýn hafta
		// içi ve hafta sonu oldugunu yazdýrýn
		
		Scanner scan =new Scanner(System.in);
		
		
		System.out.println("Lutfen gun ismini giriniz");
		
		String gunIsmi=scan.next().toLowerCase();
		
		
		if (gunIsmi.equals("pazartesi") || gunIsmi.equals("sali") || gunIsmi.equals("carsamba") || gunIsmi.equals("persembe") || gunIsmi.equals("cuma")) {
			
			System.out.println("hafta içi");
			if (gunIsmi.equals("cumartesi") || gunIsmi.equals("pazar")) {
				System.out.println("haftasonu");
			}
			
		}scan.close();
	}

}
