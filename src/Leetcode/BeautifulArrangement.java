package Leetcode;

/**
 * Created by anusha on 2/18/17.
 * Suppose you have N integers from 1 to N. We define a beautiful arrangement as an array that is constructed by these N numbers successfully if one of the following is true for the ith position (1 ≤ i ≤ N) in this array:
 * The number at the ith position is divisible by i.
 * i is divisible by the number at the ith position.
 * Now given N, how many beautiful arrangements can you construct?
 */
public class BeautifulArrangement {
        public static int countArrangement(int N) {
            int ans = N;
            if( N == 1 || N ==2 || N==3){
                return ans;
            }
            int k = 1;
            for(int i = N; i>= 3;i--){
                for(int j = i-1; j>= 2;j--){
                    if ( i % j == 0) {
                        k *= j;
                        break;
                    }
                }
            }
            return N*k;
        }

    public static void main(String[] args) {
        System.out.println(countArrangement(5));
        System.out.println(countArrangement(6));
        System.out.println(countArrangement(7));
    }
}
