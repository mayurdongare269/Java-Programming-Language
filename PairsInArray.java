import java.util.*;

public class PairsInArray {
    public static void PairsInArray(int array[]) {
        for(int i=0; i<array.length; i++) {
            int current = array[i];
            for(int j=i+1; j<array.length; j++) {
                System.out.print("(" + current + "," + array[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int array[] = {2,4,6,8,10,12};
        PairsInArray(array);
    }
}