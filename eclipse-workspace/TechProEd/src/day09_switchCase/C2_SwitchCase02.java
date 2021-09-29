package day09_switchCase;

import java.util.Scanner;

public class C2_SwitchCase02 {

	public static void main(String[] args) {
		// Soru3 : Kullanicidan bir sayi girmesini isteyin
		// Girilen sayi
		 //10 ise “Iki basamakli en kucuk sayi 
		 //100 ise “uc basamakli en kucuk sayi”
		 //1000 ise “dort basamakli en kucuk sayi”
		 //diger durumlarda “Girdigin sayiyi degistir” yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Bir tamsayý girin");
		int sayi=scan.nextInt();
		
		switch(sayi) {
		
		case 10: System.out.println("iki basamaklý en küçük sayý");
	break;
		case 100: System.out.println("Üç basamaklý en küçük sayý");
	break;
		case 1000: System.out.println("Dört basamakli en küçük sayý");
	break;
	
	default :
		System.out.println("Girdiðiniz sayýyý deðiþtirin");
		
		}
		scan.close();
		
	}

}
