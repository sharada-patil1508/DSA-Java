package Javaclass;
import java.util.*;

public class Sunofnnums {
	//Write a function that returns the sum of first n natural numbers.
	static int sum(int n){
		int x=0;
		for (int i=0;i<n;i++)
		{
			x=x+i;
		}
		return x;
		
		
	}

	public static void main(String[] args) {
	
		int n=9;
		System.out.println(sum(9));
		

	}

}
