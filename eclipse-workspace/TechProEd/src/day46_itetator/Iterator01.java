package day46_itetator;
import java.util.*;
public class Iterator01 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("t", "a", "r", "i", "k"));
        System.out.println("ilk hali: " + list);
        ListIterator lt1 = list.listIterator();//listýterator interfaceden lt1 veriable creat edildi. degerini listten assingn edildi
        while (lt1.hasNext()) {
            String depo = (String) lt1.next();
            lt1.set(depo + ":-)");//list elemnalrini update etti
        }
        System.out.println("uodate hali : " + list);
        List<String> list1 = new ArrayList<>(Arrays.asList("m", "e", "l", "i", "h", "a"));
        //son elemanina :-) ile update ediniz
        System.out.println("ilk hali: " + list1);
        ListIterator lt2 = list1.listIterator();//listýterator interfaceden lt1 veriable creat edildi. degerini listten assingn edildi
        int count = 0;
        while (lt2.hasNext()) {
            String depo = (String) lt2.next();
            if (count == list1.size() - 1) {
                lt2.set(":-)"+depo);
            }
           
    }
   while (lt2.hasPrevious()) {
	String depo=(String) lt2.previous();
	System.out.print(depo+" ");
}    
   //hasPrevious() calismasi icin oncesinde utlaka kesinlikle 
   //hasnext ve next methodlarý ile pointer sona gelmeli
   /*"ýterator ve listIterator arasýndaki farklar
    
1) "ITERATOR" sadece hasNext(), next() ve remove() methodlarini icerir
    "LISTITERATOR"  ise hasNext(), next(),remove() hasPrevius(), Previus(), add(); set()  method'rini içerir.

2) "LISTITERATOR" sadece list'ler cin kullanilir.
    "ITERATOR" ise tum collection(list set map) elemanlari icin kullanilir

3) "ITERATOR" sadece ileri gidiyor, "LISTITERATOR" hem ileri hem geri cift yonlu gitmek icin kullanilir




   */
   System.out.println();
   System.out.println(list1);//[m, e, l, i, h, :-)a]
   
   
   
   
   
   
}
}
