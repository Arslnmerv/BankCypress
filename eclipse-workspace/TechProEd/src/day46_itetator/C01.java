package day46_itetator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class C01 {
  public static void main(String[] args) {
	List<String> l1=new ArrayList<>(Arrays.asList("z","e","h","r","a"));
System.out.println("listin ilk hali "+ l1);
  for (int i = 0; i < l1.size(); i++) {
	System.out.print(l1.get(i)+" ");
	
	
	
}
  System.out.println();
  System.out.println("***************");
  for (String w : l1) {
	System.out.print(w+" ");
}
  System.out.println();
 System.out.println("****************");
  for (int i = 0; i < l1.size(); i++) {
	System.out.print(l1.get(i) +":-)");
}
  System.out.println(":-) sonrasi l1 "+ l1);
  
	List<String> l2=new ArrayList<>(Arrays.asList("s","a","i","d"));
    Iterator it1=l2.iterator();
    while (it1.hasNext()) {
		it1.next();
		it1.remove();
	}
    System.out.println("l2 nin iterator sonrasý"+l2);
    
  }
}
