package day31_varargs;

public class C04_Varargs04 {

	public static void main(String[] args) {

		int arr[] = { 1, 3, 5, 7, 9 };

		System.out.println("Array toplamý : " + arrTopla(arr));
		System.out.println("Varargs toplami : " + varargstopla(1, 3, 5, 7, 9));
		System.out.println("Varargsýn arr parametreli toplami : " + varargstopla(arr));
		
		
	}   // varargs array gibi davrandýðý için herhangi bir arrayi parametre olarak alabilir

	private static int varargstopla(int... i) {
		int topla = 0;
		for (int each : i) {
			topla += each;
		}
		return topla;
	}

//array elemanlarýný toplayan metod
	private static int arrTopla(int[] arr) {
		int topla = 0;
		for (int a : arr) {
			topla += a;
		}
		return topla;
	}
//varargs elemanlarý toplayan metod

}
