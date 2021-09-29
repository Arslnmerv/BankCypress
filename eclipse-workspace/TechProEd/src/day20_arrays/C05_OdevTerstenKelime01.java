package day20_arrays;



public class C05_OdevTerstenKelime01 {

	public static void main(String[] args) {
	/*	// "java ögren, hayati yasa" kelime kelime terse cevirme


		String str="java ögren, hayati yasa";
		
		String arrStr []= str.split(" ");
		String temp[]= new String[arrStr.length];
		
		for (int i=0; i< arrStr.length ; i++) {
			
			temp[i]=arrStr[arrStr.length-1-i];
				System.out.print(temp[i]+" ");	
		
	      
	}  System.out.println("");
		
	System.out.println(Arrays.toString(temp));

*/
		String str="java ogren, hayati yasa";
		
		String arrStr[]=str.split(" ");
		
		kelimeTersten(arrStr);
		
		String tersten=kelimeTersten(arrStr);
	    System.out.println(tersten);
	
	}

	private static String kelimeTersten(String[] arrStr) {
		
		String temp="";
		for (int i=0 ; i<arrStr.length ; i++) {
		
		temp+=arrStr[arrStr.length-1-i];
		temp+=" ";
		}
		
		return temp ;
	}
}