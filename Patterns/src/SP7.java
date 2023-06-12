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


        Reducing this into a formula
        starting from i=0, n=5 we get n-i-1 spaces and 2*i+1 stars
        for i=0 5-0-1=4 spaces and 2*0+1=1 star
        for i=1 5-1-1=3 spaces and 2*1+1=3 stars
        for i=2 5-2-1=2 spaces and 2*2+1=5 stars
        for i=3 5-3-1=1 space and 2*3+1=7 stars
        for i=4 5-4-5=0 spaces and 2*4+1=9 stars

        FYI we need to seperate for loops, one for spaces and one for stars. Both will run inside i for loop.
         */

        //Display section
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
