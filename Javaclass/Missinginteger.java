package Javaclass;

import java.util.Arrays;

public class Missinginteger {

    public static void main(String[] args) {
        
    	  int arr[]= {9,723,76};
          String  ans= build(arr);
          System.out.println(ans);          
    }
    static String build(int[] arr) {
    	
    	 int x[] =fun(arr);
    	 int y[]=sort(x);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < y.length; i++) {
            sb.append(y[i]);
        }
        String m= sb.toString();
        return m;
    }
    static int[] fun(int[] arr)
    {
        int tdigit=0;
        for(int num:arr)
        {
            tdigit+=count(num);
        }
        int[] nums=new int[tdigit];
        int index=0;
        for(int num:arr)
        {
            while(num>0)
            {
                int digit=num%10;
                nums[index++]=digit;
                num/=10;
            }
        }
       return nums;
    }
    static int count(int num)
    {
        int c=0;
        if(num==0)
            return -1;
        while(num!=0)
        {
            num/=10;
            c++;
        }
        return c;
    }
    static int[] sort(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j]>arr[j-1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                }
            }
        }
        return arr;
    }
    
}
