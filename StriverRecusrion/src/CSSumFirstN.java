public class CSSumFirstN {

    public static int SumFirstN(int n)
    {
        if(n==1){
            return 1;
        }
        else {
            return n+SumFirstN(n-1);
        }
    }
    public static void main(String[] args) {
        int n=3;
        int sum = SumFirstN(n);
        System.out.println(sum);
    }
}
