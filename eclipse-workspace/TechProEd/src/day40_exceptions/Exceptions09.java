package day40_exceptions;


		import java.util.Scanner;
		public class Exceptions09 {
		    public static void main(String[] args) {
		        /*
		         * Kullanicidan carpma yapmak icin bir String isteyin. Kullanicinin girdigi
		         * String sadece sayilardan olusuyorsa sayiyi 2 ile carpip sonucu yazdirin.
		         * Kullanici sayilardan olusmayan bir String girerse
		         * "Girdiginiz String sayiya cevrilemez" yazdirin.--> hata firlatin...
		         */
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("sayi giriniz: ");
		        String str = scanner.nextLine();
		        // NumberFormatException
		        try {
		            System.out.println(2 * Integer.parseInt(str));
		        } catch (NumberFormatException e) {
		            System.out.println("Girdiginiz String sayiya cevrilemez");
		        }
		        scanner.close();

	}

}
