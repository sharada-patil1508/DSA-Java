package OOP;

public class Boxmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b1=new Box();
		System.out.println(b1.l+" "+b1.w+" "+b1.h);
		Box b2=new Box(2,4,6);
		System.out.println(b2.l+" "+b2.w+" "+b2.h);
		Box b3=new Box(b2);
		System.out.println(b3.l+" "+b3.w+" "+b3.h);
		Box b4=new Box(8);
  		System.out.println(b4.side);
  		Boxweight b5=new Boxweight(5,7,3,2);
  		System.out.println(b5.l+" "+b5.w+" "+b5.h+" "+b5.weight);
  		Boxweight b6=new Boxweight(9,12);
  		System.out.println(b6.side+" "+b6.weight);
  		Boxweight b7=new Boxweight(b5);
  		System.out.println(b5.side+" "+b5.l+" "+b5.w+" "+b5.h+" "+b5.weight);
  		Box b8=new Boxweight(8,4,3,2);
  		System.out.println(b8.side);
  		Boxcolor b9=new Boxcolor(7,8,4,2);
  		System.out.println(b9.l+" "+b9.w+" "+b9.r+" "+b9.y);
  		
  		
  		
	}
}
