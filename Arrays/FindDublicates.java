// Leetcode problem number 
import java.util.Arrays;
public class FindDublicates {
    public static void main(String[] args) {
        int[] arr = {3,3,3,3,3,3};
        System.out.println(findDuplicate(arr));
    }

    public static int findDuplicate(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctPos = arr[i] - 1; // Assumes numbers should be from 1 to n

            if (arr[i] >=1 && arr[i] <= arr.length && arr[i] != arr[correctPos]) { // Check if the element is in range and not at the correct position
                swap(arr, i, correctPos);
            } else {
                i++; // Move to the next element
            }
        }

        return arr[arr.length-1];
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
