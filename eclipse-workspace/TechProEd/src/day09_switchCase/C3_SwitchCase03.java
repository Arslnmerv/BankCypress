package day09_switchCase;

import java.util.Scanner;

public class C3_SwitchCase03 {

	public static void main(String[] args) {
		// Soru5 : Kullanicidan gun
		//ismini alip haftaici veya hafta sonu
		//yazdiralim

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir gün ismi girin");
		String gunIsmi=scan.next().toLowerCase();
		
		switch (gunIsmi) {
		  
		case "Pazartesi" :
		case "Salý" :
		case "Carsamba" :
		case "Persembe" :
		case "Cuma" :
		    System.out.println("hafta içi");
		break;
		
		case "cumartesi" :
		case "pazar" :	
			System.out.println("hafta sonu");
		break;
		
		   
		default: 
			System.out.println("gun girin");
		
		scan.close();
		
		
	}
		
	}

}
