package day39_exceptions;
		import java.util.Scanner;
		public class Exceptions01 {
		    public static void main(String[] args) {
		        //kullanicidan alacaginiz iki tam sayinin bolumunu yazdiriniz
		         
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("bolunen sayiyi giriniz : ");
		        int sayi1=scanner.nextInt();
		        
		        System.out.print("bolen sayiyi giriniz : ");
		        int sayi2=scanner.nextInt();
		        
		        try {
		            System.out.println("bolum : "+sayi1/sayi2);
		            
		        } catch (ArithmeticException e) {//try body'sinden muhtemel hata ArithmeticException olarak catch body'a sart olarak yazildi
		        System.out.println("hatali giris yaptýn  bolen 0 olamaz");/*
		                                                                    e: ArithmeticException class'indan data type
		                                                                      ArithmeticException olan bir exception obj
		                                                                        manual handle yaptik
		                                                                    */
		        
		        }
		            
		        
		            
		        }
		        
		        
		        
		    }
		    
		    
		    
		    
		    
		    
		    
		    
		    
	
