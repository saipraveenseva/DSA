public class Fibonacci {

    public static void RecursiveFibonacci(int n, int d1, int d2){
        if(d2>n){
            return;
        }
        else{
            d1=d1+d2;
            System.out.print(d1+" ");
            d2=d1+d2;
            System.out.print(d2+" ");
            RecursiveFibonacci(n,d1,d2);
        }

    }


    public static void main(String[] args) {
        int d1=0,d2=1,n=20;
        System.out.print(d1+" ");
        System.out.print(d2+" ");

        RecursiveFibonacci(n,d1,d2);



//        System.out.print(d1+" ");
//        System.out.print(d2+" ");
//        while(d2<n){
//            d1=d1+d2;
//            System.out.print(d1+" ");
//            d2=d1+d2;
//            System.out.print(d2+" ");
//
//        }


    }
}

//
//    d1 d2
//     0  1
//     1  2
//     3  5
//     8  13
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181.