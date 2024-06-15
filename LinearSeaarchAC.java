import java.util.*;

public class LinearSearchAC {

    public static void LinearSearcha(int array[], int key) {
        int n = array.length;
        for(int i=0; i<n; i++) {
            if(array[i] == array[key]) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {12,33,2,3,4,5,2,5,9,10};
        int key = 3;

        int index = LinearSearcha(array,key);

        if(index==-1) {
            System.out.println("not found");
        }
        else {
            System.out.println("Element found at : " + index);
        }

        
    }
}