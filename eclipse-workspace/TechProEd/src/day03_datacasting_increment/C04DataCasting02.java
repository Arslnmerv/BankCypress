package day03_datacasting_increment;

public class C04DataCasting02 {

	public static void main(String[] args) {
		
		double sayi1=3.14;
		
		int sayi2=(int)sayi1;
   
		System.out.println("double deðiþken : "+ sayi1);
    System.out.println("int deðiþken : "+ sayi2);

	   byte sayi3=(byte) sayi2;
	   System.out.println("byte deðiþken : "+ sayi3);
	
	   int sayi4=95;
	   int sayi5=10;
	   
	   System.out.println("bölme sonucu : "+sayi4/sayi5);
	   
	   double sayi6=2000;
	   System.out.println(sayi6/sayi5);
	   
	   double sayi7=5;
	  
	   System.out.println(sayi4/sayi7);
	
	}
	

}
