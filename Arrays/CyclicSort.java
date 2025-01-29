import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
		int[] arr = {4,3,2,7,8,2,3,1};
		cyclicSort_2(arr);
	    System.out.print(Arrays.toString(arr));
	}
	
	// this cyclic sort will not handle dublicates elements
	public static void cyclicSort_1 (int[] arr) {

        int i = 0;
	    
	    while (i < arr.length) {

            if ( i != arr[i] - 1 ) {

                swap(arr,i,arr[i]-1);

            } else {
                i++;
            }
	        
	        
	    }   
	    
	}

	// this cyclic sort will  handle dublicates elements
	public static void cyclicSort_2(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1; // Correct index for current element
            // Swap only if the number is not at its correct index and is not duplicate
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else {
                i++;
            }
        }
	}
	
	public static void swap(int[] arr, int idx1, int idx2) {
	    
	    int temp = arr[idx1];
	    arr[idx1] = arr[idx2];
	    arr[idx2] = temp;
	    
	}

}
