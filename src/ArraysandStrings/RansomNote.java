package ArraysandStrings;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by anusha on 2/22/17.
 */
public class RansomNote {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        String answer = canMakeRansomNote(magazine, ransom) ? "Yes" : "No";
        System.out.println(answer);
    }

    public static boolean canMakeRansomNote(String[] mag, String[] ran){
        if(ran.length > mag.length)
            return false;
        HashMap<String,Integer> words = new HashMap<>();
        for(int i = 0; i < mag.length; i++) {
            String word = mag[i];
            if(words.get(word) == null) {
                words.put(word, Integer.valueOf(1));
            } else {
                int count = words.get(word);
                count++;
                words.put(word,Integer.valueOf(count));
            }
        }
        for(int i = 0; i < ran.length; i++) {
            String word = ran[i];
            if(words.get(word) == null || words.get(word) == 0) {
                return false;
            } else {
                int count = words.get(word);
                count--;
                words.put(word,Integer.valueOf(count));
            }
        }
        return true;
    }
}
