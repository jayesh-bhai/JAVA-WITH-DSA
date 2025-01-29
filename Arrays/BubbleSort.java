import java.util.Arrays;
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {8,1,2,2,3};
        int[] nums1 = {10,20,30,40,50};
        bubbleSort(arr);
        bubbleSort(nums1);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums1));

    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        int temp;
        for (int i = 0; i < arr.length; i++) {

            swapped = false;

            for (int j = 0; j < arr.length - i - 1; j++) {

                if ( arr[j] > arr[j+1]) {

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;

                }

            }

            if (swapped == false) { // If the array is sorted the this condition will prevent O(n^2) time complexity
                break;
            }

        }
    }
    
}
