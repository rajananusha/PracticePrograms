package ArraysandStrings;

import java.util.stream.IntStream;

/**
 * Created by anusha on 26/10/16.
 */
public class PermutationPalindromeTester {
    public static boolean isPermutPalindrome(String input) {
        char[] array = input.toCharArray();
        int charac[] = new int[128];
        for(int i=0 ; i < input.length(); i++) {
            if(array[i] == ' ')
                continue;
            int val = array[i];
            if(charac[val] == 1)
                charac[val] = 0;
            else
                charac[val] = 1;
        }
        int sum = IntStream.of(charac).sum();
        if(sum<=2) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        String result = isPermutPalindrome("taco cat") ? "Is palindrome" : "Is not palindrome";
        System.out.println(result);
        result = isPermutPalindrome("taccat") ? "Is palindrome" : "Is not palindrome";
        System.out.println(result);
    }
}
