package ArraysandStrings;

/**
 * Created by anusha on 2/18/17.
 */
public class LongestPalindrome {

    public static boolean isPalindrome(String s, int i, int j) {
        if (i < 0) {
            return false;
        }
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static String longestPalindrome(String s) {
        String longest = "";
        int n = 0;
        for(int i=0;i<s.length();i++){
            if(isPalindrome(s,i-n-1,i)){
                longest = s.substring(i-n-1,i+1);
                n = n+2;
            }
            else if(isPalindrome(s,i-n,i)){
                longest = s.substring(i-n,i+1);
                n = n+1;
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        System.out.println(longestPalindrome("dabad"));
    }
}
