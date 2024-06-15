import java.util.*;

public class ArraysAssigQue {
    /*Given an integer array nums, return true if any value appears at least twice in the 
      array, and return false if every element is distinct.
      (DSASheet #4) */
      //que 1 (DSASheet #4)
    public static boolean queOne(int num[]) {
        for(int i=0; i<num.length-1; i++) {
            for(int j=i+1; j<num.length; j++) { //j=i+1
                if(num[i] == num[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    //que 3 (DSASheet #8)
    public static int buyandsell(int num[]) {
        int minBuy = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i=0; i<num.length; i++) {
            if(minBuy < num[i]) {
                int Profit = num[i] - minBuy;
                maxProfit = Math.max( Profit,maxProfit);
            } else {
                minBuy = num[i];
            }
        }
        return maxProfit;
    }


    //que 4 (DSASheet #11)
    public static int TrappingRain(int num[]) {
        int n = num.length;
        int leftMax[] = new int[n];
        leftMax[0] = num[0];
        for(int i=1; i<n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], num[i]);
        }

        int rightMax[] = new int[n];
        rightMax[n-1] = num[n-1];
        for(int i=n-2; i>=0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], num[i]);
        }

        int TrappedWater = 0;
        for(int i=0; i<n; i++) {
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            TrappedWater += waterLevel - num[i];
        }
        return TrappedWater;
        
    }


    //que 5 (DSASheet #16)
    public List<List<Integer>> threeSum(int nums[]) {
        List<List<Integer>> result = new ArrayList <List<Integer>> ();
        for(int i=0; i<nums.length; i++) {
            for(int j=i+1; j<nums.length; j++) {
                for(int k=j+1; k<nums.length; k++) {
                    if(nums[i] + nums[j] + nums[k] == 0) {
                        List<Integer> triplet = new ArrayList < Integer > ();
                            triplet.add(nums[i]);
                            triplet.add(nums[j]);
                            triplet.add(nums[k]);
                            Collections.sort(triplet);
                            result.add(triplet);
                        }
                    }
            }
        }
    result = new ArrayList<List<Integer>> (new LinkedHashSet<List<Integer>> (result));
    return result;
    }

// que 2 (DSASheet #6)
    public int search(int[] nums, int target) {
        //min will have index of minimum element of nums
        int min = minSearch(nums);
        //find in sorted left
        if(nums[min] <= target && target <= nums[nums.length-1]){
            return search(nums,min,nums.length-1,target);
        }
        //find in sorted right
        else{
            return search(nums,0,min,target);
        }
        }
        //binary search to find target in left to right boundary
        public int search(int[] nums,int left,int right,int target){
            int l = left;
            int r = right;
        // System.out.println(left+" "+right);
            while(l <= r){
                int mid = l + (r - l)/2;
                if(nums[mid] == target){
                return mid;
                }
                else if(nums[mid] > target){
                r = mid-1;
                }
                else{
                l = mid+1;
                }
            }
        return -1;
        }
        //smallest element index
        public int minSearch(int[] nums){
        int left = 0;
        int right = nums.length-1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(mid > 0 && nums[mid-1] > nums[mid]){
            return mid;
            }
            else if(nums[left] <= nums[mid] && nums[mid] > nums[right]){
            left = mid+1;
            }
            else{
            right = mid-1;
            }
            }
        return left;
        }            


    public static void main(String[] args) {
        int num[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        // System.out.println(queOne(num));
        // System.out.println(buyandsell(num));
        // System.out.println(TrappingRain(num));
        // System.out.println(threeSum(num));//error
    }
}