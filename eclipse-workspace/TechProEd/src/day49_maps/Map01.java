package day49_maps;

import java.util.HashMap;
	public class Map01 {
	    public static void main(String[] args) {
	        HashMap<Integer,String> m1 =new HashMap<>();
	        m1.put(101,"Levent");
	        m1.put(102,"Said");
	        m1.put(103,"Hasan");
	        m1.put(104,"Canan");
	        m1.put(105,"Ayse");
	        System.out.println(m1);//{101=Levent, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}
	        m1.put(101,"harun");//key values!i update edilir eski veri uzerine yeni girilen veri yazilir
	        System.out.println(m1);//{101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse}
	        m1.put(106,"Canan");//ayný value farkli key'e atanabilir
	        System.out.println(m1);//{101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan} value'ler uniqu olamk zorunda degil.
	        m1.put(null,"haluk");//key degeri null alabilir
	        System.out.println(m1);//{null=haluk, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}
	        m1.put(null,"hakan");
	        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan}
	        m1.put(107,null);//Value degerleri coklu null olabilir
	        m1.put(108,null);//Value degerleri coklu null olabilir
	        m1.put(109,null);//Value degerleri coklu null olabilir
	        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null}
	        System.out.println(m1.get(103));//Hasan
	        System.out.println(m1.values());//[hakan, harun, Said, Hasan, Canan, Ayse, Canan, null, null, null]--> map'deki tüm elemanlarin value'lerini return eder.
	        System.out.println(m1.keySet());//[null, 101, 102, 103, 104, 105, 106, 107, 108, 109]
	        System.out.println(m1.getOrDefault(106, "boyle bir eleman yoktur"));//canan
	        System.out.println(m1.getOrDefault(111, "boyle bir eleman yoktur"));//boyle bir eleman yoktur.
	        m1.putIfAbsent(110, "ahmet");//--> belirtilen key'de value yoksa verilen value'i ekler...
	                                    // yazdirilirse belirtilen key'de value olup olmadigini true/false return eder
	        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=ahmet}
	        m1.putIfAbsent(105,"salih");//--> 105 Key'de Ayse value oldg icin salih put edilmedi
	        System.out.println(m1.putIfAbsent(105, "salih"));//105 key'deki value degeri Atse return edildi
	        System.out.println(m1);//{null=hakan, 101=harun, 102=Said, 103=Hasan, 104=Canan, 105=Ayse, 106=Canan, 107=null, 108=null, 109=null, 110=ahmet}

	
	
	
	
	
	
}
}
