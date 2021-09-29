package day31_varargs;

public class C03_Varargs03 {

	public static void main(String[] args) {
		// verilen int lerden ilki haric tum sayilari toplayan ve
		// buldugunuz toplam ile ilk sayiyi carpip sonucu yazdirin.

	 
	   
	   topla(2,5,55,21,33);
	   
	
	
	}

	private static void topla(int carpilacakSayi, int...toplanacaklar) {
		int toplam=0;
		for (int each:toplanacaklar) {
			toplam+=each;
		}
		System.out.println("iþlem sonucu : "+ toplam*carpilacakSayi);
	}

}
