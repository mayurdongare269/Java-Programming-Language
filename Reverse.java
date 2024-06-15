import java.util.*;

public class Reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        while (num > 0) {
            int lastdigit = num % 10;
            System.out.print(lastdigit + " ");
            num/=10;
        }
        System.out.println();
    }
}