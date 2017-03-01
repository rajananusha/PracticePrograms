package ArraysandStrings;

/**
 * Created by anusha on 2/16/17.
 * Write a function in Java to leftpad each line with 'x' spaces.
 */

public class LeftPadding {

    public static String leftPadding(String text, int x){
        StringBuilder paddedText = new StringBuilder();
        String[] lines = text.split("\n");
        String padding = "";
        for(int i = 0 ; i < x; i++) {
            padding += " ";
        }
        paddedText = paddedText.append(padding);
        for(int j =0; j < text.length(); j++) {
            char c = text.charAt(j);
            paddedText = paddedText.append(c);
            if(c == '\n'){
                paddedText = paddedText.append(padding);
            }
        }
        return paddedText.toString();
    }

    public static void main(String[] args){
        String text = "blah\nblah\nblah";
        int x = 3;
        System.out.println(leftPadding(text, x));
    }
}
