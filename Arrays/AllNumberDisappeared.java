// Leet code problem number 448
import java.util.ArrayList;
import java.util.List;

public class AllNumberDisappeared {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        
        System.out.println(findDisappearedNumbers(arr));
    }

     public static List<Integer> findDisappearedNumbers(int[] arr) {

        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        for (i = 0;i< arr.length; i++) {

            if ( i != arr[i]-1) {
                ans.add(i+1);
            }

        }
        return ans;
        
    }

	
	public static void swap(int[] arr, int idx1, int idx2) {
	    
	    int temp = arr[idx1];
	    arr[idx1] = arr[idx2];
	    arr[idx2] = temp;
	    
	}
}