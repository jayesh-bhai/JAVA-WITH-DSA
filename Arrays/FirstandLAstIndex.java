// We have to return the first and last index of the target element
// leetcode problem no 34

import java.util.Arrays;
public class FirstandLAstIndex {
    public static void main(String[] args) {
        int[] nums = {5,6,7,7,7,7,8,10};
        int target = 5;
        System.out.println(Arrays.toString(searchRange(nums,target)));

    }

    public static int[] searchRange (int[] arr, int target) {
        int[] ans = {-1,-1};

        ans[0] = BS(arr,target,true);
        ans[1] = BS(arr,target,false);
        return ans;
    }

    static int BS (int[] arr,int target, boolean firstIndex) {
        int start = 0;
        int end = arr.length-1;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target < arr[mid] ) {
                end = mid-1;
            } else if ( target > arr[mid] ) {
                start = mid + 1;
            } else  {
                ans = mid;
                if (firstIndex) {
                    end = mid-1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}

/*
Approach to solve this problem
1. First find the element in the array (This will be potential answer as more such same elements can be found in left and right side of the array)
2. Find the first occurence of element in the left half of the potential answer by doing end = mid-1
3. then find the last occurence of the element in the right of the potential answer by doing start = mid +1
 */
