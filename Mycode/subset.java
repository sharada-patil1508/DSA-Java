package Mycode;
import java.util.*;
public class subset {
	static int c=0;
	public static void main(String[] args) {
		int w[] = new int[10];
		int n,d,i,sum=0;
		int x[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("ENter the number of elements:");
		n = sc.nextInt();
		System.out.println("Enter the elements in incresing order:");
		for(i=0;i<n;i++) {
			w[i]=sc.nextInt();
		}
		System.out.println("Enter the value of d:");
		d = sc.nextInt();
		for(i=0;i<n;i++) {
			sum = sum+w[i];
		}
		System.out.println("SUM="+sum);
		if(sum<d||w[0]>d) {
			System.out.println("Subset is not possible");
			System.out.println("END");
			System.exit(0);
		}
		finalsubset(0,0,sum,x,w,d);
		if(c==0) {
			System.out.println("Subset is not possible!");
		}
		System.out.println("END");
	}
	static void finalsubset(int cs,int k,int r,int x[],int w[],int d) {
		x[k] = 1;
		if(cs+w[k]==d) {
			c++;
			System.out.print("Solution "+c+" is {");
			for(int i=0;i<=k;i++)
			{
				if(x[i]==1) {
					System.out.print(w[i]+" ");
				}
			}
			System.out.println("}");
		}
		else if(cs+w[k]+w[k+1]<=d){
			finalsubset(cs+w[k],k+1,r-w[k],x,w,d);
		}
		if(cs+r-w[k]>=d&&(cs+w[k+1])<=d) {
			x[k] = 0;
			finalsubset(cs,k+1,r-w[k],x,w,d);
		}
	}
}
