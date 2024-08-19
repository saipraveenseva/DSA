// A perfect number is a number that is equal to sum of all its divisors.

import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n=sc.nextInt();
        int divisorSum=0;

        for(int i=1;i<n;i++){

            if(n%i==0)
            {
                divisorSum=divisorSum+i;
            }
        }

        System.out.println(n==divisorSum);
    }
}
