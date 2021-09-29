package day08_ternaryOperator;

import java.util.Scanner;

public class C01_ifElse_ArtikYil {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen yýl girin");
		int yil=scan.nextInt();
		
		if ( yil % 4 == 0 && yil % 100!= 0)
		{System.out.println("artýk yýldýr");}
		
		else if (yil %400==0)
		{ System.out.println("artýk yýldýr");
		}
		else {System.out.println("deðil");}
		
		scan.close();
		
	}

}
