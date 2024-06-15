import java.util.*;
import java.util.Collections;

public class sortingTechniques {
    public static void bubbleSort(int arr[]) { //O(n2)
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) { // for des <
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void bubbleSortAdv(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no swaps occurred, the array is already sorted
            if (!swapped) {
                System.out.println("Array already sorted");
                break;
            }
        }
    }
    

    

    public static void PrintArr(int arr[]) { //print the array .
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SelectionSort(int arr[]) {   //o(n2)
        for(int i=0; i<arr.length-1; i++) {
            int minPos = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[minPos] > arr[j]) { // for des <
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]) {

        /*Explanation
            ->Outer Loop (for loop): Iterates over each element in the array starting from the second element (index 1) because the first element is trivially sorted.

            ->Inner Loop (while loop): Finds the correct position to insert the current element (curr) by shifting elements in the sorted portion of the array that are greater than curr to the right.
            
            ->Insertion: After the correct position is found, curr is placed into the array.*/

        for(int i=1; i<arr.length; i++) {
            int curr = arr[i];
            int prev = i-1;
            //finding out the correct postion to insert
            while(prev >= 0 && arr[prev] > curr) {  //for descending array : arr[prev] < curr
                arr[prev+1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev+1] = curr;
        }
    }

    public static void inbuiltSort(Integer arr[]) {
        // Arrays.sort(arr); //import java.util.Arrays .... O(nlogn)
        // Arrays.sort(arr, 0, 3);

        // collections for reverse sort
        Arrays.sort(arr, Collections.reverseOrder()); //import java.util.Collections ... alwayes objective(Integer)

    }

    public static void CountingSort(int arr[]) { //O(n+range)
        int largest = Integer.MIN_VALUE;
        int n = arr.length;
        for(int i=0; i<n; i++) {
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest + 1];
        for(int i=0; i<n; i++) {
            count[arr[i]]++; //
        }
        //sortig
        int j=0;
        for(int i=0; i<count.length; i++) { // for(int i=count.length-1; i>=0; i--)
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }

    public static void main(String[] args) {
        
        int arr[] = {5,4,1,3,2};
        // bubbleSort(arr);
        bubbleSortAdv(arr);
        // SelectionSort(arr);
        // insertionSort(arr);
        // inbuiltSort(arr);
        // CountingSort(arr);
        PrintArr(arr);

        
    }
}