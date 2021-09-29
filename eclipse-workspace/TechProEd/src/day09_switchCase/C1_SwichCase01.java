package day09_switchCase;

import java.util.Scanner;

public class C1_SwichCase01 {

	public static void main(String[] args) {
		// Soru1 : Kullanicidan haftanin kacinci gunu oldugunu sorun ve gun ismini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen haftanýn kaçýncý gününde olduðunuzu girin :");
		int gunNo=scan.nextInt();
		
		switch(gunNo) {
		
		case 1: System.out.println("bugün pazartesi");
	break;	
		case 2 :System.out.println("bugün salý");
	break;	
		case 3 : System.out.println("bugün çarþamba");
	break;
        case 4: System.out.println("bugün persembe");
	break;
		case 5 :System.out.println("bugün cuma");
	break;	
		case 6 : System.out.println("bugün cumartesi");
	break;	
		case 7 : System.out.println("bugün pazar");
    break; //burda break olmasaydý defoult da çalýþýrýdý
		default: System.out.println("geçerli gün giriþi yazýn");	
	
		
		}
		
	scan.close();
	}

}
