package Mycode;
import java.util.*;
public class Wrshall {

	public static void main(String[] args) {
		int a[][]=new int[10][10];
		int i,j;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of vertices:");
		int n = sc.nextInt();
		System.out.println("Enter the adjacency matrix: ");
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				a[i][j] = sc.nextInt();
			}
		}
		warsh(a,n);
		System.out.println("All pair shortest path matrix:");
		for(i=1;i<=n;i++) {
			for(j=1;j<=n;j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("END");
	}
	static void warsh(int a[][],int n) {
		for(int k=1;k<=n;k++) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=n;j++) {
					a[i][j] = (a[i][j]!=0)||((a[i][k]!=0)&&(a[k][j]!=0))?1:0;
				}
			}
		}
	}

}
