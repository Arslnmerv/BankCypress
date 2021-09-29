package day07_IfElseStatements;

import java.util.Scanner;

public class C08_NestedIf01 {

	public static void main(String[] args) {
	
		// Kullanicidan cinsiyet ve yas aliniz
		// Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
		// calisan erkekse 65 yasindan buyukse emekli olabilir yazdirin
		// emekli olamayacaksa emekli olamazsin daha ... yil calisman lazim yazdirin
   
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen cinsiyetinizi giriniz\nErkek için E, Kadýn için K girin");
		
		char cinsiyet=scan.next().toUpperCase().charAt(0);
		
		System.out.println("Lütfen yaþýnýzý tam sayý olarak giriniz");
		 
		int yas=scan.nextInt();
		
		if (cinsiyet=='K') { if(yas>=60) { System.out.println("emekli olabilirsiniz");}
		                  else { System.out.println("Emekli olamazsýnýz "+(60-yas)+ " sene daha çalýþmalýsýnýz");}
		
		               }
		
		else { if (yas>=65) {System.out.println("Emekli olabilirsiniz");}
		      else { System.out.println("Emekli olamazsýnýz "+ (65-yas)+ " sene daha çalýþmalýsýnýz");}
		}
			
		
		scan.close();
		
}
}






























