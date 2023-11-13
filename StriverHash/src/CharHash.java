//import java.sql.SQLOutput;
//import java.util.*;
//public class CharHash {     // 10^8 above hash array size is not supported. So we use Java Collections(Map)
//
//    public static void main(String[] args) {
//        String str="SaiPraveenSeva";
//
//        System.out.println(str);
//
//        int[] hasharr = new int[53];
//
//
//       System.out.println();
//
//      for(int i=0;i<str.length();i++){
//           hasharr[str[i]-'a'];
//       }
//
//        for(int i=0;i<arr.length;i++){
//            hasharr[arr[i]]++; // 97 is the ASCII of 'a'. a1, b2, c3,....z26. Similarly ASCII of 'A' is 65. 33 is the ASCII of first special character '!'
//                                    // Inorder to get these indexes we do 'b'-'a' = 98-97=1 so we increment arr[1]
//                                    // No need to do -a if you are doing this for all 256 ASCII character
//        }
//        for(int i=0;i<hasharr.length;i++){
//            System.out.print(hasharr[i]+" ");
//        }
//
//
//    }
//}