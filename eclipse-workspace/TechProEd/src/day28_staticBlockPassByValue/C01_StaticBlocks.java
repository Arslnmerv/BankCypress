package day28_staticBlockPassByValue;

public class C01_StaticBlocks {

	static int sayi=10;
	
	static {
		System.out.println("1.Static block çalýþtý");
		sayi=20;
	}
	static {
		System.out.println("2.Static block çalýþtý");
		sayi=30;
	}
	static {
		System.out.println("3.Static block çalýþtý");
		sayi=45;
	}
	public static void main(String[] args) {
		
		System.out.println("main methodun ilk satýrýnda sayi:"+sayi);
	}
	static {
		System.out.println("main methoddan sonraki block çalýþtý");
		sayi=100;
	}
}
