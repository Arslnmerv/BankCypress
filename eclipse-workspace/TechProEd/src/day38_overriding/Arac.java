package day38_overriding;

public class Arac {

	
		// 1) Arac isimli bir superclass olusturunuz, fields : 
	//renk, motor(private), model(protected) olsun
		// 2) Constructor ekleyiniz, get ve set methodlari ve toString Method' unu ekleyiniz
		// 3) Bu siniftan Otobus sinifini uretiniz, otobusun ayrica 
	//yolcuSayisi field' inin ekleyiniz.
		// 4) Bir AracPark isimli icinde main olan bir sinif olusturunuz ve Otobus' ten obj olusturarak,
//	Otobus' un ozelliklerinin tumunu ekrana yazdiriniz.
	
	
	private String renk;
    private int motor;
    protected String model;
    
	public Arac(String renk, int motor, String model) {
		super();
		setModel(model);
		setMotor(motor);
		setRenk(renk);

	}

	public String getRenk() {
		return renk;
	}

	public void setRenk(String renk) {
		this.renk = renk;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
    
   
    
	    
	    
	    
	    
	    

}
