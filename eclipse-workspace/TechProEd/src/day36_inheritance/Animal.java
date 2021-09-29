package day36_inheritance;

public class Animal {
	public int a=11;
	public int b;
	public Animal() {
		System.out.println("psiz cons");
	}
	public Animal(int i) {
		System.out.println("pli cons");
	}
	public void mB() {
		System.out.println("animal"+ "mammal");
	}
	
public void mA() {
	System.out.println("animal");
}
}
