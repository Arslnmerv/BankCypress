package day29_passByValueMutableClass;

public class C04_ImmutableClass01 {

	public static void main(String[] args) {
	int sayi=10;
		
		for (int i = 0; i < 10000; i++) {
			i++;
			sayi++;
		}
		
		// Bu kodu calistirdigimizda 13.satira kadar Java kac obje uretir
		// Bu soruyu cevaplamak icin degiskenin data turune bakmaliyiz
		// sayi ve i'nin veri turu : int
		// int mutable
		
		
		String str="A";
		
		for (int i = 0; i < 10000; i++) {
			str+=" ";
		}
		
		/*
		 20.satir ile 24.satir arasinda kac obje olusur ?
		 i int oldugu icin sadece 1 tane variable olusturuur
		 str String oldugundan 10001 obje olusturulur
		 */
	}

}
