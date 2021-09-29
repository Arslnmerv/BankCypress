package day40_exceptions;

		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		public class Exceptions04 {
			
			/*	
			EXCEPTIONS   --->
			1)iki tur exceptions vardir.
			i) Compile Time (checked) Exceptions: kod creat edilirken java'nin ongordugu olasi sorunlara karsi hatanin altinin cizilmesi.
			Ama  her alti kirimizi cizilen kod exceptions degildir.
			ii) Run Time (unchecked) Exceptions: Kod run edildiginde olusan exceptions'dur.
			2) Code creat edilirkenException kullanilmasi gerekirse:
			            
			            a--> Add throws declarations :Hata olustugunda concol'a hata ile ilgili mesaj verir
			            b-->try-catch block :Hata olustugunda  hata'nin yazdirilmasi ve handle edilmesini saglar
			            
			3) try  block'tan sonra en az bir tane catch block olamli aksi durumda CTE verir...!!!!!
			4) try-catch block'ta try body hatasiz calisirsa catch body calistirilmaz. catch body try body'deki exceptions'da calisir.
			5) try  body'den sonra 1 den fazla catch body creat edilebilir. Olusan exceptions hangi catch ile ilgili ise o catch body
			 calisir. Ayni anda sadece tek catch body calisir. tek try ama birden cok catch body olan durumlarda catch bodyler arasinda yukaridan 
			 asasiya dogru child - parent iiskisi olmali yosa CTE (erisilemez catch blogu) verir.catch bodyler arasinda parent-child iliskisi yoksa siralama onemli degil 
			 yukaridan asagiya catchler calisir.
			 */
		    public static void main(String[] args) {
		        try {// parent try-catch--> file yerini kontrol ediyor ya evde yoksa hatasini handle
		                // ediyor
		            FileInputStream fis = new FileInputStream(
		                    "/Users/yeni/eclipse-workspace/javaSummer2021Tr/src/_14_Exceptions/file");
		            fis.close();//fis obj close edildi
		            int i = 0;
		            // child try-catch --> file icerigini okuma ve yazdirma islemini handle etti
		            while ((i = fis.read()) != -1) {// iint degeri fis obj read metodu ile atandiginda -1 esit degilse while
		                                            // bodye gir
		                System.out.print((char) (i));// (i) data casting ile i'nin ascii degeri yerine char degerleri
		                                                // yazdirildi
		            }
		        }
		        catch (FileNotFoundException e) {
		            // e.printStackTrace();
		            System.out.println(e.getMessage());
		        }
		        catch (IOException e) {// I :input O:output dosyalarla ilgili genel yazma ve okuma sorunlari ile handle
		                                // eder
		            // e.printStackTrace();//daha cok kullanilir cunku hatanin tum verisini verir
		            // handle kolayligi saglar
		            System.out.println(e.getMessage());// hata mesajini yazdirir
		        }
		        
		        System.out.println();
		        System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");


	}

}
