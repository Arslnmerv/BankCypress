package day02_variablesScanner;

public class C01_Variables {

	public static void main(String[] args) {
	//1 Farkli 3 data turunde variable olusturun ve bunlari yazdirin
		
		String kelime="Merhaba"; //satir sonunda mutlaka ; kullanilmalidir
		
		System.out.println( kelime ); // varible ýn icindeki degeri yazar

		System.out.println( "kelime" ); // kelime yazar
	
		int sayi=20;
		
		System.out.println(sayi);
		
		// yazdirirken basina aciklama eklemek istersem
		// girilen sayi : 20 yazalim
		// eger degisken ve aciklamayi birlikte yazdirmak istersek 
		// " aciklama " + varibleIsmi
		
		System.out.println("girilen sayi : " + sayi);

		boolean tatildeMi = true ;
		
		System.out.println( tatildeMi );
		
		// konsolda bu sene tatile gittiniz mi ? = true
		// bu sene tatile gittiniz mi ? = true
		// variable olmayan kisim cift tirnak icine yazilacak
		// "bu sene tatile gittiniz mi ?"
		
		System.out.println("bu sene tatile gittiniz mi ? = " + tatildeMi);
	
		/*
		 2 isim ve soyisim icin iki variable olusturun ve bunlarý 
		 
		 isminiz : Sabah Nur
		 soyisminiz : Dagtekin
		 seklinde yazdirin
		 
		 */
		
		String name="Sabah Nur";
		String surname="Dagtekin";
		
		System.out.println("isminiz : "+name);
	    System.out.println("soyisminiz : "+surname);
	
	//3 iki farkli tamsayi data türüne 2 variable olusturun bunlarýn toplamlarini yazdirin.
	   
	    int sayi1=10;
	    byte sayi2 = 5;
	    
	    System.out.println(sayi1+sayi2);
	
	// toplama isleminin basina aciklama yazmak istersek
	// iki sayinin toplami =15
	
	System.out.println("iki sayinin toplami ="+ (sayi1+sayi2));
	// string ve sayisal islemleri birlikte yaptirdigimizda parantez icine alýn
	
	// 4. BÝr tamsayi ve bir ondalikli variable olusturun ve bunlarin toplamini yazýn.
	
	int sayi3= 15 ;
	double sayi4 = 3.14;
	
	System.out.println(sayi3+sayi4);
	
	// toplam : 18.14 
	
	System.out.println("toplam: "+ (sayi3+sayi4));
	
	//5. char data turunde bir variable olusturun ve yazdirin
	
	char karakter='?';
	
	System.out.println(karakter);
	System.out.println("Girilen karakter:"+ karakter);
	
	//6. Bir tam sayi bir de char degisken variable olusturun ve toplamini yazdirin
	
	int sayi5 =20;
	char harf ='M';
	
	System.out.println(sayi5+harf);
	
	// 
			
	
	}

}
