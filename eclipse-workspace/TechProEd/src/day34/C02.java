package day34;

import java.util.Scanner;

public class C02 {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	
	System.out.println("adinizi giriniz : ");
	String name=scan.nextLine();
	
	System.out.println("oda sayisini giriniz : ");
	int odaSayisi=scan.nextInt();
	
	System.out.println("balkon tercihiniz : ");
    boolean balcony=scan.nextBoolean();
    
    C03 kiraci=new C03();
    
    kiraci.setName(name);
    kiraci.setBalconyOrtNo(balcony);
    kiraci.setRoomCount(odaSayisi);
    
    
    int toplamKira=kiraci.balkonSor(balcony)+kiraci.kiraHesapla(odaSayisi);
    System.out.println(kiraci.getName()+" bey kira ucretiniz : "+toplamKira);
	}

}
