// 1920. Build Array from Permutation (Leet Code Problem)
import java.util.Arrays;
public class BuildArray {
    public static void main(String[] args) {
        int[] nums = {5,0,1,2,3,4};
        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++ ) {
            ans[i] = nums[nums[i]];
        }

        System.out.println(Arrays.toString(ans));

    }
    
}
