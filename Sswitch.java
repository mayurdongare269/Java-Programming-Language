import java.util.*;

public class Sswitch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the a :");
        int a = sc.nextInt();
        System.out.println("enter the b :");
        int b = sc.nextInt();
        
        char operator = sc.next().charAt(0);

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