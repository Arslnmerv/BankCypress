package day42_abstractClasses;

public class BenimHesabim extends Banka {

	

	@Override
	double paraYatir(double miktar) {
		super.Bakiye+=miktar;
		return Bakiye;
	}

	@Override
	double paraCek(double miktar) {
		super.Bakiye-=miktar;
		return Bakiye;
		
	}
public BenimHesabim(double bakiye) {
	super.Bakiye=Bakiye;
System.out.println(Bakiye);
	}

}
