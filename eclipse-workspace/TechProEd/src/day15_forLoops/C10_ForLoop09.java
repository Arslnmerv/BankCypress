package day15_forLoops;

import java.util.Scanner;

public class C10_ForLoop09 {

	public static void main(String[] args) {
		
		// kullanici 5 girdiyse bu islemin sonucunda konsolda 5!=1*2*3*4*5 = 120 yazdiralim
	
		Scanner scan=new Scanner(System.in);
		System.out.print("10'den kucuk bir sayi giriniz: ");
		int sayi=scan.nextInt();
		int faktoriyel=1;
		
		System.out.print(sayi+"!=");
		for (int i=1;i<=sayi;i++) {
			
			faktoriyel=faktoriyel*i;
			System.out.print(i);
			if (i!=sayi) {
				System.out.print("*");
			}
		}
		System.out.print("="+faktoriyel);
		scan.close();
	
	}

}
