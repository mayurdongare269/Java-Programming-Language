import java.util.*;

public class prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number : ");
        int n = sc.nextInt();
        if(n==1) {
            System.out.println("null");
        }
        else if(n>1) {
            for(int i=2;i<n-1; i++) {
                if(n%i==0) {
                    System.out.println("not prime");
                    break;
                }
                else{
                    System.out.println("Prime");
                    break;
               }    
            }
            
        }
        else {
            System.out.println("not prime");
        }
    }
}