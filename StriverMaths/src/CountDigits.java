public class CountDigits {

    public static void main(String[] args) {

        int n=980;
        int d=n;
        int p;
        int count=0;
        int divcount=0;
        while(d>0){
            p=d%10;
            if(p!=0) { // To avoid dive by zero exception
                if (n % p == 0) { //Dividing n with each digit, if it is divisible we do divcount++ hello
                    divcount++;
                }
            }
            d=d/10;
            count++; // This just counts the number of digits.

        }
        System.out.println("Digit count: "+count);
        System.out.println("Div count: "+divcount);
    }

}
