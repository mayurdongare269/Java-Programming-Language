import java.util.*;

public class BruteForce {
    //Max Subarray Sum(Brute Force)
    public static void BruteForce(int array[]) {
        int maxSum = Integer.MIN_VALUE;
        int currSum =  0;
        for(int i=0; i<array.length; i++) {
           
            int start = i;
            for(int j=i; j<array.length; j++) { //j=0 -> 0 will be printed in the output
                int end = j;
                currSum = 0;
                for(int k=start; k<=end; k++) {
                    // subarray sum
                    currSum += array[k];
                    
                }
                System.out.println(currSum);
                if(maxSum < currSum) {
                    maxSum = currSum;
                }
                
            }
         
        }
        System.out.println("max sum : " + maxSum);
           
    }

    //Max Subarray Sum(PrefixSum)
    public static void PrefixSum(int array[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[array.length];

        prefix[0] =array[0];
        //cal prefix array
        for(int i=1; i<prefix.length; i++) {
            prefix[i] = prefix[i-1] + array[i];
        }

        for(int i=0; i<array.length; i++) {
            int start = 0;
            for(int j=i; j<array.length; j++) {
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("max sum = " + maxSum);
    }

    // Max Subarray Sum(Kadanes Algorithm)

    public static void Kadanes(int array[] ) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for(int i=0; i<array.length; i++) {
            cs = cs + array[i];
            if(cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs,ms);
        }
        System.out.println("our max sum is : " + ms);
    }

    
    


    public static void main(String[] args) {
        int array[] = {2,4,6,8,10};

        // BruteForce(array);
        // PrefixSum(array);
        Kadanes(array);
        
    }
}