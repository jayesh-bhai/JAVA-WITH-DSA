
public class BinarySearch {
    public static void main(String[] args) {
        int[] nums1 = {100,65,55,46,38,21,03,0};
        int[] nums2 = {2,4,6,9,14,16,18};
        int n = 14;
        System.out.println("The index of the target element is : " + binarySearch(nums2,n));
        
        
    }

    // Assuming that the array is sorted in the ascending order
   public static int binarySearch (int[] arr,int target) {
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
        return -1;
    }

    // Assuming that the array is sorted in the descending order
    static int search_2 (int[] arr,int target) {
        int start = 0;
        int end = arr.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
           
            if (target < arr[mid] ) {
                start = mid + 1;
            } else if ( target > arr[mid] ) {
                end = mid-1;
            } else  {
                return mid;
            }
        }
        return -1;
    }

    // when we dont know whether the array is sorted in ascending or descending order.
    static int orderAgnosticBS ( int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end-start)/2;

            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid] ) {
                    end = mid-1;
                } else if ( target > arr[mid] ) {
                    start = mid + 1;
                }
            } else {
                if (target < arr[mid] ) {
                    start = mid + 1;
                } else if ( target > arr[mid] ) {
                    end = mid-1;
                }

            }

        }
        return -1;
    }

    
}
