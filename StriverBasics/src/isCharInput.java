import java.util.Scanner;
/*
Write a program that takes a character as input and prints

1 for upper case letters
0 for lower case letters
-1 for non alphabets
*/

public class isCharInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char character = sc.next().charAt(0);
        int temp = character; // This typecasting will assign the ASCII value of the characer to temp.

        if(temp>=65 && temp <=90){
            System.out.println(1);
        }

        else if(temp>=97 && temp <=112){
            System.out.println(0);
        }
        else{
            System.out.println(-1);
        }


    }
}
