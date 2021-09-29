package day32_stringBuilder;

import java.time.LocalTime;

public class C02_StringBuilder02 {

	public static void main(String[] args) {
// 1000 kere donecek bir loop yazalim
// loop'da String ve StringBuilder kullanip 
// oncesinde ve sonrasinda zaman alalim
		// hizlarini karsilastiralim

	LocalTime zaman=LocalTime.now();
	System.out.println("String öncesi : "+zaman);
	String temp="";
	for (int i=0; i<1000 ; i++) {
	 temp+="s";
		
	}System.out.println(temp);
	
	LocalTime zaman1=LocalTime.now();
	System.out.println("String sonrasi ve sb öncesi : "+zaman1);
	
	StringBuilder sb=new StringBuilder();
	
	for (int i=0; i<1000 ; i++) {
		sb.append("a");
	}System.out.println(sb);
	 
	
	LocalTime zaman2=LocalTime.now();
	System.out.println("Sb sonrasi : "+zaman2);
	
	
	
	
	
	}

}
