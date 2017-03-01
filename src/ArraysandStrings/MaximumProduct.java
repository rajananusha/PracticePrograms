package ArraysandStrings;

import java.util.Arrays;

/**
 * Created by anusha on 2/16/17.
 * Given an array of integers. Find the two that produce the highest product.
 */
public class MaximumProduct {

    public static void getMaxProductPair(int[] array){
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int x : array){
            if(x >= max1){
                max2 = max1;
                max1 = x;
            } else if(x >= max2){
                max2 = x;
            }
        }

        System.out.println(max1 + ", " + max2);
    }

    public static void main(String[] args){
        int[] array1 = {1, 4, 3, 6, 7, 0};
        int[] array2 = {-1, -3, -4, 2, 0, -5};
        getMaxProductPair(array1);
        getMaxProductPair(array2);
    }
}
