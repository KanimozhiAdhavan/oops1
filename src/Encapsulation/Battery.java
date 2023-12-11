package Encapsulation;

public class Battery {
	private String brand;
	private int price;
	private float capacity;
	public Battery(String brand,int price,float capacity) {
		this.brand=brand;
		this.price=price;
		this.capacity=capacity;
	}
	public void setbarnd(String barnd) {
		this.brand=barnd;
	}
	public String getbrand() {
		return brand;
	}
	public void setprice(int price) {
		this.price=price;
	}
	public int getprice() {
		return price;
	}
	public void setcapacity(float capacity) {
		this.capacity=capacity;
	}
	public float getcapacity() {
		return capacity;
	}
	public String toString() {
		return "Brand="+brand+"Price="+price+"capacity="+capacity;
	}

}
