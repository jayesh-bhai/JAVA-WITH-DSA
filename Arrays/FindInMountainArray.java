class FindInMountainArray {
    public static void main(String[] args) {
        int[] nums = {2,3,6,8,9,15,21,31,38,23,11,3,1};
        int target = 0;
        System.out.println(findTarget(nums,target));

    }

    public static int findTarget(int[] arr,int target) {

        int peakValueIndex = peakIndexInMountainArray(arr);
        int firstSearch = orderAgnosticBS(arr,target,0,peakValueIndex);

        if (firstSearch != -1) {
            return firstSearch;
        } else {
            return orderAgnosticBS(arr,target,peakValueIndex+1,arr.length-1);
        }
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0,end = arr.length-1,mid;
        while (start < end) {
            mid = start + (end-start)/2;
            if (arr[mid] < arr[mid+1] ) {
                start = mid+1;
            } else  {
                end = mid;
            }
        }
        return start;

    }

    static int orderAgnosticBS ( int[] arr, int target,int start,int end) {
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