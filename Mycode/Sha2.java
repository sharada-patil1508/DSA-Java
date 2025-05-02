package Mycode;
import java.util.*;

public class Sha2 {
    public static void main(String[] args) {
       
  Scanner sc=new Scanner(System.in);
  System.out.println("enter total amount:");
  int c=sc.nextInt();
  System.out.println("enter th num of demonstartion:");
  int n=sc.nextInt();
  Integer[] arr=new Integer[n];
  System.out.println("enter demonstrtions:");
  for(int i=0;i<n;i++)
  {
	  arr[i]=sc.nextInt();
  }
  Arrays.sort(arr, Collections.reverseOrder());
  int num=0;
  System.out.println("charge");
  
  for(int i=0;i<n;i++)
  {
	  num=c/arr[i];
	  c=c%arr[i];
	  System.out.println(num);
	  
  }
    	
    }
    
}
