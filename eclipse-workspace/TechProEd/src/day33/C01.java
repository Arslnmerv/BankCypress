package day33;

import java.util.Scanner;

import day34.C01_Book;

public class C01 {

	
	public C01(int i, String string, String string2, int j, int k) {
		
	}

	public static void main(String[] args) {
		Car car1=new Car();
		car1.color="kirimizi";
		car1.model="merdeces";
		car1.engine=4.0;
		car1.doors=5;
		
		System.out.println("arabanin modeli : "+car1.model);
		System.out.println("arabanin rengi : "+car1.color);
		System.out.println("arabanin motoru : "+car1.engine);
		System.out.println("arabanin kapilari : "+car1.doors);
		
		car1.engine=5.0;
		System.out.println("****yeni atamma****");
		System.out.println("arabanin motoru : "+ car1.engine);
		

		System.out.println("ikinci cons****");
		
		
		Car car2=new Car("sari","Civic",6,5,4);
		System.out.println(car2.color+", " + car2.model + ", "+ car2.engine+", "+ 
				car2.doors+", "+ car2.tekerlekleri);
		
		
		System.out.println("encapsulation");
		
		Car car3=new Car();
		car3.setColor("mavi");
		car3.setDoors(5);
	    System.out.println("aracin rengi "+car3.getColor() +" aracýn kapi sayisi "+ car3.getDoors() );
		
		}
	}

