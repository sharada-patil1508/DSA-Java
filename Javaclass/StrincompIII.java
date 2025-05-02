package Javaclass;

import java.util.Scanner;

public class StrincompIII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(fun(str));
    }

    static String fun(String str) {
        if (str.length() == 0) {
            return "";
        }

        StringBuilder ans = new StringBuilder();
        int count = 1;

        for (int i = 0; i < str.length(); i++) {
            // Check if the current character is the same as the next one
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                count++;
            } else {
                // Append the count and the current character
                if (count > 9) {
                    ans.append("9").append(str.charAt(i));
                    count -= 9;
                }
                ans.append(count).append(str.charAt(i));
                // Reset count for the next sequence of characters
                count = 1;
            }
        }
        
        return ans.toString();
    }
}
