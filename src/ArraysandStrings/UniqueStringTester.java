package ArraysandStrings;

/**
 * Created by anusha on 23/10/16.
 */
public class UniqueStringTester {
    public static boolean isUnique(String input) {
        if(input.length() > 128)
            return false;
        char[] arr = input.toCharArray();
        boolean[] alphabets = new boolean[128];
        for(int i =0; i< arr.length ; i++) {
            int val = arr[i];
            if(alphabets[val]){
                return false;
            }
            alphabets[val] = true;
        }
        return true;
    }

    public static void main(String[] args) {
        String result = isUnique("Anusha") ? "Is Unique" : "Is not Unique";
        System.out.println(result);
        result = isUnique("anusha") ? "Is Unique" : "Is not Unique";
        System.out.println(result);
    }
}
