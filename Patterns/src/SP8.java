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
         * For spaces if i=0 print i spaces
         * For stars n=5 then how can be make 5 to 9. It would be multiplying it with 2 minus 1.
         * n*2-1
         * for i=0 0 spaces 2*5-1=9 stars
         * for i=1 1 space  2*5
         * */

        //Display section

        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*5)-(2*i+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
