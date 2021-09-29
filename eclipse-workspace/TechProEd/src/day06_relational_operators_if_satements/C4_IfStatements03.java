package day06_relational_operators_if_satements;

import java.util.Scanner;

public class C4_IfStatements03 {

	public static void main(String[] args) {
		
		//Kullanicidan gun isimlerinden birinin ilk harfini isteyin ve o harfle baslayan gun isimlerini yazdirin 
      
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lütfen istediginiz gun isminin ilk harfini girin");
		
		char harf=scan.next().toLowerCase().charAt(0); // tek karakteri char olarak da alabiliriz 
		                                               // char primitive dir ve metodlari yoktur
		                                               // bu yuzden string olarak aldik (fikir degisti)
		
		if (harf=='p' || harf=='P') { // bu da bir yontem
			System.out.println("pazartesi,persembe veya pazar");
		}
        if (harf=='s') {
        	System.out.println("sali");
        }
	    if (harf=='c') {
			System.out.println("carsamba,cuma veya cumartesi");
		}
	if (harf!='p'&& harf!='s'&&harf!='c') {
		System.out.println("lütfen gecerli bir harf girin");
	}
	scan.close();
	}
	

}
