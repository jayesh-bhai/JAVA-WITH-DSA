public class FloorProblem {

        // Floor : The greatest number in the array that is less than or equal to the target element.
    
        public static void main(String[] args) {
            int[] nums = {2,4,6,9,14,16,18};
            int n = 1;
            System.out.println("The index of the floor of target element is : " + floor(nums,n));
            
            
        }
    
        // Assuming that the array is sorted in the ascending order
        static int floor (int[] arr,int target) {
            int start = 0;
            int end = arr.length-1;
            while (start <= end) {
                int mid = start + (end-start)/2;
                if (target < arr[mid] ) {
                    end = mid-1;
                } else if ( target > arr[mid] ) {
                    start = mid + 1;
                } else  {
                    return mid;
                }
            }
            return end;
    
            // the catch in this problem is to just return the end in the code of BS instead of -1
        }
    
    
}
