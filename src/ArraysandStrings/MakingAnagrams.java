package ArraysandStrings;

/**
 * Created by anusha on 2/22/17.
 */
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int[] alphabets = new int[26];
        int count =0;
        first.chars().forEach(c -> alphabets[c-97]++);
        second.chars().forEach(c -> alphabets[c-97]--);
        for (int i = 0; i < 26; i++) {
            count += Math.abs(alphabets[i]);
        }
        return count;
    }

    public static void main(String[] args) {
        String a = "cde";
        String b = "abc";
        System.out.println(numberNeeded(a, b));
    }
}
