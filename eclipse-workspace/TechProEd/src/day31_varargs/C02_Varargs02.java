package day31_varargs;

public class C02_Varargs02 {

	public static void main(String[] args) {
		//varargs kullanarak verilen stringleri birleþtiren concat isimli bir metod yazýn.
	
		String str="m";
	    String str1="e";
	    String str2="r";
	    String str3="v";
	    String str4="e";
	// concat("m","e","r","v","e"); string declare ve assign etmeden de bu þekilde olur
	    
	    concat(str,str1,str2,str3,str4);
	}

	private static void concat(String ... str) {
		String s="";
		for (String w:str) {
			s+=w; //s=s.concat(w);
		}
		System.out.println(s);
	}

}
