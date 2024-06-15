import java.util.*;

public class PrintSubarrays {
    public static void PrintSubarrays(int array[]) {
        int ts = 0; //total subarray
        for(int i=0; i<array.length; i++) {
            int start = i;
            for(int j=0; j<array.length; j++) {
                int end = j;
                for(int k=start; k<=end; k++) {
                    System.out.print(array[k] + " ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("total subarray = " + ts);
    }

    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12};
        PrintSubarrays(array);
    }
}