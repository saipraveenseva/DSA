import java.util.Scanner;

public class isCharInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char character = sc.next().charAt(0);
        int temp = character;

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
