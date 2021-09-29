package day39_exceptions;


	
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.io.IOException;
		public class Exceptions03 {
		    public static void main(String[] args) {//inner try-catch parent child try-catch
		        
		        try {//parent try-catch--> file yerini kontrol ediyor ya evde yoksa hatasini handle ediyor
		            FileInputStream fis =new FileInputStream("/Users/yeni/eclipse-workspace/javaSummer2021Tr/src/_14_Exceptions/file");
		         int i=0;
		         
		         
		        try {//child try-catch  --> file icerigini okuma ve yazdirma islemini handle etti
		            while ((i=fis.read())!=-1) {//iint degeri fis obj read metodu ile atandiginda  -1 esit degilse while bodye gir
		                System.out.print((char)(i));
		            }
		            
		        } catch (IOException e) {//I :input O:output
		            //e.printStackTrace();//daha cok kullanilir cunku hatanin tum verisini verir handle kolyligi saglar
		            System.out.println(e.getMessage());
		            
		        }
		        
		        
		        
		        
		        
		    }
		        
		        catch (FileNotFoundException e) {
		            
		            //e.printStackTrace();
		            System.out.println(e.getMessage());
		            
		        }
		        
		        
		        
		        
		        
		        
		        
		        System.out.println();
		        
		        
		        System.out.println("dewamkeee yazisini okuduysan kod bu satira kadar sorunsuz run olmustur...");
		        
		        
		        
		        
		   
	}

}
