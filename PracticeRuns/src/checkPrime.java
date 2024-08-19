import java.util.*;
public class checkPrime {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean isPrime=true;

        for(int i=2;i<Math.sqrt(n);i++){

            if(n%i == 0){
                isPrime=false;
                break;
            }
        }
        System.out.println(n);
        System.out.println("isPrime: "+isPrime);
    }
}
