package day29_passByValueMutableClass;

import java.util.ArrayList;
import java.util.List;

public class C02_PassByValueList2 {

	public static void main(String[] args) {
		
		List <Integer> list=new ArrayList<>();
		
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println(list);
		
		forarttir(list);
		
		System.out.println("for each ile listemi arttýrdým : "+list);
	
		setarttir(list);
		
		System.out.println("set metodu ile listemi arttýrdým : "+ list);

}

	private static void setarttir(List<Integer> list) {
		for (int i=0; i<list.size(); i++) {
			list.set(i, list.get(i)+3);
		
		}
		System.out.println("set metodundan sonra list : "+list);
	}

	private static void forarttir(List<Integer> list) {
		
		for (Integer each:list) {
			each+=5;
		System.out.print(each+" ");
	}
       System.out.println("");
       System.out.println(list);
   }





}