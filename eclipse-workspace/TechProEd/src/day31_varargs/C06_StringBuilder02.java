package day31_varargs;

public class C06_StringBuilder02 {

	public static void main(String[] args) {
		StringBuilder sb1= new StringBuilder(); //bos bir sb1 objesi ürettik
		//SB e eleman ekleme obj.appent(obj);
		sb1.append("Faruk");
		System.out.println("sb1 ilk hali : "+sb1);
	    sb1.append(" Efehan");
	    System.out.println("sb1 in eklenmiþ hali : "+sb1);
	    System.out.println("sb1 uzunluk : "+sb1.length());
        System.out.println("sb1 kapasite : "+sb1.capacity());
        System.out.println("sb1 son hali : "+sb1.append(" güzel insan"));
	    System.out.println("sb1 in son halinin kapasitesi : "+sb1.capacity());
	    
	}

}
