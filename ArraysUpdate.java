import java.util.*;

public class ArraysUpdate {

    public static void update(int marks[] , int nonchangable) {
        nonchangable = 5;
        for(int i = 0; i<marks.length; i++) {
            marks[i] = marks[i]+1;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int marks[] = {99,98,97};
        int nonchangable = 10;
        update(marks,nonchangable);
        System.out.println(nonchangable);

        for(int i=0; i<marks.length; i++) {
            System.out.println(marks[i] + " ");
        }
        System.out.println();
    }
}