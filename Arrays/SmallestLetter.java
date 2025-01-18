// 744. Find Smallest Letter Greater Than Target

public class SmallestLetter {

    public static void main(String[] args) {
        char[] nums = {'b','c','f'};
        char n = 'a';
        System.out.println("The character of the ceiling of target element is : " + nextGreatestLetter( nums , n ));
    }
    public static char nextGreatestLetter(char[] letters, char target) {
        
        if (target > letters[letters.length-1]) {
            return letters[0];
        }
        int start = 0;
        int end = letters.length-1;
        while (start <= end) {
            int mid = start + (end-start)/2;
            if (target < letters[mid] ) {
                end = mid-1;
            } else { // We are only concern about the letter should be strictly greater than the target so we have removed else if condition
                start = mid + 1;
            }
        }
        return letters[start % letters.length]; // logic for wrapping the letter as montioned in the question
    }
}
