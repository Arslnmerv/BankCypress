package day04_Increment;

public class C01_Increment_decrement {

	public static void main(String[] args) {
		
		int sayi1=10;
		int sayi2=20;
		
		sayi1-=5; //5
		sayi2+=10; //30
		
		System.out.println(sayi2/sayi1); //6

		sayi1*=2; //10
		sayi2++;  //31
		
		System.out.println(sayi2/sayi1); //
		
		sayi1 /=2; //10 du 2 ye boldum 5 oldu
		
		double sayi3=sayi2/10; //sayi2 ye atama yok sayi2 31 hala/10 3olur int olarak sayi3 e atanýr ve sonradan double olduðu için 3.0 olarak yazdýrýr.
		
		System.out.println(sayi3);
		System.out.println(sayi1*sayi2);
		System.out.println(sayi1*sayi3);
		
		sayi3=(double)sayi2/10;//3.1 olur sayi2 31 iken double a cevirince 31.0 oldu 10 a bölünce sayi3 ün deðeri 3.1 oldu
		
		System.out.println(sayi3);
		
		
	}

}
