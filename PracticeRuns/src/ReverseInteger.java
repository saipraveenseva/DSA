import java.util.*;
public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int p=n;
        if(p<0){
            n=Math.abs(n);
        }
        int reverse=0;
        while(n>0){
            int remainder = n%10;
            reverse = reverse*10+remainder;
            n=n/10;
        }

        if(p<0) {
            System.out.println(-reverse);
        }
        else{
            System.out.println(reverse);
        }
    }
}
