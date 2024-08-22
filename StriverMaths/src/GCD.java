import java.sql.SQLOutput;

public class GCD {

    static int GCD(int a, int b){

        int gcd=0;
        int n = Math.min(a,b);

//        for(int i=1;i<=n;i++){
//            if(a%i == 0 && b%i==0){
//               gcd=i;
//            }
//        }

//        for(int i=1;i<=Math.min(a,b);i++){
//            if(a%i == 0 && b%i==0){
//                gcd=i;
//            }
//        }

//        for(int i=Math.min(a,b);i>=1;i--){    //Slightly better solution as we are starting from reverse and breaking the loop once we find the gcd.
//            if(a%i == 0 && b%i==0){           // Still give O(min(a,b)) complexity in worst cases.
//                gcd=i;
//                break;
//            }
//        }



//       while(a>0 && b>0){
//           if(a>b){
//               a=a%b;
//           }
//           else {
//               b=b%a;         // Optimal solution O(log(min(a,b))) where a>b.
//           }
//       }
//        if(a==0)
//            return b;
//        return a;

        if(a==0){
            gcd=b;
        }
        else {
            if(a>b) {
                gcd=GCD(a - b, b);      //Euclidean Algortihm
            }
            else{
                gcd=GCD(b-a,a);
            }
        }
        return gcd;
    }

    public static void main(String[] args) {

        System.out.println(GCD(8,12));
        System.out.println(GCD(15,10));
    }
}
