package day40_exceptions;



	
		/*Kullanicidan carpma yapmak icin bir String isteyin. Kullanicinin girdigi String sadece sayilardan olusuyorsa sayiyi 2 ile carpip sonucu yazdirin.
		Kullanici sayilardan olusmayan bir String girerse “Girdiginiz String sayiya cevrilemez” yazdirin.
		*/
		
		
		public class Exceptions08 {
		    public static void main(String[] args) {
		        
		        int sayi=34;
		        
		        String str="1453";
		        
		    //  String str1=sayi;//CTE --> checked exception ClassCast
		        
		        int okulNo=Integer.parseInt(str);
		        
		        System.out.println("okul no:"+okulNo);
		        System.out.println(str+35);//143535
		        System.out.println(okulNo+35);//1488
		        
		        
		        String str1="14a3";
		        
		    //  int strSayi=Integer.parseInt(str1);//NumberFormatException  unchecked
		        
		        
		        //UNchecked-->(r)Unchecked
		        
		        Object sayi3= 45;//object data type hz adem javanin tum class'arinin parenti
		        
		        String strSayi2=(String)sayi3;//data Type Class casting-->buyuk veri kucuk kont atandi
		                                        // Data turlerini casting yaparkern uygun olmayan islem 
		                                        //ClassCastException unchecked verir.
		        
		        
		        
	}

}
