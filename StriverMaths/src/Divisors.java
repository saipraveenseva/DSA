public class Divisors {
    public static void main(String[] args) {        // *** Complete coding ninjas code after learning recusion
        int n=36;

//        for(int i=1;i<=n;i++){
//            if(n%i==0){
//                System.out.print(i+" "); // Bruteforce approach
//            }
//        }

        for(int i=1;i<=Math.sqrt(n);i++){                // No need to run the loop until n, just run it until sqrt(n).
            if(n%i==0){                                   // While finding all the divisors, print the quotient as well
                System.out.print(i+" ");                   // Printing divisor
                if(i*i!=n) {                                // For a perfect square number like 36, the divisor will print 2 times. 2 avoid that I wrote this corner testcase.
                    System.out.print(n / i + " ");      // printing quotient
                }
            }
        }
    }
}
