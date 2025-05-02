package Javaclass;
import java.util.*;

public class Problem {

	public static void main(String[] args) {
		
		/*
		 * //Kunal is allowed to go out with his friends only on the even days of a given month.
		 *  Write a program to count the number of days he can go out in the month of August.
		int n=31;
		int count=0;
			for(int i=0;i<n;i++)
			{
				if(i%2!=0)
				{
					count++;
				}
		
			}
		
				
		System.out.println(count);
		*/
		
		
		//Write a program to print the sum of negative numbers, sum of positive even numbers and 
		//the sum of positive odd numbers from a list of numbers (N) entered by the user. The list terminates when the user enters a zero.
		int[] arr = {-1, -4, 2, 8, 9, 5};
		int sumn = 0, sumpe = 0, sumpod = 0;

		for (int i = 0; i < arr.length; i++) {
		    if (arr[i] < 0) {
		        sumn += arr[i];
		    } else {
		        if (i % 2 == 0) {
		            sumpe += arr[i];
		        } else {
		            sumpod += arr[i];
		        }
		    }
		}
		System.out.println(sumn);
		System.out.println(sumpe);
		System.out.println(sumpod);
		
		
		
	}

}
