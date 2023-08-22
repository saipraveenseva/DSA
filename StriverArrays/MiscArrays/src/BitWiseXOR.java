// Program to take array as input and bitwise XOR each element with its consecutive number(right).



import java.sql.SQLOutput;

public class BitWiseXOR {

    public static void main(String[] args) {
        int a=10;
        int b=11;

        System.out.println("Bitwise XOR: "+(a^b));

        int[] arr = new int[]{10,11,1,2,3};

        //Logic section
          /*
           a=10 // 1010
           b=11 // 1011
       XOR bitwise 0001 = 1


           */

        for(int i=0;i<arr.length-1;i++){
            arr[i] = arr[i]^arr[i+1];
        }


        //Display section
        for(int p=0;p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }
    }
}
