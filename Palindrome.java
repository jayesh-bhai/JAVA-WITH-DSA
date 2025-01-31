public class Palindrome {
    public static void main (String[] args) {

        String str = null;

        System.out.println("Is the string is palindrome ? -> " + isPalindrome(str));


    }

    public static boolean isPalindrome (String str) {

        if(str == null || str.length() == 0) {
            return true;
        }

        int start = 0;
        int end = str.length()-1;

        while (start < end) {

            if ( str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;

    }
}