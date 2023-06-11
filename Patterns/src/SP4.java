/*Print the pattern
* 1
* 2 2
* 3 3 3
* 4 4 4 4
* 5 5 5 5 5
* */
public class SP4 {
    public static void main(String[] args) {

        //Logic section
        /*Same logic as SP3
        * In SP3, j is printed j times for every i loop starting from 1
        * In this pattern i should be printed for every i loop j times
        * for i=1 j will print 1
        * for i=2 j will print 2 2
        * for i=3 j will print 3 3 3
        * for i=4 j will print 4 4 4 4
        * for i=5 j will print 5 5 5 5 5
        * The loop terminates at <=5
        * */

        //Display section
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++) {
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
