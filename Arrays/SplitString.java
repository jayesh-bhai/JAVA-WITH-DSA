public class SplitString {
        public static void main (String[] args) {
            String str = "00";
            System.out.println(maxScore(str));
        }
     
        public static int maxScore(String s) {
            int ans = 0;
            
            for (int i = 0; i < s.length() - 1; i++) {
                int curr = 0;
                for (int j = 0; j <= i; j++) {
                    if (s.charAt(j) == '0') {
                        curr += 1;
                    }
                }
                
                for (int j = i + 1; j < s.length(); j++) {
                    if (s.charAt(j) == '1') {
                        curr += 1;
                    }
                }
                
                ans = Math.max(ans, curr);
            }
            
            return ans;
        }
    }
