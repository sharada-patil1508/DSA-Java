package Arrays;
import java.util.*;

public class Find_Duplicats_Array {
    public static int[] dup(int[] arr) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j] && !duplicates.contains(arr[i])) {
                    duplicates.add(arr[i]);
                }
            }
        }
        
        
        int[] ans = new int[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            ans[i] = duplicates.get(i);
        }
        
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 1, 2, 5, 5};
        System.out.println(Arrays.toString(dup(arr)));
    }
}
