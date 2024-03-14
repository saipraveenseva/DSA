/* Print the below pattern
    *
   ***
  *****
 *******
*********


 */
public class SP7 {
    public static void main(String[] args) {


        //Logic section(Striver solution)
        /*
        ----*          4 spaces 1 star
        ---***         3 spaces 3 stars
        --*****        2 spaces 5 stars
        -*******       1 spaces 7 stars
        *********      0 space  9 stars

        In total there are 5 rows and 9 columns, we can find a relation for rows and columns. n=5 means 5 rows. 2*n-1(2*5-1)= 9columns.
        So rows printing starts from 1 to 2*n-1 columns

        FOr - triangle we have to run the loop for n-i=5-1=4 starting from i=1

        Reducing this into a formula
        starting from i=1, n=5 we get n-i spaces and 2*i-1 stars
        for i=1 5-1=4 spaces and 2*1-1=1 star
        for i=2 5-2=3 spaces and 2*2-1=3 stars
        for i=3 5-3=2 spaces and 2*3-1=5 stars
        for i=4 5-4=1 space and 2*4-1=7 stars
        for i=5 5-5=0 spaces and 2*5-1=9 stars

        FYI we need to seperate for loops, one for spaces and one for stars. Both will run inside i for loop.
         */

        //Display section
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
