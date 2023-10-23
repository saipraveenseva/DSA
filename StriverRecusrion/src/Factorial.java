public class Factorial {

    public static int PrintFactorial(int n){
        if(n==0){
            return 1;
        }
        else {
            return n * PrintFactorial(n - 1);
        }
    }


    public static void main(String[] args) {
        int n=5;
        int fact=PrintFactorial(n);
        System.out.println(fact);

    }
}
