package Javaclass;
import java .util.*;
public class Secondhigestnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		int max=0;
		int smax=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			if(arr[j]>max)
			{
				max=arr[j];
			}
		}
		System.out.println(max);
		for(int i=0;i<n;i++)
		{
			if(arr[i]>smax&&arr[i]!=max)
			{
				smax=arr[i];
			}
		}
		System.out.println(smax);

	}

}
