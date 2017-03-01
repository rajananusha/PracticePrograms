package ArraysandStrings;

/**
 * Created by anusha on 26/10/16.
 */
public class OneEditAwayTester {
    public static boolean isOneEditAway(String s1, String s2) {
        if(Math.abs(s1.length() - s1.length()) > 1) {
            return false;
        }
        int ptr1 = 0;
        int ptr2 = 0;
        int diff = 0;
        while(ptr1 < s1.length() && ptr2 < s2.length()){
            int x = s1.charAt(ptr1);
            int y = s2.charAt(ptr2);
            if(x == y) {
                ptr1++;
                ptr2++;
            } else {
                diff++;
                if(diff > 1) {
                    return false;
                }
                if(s1.charAt(ptr1+1) == y) {
                    ptr1++;
                } else if(s2.charAt(ptr2+1) == x) {
                    ptr2++;
                } else {
                    ptr1++;
                    ptr2++;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String result = isOneEditAway("pale","bale") ? "Is One Edit Away" : "Is not One Edit Away";
        System.out.println(result);
        result = isOneEditAway("pale", "bake") ? "Is One Edit Away" : "Is not One Edit Away";
        System.out.println(result);
    }
}
