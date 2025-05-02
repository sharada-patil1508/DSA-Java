package Mycode;
import java.util.*;

class GreedyKnapsack {

    int n;
    double c, p[], w[];

    public GreedyKnapsack(int n, double c, double[] p, double[] w) {
        this.n = n;
        this.c = c;
        this.p = p;
        this.w = w;
    }

    void compute() {
        int i;
        double[] x = new double[n];
        for (i = 0; i < n; i++)
            x[i] = 0.0;

        double rc = c;
        for (i = 0; i < n; i++) {
            if (w[i] > rc)
                break;
            x[i] = 1;
            rc = rc - w[i];
        }

        if (i < n)  // Ensures we don't go out of bounds
            x[i] = rc / w[i];

        double netProfit = 0.0;
        for (i = 0; i < n; i++)
            netProfit += x[i] * p[i];

        System.out.println("Net Profit: " + netProfit);
        
    }

    public static void main(String args[]) {
        int n;
        double c;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number of objects: ");
        n = scan.nextInt();
        double[] p = new double[n];
        double[] w = new double[n];

        System.out.print("Enter the capacity of Knapsack: ");
        c = scan.nextDouble();

        System.out.println("Enter profit for each of the " + n + " objects:");
        for (int i = 0; i < n; i++)
            p[i] = scan.nextDouble();

        System.out.println("Enter weight for each of the " + n + " objects:");
        for (int i = 0; i < n; i++)
            w[i] = scan.nextDouble();

        GreedyKnapsack gk = new GreedyKnapsack(n, c, p, w);
        gk.compute();
    }
}
