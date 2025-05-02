package Baisc_prgms;
import java.util.*;

public class Is_sorted {
	
	public static boolean fun(int[] arr)
	{
		int i=0;
		boolean flag=false;
		while(i!=arr.length)
		{
			if(arr[i]<arr[i+1])
			{
				i++;
				
				flag=true;
			}
			if(arr[i]>arr[i+1])
			{
				i++;
				flag=true;
			}
			
			return flag;
		}
		return false;
	}
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		boolean ans=fun(arr);
		

	}

}
