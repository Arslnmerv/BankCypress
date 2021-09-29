package day04_Increment;

public class C2_PreIncrement_PostIncrement {

	public static void main(String[] args) {
		
		int sayi1=20;
		int sayi2=++sayi1;
		
		System.out.println("pre-increment sayi1:"+sayi1);
		System.out.println("pre-increment sayi2:"+sayi2);

		sayi2=sayi1++;
		System.out.println("post-increment sayi1:"+sayi1);
		System.out.println("post-increment sayi2:"+sayi2);
	
	
		int sayi3=10;
		System.out.println("pre increment : "+ ++sayi3); //11
		
		System.out.println("post increment : "+ sayi3++); //11
	
		System.out.println("post incrementtan sonra sayi3 : "+ sayi3); //12
	
	}

}
