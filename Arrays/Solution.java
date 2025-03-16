import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.math.BigInteger;

public class Solution {
    public static void main (String[] args) {

        int[] arr = {9,9,9,9,9,9,9,9,9,9,9,9,9,9};
        int k = 34;
        System.out.println(addToArrayForm(arr,k));
      
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {

        String str = "";
        List<Integer> ans = new ArrayList<>();

    for (int el : num) {
        str += Integer.toString(el);
    }

    BigInteger new_val = new BigInteger(str);
 
    BigInteger bigK = BigInteger.valueOf(k);

    BigInteger bigSum = new_val.add(bigK);

    while (!bigSum.equals(BigInteger.ZERO)) {
        BigInteger[] divAndRem = bigSum.divideAndRemainder(BigInteger.TEN);
        int digit = divAndRem[1].intValue(); // Remainder is the last digit
        ans.add(digit);
        bigSum = divAndRem[0]; // Update bigNumber to the quotient
    }

    Collections.reverse(ans);
    return ans;


        
    }
}
