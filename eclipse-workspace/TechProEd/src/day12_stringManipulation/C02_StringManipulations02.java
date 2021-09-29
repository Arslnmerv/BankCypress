package day12_stringManipulation;

import java.util.Scanner;

public class C02_StringManipulations02 {

	public static void main(String[] args) {
		
	//	Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin ve asagidaki gibi yazdirin
	 //isim-soyisim : M***** B*******
	 //kart no : **** **** **** 1234
	
	Scanner scan=new Scanner(System.in);
	System.out.println("isminizi giriniz");
	String isim=scan.nextLine();
	System.out.println("Soyisminizi giriniz");
	String soyisim=scan.nextLine();
	System.out.println("Kart no girin");
	String kkNo=scan.nextLine();
	
	String isimDuzenlenmis= isim.substring(0,1).toUpperCase()+
            isim.substring(1).replaceAll("\\w", "*"
          		   );		
		String soyisimDuzenlenmis= soyisim.substring(0,1).toUpperCase()+
		     soyisim.substring(1).replaceAll("\\S","*");		
		String kkNoDuzenlenmis= "**** **** ****"+" "+ kkNo.substring(12);
		System.out.println("Isim-soyisim :"+isimDuzenlenmis+ " "+ soyisimDuzenlenmis
				+ "\nkart no :"+kkNoDuzenlenmis);
	
scan.close();
	
	}

}
