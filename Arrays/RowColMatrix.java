import java.util.Arrays;
public class RowColMatrix {
    public static void main(String[] args) {
        int[][] arr =  {{10,20,30},{50,60,90},{100,110,120}};
        int target = 100;
        System.out.println(arr.length);
        System.out.println(Arrays.toString(matrixSearch(arr,target)));

    }

    public static int[] matrixSearch(int[][] matrix , int target) {
        int r = 0;
        int c = matrix.length-1;

        while (r < matrix.length && c >= 0) {

            if (matrix[r][c] == target) {
                return new int[]{r,c};
            }

            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }

        }
        return new int[]{-1,-1};
    }
    
}
