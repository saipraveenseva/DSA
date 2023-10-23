public class CSFactorialNumbers {

    public static int factorial(int f){
        if(f==0) {
            return 1;
        }
        else{
            return f*factorial(f-1);
        }
    }

    public static void PrintFactorialNumbers(int n, int i, int fact){
        if(fact>n){
            return;
        }

        else{


            System.out.print(fact + " ");
            i++;
            fact=factorial(i);                          // My code
            PrintFactorialNumbers(n,i,fact);

//
//            System.out.print(fact+" ");
//            i++;
//            fact=fact*i;                            // Optimised code. No need of seperate Factorial function.
//            PrintFactorialNumbers(n,i,fact);

        }
    }

    public static void main(String[] args) {
        int n=7;
        int fact=1;
        PrintFactorialNumbers(n,1,fact);
//        System.out.println(fact);
    }
}

//-------------------------------------------- Code Studio code we have to add result to an ArrayList and return the ArrayList to the main


//        import java.io.*;
//
//                import java.util.*;
//
//                import java.util.List;
//
//        public class Solution {
//
//            public static void Factorial(long n, int i, long fact, ArrayList<Long> li){
//                if(fact>n){
//                    return;
//                }
//
//                else{
//                    li.add(fact);
//                    i++;
//                    fact=fact*i;                            // Optimised code. No need of seperate Factorial function.
//                    Factorial(n,i,fact,li);
//
//                }
//            }
//
//            public static List<Long> factorialNumbers(long n) {
//                // Write Your Code Here
//
//                ArrayList<Long> li = new ArrayList<Long>();
//                long fact=1;
//                Factorial(n,1,fact,li);
//                return li;
//            }
//        }