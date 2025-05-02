package Arrays;
import java.util.*;
public class Best_time_to_buy_ans_sell {
	
	public static int fun(int[] prices)
	{
		
		int buy=prices[0];
		int profit=0;
		for(int i=0;i<prices.length;i++)
		{
			if(prices[i]<buy)
			{
				buy=prices[i];
			}else
			 if(prices[i]-buy>profit)
			 {
				 profit=prices[i]-buy;
			 }
		}
		
		return profit;
	}
	
	public static void main(String[] args) {
		
		int[] arr= {7,1,5,3,6,4};
		
		int ans=fun(arr);
		System.out.println(ans);
		
	}

}
