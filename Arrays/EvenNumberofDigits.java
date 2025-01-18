public class EvenNumberofDigits {

    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896};
        int result = findNumbers(arr);
        System.out.println(result);
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        int ans = 0;
        for(int element : nums) {
            while(element > 0 ) {
                count++;
                element = element/10;
            }
            if(count % 2 == 0) {
                ans += 1;
            }
            count = 0;
        }
        return ans;
        
    }
    
}
