public class Armstrong {
    public static void main(String[] args) {

        int n=15345673;
        double result=0;
        int count=0;

        int p=n;

        while(p>0){
            p=p/10;
            count++;            // THis loop finds the no of digits
        }

        int q=n;
        while(q>0){
            int digit=q%10;
            result = result + Math.pow(digit,count); // This loop finds the armstrong value
            q=q/10;
        }


        System.out.println((int)result);


        if(n==result){
            System.out.println("Armstrong");        // Comparision is done.
        }
        else {
            System.out.println("Not Armstrong");
        }
    }
}

// Take input and check armstrong


//import java.util.Scanner;
//
//public class Main {
//
//    public static void main(String[] args) {
//        Scanner s= new Scanner(System.in);
//        int n= s.nextInt();
//        if (ArmstrongNumber(n))
//        {
//            System.out.println("true");
//        }
//        else
//        {
//            System.out.println("false");
//        }
//    }
//    static boolean ArmstrongNumber(int n)
//    {
//        int originalno = n;
//        int count = 0;
//        int temp = n;
//        while (temp != 0)
//        {
//            count++;
//            temp = temp / 10;
//        }
//        int sumofpower = 0;
//        while (n != 0)
//        {
//            int digit = n % 10;
//            sumofpower += Math.pow(digit,count);
//            n /= 10;
//        }
//        return (sumofpower == originalno);
//    }
//
//}
//





