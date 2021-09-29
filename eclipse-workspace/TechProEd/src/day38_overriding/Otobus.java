package day38_overriding;

public class Otobus extends Arac {
    int yolcuSayisi;

	public Otobus(String renk, int motor, String model, int yolcuSayisi) {
		super(renk, motor, model);
		this.yolcuSayisi = yolcuSayisi;
	}

	@Override
	public String toString() {
		return "Otobus [yolcuSayisi=" + yolcuSayisi + ", model=" + model + ", renk=" + getRenk() + ", motor"
				+ getMotor() + "]";
	}

	
	

	
    

}
