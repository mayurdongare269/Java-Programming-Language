import java.util.*;

public class LargestINArray {
    public static int LargestInArray(int num[]) {
        int largest = Integer.MIN_VALUE;
        
        for(int i=0; i<num.length; i++) {
            if(largest<num[i]) {
                largest = num[i];
            }
        }
        return largest;
    }
    

    public static void main(String[] args) {
        int num[] = {1,22,3,2,4,5,7,223,9};
        System.out.println("Largest is : " + LargestInArray(num));
    }
}