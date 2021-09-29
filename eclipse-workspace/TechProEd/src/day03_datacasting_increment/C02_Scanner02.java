package day03_datacasting_increment;

import java.util.Scanner;

public class C02_Scanner02 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen isminizi girin");
		
		char ilkharf=scan.next().charAt(1);
		
		System.out.println("girdiðiniz kelimenin ilk harfi : "+ ilkharf);
		
		scan.close();
		
		
	}

}
