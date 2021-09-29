package Java;

public class C0111 {

	public static void main(String[] args) {
	
//		Bir diziyi parametre olarak kabul eden ve dizideki 
			//tüm öðelerin toplamýný döndüren bir method yazýn. Ardýndan sonucu main metodda yazdýrýn.
		//	Eg : 

			//	input : {1,2,3,4,5,6,7,8};

			//	output: 36
		int[] arr={1,2,3,4,5,6,7,8};
		
		
		System.out.println("verilen arraydeki sayilarin toplami : "+sum(arr));
		
		
	}

	private static int sum(int[] arr) {
		int toplam=0;
		for (int i = 0; i < arr.length; i++) {
			toplam+=arr[i];
		}
		return toplam;
	}

}
