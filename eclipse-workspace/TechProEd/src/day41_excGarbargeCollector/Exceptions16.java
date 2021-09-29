package day41_excGarbargeCollector;

public class Exceptions16 {
	 public static void main(String[] args) { // 1
	        System.out.println(exceptions());    //2
	        //acde yazdirir
	    }
	    @SuppressWarnings("finally")
	    public static String exceptions() {    //3
	        String result = "";   //4
	        String v = null;   //5
	        try {
	            try {
	                result = result + "a";  //a     //6
	                v.length();             //NullPointer Exception sonras� calismaz    //7
	                result = result + "b";
	            } catch (NullPointerException e) {    //8
	                result = result + "c";    //ac    //9
	            } finally {
	                result = result + "d";    //acd    //10
	                throw new Exception();   //11  exception verir
	            }
	        } catch (Exception e) {   //12  exception yakalar
	            result = result + "e";  //acde       //13 methodcall a gider //2 ye
	        }
	        return result;
}
}
