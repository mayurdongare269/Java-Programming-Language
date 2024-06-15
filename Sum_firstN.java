import java.util.*;

public class Sum_firstN {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int couner = 1;
        int sum = 0;
        while (couner<=range) {
            sum += couner;
            // System.out.print(sum);
            couner++;
        }
        System.out.println(sum);
    }
}