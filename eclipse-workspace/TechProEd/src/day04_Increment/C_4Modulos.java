              package day04_Increment;

public class C_4Modulos {

	public static void main(String[] args) {
		
		//5496 sayisinin rakamlar toplamini bulalim
		
		int sayi=5496;
		int rakamlarToplami=0;
		
		// 1. sayi%ile son basamaðý elde ederiz
		
		int rakam=sayi%10;
		
		
		//2. bu rakamý rakamlartoplamýna ekleriz

		rakamlarToplami+= rakam;
		 
		// 3. deðerini aldýðýmýz son basamaktan kurtulmak için 10 a böleriz
		
		sayi/=10;
		
		// bu satýra geldiðimizde sayi=549 rakamlar toplami=6 olur
		
		rakam=sayi%10;
	    
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
		// bu satýra geldiðimizde sayi=54 rakamlar toplami=15 olur
   
        rakam=sayi%10;
	    
		rakamlarToplami+=rakam;
		
		sayi/=10;
		
		// bu satýra geldiðimizde sayi=5 rakamlar toplami=19 olur

		rakam=sayi%10;
		    
		rakamlarToplami+=rakam;
			
		sayi/=10;
	
	   // kodumuzun sonunda rakamlarToplamý 24 sayi 0 oldu
		
		System.out.println("RAKAMLARIN TOPLAMI : "+rakamlarToplami);
	    System.out.println("SAYININ SON DEGERI :" +sayi);
	}
	

}
