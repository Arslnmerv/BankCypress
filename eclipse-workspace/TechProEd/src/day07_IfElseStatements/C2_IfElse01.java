package day07_IfElseStatements;

import java.util.Scanner;

public class C2_IfElse01 {

	public static void main(String[] args) {
		
		// Kullanicidan dikdörtgenin iki kenarýný alin 
		//kare olup olmadigini yazdýrýn

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen dikdörtgen kenarlarýný giriniz \nilk kenarý girince entera basýnýz");
		
		double kenar1=scan.nextDouble();
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("girdiðiniz dikdörtgen karedir");
			
			
		} else {
			System.out.println("girdiðiniz dikdörtgen kare deðil");
			scan.close();
		}
			

	}

}
