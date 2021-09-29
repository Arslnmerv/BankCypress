package day49_maps;
		import java.util.Arrays;
		import java.util.Deque;
		import java.util.LinkedList;
		public class Deque02 {
		    public static void main(String[] args) {
		        Deque<String> dq1=new LinkedList<>(Arrays.asList("SUNA","onur","Suleyman","harun"));
		        System.out.println(dq1);//[SUNA, onur, Suleyman, harun]
		        System.out.println(dq1.peekFirst());//SUNA -->ilk elemani silmeden verir
		        System.out.println(dq1.pollFirst());//SUNA -->ilk elemani silerek verir
		        System.out.println(dq1);//[onur, Suleyman, harun]
		        System.out.println(dq1.peekLast());//harun  -->son elemani silmeden verir
		        System.out.println(dq1);//[onur, Suleyman, harun]
		        System.out.println(dq1.pollLast());//harun  -->son elemani silerek verir
		        System.out.println(dq1);//[onur, Suleyman]
		        dq1.add("yunus");
		        dq1.add("yusuf");
		        System.out.println(dq1);//[onur, Suleyman, yunus, yusuf]
		        System.out.println(dq1.getFirst());//onur --> istenen ilk elamani getirir ancak silmez
		        System.out.println(dq1.getLast());//yusuf --> istenen son elamani getirir ancak silmez
		        System.out.println(dq1);//[onur, Suleyman, yunus, yusuf]
		        System.out.println(dq1.pop());//onur -->ilk elemani silerek verir
		        System.out.println(dq1);//[Suleyman, yunus, yusuf]
		        dq1.clear();//--> Deque'i  bosalttik
		      System.out.println(dq1.element());////bos Deque'den  element() methodu ile ilk eleman cagirilirsa NoSuchElementException firlatir
		        System.out.println(dq1.pop());//onur-->bos Deque'den  pop() methodu ile ilk eleman cagirilirsa NoSuchElementException firlatir
		        System.out.println(dq1);//[Suleyman, yunus, yusuf]
		    
		     // System.out.println(dq1.peekFirst());//bos Deque'den ilk elemani cagirdik nuul verdi code kirilmadi.
		     // System.out.println(dq1.peekLast());//bos Deque'den  son elemani cagirdik nuul verdi code kirilmadi.
		     // System.out.println(dq1.getFirst());// bos Deque'den  get() methodu ile ilk eleman cagirilirsa NoSuchElementException firlatir
		     // System.out.println(dq1.getLast());// bos Deque'den  get() methodu ile son eleman cagirilirsa NoSuchElementException firlatir
		    }
		

}
