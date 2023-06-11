/*Print the below pattern
* *****
* *****
* *****
* *****
* *****
* */

public class SP1Patterns {
    public static void main(String[] args) {

        //Logic section
        /*The pattern given has equal number of rows and columns.
        * Inner for loop(j) prints columns
        * Outer for loops prints rows*
        * For the above pattern j for loops prints * in 5 columns *****
        * Then the i for loops repeats this 5 times. */

        //Display section

        for(int i=0;i<5;i++) {                  // This repeats what is printed 5 times
            for (int j = 0; j < 5; j++) {
                System.out.print("*");          // This prints *****
            }
            System.out.println();               //After printing ***** we have to print the next 5 *'s in the next line.
        }
    }
}
