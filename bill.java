import java.util.*;

public class bill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the pencile price : ");
        float pencile = sc.nextFloat();

        System.out.print("enter the pen price : ");
        float pen = sc.nextFloat();

        System.out.print("enter the erasor price : ");
        float erasor = sc.nextFloat();

        System.out.println("Your bill(with GST) : 😒");

        System.out.println("pencile price " + (pencile+pencile*0.18));
        System.out.println("pen price " + (pen+pen*0.18));
        System.out.println("erasor price " + (erasor+erasor*0.18));
        System.out.println("Total price " + ((pencile+pencile*0.18)+(erasor+erasor*0.18)+(pen+pen*0.18)));

    }
}