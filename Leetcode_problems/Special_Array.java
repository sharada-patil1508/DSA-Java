package Leetcode_problems;

public class Special_Array {

	
		
		public static  boolean fun(int[] arr)
		{
			if(arr.length==1)
			{
				return true;
			}
			for(int i=0;i<arr.length-1;i++)
			{
				
				if(arr[i]%2==0&&arr[i+1]%2==0||(arr[i]%2!=0&&arr[i+1]%2!=0))
				{
					return false;
				}
				
				
			}
			return true;
		}
		public static void main(String[] args) {
		int[] arr= {4,7,1,2};
		boolean ans=fun(arr);
		System.out.println(ans);
		
	}

}
