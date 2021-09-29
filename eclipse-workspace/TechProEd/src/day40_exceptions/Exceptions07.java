package day40_exceptions;


		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.List;
		public class Exceptions07 {
		    public static void main(String[] args) {
		        int[] arr = { 1, 2, 3, 4 };
		        System.out.println(arr[1]);//2
		        System.out.println(arr[3]);//4
		        //System.out.println(arr[5]);//ArrayIndexOutOfBoundsException unchecked 
		        
		        List<String> gzlinsn= new ArrayList<>(Arrays.asList("merve","hakan","fýrat"));
		        
		        System.out.println(gzlinsn.get(2));//
		        System.out.println(gzlinsn.get(0));//
		        System.out.println(gzlinsn.get(5));//IndexOutOfBoundsException unchecked
		        
		        //Array ve list'lerde olmayan bie index ile islem yapilirsa  
		        //java IndexOutOfBoundsException unchecked  hatasi verir.
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
	}

}
