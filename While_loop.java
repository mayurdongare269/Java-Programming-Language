import java.util.*;

public class While_loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int couner = 1;
        while (couner<=range) {
            System.out.print("Hello World ! ");
            couner++;
        }
        System.out.println();
    }
}