import java.util.*;

public class FunctionAssigQue {

    public static void even(int num) {
        while (num>0) {
            if(num%2==0) {
                // return true;
                System.out.println("true");
                break;
            }
            else {
                System.out.println("False");
                break;
            }
        }
    }

    public static void palindrome(int num) {
        int original_num = num;
        int digit;
        int rev = 0;
        while (num > 0) {
            digit = num % 10;
            rev = (rev*10) + digit;
            num /= 10;
        }
        System.out.println(rev);
        if(rev == original_num) {
            System.out.println("The given number is an palindrome"); //some mistake here ☆*: .｡. o(≧▽≦)o .｡.:*☆
        }
        else {
            System.out.println("not pallindrome");
        }
    }

    public static void digitsSum(int n) {
        int sum = 0;
        while (n>0) {
            int digit = n % 10;
            sum += digit;
            n = n/10;
        }
        System.out.println("Sum of the digits is : " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // even(num);
        palindrome(num);
        // digitsSum(n);
    }
}