package day34;

public class C03 {
private String name;
private int roomCount;
private boolean balconyOrtNo;
private int kira;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getRoomCount() {
	return roomCount;
}
public void setRoomCount(int roomCount) {
	this.roomCount = roomCount;
}
public boolean isBalconyOrtNo() {
	return balconyOrtNo;
}
public void setBalconyOrtNo(boolean balconyOrtNo) {
	this.balconyOrtNo = balconyOrtNo;
}
public int kiraHesapla(int roomCount) {
	if (roomCount==0) {
		this.kira=1400;
	}else if (roomCount==1) {
		this.kira=1700;
	}else if (roomCount==2) {
		this.kira=2200;
	}else if (roomCount==3) {
		this.kira=2700;
	}else {
		System.out.println("hatali veri giridiniz");
	}
	return this.kira;
	
}
public int balkonSor(boolean balkonyOrtNo) {
	if (balkonyOrtNo==true) {
		this.kira+=200;
	}
	return this.kira;
}









}

