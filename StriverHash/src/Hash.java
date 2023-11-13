import java.sql.SQLOutput;
import java.util.*;



public class Hash {

    public static void main(String[] args) {
        int arr[]={0,9,8,7,6,5,4,3,1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        int hasharr[] = new int[10];

        Arrays.fill(hasharr,0);
        System.out.println();
//        for(int i=0;i<hasharr.length;i++){
//            System.out.print(hasharr[i]+" ");
//        }

        for(int i=0;i<arr.length;i++){
            hasharr[arr[i]]++;

        }
        for(int i=0;i<10;i++){
            System.out.print(i+" "); // Printing digits
        }

        System.out.println();
        for(int i=0;i<hasharr.length;i++){
            System.out.print(hasharr[i]+" "); // Printing frequency of the digits
        }

    }
}
