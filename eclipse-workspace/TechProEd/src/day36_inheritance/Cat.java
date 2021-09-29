package day36_inheritance;

public class Cat extends Mammal {
	public int c=12;
	public int d=15;
	public void mC() {
		System.out.println("cat"+"mammal");
	}
	 Cat(String s) {
		 this();
		 System.out.println(super.c);
		System.out.println("pli cons cat class");
	}
	Cat() {
		
		System.out.println("psiz cons cat class");
	}
	
}
