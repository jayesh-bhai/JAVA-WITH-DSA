
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
class Solution {
    public static void main (String[] args) {

        int[] nums = {1,2,3,4,0};
        int[] index = {0,1,2,3,0};
        System.out.println("The target array is : " + Arrays.toString(createTargetArray(nums,index)));
    
    }

    public static int[] createTargetArray(int[] nums, int[] index) {

        List<Integer> temp = new ArrayList<>();

        int[] ans = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            temp.add(index[i],nums[i]);


        }

        for (int i = 0; i < nums.length; i++) {

            ans[i] = temp.get(i);


        }

        return ans;
    }
   
}
