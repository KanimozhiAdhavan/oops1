package Encapsulation;

public class UseMobile {
	public static void main(String[] args) {
		Battery b=new Battery("xyz",200,2.4f);
//		b.setbarnd("xzy");
//		b.setprice(200);
//		b.setcapacity(2.4f);
		Mobile m=new Mobile("oppo",30000,b);
//		m.setbrand("oppo");
//		m.setprice(30000); 
//		m.setbattery(b);
		System.out.println(b.getbrand()+" "+b.getprice()+" "+b.getcapacity()+" "+m.getbarnd()+" "+m.getprice()+" "+m.getbattery().getbrand()+" "+m.getbattery().getcapacity());
		System.out.println(b);
	    System.out.println(m);
	}

} 
