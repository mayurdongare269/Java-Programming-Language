import java.util.*;

public class switch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a :");
        int a = sc.nextInt();
        System.out.println("enter the b :");
        int b = sc.nextInt();
        
        char operator = sc.next.charAt(0);

        switch(operator) {
            case '+' : System.out.println(a+b);
                            break;
            
            case '-' : System.out.println(a-b);
                            break;

            case '*' : System.out.println(a*b);
                            break;

            case '/' : System.out.println(a/b);
                            break;
            default : System.out.println("wrong operator");
        }
    }
}


// More optimized and with error handling featured code for making calculator program 😊
// ✅ Improvements:
// 🔒 Handled division by zero.

// ⚙️ Used double for precision in operations.

// 📦 Separated logic into a method (calculate).

// 🛡️ Exception handling to make it crash-proof.

// ✅ Closed Scanner after use.

import java.util.Scanner;

public class AdvancedCalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number (a): ");
            double a = sc.nextDouble();

            System.out.print("Enter second number (b): ");
            double b = sc.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = sc.next().charAt(0);

            double result = calculate(a, b, operator);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }

    // Proper use of switch-case with return: Smart use! Since you return in each case, you don’t need break ✅
    
    public static double calculate(double a, double b, char operator) throws Exception {
        switch (operator) {
            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                if (b == 0) throw new Exception("Cannot divide by zero");
                return a / b;

            default:
                throw new Exception("Invalid operator");
        }
    }
}
