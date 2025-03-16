public class SingleNumber {

    public static void main(String[] args) {


        int [] arr = {2,3,3,4,2,6,4}; 
        // Every number in this array is repeating for twice while there is only one number that is not repeating more than once.
        // So this number is going to our answer.

        System.out.println(singleNumber(arr));
        
    }

    public static int singleNumber(int[] arr) {
        int unique = 0;
        for (int n : arr) {
            unique ^= n;
        }
        return unique;
    }
    
}
