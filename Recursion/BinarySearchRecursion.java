public class BinarySearchRecursion {

    public static void main(String[] args) {

        int[] nums = {2,5,7,11,23,41,50};
        int target = 0;
        System.out.println(binarySearch(nums,target,0,nums.length-1));
        
    }

    public static int binarySearch (int[] arr, int target, int s, int e) {
        int mid = s + (e-s)/2;

        if (s>e) {
            return -1;
        }

        if (target == arr[mid] ) {
            return mid;
        }

        if (target > arr[mid]) {

            return binarySearch (arr,target,mid+1,e);

        } else {
            return binarySearch( arr, target, s, mid-1);
        }
    }
    
}
