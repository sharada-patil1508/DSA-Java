package Leetcode_problems;

import java.util.Arrays;
//https://leetcode.com/problems/rank-transform-of-an-array/description/
public class Leetcode {

    public static void main(String[] args) {
        int[] arr = {40, 10, 20, 30};
        int[] ans = arrayRankTransform(arr);
        System.out.println(Arrays.toString(ans));
    }

    public static int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);
        int[] ranks = new int[n];

        for (int i = 0; i < n; i++) {
            ranks[i] = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] > sortedArr[j]) {
                    ranks[i]++;
                } else {
                    break;
                }
            }
        }

        return ranks;
    }
    
    //easy way
    /*
    static int[] arrayRankTransform(int[] arr) {
        int[] sortArr = arr.clone();
        int n = arr.length;

        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sortArr[j] > sortArr[j + 1]) {
                    int temp = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = temp;
                }
            }
        }

        // Rank assignment
        int[] rank = new int[n];
        for (int i = 0; i < n; i++) {
            rank[i] = 1;
            for (int j = 0; j < n; j++) {
                if (arr[i] > sortArr[j]) {
                    rank[i]++;
                } else {
                    break;
                }
            }
        }

        return rank;
    }*/

        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
