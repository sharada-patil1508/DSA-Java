package Mycode;
import java.util.*;
public class Linearsearch {
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.print("enter n:");
	int n=sc.nextInt();
	int[] arr=new int[n];
	
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.print("enter target ele:");
	int x=sc.nextInt();
	boolean found=false;
	long start=System.nanoTime();
	int j=0;
	for(j=0;j<n;j++)
	{
		if(arr[j]==x)
		{
			found=true;
			break;
		}
			
	}
	long end=System.nanoTime();
	if(found)
	{
		System.out.println("ele found at index "+j);
	}else
	{
		System.out.println("ele  not found");
	}
	System.out.println("time complexity "+(end-start)+"ns");
}
	
//3 4 5 6 7 1 3
}
