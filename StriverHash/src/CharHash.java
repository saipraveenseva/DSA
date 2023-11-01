import java.util.*;
public class CharHash {     // 10^8 above hash array size is not supported. So we use Java Collections(Map)

    public static void main(String[] args) {
        int arr[]={'!','!','&','&','(','$','%','#','A','a','b','c','A','a',')'};

//        for(int i=0;i<arr.length;i++){
//            System.out.print(arr[i]+" ");
//        }

        int[] hasharr = new int[256];

        Arrays.fill(hasharr,0);
       System.out.println();
//////        for(int i=0;i<hasharr.length;i++){
//////            System.out.print(hasharr[i]+" ");   Hello
//////        }

        for(int i=0;i<arr.length;i++){
            hasharr[arr[i]]++; // 97 is the ASCII of 'a'. a1, b2, c3,....z26. Similarly ASCII of 'A' is 65. 33 is the ASCII of first special character '!'
                                    // Inorder to get these indexes we do 'b'-'a' = 98-97=1 so we increment arr[1]
                                    // No need to do -a if you are doing this for all 256 ASCII character
        }
        for(int i=0;i<hasharr.length;i++){
            System.out.print(hasharr[i]+" ");
        }
        String str=null;
        System.out.println();
        for(int i=0;i<=256;i++){
            str=Character.toString((char)i);
            System.out.print(str+" ");
        }

    }
}