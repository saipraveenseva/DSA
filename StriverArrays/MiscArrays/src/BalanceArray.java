/* Program to find a number to make the array balanced.
   Array is of even size.
   Sum of First half of array should be equal to Second half of the array. Then the array is balanced.
   If the array is not balanced, find the number that can be added to array to make it balanced.

 */
import java.util.*;

import static java.lang.Math.abs;

public class BalanceArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 1, 2, 1, 3};
        int first=0;
        int second=0;
        /*
        int mid = arr.length/2;

        for(int i=0;i<mid;i++){
            first=first+arr[i];
        }

        for(int i=mid;i<arr.length;i++){
            second=second+arr[i];
        }

        System.out.println(first);
        System.out.println(second);

        System.out.println("Balanced factor: " + Math.abs(first-second));

         */

        /* Optimised way is to write the logic in a single loop. time efficient

            Run the loop till mid
            first will calculate sum of first half
            second will calculate sum of second half

            we just simply write it as second = second + arr[n-1-i];
         */

        for(int j=0;j<arr.length/2;j++){
            first = first+arr[j];
            second = second + arr[arr.length-1-j];
        }
        System.out.println("Balanced factor: " + Math.abs(first-second));
    }
}
