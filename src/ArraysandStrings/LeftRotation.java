package ArraysandStrings;

import java.util.Scanner;

/**
 * Created by anusha on 2/22/17.
 */
public class LeftRotation {
    public static int[] leftRotate(int[] arr, int n){
        int len = arr.length;
        int new_arr[] = new int[len];
        for(int i=0;i<len;i++){
            int p = (i + n) % len;
            new_arr[i]=arr[p];
        }
        return new_arr;
    }
    public static void printarr(int[] arr) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int k = 4;
        printarr(leftRotate(a,k));
    }
}
