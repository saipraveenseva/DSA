/*Print the pattern
 *********
  *******
   *****
    ***
     *
 */

public class SP8 {

    public static void main(String[] args) {

        //Logic section
        /*Similar to SP7 lets try to reduce this into a formula
         * 0 spaces 9 stars
         * 1 space  7 stars
         * 2 spaces 5 stars
         * 3 spaces 3 stars
         * 4 spaces 1 star
         * The formula would be
         * For spaces if i=1 print i-1 spaces
         * For stars n=5 then how can be make 5 to 9. It would be multiplying it with 2 minus something.
         * n*2-something, that something is 2*i-1
         * for i=1 0 spaces 2*5-1=9 stars 1 2*1-1
         * for i=2 1 space  2*5-3=7 stars 3 2*2-1
         * for i=3 2 spaces 2*5-5=5 stars 5 2*3-1
         * for i=4 3 spaces 2*5-7=3 stars 7 2*4-1
         * for i=5 4 spaces 2*5-9=1 stars  9 2*5-1
         *
         * */

        //Display section

        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*5)-(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
