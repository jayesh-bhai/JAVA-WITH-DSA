import java.util.Arrays;

public class CyclicSort {

    public static void main(String[] args) {
		int[] arr = {5,2,4,3,1,9,6,8,7,10};
		cyclicSort(arr);
	    System.out.print(Arrays.toString(arr));
	}
	
	public static void cyclicSort (int[] arr) {

        int i = 0;
	    
	    while (i < arr.length) {

            if ( i != arr[i] - 1 ) {

                swap(arr,i,arr[i]-1);

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
