package day42_abstractClasses;

public class Calisan extends Insan {
     private int calisanId;
	public Calisan(String isim, String soyisim, int calisanId) {
		super(isim, soyisim);
		this.calisanId=calisanId;
	}

	@Override
	public void calis() {
		
		if (calisanId==0) {
			System.out.println("bu sahis sirket calisani degil");
			System.out.println("bu sahsin id si "+calisanId);
		}else {
			System.out.println("bu sahis bizim eleman");
			System.out.println("sahsin id si "+calisanId);
		}
		
	}public static void main(String[] args) {
		Calisan sekreter=new Calisan("merve","aslan",0);
		Calisan QAtester=new Calisan("melek","kutlu",1453);
		Calisan Developer=new Calisan("oguzhan","akkafa",1905);
		
		sekreter.bilgilendirme();
		sekreter.calis();
		
		QAtester.bilgilendirme();
		QAtester.calis();
		
		Developer.bilgilendirme();
		Developer.calis();
		
	}

}
