// leetcode 1470 (easy)
import java.util.Arrays;
public class Shuffle {
    public static void main(String[] args) {

        int[] nums = {2,5,1,3,4,7}; // o/p -> 2,3,5,4,1,7
        int arrLength = 3;
        System.out.println(Arrays.toString(shuffle(nums,arrLength)));

        
    }

    public static int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            result[j++] = nums[i];
            result[j++] = nums[i + n];
        }
        return result;
    }
    
}
