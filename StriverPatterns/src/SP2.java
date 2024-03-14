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
        * if i=1, j run 1 time(1)
        * if i=2 j runs 2 times(1,2)
        * if i=3 j runs 3 times(1,2,3)
        * if i=4 j runs 4 times(1,2,3,4)
        * if i=5 j runs 5 times(1,2,3,4,5)
        * Once i hits 6 i loop terminates, terminating j loop as well.*/

        //Display section
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
