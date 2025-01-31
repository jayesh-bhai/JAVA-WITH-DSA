
public class prblm_41 {
    public static void main(String[] args) {

        int[] arr = {1};
        System.out.println(firstMissingPositive(arr));
        
    }

    public static int firstMissingPositive(int[] arr) {

        int i = 0;

        // Using cyclic sort to first sort the array
        while ( i < arr.length) {

            int correct = arr[i] - 1;

             // The main catch of this problem is this line and the last line i.e return arr[i-1] + 1
            if ( arr[i] > 0 && arr[i] < arr.length && arr[i] != arr[correct] ) {

                swap(arr,i,correct);

            } else {
                i++;
            }

        }

        for ( i = 0; i < arr.length; i++ ) {

            if ( i != arr[i] - 1) {

                return i+1;
            }

        }

        return arr[i-1]+1;

        
    }

  

    public static void swap (int[] arr, int first, int second) {
            
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
