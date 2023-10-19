import java.util.*;
public class Prime {

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n= s.nextInt();


        boolean isPrime=true;

        for(int i=2;i<Math.sqrt(n);i++){
            if(n%i ==0){
                isPrime=false;
                break;
            }
        }
        System.out.println(isPrime);


    }
}
