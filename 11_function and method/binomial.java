import java.util.*;

public class binomial {
    public static int fact(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        if (r > n) {
            System.out.println("Invalid input! r should not be greater than n.");
        } else {
            int nFact = fact(n);
            int rFact = fact(r);
            int n_rFact = fact(n - r);

            int ncr = nFact / (rFact * n_rFact);

            System.out.println("The NCR is: " + ncr);
        }

        sc.close();
    }
}
