package ArraysandStrings;

/**
 * Created by anusha on 26/10/16.
 */
public class ReplaceSpacesTester {
    public static char[] replaceSpaces(char[] input, int string_length) {
        int spaceCount = 0;
        for(int i =0; i < string_length; i++) {
            if(input[i]==' ') {
                spaceCount++;
            }
        }
        int newlength = string_length + spaceCount * 2;
        input[newlength]='\0';
        for(int i = string_length - 1; i >= 0; i--) {
            if(input[i] == ' ') {
                input[newlength-1] = '0';
                input[newlength-2] = '2';
                input[newlength-3] = '%';
                newlength = newlength - 3;
            } else {
                input[newlength -1 ] = input[i];
                newlength = newlength - 1;
            }
        }
        return input;
    }
    public static void main(String[] args) {
        char[] input = {'m','r', ' ', 'j','o','h','n',' ','s','m','i','t','h',' ', ' ', ' ',' ',' ',' '};
        System.out.println(input);
        System.out.println(replaceSpaces(input, 13));

    }
}
