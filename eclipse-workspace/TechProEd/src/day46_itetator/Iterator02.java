package day46_itetator;
import java.util.*;
public class Iterator02 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("t", "a", "r", "i", "k"));
        System.out.println("ilk hali: "+list);
        ListIterator lt1 = list.listIterator();//listýterator interfaceden lt1 veriable creat edildi. degerini listten assingn edildi
        while (lt1.hasNext()) {
          
             String depo= (String) lt1.next();
            lt1.set(depo+":-)");//list elemnalrini update etti
        }
        System.out.println("uodate hali : "+list);
        List<String> list1 = new ArrayList<>(Arrays.asList("m", "e", "l", "i", "h","a"));
        System.out.println("ilk hali: "+list1);
        
        
        
    }
}
