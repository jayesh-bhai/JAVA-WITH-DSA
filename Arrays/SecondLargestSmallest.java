import java.util.Scanner;
public class SecondLargestSmallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {12,35,1,10,34,1};
        second(arr);
        sc.close();
    }

    static void second (int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array size is to small !!! ");
    
        } else {
            int largest = Integer.MIN_VALUE;
            int secondLargest = Integer.MIN_VALUE;

            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for (int num : arr) {

                // For Finding Second Largest Element
                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } else if ( num > secondLargest && num != largest) {
                    secondLargest  = num;
                }

                if (num < smallest) {
                    secondSmallest = smallest;
                    smallest = num;
                } else if ( num < secondSmallest && num != smallest) {
                    secondSmallest  = num;
                }
            }

            System.out.println("Second Largest and Smallest Element is : " + secondLargest + " " + secondSmallest);
        }
    }
    
}
