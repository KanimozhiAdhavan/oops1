package composition;

public class UseTruck {
	public static void main(String[] args) {
		Engine e=new Engine();
		e.brand="tata";
		e.price=5000;
		Truck t=new Truck();
		t.brand="volvo";
		t.color="yellow";
		t.price=145000;
		t.isQuality=true;
		t.engine=e;
		System.out.println(t.brand+" "+t.price+" "+t.color+" "+t.isQuality+" "+t.engine.brand+" "+t.engine.price);
		
	}
	

}
