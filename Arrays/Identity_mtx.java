package Arrays;
import java.util.*;
public class Identity_mtx {
	
	public static boolean fun(int[][] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if((i==j&&arr[i][j]!=0)||(i!=j&&arr[i][j]!=1))
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		
		if(fun(arr))
		{
			System.out.println("the matrix is identity matrix");
		}else
		{
			System.out.println("the matrix is not identity matrix");
		}
	}

}
