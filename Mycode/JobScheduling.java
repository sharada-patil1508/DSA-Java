package Mycode;
import java.util.*;

class Job {
    char id;
    int deadline;
    int profit;
}

public class JobScheduling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of jobs: ");
        int n = scanner.nextInt();
        int totalProfit = 0;
        Job[] jobs = new Job[n];
        
        for (int i = 0; i < n; i++) {
            jobs[i] = new Job();
            System.out.print("Enter job ID, profit, and deadline : ");
            jobs[i].id = scanner.next().charAt(0);
            jobs[i].profit = scanner.nextInt();
            jobs[i].deadline = scanner.nextInt();
        }

     
        Arrays.sort(jobs, (a, b) -> b.profit - a.profit);

        int[] result = new int[n]; 
        boolean[] slot = new boolean[n]; 

     
        for (int i = 0; i < n; i++) {
            
            for (int j = Math.min(n, jobs[i].deadline) - 1; j >= 0; j--) {
               
                if (!slot[j]) {
                    result[j] = i; 
                    slot[j] = true; 
                    totalProfit += jobs[i].profit;
                    break;
                }
            }
        }
        
        
        System.out.print("Maximum profit sequence of jobs: ");
        for (int i = 0; i < n; i++) {
            if (slot[i]) {
                System.out.print(jobs[result[i]].id + " ");
            }
        }
        System.out.println("\nProfit from the sequence of jobs: " + totalProfit);
    }
}
