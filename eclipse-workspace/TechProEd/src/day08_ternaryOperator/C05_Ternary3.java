package day08_ternaryOperator;

import java.util.Scanner;

public class C05_Ternary3 {

	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
	        
	        System.out.println("Lutfen bir sayi giriniz");
	        
	        double sayi=scan.nextDouble();
	        
	        System.out.println(  sayi>=0 ? sayi : -1*sayi );
	    scan.close();    
	}

}
