package OOP;

public class Circlemain {

	public static void main(String[] args) {
		Circle c1=new Circle();
		//ex. for method overriding
		Circle c2=new shape();
		c2.area();
		c1.area();
		System.out.println(c1.sun(2, 4));
		System.out.println(c1.sun(2, 4,9));
		
	}

}
