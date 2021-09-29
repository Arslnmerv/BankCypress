package day01_variables;

import java.util.Scanner;

public class C02_Scanner01 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("isminizi giriniz");
		
        String kullanicininIsmi = scan.nextLine();
        
        
        System.out.println("girdiginiz isim :" + kullanicininIsmi);
        scan.close();
	}

}
