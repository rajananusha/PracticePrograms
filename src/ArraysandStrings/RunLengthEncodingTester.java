package ArraysandStrings;

public class RunLengthEncodingTester {

    public static String runLengthEncoding(String input) {
        int prev = input.charAt(0);
        StringBuilder encodedString = new StringBuilder();
        encodedString.append(input.charAt(0));
        int count = 1;
        for(int i = 1; i < input.length(); i++){
            if(input.charAt(i) == prev) {
                count++;
            } else {
                encodedString.append(count);
                encodedString.append(input.charAt(i));
                prev = input.charAt(i);
                count = 1;
            }
        }
        encodedString.append(count);
        String encoded = encodedString.toString();
        String answer = encoded.length() < input.length() ? encoded : input;
        return answer;
    }

    public static void main(String[] args) {
        String input = "abcd";
        System.out.println(runLengthEncoding(input));
    }
}
