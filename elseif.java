import java.util.*;

public class elseif {

    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 6;
        int num3 = 45;
        // int largest;
        if(num1>=num2 && num1>=num3) {
            // largest = num1;
            System.out.println(num1);
        }
        else if(num2>=num3) {
            // largest = num2
            System.out.println(num2);;
        }
        else {
            // largest = num3;
            System.out.println(num3);
        }

        
    }
}