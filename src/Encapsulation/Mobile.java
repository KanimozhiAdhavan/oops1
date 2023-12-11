package Encapsulation;

public class Mobile {
	private String brand;
	private int price;
	private Battery battery;
	public Mobile(String brand,int price,Battery battery) {
		this.brand=brand;
		this.price=price;
		this.battery=battery; 
	}
	public void setbrand(String brand) {
		this.brand=brand;
	}
	public String getbarnd() {
		return brand;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public void setbattery(Battery battery) {
		this.battery=battery;
	}
	public Battery getbattery() {
		return battery;
	}
	public String toString() {
		return "Barnd="+brand+"Price="+price+"Battery="+battery;
	}

}
