class Solution {

    public static void main(String[] args) {
        int[] gain = {-5,1,5,0,-7};
        System.out.println(largestAltitude(gain));
    }
    public static int largestAltitude(int[] gain) {

        int[] altitude = new int[gain.length+1];
        altitude[0] = 0;
        int max = altitude[0];
        for (int i = 0; i < gain.length; i++) {

            altitude[i+1] = altitude[i] + gain[i];

            if ( altitude[i+1] > max ) {
                max = altitude[i+1];
            }

        }

        return max;
        
    }
}