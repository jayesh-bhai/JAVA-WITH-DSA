import java.util.Arrays;
// Imp question
public class Search_in_2D {
    public static void main(String[] args) {
        int[][] arr =  {{10,20,30},{40},{50,60},{100,110,120}};
        int[] ans = {-1,-1};
        int target = 50;
        int i,j;
        boolean found = false;
        for (i = 0; i<arr.length; i++) {
            for (j=0; j<arr[i].length; j++) {
                if (arr[i][j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    found = true;   
                }
            }
            if (found) break;
        }

        System.out.println(Arrays.toString(ans));

    }
}
