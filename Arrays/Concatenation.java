// 1929. Concatenation of Array
import java.util.Arrays;
public class Concatenation {

    public static void main (String[] args) {
        int[] arr = {1,3,2,1};
        System.out.println(Arrays.toString(getConcatenation(arr)));
        }
    
        public static int[] getConcatenation(int[] arr) {
            int[] ans = new int[2 * arr.length];
    
            for (int i = 0; i < arr.length; i++) {
                
                ans[i] = ans[i + arr.length] = arr[i];
            }
    
            return ans;     
        }
    
}
