package ArraysandStrings;

/**
 * Created by anusha on 3/2/17.
 *
 * Given a word. Rearrange the letters to form the next alphabetically greater word.
 */
public class NextAlphabeticalWord {

    public static char[] swap(char[] wordArray, int i , int j){
        char temp = wordArray[i];
        wordArray[i] = wordArray[j];
        wordArray[j] = temp;
        return wordArray;
    }


    public static String rearrangeWord(String word) {
        char[] wordArray = word.toCharArray();
        int len = wordArray.length;
        int i = len - 1;
        int flag = 0;
        while (i > 0) {
            if(wordArray[i - 1] < wordArray[i]){
                flag = 1;
                break;
            }
            i--;
        }
        if (flag == 0) {
            return "no answer";
        }
        int j = len - 1;
        while (wordArray[j] <= wordArray[i - 1]) {
            j--;
        }
        swap(wordArray, i - 1 , j);
        j = len - 1;
        while (i < j) {
            swap(wordArray, i , j);
            i++;
            j--;
        }
        return String.valueOf(wordArray);
    }


    public static void main(String[] args) {
        System.out.println(rearrangeWord("hefg"));
    }
}
