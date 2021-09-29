package day41_excGarbargeCollector;

public class C01 {
	/*
	'ortalama' isminde bir method oluþturun ve int v  - int f 
	 isminde 2 adet parametresi olsun.
	int v = vize
	int f = final
	Eðer  vize 100 den büyük, veya final 100'den büyük, 
	veya vize 0'dan küçük, veya final 0'dan küçük ise,
	Sistem ArithmeticException hatasý versin ve "Notlar 0-100 
	arasýnda olmalý" mesajýný döndürsün.
	Diðer durumlarda ise,
	vizenin yüzde 40 ýný, finalin yüzde 60 ýný alsýn 
	ve toplasýn.(ortalama =)
	vizeye 120, finale 80 girin.
	Programýn çalýþmasýný saðlayýn. (handle edin)
	 */
	
	public static void main(String[] args) {
     try {
		ortalama(120,80);
	} catch (Exception e) {
		System.out.println(e);
		
	}
	
	}
	public static void ortalama(int v, int f) {
		if (v>100||v<0||f>100||f<0) {
			throw new ArithmeticException("Notlar 0-100 arasýnda olmalý");
		}else {
			System.out.println((v*4)/10+ (f*6)/10);
		}
	}
	
}
