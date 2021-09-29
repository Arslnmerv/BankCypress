package day06_relational_operators_if_satements;

import java.util.Scanner;

public class C5_IfStatement04 {

	public static void main(String[] args) {
		// Kullanicidan dikdörtgenin iki kenarýný alin 
		//kare olup olmadigini yazdýrýn

		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen kenar uzunluklarýndan birini tam sayý girin");
		int kenar1=scan.nextInt();
		System.out.println("Lutfen kenar uzunluklarýndan digerini tam sayý girin");
		int kenar2=scan.nextInt();
		
		if (kenar1==kenar2) {
			System.out.println("girdiginiz karedir");
		}
	    if (kenar2!=kenar1) {
			System.out.println("girdiginiz kare degil");
		}
	scan.close();
	}
	
}
