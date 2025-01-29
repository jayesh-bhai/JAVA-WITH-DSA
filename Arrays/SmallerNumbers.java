import java.util.Arrays;
public class SmallerNumbers {

    public static void main(String[] args) {

        int[] arr = {8,1,2,2,3};
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(arr)));
        
    }
    public static int[] smallerNumbersThanCurrent(int[] arr) {
        int count;
        int[]  ans = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            for (int j = 0; j< arr.length; j++) {

                if (arr[j] < arr[i] && arr[j] != arr[i]) {
                    count++;
                }

            }

            ans[i] = count;
        }

        return ans;
        
    }
}
