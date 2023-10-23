public class CSFactorialNumbers {

    public static void PrintFactorialNumbers(int n, int i){
        if(n==i){
            return;
        }
        else{
            System.out.print(i*(i+1)+" ");
            PrintFactorialNumbers(n,i+1);
        }
    }

    public static void main(String[] args) {
        int n=15;

        PrintFactorialNumbers(n,1);
    }
}
