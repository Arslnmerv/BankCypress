package day37_overriding;

public class Animal {
public void beslenme() {
	System.out.println("tum hayvanlar beslenir");
}
  public void tatli() {//public olur default olur protected olur private olmazz
	System.out.println("trilece");
}
protected String icecek() {
	System.out.println("nigde gazozu");
	return "ohhh";
}
public Integer topla() {
	return 34+6;
}
public Animal fatih() {
	return new Animal();
}
}
