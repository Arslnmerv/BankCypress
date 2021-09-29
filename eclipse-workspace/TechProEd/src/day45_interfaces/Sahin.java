package day45_interfaces;

public class Sahin extends Tofas implements IcDonanim ,disDonanim{
	    @Override
	    public void koltuk() {
	        System.out.println("deri koltuk yazin pisirir..");
	        System.out.println("icinde saman olmasin yeter");
	        
	    }
	    @Override
	    public void motor() {
	        System.out.println("1.6 aile motoru");
	        
	    }
	    @Override
	    public void yakit() {
	        System.out.println("tup takmazsan coookmyakar");
	        
	    }
	    @Override
	    public void ayna() {
	        System.out.println("elentirkli aynalar");
	        
	    }
	    @Override
	    public void kapi() {
	        System.out.println("4 kapili");
	        
	    }
	    @Override
	    public void kaporta() {
	        System.out.println("kordon gibi kaporata sahip");
	     
}
	    
}