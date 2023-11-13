import java.util.*;
public class FibonacciForLoop {

    public static void main(String[] args) {
        int a=0,b=1;
        // 0 1 1 2 3 5 8 13 21
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        if(n==0){
            System.out.println(0);
        }
        else if(n==1 || n==2){
            System.out.println(1);

        }
        else{
            for(int i=2;i<=n;i++)
            {
                int temp=a+b;
                a=b;
                b=temp;
            }
            System.out.print(b);
        }
    }
}
