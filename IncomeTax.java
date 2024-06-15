import java.util.*;

public class IncomeTax {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the your income : ");
        int income = sc.nextInt();
        int tax;

        if(income<=500000) {
            // System.out.println("ur income is : " + income);
            tax=0;
        }
        else if (income>500000 && income<=100000) {
            // System.out.println("ur income is : " + (income-income*0.2));
            tax = (int) (income*0.2);
        }
        // else if(income>1000000) {
        //     // System.out.println("ur income is : " + (income-income*0.3));

        // }
        else {
            tax = (int) (income*0.3);
        }
        System.out.println("Your tax is : " + tax);

    }
}