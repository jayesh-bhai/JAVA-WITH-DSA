import java.util.ArrayList;
import java.util.List;
// problem no. 1431
public class KidsWithGreatestNoOfCandies {
    public static void main(String[] args) {

        int[] candies = {4,2,1,1,2};
        int extraCandies = 1;
        System.out.println(kidsWithCandies(candies,extraCandies));
        
    }
    
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        ArrayList<Boolean> result = new ArrayList<>();

        // For finding the max element in the array
        for (int i = 0; i < candies.length; i++) {

            if ( candies[i] > max ) {
                max = candies[i];
            }

        }

        for (int i = 0; i < candies.length; i++) {

            if ( candies[i] + extraCandies >= max ) {
                result.add(true);
            } else {
                result.add(false);
            }

        }

        return result;
        
    }
}
