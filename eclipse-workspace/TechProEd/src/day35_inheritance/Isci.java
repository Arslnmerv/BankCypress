package day35_inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {
	Isci i1=new Isci();
	
	i1.adres="inonu mah 821sk no21";
	i1.id=i1.idAta();
	i1.isim="merve";
	i1.soyIsim="aslan";
	i1.saatUcreti=15;
	i1.statu="temizlik";
	i1.tel="02567841256";
	i1.maas=i1.maasHesapla();
	System.out.println(i1.isim + "\n" + i1.soyIsim+  "\n" +i1.tel+ "\n" + i1.adres + "\n" + i1.saatUcreti + "\n" +i1.id + "\n" + i1.maas);
	
	

	}

}
