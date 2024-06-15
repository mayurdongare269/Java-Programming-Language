import java.util.*;

public class functionsBasis {

    public static int factorial(int n) {
        int f = 1;

        for(int i=1; i<=n; i++) {
            f = f * i;
        }
        return f;
    }

    public static int bin_Coef(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bin_Coeff = fact_n / (fact_r * fact_nmr);
        return bin_Coeff;

    }

    public static void main(String[] args) {
        // int n = 5;
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        // System.out.println("Factoril is : " + factorial(n));

        System.out.println(bin_Coef(5, 2));

    }
}