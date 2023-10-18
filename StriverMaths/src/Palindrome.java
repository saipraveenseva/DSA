

public class Palindrome {

    static int reversal(int n){
        int reverse=0;

        while(n>0){
            int remainder = n%10;
            reverse=reverse * 10 + remainder;
            n=n/10;
        }
        return reverse;
    }

    public static void main(String[] args) {

        int n1=121;
        int n2=3223;
        int n3=123456;

        System.out.println(n1==reversal(n1));
        System.out.println(n2==reversal(n2));
        System.out.println(n3==reversal(n3));
    }


}
