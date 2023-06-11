/*Print the below pattern
* 1
* 12
* 123
* 1234
* 12345
* */
public class SP3 {

    public static void main(String[] args) {

        /*Similar to SP2 logic
        * We print numbers instead of *.
        * In order to start from 1, we made both the loops start from 1 and end at <=5 */

        //Display section
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print(j);
            }
            System.out.println();
        }

    }



}
