package Inheritance;

public class Main {

	public static void main(String[] args) {
		//call the construcor that will take 2 parameters
		Box box=new Box();
		System.out.println(box.l+" "+box.w+" "+box.h);
		
		
		//call the constructror that will take 3 parameters
		Box box1=new Box(2);
		System.out.println(box1.l+" "+box1.w+" "+box1.h);
		
		Box box2=new Box(3,6,1);
		System.out.println(box2.l+" "+box2.w+" "+box2.h);
		
		Box box3=new Box(box1);
		System.out.println(box3.l+" "+box3.w+" "+box3.h);
				

	}

}
