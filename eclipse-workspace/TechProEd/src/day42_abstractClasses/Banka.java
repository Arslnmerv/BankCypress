package day42_abstractClasses;

public abstract class Banka {
	double Bakiye;

	public Banka(double bakiye) {
		
		this.Bakiye= Bakiye;
	}
	public Banka() {
		System.out.println("hesap haraketleri");
	}
	abstract double paraYatir(double miktar);
	
    abstract double paraCek(double miktar);
}