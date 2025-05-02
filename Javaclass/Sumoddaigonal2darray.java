package Javaclass;

public class Sumoddaigonal2darray {

	public static void main(String[] args) {
		int[][]  arr= {
				{3,7,1,7},
				{3,1,2,8},
				{9,1,3,7},
				{1,2,3,4}
		};
		int sum=daigonal(arr);
		System.out.println(sum);

	}
	static int daigonal(int[][]arr)
	{
		int pd=0;
		int sd=0;
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				if(row==col)
				{
					pd=pd+arr[row][col];
				}
				if((row+col)==(arr.length-1)&&(row!=col))
				{
					sd=sd+arr[row][col];
				}
			}
			
		}
		int sum=pd+sd;
		return sum;
	}

}
