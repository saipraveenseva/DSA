// Program to count the digits in a number N that evenly divides N.

import java.util.Scanner;

public class CountDigits {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        int input=sc.nextInt();
        int N=input;
        int count=0;
        int digitcount=0;

        while(N!=0){
            int digit=N%10;
             // To avoid divide by zero exception
                if (digit!=0 && input%digit==0) { //Dividing n with each digit, if it is divisible we do digitcount++
                    digitcount++;
                }
                N=N/10;
            count++; // This just counts the number of digits.

        }
        System.out.println("Digit count: "+count);
        System.out.println("Div count: "+digitcount);
    }

}
