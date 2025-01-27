public class GoodPairs {

    public static void main (String[] args) {

        int[] arr = {1,2,3,1,1,3};

        System.out.println("The number of good pairs are : "+numIdenticalPairs(arr));

    }
    public static int numIdenticalPairs(int[] arr) {
		int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count = count + 1;
                }
            }
        }
        return count;
        
    }   
    
}
