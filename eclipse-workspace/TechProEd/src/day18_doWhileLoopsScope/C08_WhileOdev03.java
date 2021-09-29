package day18_doWhileLoopsScope;

import java.util.Scanner;

public class C08_WhileOdev03 {

	public static void main(String[] args) {
		
		// Soru 6 ) Kullanicidan toplamak icin sayi isteyin ve 
				// toplam 500’e ulasincaya kadar 
		        // istemeyi devam ettirin. Toplam 500’e ulastiginda veya gectiginde toplami ve kac sayi
		        // girildigini yazdirin
		  
		Scanner scan=new Scanner(System.in);
		
		int toplam =0;
		int sayac=0;
		int sayi=1;
		
		while (toplam<=500) {
			
			System.out.println("Lütfen toplamak istediðiniz sayýyý girin");
			
			sayi=scan.nextInt();
			
			toplam+= sayi;
			sayac++;
			
	
		}
		
		System.out.println("Girdiðiniz "+sayac+" sayýnýn toplamý: "+toplam);	
	scan.close();
	}

}
