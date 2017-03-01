package ArraysandStrings;

import java.util.Arrays;
/**
 * Created by anusha on 23/10/16.
 */
public class PermutationStringTester {
    public static boolean isPermutation1(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }
        char[] arrayA = a.toCharArray();
        char[] arrayB = b.toCharArray();
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);
        if(Arrays.equals(arrayA, arrayB))
            return true;
        else
            return false;
    }
    public static boolean isPermutation(String a, String b){
        if(a.length() != b.length()) {
            return false;
        }
        int[] characA = new int[128];
        int[] characB = new int[128];
        for(int i = 0 ; i < a.length() ; i++) {
            int a_val = a.charAt(i);
            int b_val = b.charAt(i);
            characA[a_val]++;
            characB[b_val]++;
        }
        if(Arrays.equals(characA, characB))
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        String result = isPermutation("pater","taper") ? "Is permutation" : "Is not permutation";
        System.out.println(result);
        result = isPermutation("cat", "dog") ? "Is permutation" : "Is not permutation";
        System.out.println(result);
    }
}
