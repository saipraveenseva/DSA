import java.util.*;
public class StringsBasics {

    public static void main(String[] args) {
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + lastName; // concatenation
        System.out.println(fullName); //TonyStark

        // Taking input from user
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String inputfirstName = sc1.next(); // .next(); space is a delimter. It considers the input until it reaches a space.
        System.out.println(inputfirstName);

        System.out.println("Enter full name: ");
        String inputfullName = sc2.nextLine(); // .nextLine(); considers the entire line along with spaces.
        System.out.println(inputfullName);

        System.out.println(inputfullName.length()); // prints the length of the string

        //charAt

        for(int i=0;i<inputfullName.length();i++)
        {
            System.out.println(inputfullName.charAt(i)); // prints the string one by one.
        }


    }
}
