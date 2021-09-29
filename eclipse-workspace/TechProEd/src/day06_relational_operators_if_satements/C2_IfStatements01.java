package day06_relational_operators_if_satements;

public class C2_IfStatements01 {

	public static void main(String[] args) {

		int a = 2;
		int b = 3;

		if (a > b) {
			System.out.println(a + b);
		}

		if (a == b) {
			System.out.println(a * b);

		}
		if (a > b || a + b < 10) {
			System.out.println("yasasin java");//sartin sonucu true ise ilk body calisir.
			                                   //false ise ilk body calismaz.
		}

	
		if (a+b<0 || a*b>20) {
			System.out.println("bitti bu is");
			
		}
        	
	    
	}

}
