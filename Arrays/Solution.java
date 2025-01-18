import java.util.Arrays;

class Solution {
        public static void main(String[] args) {
            int[] nums = {0,2,11,19,21,27,34,37,43,20,10,5,1};
            //            0 1 2  3  4  5  6  7  8  9  10 11 12
            System.out.println("The index of the peak element is " + searchPeak(nums));
        }
    
        public static int searchPeak(int[] arr) {
            int start = 0;
            int end = arr.length-1;
            while (start <= end) {
                int mid = start + (end-start)/2;
                if (arr[mid] < arr[mid+1] ) {
                    start = mid+1;
                } else  {
                    end = mid;
                }
            }
            return start;
    
        }
}