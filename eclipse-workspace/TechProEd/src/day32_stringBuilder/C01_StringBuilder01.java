package day32_stringBuilder;

import java.util.Arrays;

public class C01_StringBuilder01 {

	public static void main(String[] args) {
		StringBuilder sb1= new StringBuilder(); // boþ bir obje 16 kapasite
		
		sb1.append("Faruk");
		System.out.println("sb1 ilk hali : "+sb1);
	    sb1.append(" Efehan");
	    System.out.println("sb1 in eklenmiþ hali : "+sb1);
	    System.out.println("sb1 uzunluk : "+sb1.length());
        System.out.println("sb1 kapasite : "+sb1.capacity());
        System.out.println("sb1 son hali : "+sb1.append(" güzel insan"));
	    System.out.println("sb1 in son halinin kapasitesi : "+sb1.capacity());
	    
	    //Faruk Efehan güzel insan
	    //Fazladan ayrýlan kapasiteyi silme obj.trimSize();
	    sb1.trimToSize();
	    System.out.println(sb1.capacity()); //fazladan kapasite boþluklarý alýnca 24
        // istenen karakterin indexini alalým obj.indexOf();
	  
	    System.out.println(sb1.indexOf("e"));// 8 ilk bulduðu e nin indexini verir
	    
	    System.out.println(sb1.lastIndexOf("e")); //16
	    
	    //istenen bir karakteri indexine göre alma
	    System.out.println(sb1.charAt(7));// 7 . indexteki karakteri getirir
	    
	    // belirli bir aralýktaki characterleri alma obj.subSquence();
	    System.out.println("7 dahil 12 hariç karaterleri : "+sb1.subSequence(7, 12));//fehan
	   System.out.println(sb1);
	    //System.out.println("5 dahil tüm hariç karaterleri : "+sb1.toString().substring(5));
	    System.out.println("5 dahil tüm hariç karaterleri : "+sb1.substring(5));
	    //sb1 deki belli bir index teki characteri silme obj.delete();
	    System.out.println("3. indexten 7. i index arasýnýn silinmiþ hali : "+sb1.delete(3, 7));//3-7 arasý
	    System.out.println("2. indexi sil : "+sb1.deleteCharAt(2));//2. indexi
	    
	    // istenen index e istenen karakteri veya karakterleri eklemek
	    sb1.insert(2, "r");
	    
	    System.out.println("2. index e r eklenmiþ hali : "+sb1);
	    
	    sb1.insert(2, 3.14);
	    System.out.println("2. index e3.14 eklenmiþ hali : "+sb1);//int bir deðeri de ekleyebiliriz
	    
	    int arr[]= {17,63,21};
	    sb1.insert(9, Arrays.toString(arr));// Arrays.toString olmazsa referansýný ekler
	    System.out.println("9. karaktere arr eklenmiþ hali : "+sb1);
	    //Ýstenen karakterin yerine karakter ya da dizi eklemek
	   
	    
	    StringBuilder sb2=new StringBuilder ("Bugun hava cook iscakk");
	    
	    
	    System.out.println(sb2);
	    sb2.replace(3, 8, "xxxxxx"); //3. indexten 8. index e kadar xxxxx yazdý
	  
	    System.out.println(sb2); // 3-8 arasýný girilen ifade ile deðiþtirdik
	    
	    // girilen ifade aralýktan kýsa olursa kalan karakterleri siler
	    sb2.replace(0, 10, "ali");
	    System.out.println(sb2);
	    
	    //5: 5. indexten itibaren yazýlacak
	    //basarili: buradaki ifadenin
	    //2: basarilinin 2. indexten itibaaren
	    //4: 4. indexine ekadar ekler
	    
	    System.out.println("özel durum : "+sb2.insert(5, "basarili", 2, 4));
	
	    //reverse metodu obj.reverse ();elemanlarý index e göre terse çevirir.
	    StringBuilder sb3=new StringBuilder ("Bugun hava cook iscakk");
	    System.out.println("sb3 ün ilk hali : "+sb3);
	    sb3.reverse();
	    System.out.println("sb3 ters cevrilmis hali : "+sb3);
	
	    
	}

}
