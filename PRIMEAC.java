import java.util.*;

public class PRIMEAC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean issPrime = true;
        for(int i=2; i<=num-1; i++) {
            if(num%i==0) {
                issPrime = false;
                break;
            }
        } 
        // System.out.println(isPrime);
        if(issPrime==true) {
            System.out.println("num is prime");

        }
        else {
            System.out.println("num is not prime");
        }
    }
}