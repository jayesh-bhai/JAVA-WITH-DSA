import java.util.Arrays;
public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {7,6,5,4,3,2,1,0,-1};
        selection(nums);
        System.out.println(Arrays.toString(nums));

    }

    public static void selection(int[] arr) {

        for (int i = 0; i < arr.length; i++) {

            int last = arr.length-i-1;
            int getMaxIndex = getMaxIndex(arr,0,arr.length-i);
            swap(arr,getMaxIndex,last);
        }

    }

    public static int getMaxIndex (int[] arr, int start, int end) {

        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = start; i < end; i++) {

            if(arr[i] > max) {
                max = arr[i];
                index = i;
            }

        }
        return index;

    }

    public static void swap ( int[] arr, int maxValue, int lastValue ) {

        int temp = arr[maxValue];
        arr[maxValue] = arr[lastValue];
        arr[lastValue] = temp;
    }
    
}
