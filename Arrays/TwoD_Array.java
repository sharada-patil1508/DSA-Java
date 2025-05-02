package Arrays;
import java.util.*;
public class TwoD_Array {

	public static void main(String[] args) {
		int[][] arr=new int[2][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		//sum of all emelemts
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				sum+=arr[i][j];
			}
			
		}
		
		System.out.println("the sum is:"+sum);
		
		
		//smallest ele in 2d array
		int min=arr[0][0];
		int max=0;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i][j]<min)
				{
					min=arr[i][j];
					
				}
				if(arr[i][j]>max)
				{
					max=arr[i][j];
				}
			}
			
		}
		System.out.println("minimum ele is:"+min);
		System.out.println("maximum ele is:"+max);
		
		System.out.println("transpose of matrix");
		int[][] trp=new int[2][2];
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr.length;col++)
			{
				trp[col][row]=arr[row][col];
			}
		}
		
		
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr.length;col++)
			{
				System.out.print(" "+trp[row][col]);
			}
			System.out.println();
		}
		
		//transpose of matrix and normal matrix are equal then
		//that matrix is called symmetric matrix
		
		
		
		

	}
	
	
	

}
