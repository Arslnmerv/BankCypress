package day06_relational_operators_if_satements;

import java.util.Scanner;

public class C3_IfStatements02 {

	public static void main(String[] args) {

    //kullanicidan
		
		Scanner scan=new Scanner(System.in);
		System.out.println();
		
		int girilenSayi=scan.nextInt();
		
		if (girilenSayi % 2==0) {
			System.out.println("sayi çifttir");
		}
        if (girilenSayi%2==1) {
			System.out.println("sayi tektir");
		}
	
	if (girilenSayi<0) {
		System.out.println("lütfen pozitif bir tam sayý girin");
	}
	
	scan.close();
	}

}
