package day05_wrapper_Concatination;

public class C2_Concatination {

	public static void main(String[] args) {

		String str1 = "Hello";
		String str2 = "World";
		int sayi1 = 3;
		int sayi2 = 4;

		// Hello1

		System.out.println(str1 + (sayi2 - sayi1));

		// Hello 5 World

		System.out.println(str1 + " " + ++sayi2 + " " + str2);

		// Hello 34

		System.out.println(str1 + " " + sayi1 + --sayi2);

		// 7World

		System.out.println((sayi1+sayi2)+str2);
		
		//34
		System.out.println(""+sayi1+sayi2);

		// ""+sayi1 bu yöndetm metod kullanmadan int ý string e cevirir
		
	}

}
