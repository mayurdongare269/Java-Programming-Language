import java.util.*;

public class areaCircle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the radius : ");
        float radius = sc.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println(area);
    }
}