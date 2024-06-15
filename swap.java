public class swap {

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value in swap : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;

        swap(a,b);
        System.out.println("value outside swap : ");
        // System.out.println(a,b);
        System.out.println("a = " + a);
        System.out.println("b = " + b);


    }
}