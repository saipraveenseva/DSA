public class CountDigits {

    public static void main(String[] args) {

        long n=1234567890;
        int count=0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Digit count: "+count);
    }

}
