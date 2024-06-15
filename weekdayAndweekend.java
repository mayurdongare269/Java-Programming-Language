import java.util.*;

public class weekdayAndweekend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        switch (num) {
            // method 1 : 
            case 1,2,3,4,5:
                System.out.println("Weekday");
                break;

            case 6,7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("wake up");
               
            
            //method 2
            case 1:
                // System.out.println("Weekday");
                // break;

            case 2:
                // System.out.println("Weekday");
                // break;

            case 3:
                // System.out.println("Weekday");
                // break;

            case 4:
                // System.out.println("Weekday");
                // break;

            case 5:
                System.out.println("Weekday");
                break;

            case 6:
                // System.out.println("Weekend");
                // break;

            case 7:
                System.out.println("Weekend");
                break;

            default:
                System.out.println("wake up");
                
        }
    }
}