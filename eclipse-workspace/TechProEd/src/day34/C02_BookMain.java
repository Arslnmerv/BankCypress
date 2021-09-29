package day34;

import java.util.Scanner;


public class C02_BookMain {

	public static void main(String[] args) {
	C01_Book kitap=new C01_Book();
	Scanner scan=new Scanner(System.in);
	System.out.println("son okudugunuz kitabi giriniz");
	String kitap2=scan.nextLine();
	kitap.setBookNmae("calikusu");
	kitap.setAuthorName(kitap2);
    System.out.println("1.kitabim : "+kitap.getBookNmae()
    +" ikinc kitabim : "+kitap.getAuthorName());
	
	}

}
