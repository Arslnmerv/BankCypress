package day08_ternaryOperator;

public class C03_Ternary {

	public static void main(String[] args) {
		
		  int sayi=50;
	        
	        String sonuc = sayi%2==0 ? "Sayi cift" : "Sayi tek";
	        
	        System.out.println(sonuc);
	        
	        System.out.println(sayi>100 ? "Sayi 100'den buyuk " : 10);
	
	        int y = 1;
	        int z = 1; 
	        
	        int a = y<10 ? y++ : z++;
	        
	        
	        System.out.println(y + "," + z + "," + a); 
	
	
	
	}
	
	

}
