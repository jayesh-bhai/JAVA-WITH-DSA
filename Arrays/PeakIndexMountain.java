public class PeakIndexMountain {
    public static void main(String[] args) {
        int[] nums = {0,2,11,19,21,27,34,37,43,100,20,10,5,1};
        System.out.println("The index of the peak element is " + searchPeak(nums));
    }

    public static int searchPeak(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while (start < end) {
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
