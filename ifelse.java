import java.util.*;
// largest of two numbers 
public class ifelse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first num : ");
        int num1 = sc.nextInt();

        System.out.println("enter the sec num : ");
        int num2 = sc.nextInt();

        if(num1>=num2) {
            System.out.println("Largest is : " + num1);
        }
        else {
            System.out.println("Largest is : " + num2);
        }


    }
}