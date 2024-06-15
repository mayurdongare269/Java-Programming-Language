import java.util.*;

public class ReverseAnArray {
    public static void ReverseArray(int array[]) {
        int first = 0,last = array.length-1;
        while (first<last) { //only less than last .. not equal
            //swap
            int temp = array[first];
            array[first] = array[last];
            array[last]= temp;
            first++;
            last--;
        }
    }

    public static void main(String[] args) {
        int array[] = {1,2,3,4,5};
        ReverseArray(array);

        //print
        for(int i=0; i<array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}