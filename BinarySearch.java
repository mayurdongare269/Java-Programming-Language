import java.util.*;
//binary search 
public class BinarySearch {
    public static int binarySearch(int array[], int key) {
        int start = 0, end = array.length-1;
        while (start<=end) {
            int mid = (start + end)/2;
            if(array[mid] == key) {
                return mid;
            }
            if(array[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = {1,2,4,6,7,10,15,30};//Array must be sorted array 
        int key = 10;
        System.out.println("the element found at index : " + binarySearch(array, key));
    }
}