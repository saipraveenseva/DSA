public class DigitsThatDivide {

    public static void main(String[] args) {
        int num=1248;

        int p=num;
        int digitsThatDivide=0;
        while(num!=0){
            int digit=num%10;

            if(p%digit==0){
                digitsThatDivide++;
            }
            num=num/10;
        }

        System.out.println(digitsThatDivide);
    }

}
