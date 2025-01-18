public class InfiniteArray {
    public static void main(String[] args) {
        // Treat this array has an infinite array.So here we cant use arr.length
        int[] nums = {2,6,24,37,67,89,90,100,200,400,678,789,987,1000};
        int target = 0;
        System.out.println("The index of the target in the array is : " + infiniteSearch(nums,target));
    }

    public static int infiniteSearch(int[] arr, int target) {
        int start = 0;
        int end = 1;
        while(target >= arr[end]) {

                int temp = end+1;
                end = end + (end - start + 1) * 2;
                start = temp;
        }
        return BS(arr,target,start,end);
    }
    public static int BS (int[] arr,int target,int start,int end) {

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
    
}

/*
Approach
The main catch in this problem is that the array is infinte so we cant use the arr.length method to set the end to the last position of the array
so we set start = 0 and end = 1
we need to check whether the target lies in the range arr[start] and arr[end] if it lies then only we can check that element is present or not
if the element is not present in the range then we need to increase of our range that is we have to increase the start and end pointer.
Once the target lies in our range then we can search that elemnet by using binary search.


 */
