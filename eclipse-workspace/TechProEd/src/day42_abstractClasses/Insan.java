package day42_abstractClasses;

public abstract class Insan {
private String isim;
private String soyisim;
public Insan(String isim, String soyisim) {
	this.isim=isim;
	this.soyisim=soyisim;
}
public abstract void calis();
public void bilgilendirme() {
	System.out.println("isim "+this.isim +" soyisim "+ this.soyisim);
}
public void isimDegisitir(String isim,String soyisim) {
	this.isim=isim;
	this.soyisim=soyisim;
}
}

