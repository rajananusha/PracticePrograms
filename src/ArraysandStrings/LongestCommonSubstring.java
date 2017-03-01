package ArraysandStrings;

/**
 * Created by anusha on 3/1/17.
 */
public class LongestCommonSubstring {

    public static String getLongestCommonSubstring(String str1, String str2) {
        String subString = "";
        int len1 = str1.length();
        int len2 = str2.length();
        String[][] dp = new String[len1 + 1][len2 + 1];

        for (int i = 0; i <= len1; i++) {
            for (int j = 0; j <= len2; j++) {
                if (i == 0 || j == 0) {
                    if (str1.charAt(0) == str2.charAt(0)){
                        dp[i][j] = str1.substring(0, 1);
                    } else {
                        dp[i][j] = "";
                    }
                } else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    StringBuilder temp = new StringBuilder();
                    temp.append(dp[i - 1][j - 1]).append(str1.charAt(i-1));
                    dp[i][j] = temp.toString();
                    if (dp[i][j].length() > subString.length()) {
                        subString = dp[i][j];
                    }
                } else {
                    dp[i][j] = "";
                }
            }
        }

        return subString;
    }

    public static void main(String[] args) {
        String str1 = "OldSite:GeeksforGeeks.org";
        String str2 = "NewSite:GeeksQuiz.com";

        System.out.print(getLongestCommonSubstring(str1, str2));
    }
}
