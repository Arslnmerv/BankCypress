package day08_ternaryOperator;

import java.util.Scanner;

public class C04_Ternary2 {

	public static void main(String[] args) {
		  
		Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Lutfen iki sayi giriniz");
	        
	        double sayi1=scan.nextDouble();
	        double sayi2=scan.nextDouble();
	        
	        System.out.println(  sayi1<sayi2 ? sayi1 : sayi2);

	        scan.close();
	}

}
