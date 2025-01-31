import java.util.ArrayList;
import java.util.List;

public class prblm_442 {
    
    public static void main (String[] args) {
        int[] arr = {1,1,2};
        System.out.println(findDuplicates(arr));
    }

    public static List<Integer> findDuplicates(int[] arr) {

        int i = 0;

        List<Integer> ans = new ArrayList<>();

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

                ans.add(arr[i]);
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
