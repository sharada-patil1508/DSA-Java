package Javaclass;

public class Timehours {

    public static void main(String[] args) {
        int arr[] = {72,48,24,3};
        long ans = fun(arr);
        System.out.println(ans); // Expected output: 1
    }

    static long fun(int[] arr) {
        long count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) % 24 == 0) {
                    count++;
                }
            }
        }

        return count;
    }
}
