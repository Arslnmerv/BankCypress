package day33;

public class Car {
public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public double getEngine() {
		return engine;
	}
	public void setEngine(double engine) {
		this.engine = engine;
	}
	public int getDoors() {
		return doors;
	}
	public void setDoors(int doors) {
		this.doors = doors;
	}
	public int getTekerlekleri() {
		return tekerlekleri;
	}
	public void setTekerlekleri(int tekerlekleri) {
		this.tekerlekleri = tekerlekleri;
	}
public String color;
public String model;
public double engine;
public int doors;
public int tekerlekleri;	
    public Car() {}
	public Car(String color, String model,double engine,int doors,int tekerlekleri) {
	this.color=color;
	this.model=model;
	this.engine=engine;
	this.doors=doors;
	this.tekerlekleri=tekerlekleri;
	}
}
	


