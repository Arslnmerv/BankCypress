package day22_23_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C06_ArrayList06 {

	public static void main(String[] args) {
		// 100'den buyuk ilk 20 fibonacci sayisini list olarak yazdirin
		
		List <Integer> fibonacci= new ArrayList <> ();
		List <Integer> istenenSayilar = new ArrayList<>();
		
		fibonacci.add(0);
		fibonacci.add(1);
		
		int sayi=0;
		int i=0;
		int count=0;
		
		do {
			sayi=fibonacci.get(i)+fibonacci.get(i+1);
			fibonacci.add(sayi);
			
			if (sayi>100) {
				istenenSayilar.add(sayi);
				count++;
			}
			i++;
			
		} while(count<20);
		System.out.println(istenenSayilar);
		
		
	}

}
