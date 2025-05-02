package Javaclass;
import java.util.*;

public class Arear {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	//area of circle
	/*System.out.println("enter radius:");
	int r=sc.nextInt();
	double pi=3.14,area;
	area=pi*r*r;
	System.out.println(area);
	*/
	
	//area of triangle
	
	/*System.out.println("enter l and h:");
	int l=sc.nextInt();
	int h=sc.nextInt();
	double area;
	area=0.5*l*h;//(h*l)/2;
	System.out.println(area);
	*/
	
	//Area Of Rectangle Program  length * width;
	//
	
	
	
	//fibonachi series
	System.out.println("enter n:");
	int n=sc.nextInt();
	int a=0;
	int b=1;
	int count=2;
	while(count<=n)
	{
		int temp=b;
		b=b+a;
		a=temp;
		count++;
	}
	System.out.println(b);
  
	}

	
	/*Before the loop body:
a = 0
b = 1
count = 2
Inside the loop:
temp = b → temp = 1
b = b + a → b = 1 + 0 = 1
a = temp → a = 1
count++ → count = 3
Second Iteration (count = 3):

Before the loop body:
a = 1
b = 1
count = 3
Inside the loop:
temp = b → temp = 1
b = b + a → b = 1 + 1 = 2
a = temp → a = 1
count++ → count = 4
Third Iteration (count = 4):

Before the loop body:
a = 1
b = 2
count = 4
Inside the loop:
temp = b → temp = 2
b = b + a → b = 2 + 1 = 3
a = temp → a = 2
count++ → count = 5
Fourth Iteration (count = 5):

Before the loop body:
a = 2
b = 3
count = 5*/
}
