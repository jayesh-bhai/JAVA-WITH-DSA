// leetcode 1672
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] arr = { {2,8,7},{7,1,3},{1,9,5} };
        System.out.println("The maximum wealth is : " + maximumWealth(arr));
    }
    public static int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for(int person = 0; person < accounts.length; person++) {
            sum = 0;
            for (int money = 0; money < accounts[person].length; money++) {
                sum += accounts[person][money];
            }

            if ( sum > max ) {
                max = sum;
            }
        }

        return max;
        
    }
    
}
