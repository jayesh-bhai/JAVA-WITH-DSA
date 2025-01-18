public class CeilingProblem {
    // Ceiling : The smallest number in the array that is greater than or equal to the target element.

    public static void main(String[] args) {
        int[] nums = {2,4,6,9,14,16,18};
        int n = 80;
        System.out.println("The index of the ceiling of target element is : " + ceiling(nums,n));
    }

    // Assuming that the array is sorted in the ascending order
    static int ceiling (int[] arr,int target) {

        //What if the target element is greatest among all the elements in the array ?
        // So in this case no answer exist and we have to return -1
        if (target > arr[arr.length-1]) {
            return -1;
        }
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
        return start;

        // the catch in this problem is to just return the start in the code of BS instead of -1
    }
}
