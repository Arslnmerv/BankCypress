package day20_arrays;

public class C06_OdevTerstenHarf {

	public static void main(String[] args) {
		
		String str="java ogren, hayati yasa";
		
		String arrStr[]=str.split("");
		
		terstenHarf(arrStr);
		
	String terstenHarf=terstenHarf(arrStr);
	
	System.out.println(terstenHarf);
	
			
	}

	private static String terstenHarf(String[] arrStr) {
		
	String	temp="";
	
		for(int i=0; i<arrStr.length ; i++) {
			 
			temp+= arrStr[arrStr.length-1-i];
			
			
	}
		return temp;
	
	}

}
