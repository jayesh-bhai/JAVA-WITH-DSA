import java.util.Arrays;

public class prblm_645 {

    public static void main (String[] args) {
        int[] arr = {1,2,2,4};
        System.out.println(Arrays.toString(findErrorNums(arr)));
    }

    public static int[] findErrorNums(int[] arr) {

        int[] ans = new int[2];

        int i = 0;

        // Using cyclic sort to first sort the array
        while ( i < arr.length) {

            int correct = arr[i] - 1;

            if ( arr[i] != arr[correct] ) {

                swap(arr,i,correct);

            } else {
                i++;
            }

        }

        for ( i = 0; i < arr.length; i++ ) {

            if ( i != arr[i] - 1) {

                ans[0] = arr[i];
                ans[1] = i+1;
            }

        }
        
        return ans;
    }

    public static void swap (int[] arr, int first, int second) {
            
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}