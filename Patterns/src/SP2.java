/*Print the below pattern
 * *
 * **
 * ***
 * ****
 * *****
 * */
public class SP2 {
    public static void main(String[] args) {

        //Logic section
        /*j loop runs i times every loop
        * if i=0, j run 1 time(0)
        * if i=1 j runs 2 times(0,1)
        * if i=2 j runs 3 times(0,1,2)
        * if i=3 j runs 4 times(0,1,2,3)
        * if i=4 j runs 5 times(0,1,2,3,4)
        * Once i hits 5 i loop terminates, terminating j loop as well.*/

        //Display section
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
