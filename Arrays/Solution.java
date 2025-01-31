import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

class Solution {

    public static void main (String[] args) {

        List<List<String>> items = new ArrayList<List<String>>();

         items.add(Arrays.asList("phone","blue","pixel"));
         items.add(Arrays.asList("computer","silver","lenovo"));
         items.add(Arrays.asList("phone","gold","iphone"));

        String ruleKey = "type";
        String ruleValue = "phone";
System.out.print("The number of list that matches the rule is " + countMatches(items,ruleKey,ruleValue));
    }
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        if (ruleKey.equals("type")) {
            count = 0;

            for (int i = 0; i < items.size(); i++) {
               if (items.get(i).get(0).equals(ruleValue)) {
                count++;
                }
            }

            return count;

        } else if (ruleKey.equals("color")) {

            count = 0;

            for (int i = 0; i < items.get(i).size(); i++) {
               if (items.get(i).get(1).equals(ruleValue)) {
                count++;
                }
            }

            return count;

        } else {
            count = 0;

            for (int i = 0; i < items.get(i).size(); i++) {
               if (items.get(i).get(2).equals(ruleValue)) {
                count++;
                }
            }

            return count;

        }
        
    }
}