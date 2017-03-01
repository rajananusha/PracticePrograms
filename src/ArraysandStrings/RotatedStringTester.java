package ArraysandStrings;

/**
 * Created by anusha on 26/10/16.
 */
public class RotatedStringTester {
    public static boolean isRotated(String s1, String s2) {
        String rotatedString = s1 + s1;
        boolean answer = rotatedString.contains(s2) ? true : false;
        return answer;
    }
    public static void main(String[] args) {
        String result = isRotated("waterbottle","terbottlewa") ? "Is rotation" : "Is not rotation";
        System.out.println(result);
        result = isRotated("cat", "dog") ? "Is rotation" : "Is not rotation";
        System.out.println(result);
    }
}
