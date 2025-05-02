package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Occurance_of_an_ele_in_Array {
public static int dup(int[] arr) {
	int count=0;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j])
{
               count++;
            }
        }
    }
    
    return count;
}

public static void main(String[] args) {
    int[] arr = {1, 2, 6, 1, 2, 5, 5,9,9,55,55,55};
    System.out.println(dup(arr));
		

	}

}
