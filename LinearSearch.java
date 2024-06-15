import java.util.*;

public class LinearSearch {

    public static void LinearSearcha(int array[], int key) {
        int n = array.length;
        for(int i=0; i<n; i++) {
            if(array[i] == array[key]) {
                System.out.print("element found at endex : " + i);
            }
        }
    }

    public static void main(String[] args) {
        int array[] = {12,33,2,3,4,5,2,5,9,10};
        int key = 3;

        LinearSearcha(array,key);

        
    }
}