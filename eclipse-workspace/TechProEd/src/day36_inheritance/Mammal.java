package day36_inheritance;

public class Mammal extends Animal {
	public int b=13;
	public int c=12;
	public Mammal() {
		this('k');
		System.out.println("mammal psiz cons");
	}
	public Mammal(char j) {
		super(45);
		System.out.println("mammal pli cons");
	}
	public void mB() {
		
		System.out.println("animal"+ "mammal");
	}
	public void mC() {
		System.out.println("cat"+"mammal");
	}
}
