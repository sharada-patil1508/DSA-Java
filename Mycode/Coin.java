package Mycode;
import java.util.*;

public class Coin {

    public static void main(String[] args) {
        
    
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter TOTAL MONEY: ");
    	 int c=sc.nextInt();
    	 System.out.print("Enter the number of denominations: ");
    	 int n=sc.nextInt();
    	 //impotant
    	 Integer[] arr=new Integer[n];
    	 System.out.print("Enter the denominations: ");
    	 for(int i=0;i<n;i++)
    	 arr[i]=sc.nextInt();
    	 Arrays.sort(arr, Collections.reverseOrder());
    	 int num;
    	 System.out.println("*Change*");
    	 for(int i=0;i<n;i++)
    	 {
    	 num=c/arr[i];
    	 c=c%arr[i];
    	 System.out.println(arr[i]+" Rs - "+ num);

    	 }
    	

    }
}
