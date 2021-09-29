package Java;

import java.util.Scanner;

public class C07_ {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("bir isim giriniz");
		String str=scan.nextLine();
		/*if(str.length()==3){
		  if (str.charAt(0)==str.charAt(1) || str.charAt(0)==str.charAt(2) || str.charAt(1)==str.charAt(2)) {
			System.out.println("isim ayni karakterlere sahiptir.");
		}else {
			System.out.println("Dizenin benzersiz karakterleri var");
		}
	}else {
		System.out.println("lutfen 3karakterli bir isim giriniz");
	}*/
System.out.println(str.length()==3 ?  (str.charAt(0)==str.charAt(1) || str.charAt(0)==str.charAt(2) || str.charAt(1)==str.charAt(2) ? 
	"isim ayni karakterlere sahiptir.": "Dizenin benzersiz karakterleri var") : "lutfen 3 karakterli bir isim giriniz");
	}
	}
