package day10_stringManipulations;

import java.util.Scanner;

public class deneme {

	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz");
        String cumle=scan.nextLine().toLowerCase();
        System.out.println("Lutfen bir kelime giriniz...");
        String kelime=scan.next().toLowerCase();
        
        if  (cumle.indexOf(kelime)==-1) { System.out.println("cümlede kullanýlmamýþ");}
        else if (cumle.indexOf(kelime)==(cumle.lastIndexOf(kelime))) { System.out.println("1 kere kullanýlmýþ");}
        
        else { System.out.println("1 den fazla kullanýlmýþ");}
        
      

	scan.close();
	
	}

}
