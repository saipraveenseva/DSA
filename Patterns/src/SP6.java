/*Print the pattern
* 1 2 3 4 5
* 1 2 3 4
* 1 2 3
* 1 2
* 1
* */
public class SP6 {
    public static void main(String[] args) {

        //Logic section
        /*Similar to SP5 striver solution
        * The difference is we are print numbers now.
        * So starting the loop from 1 till <=5 makes more sense.
        * Since we are starting from 1 the j loop is made to terminate at n-i+1;
        * i=1 print j=5-1+1=5
        * i=2 print j=5-2+1=4
        * i=3 print j=5-3+1=3
        * i=4 print j=5-4+1=2
        * i=5 print j=5-5+1=1
        * Loop terminates at i=6
        * */

        //Display section
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
