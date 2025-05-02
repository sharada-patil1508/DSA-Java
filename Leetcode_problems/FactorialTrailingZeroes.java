package Leetcode_problems;
//https://leetcode.com/problems/factorial-trailing-zeroes/submissions/1311690236/?envType=study-plan-v2&envId=top-interview-150
public class FactorialTrailingZeroes {

	public static void main(String[] args) {
		int n=7;
		int ans=fun(n);
		System.out.println(ans);
	}
	static int fun(int n)
	{
		int fact=1;
		int count=0;
		for(int i=1;i<=n;i++)
		{
			fact*=i;
		}

			while(n>=0)
			{
				int rem=fact%10;
			
				if(rem==0)
				{
					count++;
				}
				fact=fact/10;
				if(fact==0)
				{
					break;
				}
				
			}
			
			return count;	
			
	}
	//Trailing zeros, in the context of numbers, refer to the zeros that appear at the end (or "trail") of a number. They are zeros that follow all of the significant digits of the number.

}
