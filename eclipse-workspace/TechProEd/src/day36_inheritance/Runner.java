package day36_inheritance;

public class Runner extends Cat {
	
	public int sayi=34;
	String str="izmir";
	int sayi1=45;
	
	Runner(){
		
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.c);
		System.out.println(this.d);
		System.out.println(this.sayi);
        System.out.println(this.str);
		System.out.println(this.sayi1);	
	}
	public static void main(String[] args) {
		Runner obj=new Runner();
	    System.out.println(obj.a);
}
}