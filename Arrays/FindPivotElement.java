// Find the pivot element in the rotated array
public class FindPivotElement {
    public static void main(String[] args) {
        int[] nums = {1,2,4,5,10,20};
        int index = searchPivot(nums);
        System.out.println("The index of pivot element in the rotated array is " + index + " and the pivot element is " + nums[index]);
        
    }

    public static int searchPivot(int[] arr) {
            int start = 0;
            int end = arr.length-1;
            while (start <= end) {

                int mid = start + (end-start)/2;

                if (mid < end && arr[mid] > arr[mid + 1]) {
                    return mid;
                }
                if (mid > start && arr[mid] < arr[mid - 1]) {
                    return mid-1;
                }
                if (arr[mid] <= arr[start]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            return -1;
    
    }
    
}
