package day35_inheritance;

public class Muhasebe extends Personel{

	public String statu;
	public int saatUcreti;
	public int maas;
	
	public int maasHesapla() {
		return maas=saatUcreti*8*30;
	}

	
	

}  
