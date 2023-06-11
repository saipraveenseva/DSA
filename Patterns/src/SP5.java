/*Print the pattern
* * * * * *
* * * * *
* * * *
* * *
* *
* */
public class SP5 {
    public static void main(String[] args) {
        //Logic section
        /*Similar logic to where we print * i times in every jth loop.
        * Since the triangle is in decreasing order we start the ith loop from 5 and decrement to 1
        * For every ith loop j for loop prints *
        * for i=5 j will print * * * * *
        * for i=4 j will print * * * *
        * for i=3 j will print * * *
        * for i=2 j will print * *
        * for i=1 j will print *
        * Loop terminates at i=0
         * */

        /*
        //Display section
        for(int i=5;i>=1;i--){
            for(int j=0;j<i;j++){
                System.out.print("*"+" ");
            }
            System.out.println();
        } */

        //Striver solution
        /* for i=0 j prints 5 *
         * for i=1 j prints 4 *
         * for i=2 j prints 3 *
         * for i=3 j prints 2 *
         * for i=4 j prints 1 *
         * for every i value j should print * n-i times.
         * i=0 print * j=5-0=5 times
         * i=1 print * j=5-1=4 times
         * i=2 print * j=5-2=3 times
         * i=3 print * j=5-3=2 times
         * i=4 print * j=5-4=1 times
         * Loop terminates at i=5
         * */

        //Display section
        for(int i=0;i<5;i++){
            for(int j=0;j<5-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
