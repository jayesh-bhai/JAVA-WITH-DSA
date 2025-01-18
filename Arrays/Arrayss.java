import java.util.Scanner;
public class Arrayss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
       // Q1 Create an array of float and add all the elements of the array

      /*  float[] arr = { 1.22f , 3.44f , 1.22f , 5.0f , 4.45f};
        float sum = 0f;
        for (int i=0;i<arr.length;i++) {
            sum += arr[i];
        }

        System.out.println(sum);  */

        // Q2 Write a program to find out whether the given element is present in the array or not.

    /*    int[] arr = {10,20,30,40};
        System.out.println("Enter the number to find : ");
        int n = sc.nextInt();
        boolean value = false;
        int i;
        for (i = 0; i < arr.length; i++) {

            if (arr[i] == n) {
                value = true;
                break;
            }
        }
        if (value) { System.out.print("Number is found at index : " + i); }
        else { System.out.println("Number not found in the given array "); }    */

        // Q3 write a java program to reverse an array

      /*  int[] arr = {10,20,30,40};
        int start,end;
        start = 0;
        end = arr.length-1;

        while (start < end) {

            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        for ( int i=0; i<=arr.length-1;i++) {
            System.out.print(arr[i] + " ");
        }                                         */

        // Q4 Write a java program to add two matrices of size 2x3

  /*      int[][] mat1 = { {10,20,30},{40,50,60}};

        int[][] mat2 = { {100,90,80} , {100,200,300} };

        int[][] result = new int [2][3];

        for (int i = 0; i<2; i++) {
            for (int j = 0; j<3; j++) {

                result[i][j] = mat1[i][j] + mat2[i][j];

            }
        }

        for (int i = 0; i<2; i++) {
            for (int j = 0; j<3; j++) {

            System.out.print(result[i][j] + " ");

            }
            System.out.println();
        }                                   */

        // Q5 Write a java program to find a maximum element in the given array.

     /*   int[] arr = {65,678,44,3345,223,334,53,221,1};
        int max = 0;

        if (arr.length == 1) {
            max = arr[0];
            System.out.println("Array has only one element : " + max);
        } else if (arr.length == 0) {

                System.out.println("OOPS ! array is empty ?!!!!");

        } else {
            for (int i = 0; i < arr.length; i++) {
                if ( arr[i] > max ) {
                    max = arr[i];
                }
            }
            System.out.println("Max Element : " + max);
            }                                                   */


            // Q6 Write a java program to find a minimu element in the given array.

     /*   int[] arr = {65,678,44,3345,223,334,53,221,1};
        int min = arr[0];

        if (arr.length == 1) {
            System.out.println("Array has only one element : " + min);
        } else if (arr.length == 0) {

                System.out.println("OOPS ! array is empty ?!!!!");

        } else {
            for (int i = 0; i < arr.length; i++) {
                if ( arr[i] < min ) {
                    min = arr[i];
                }
            }
            System.out.println("Min Element : " + min);

        }               */

        // Q7 Write a java program to find wether a given array is sorted or not.

        // My approach 

      /*  int[] arr = {10,90,30,40,50};
        int start=0,end=arr.length-1;
        boolean check = true;

        if (arr.length > 1 ) {

            while (start < end ) {

                if (arr[start] > arr[end]) {
                    check = false;
                    break;
                }

                start++;
                end--;
            }
        }

        if (check && arr.length > 0) {
            System.out.println("Array is sorted");
        }else {
            System.out.println("Array is not sorted");
        }                   */

        // More optimized approach 

    /*    public class IsArraySorted {

            public static boolean isSorted(int[] arr) {
                for (int i = 1; i < arr.length; i++) {
                    if (arr[i - 1] > arr[i]) {
                        return false; // If a pair of adjacent elements is not in ascending order, the array is not sorted
                    }
                }
                return true; // If the loop completes without finding any out-of-order elements, the array is sorted
            }
        
            public static void main(String[] args) {
                int[] arr1 = {1, 2, 3, 4, 5};
                int[] arr2 = {5, 4, 3, 2, 1};
                int[] arr3 = {2, 2, 2, 2, 2};
        
                System.out.println("Is arr1 sorted? " + isSorted(arr1)); // Output: true
                System.out.println("Is arr2 sorted? " + isSorted(arr2)); // Output: false
                System.out.println("Is arr3 sorted? " + isSorted(arr3)); // Output: true
            }
        }      */

        // Q8 Write a java program to find a second largest and second smallest element in the given array.  <<< ( IMP ) >>>

        /* This question is solved in another file named as "SecondLargestSmallest.java" */

        // Q9) Count the frequency of each element in the given array
        int[] arr = {12,45,12,1,1,12,10,23,45,45,1};
        int freq = 0;
        for (int num : arr) {
            System.out.println("calculating the frequency of : " + num);
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == num) {
                    freq +=1;
                }
            }
            System.out.println("The frequency of "+ num + " is : " + freq);
            freq = 0;
        }





     sc.close() ;

    }
}
