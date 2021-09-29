package day47_iterators;
	import java.util.Arrays;
	import java.util.LinkedList;
	public class LinkedList01 {
	    public static void main(String[] args) {
	        LinkedList<String> ll1 =new LinkedList<>(Arrays.asList("erdem","mehmet","samet","said","yagmur"));
	        System.out.println(ll1);//[erdem, mehmet, samet, said, yagmur]
	        ll1.add("merve");//--> add yapilan node LinkedList'im ensonuna ekler,,
	        System.out.println(ll1);//[erdem, mehmet, samet, said, yagmur, merve]
	        ll1.add(2,"faruk eczanesi");//--> 2. indexe node eklenir.
	        System.out.println(ll1);//[erdem, mehmet,faruk eczanesi, samet, said, yagmur, merve]
	        LinkedList<String> ll2 =new LinkedList<>(Arrays.asList(":-)",";-("));
	        ll1.addAll(ll2);//ll1 sonuna ll2 node larini ekler
	        System.out.println(ll1);//[erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve,:-),;-( ]
	        ll1.addFirst("gayet");//-->ilk index'e node ekler
	        System.out.println(ll1);//[gayet, erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(]
	        ll1.addLast("basarili");//-->son index'e node ekler
	        System.out.println(ll1);//[gayet, erdem, mehmet, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, basarili]
	        ll1.addAll(3,ll2);//-->3. index'e collection obj ll2 ekler
	        System.out.println(ll1);//[gayet, erdem, mehmet, :-), ;-(, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, basarili]
	        ll1.remove();//ilk node siler ve silinen node'u return eder--> oldur ve kalbini getir
	        System.out.println(ll1);//[erdem, mehmet, :-), ;-(, faruk eczanesi, samet, said, yagmur, merve, :-), ;-(, basarili]
	    }
	}

