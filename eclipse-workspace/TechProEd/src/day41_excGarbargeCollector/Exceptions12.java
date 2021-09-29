package day41_excGarbargeCollector;

		public class Exceptions12 {
		    public static void main(String[] args) {
		        int[] arr = { 34, 35, 41, 63, 21 };
		        try {
		            System.out.println(arr[30]);
		        } catch (ArrayIndexOutOfBoundsException e) {
		            System.out.println(e.getMessage());
		            System.out.println("hatali index girdiniz");
		        } finally {
		            System.out.println("dewamkee okuduysan code yeni sahillere yelken aciyor");
		        }
		/*
		 * finally blogu try-catch blogu ile veya sadece try blogu ile calisabilir.
		 * Finally blogu catch ile ongordugum bir sorun oldugunda calistigi gibi
		 *  ongoremedigim bir exception olustugunda da calisir  
		 * Final cumlesi : Finally blogu her durumda mutlaka kesinlikle ca-li-sirrrr.
		 */
	}

}
