package Arrays;
import java.util.*;

public class Symmetric_matrix {
    
    public static boolean isSymmetric(int[][] arr) {
        int n = arr.length;
        
        // Check symmetry directly without creating a transpose matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {  // Only check upper triangle
                if (arr[i][j] != arr[j][i]) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the square matrix: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Call the function and print result
        if (isSymmetric(arr)) {
            System.out.println("The matrix is symmetric");
        } else {
            System.out.println("The matrix is NOT symmetric");
        }

        sc.close();  // Close scanner
    }
}
