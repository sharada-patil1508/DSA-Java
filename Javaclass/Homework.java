
package Javaclass;
import java.util.*;

public class Homework {

    public static void main(String[] args) {
        int arr[] = {7, 1, 95, 4, 9, 30};

        // Extract digits and sort in descending order
        sort(arr);

        // Build the largest number from sorted digits
        String largestNumber = build(arr);

        // Print the largest number
        System.out.println("Largest Number: " + largestNumber);
    }

    static void sort(int[] arr) {
        Arrays.sort(arr);
        reverse(arr);
    }

    static void reverse(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    static String build(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        return sb.toString();
    }
}
