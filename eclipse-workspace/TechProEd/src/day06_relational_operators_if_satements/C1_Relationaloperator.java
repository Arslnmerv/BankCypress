package day06_relational_operators_if_satements;

public class C1_Relationaloperator {

	public static void main(String[] args) {

		System.out.println(15 * 3 == 40); // false
		System.out.println(15 - 3 == 12);// true

		boolean esitMi = 24 / 2 == 12;

		System.out.println(esitMi);

		System.out.println( 5+2>8  ||  9<6  );// false
		System.out.println( 5+2<8  ||  9<6  );// true
		System.out.println( 5+2<8  &&  9<6  );// false
		System.out.println( 5+2<8  ||  9>=6  );// true
		System.out.println( 5+2<8  &&  9>=6  ); // true
		
		
	}

}
