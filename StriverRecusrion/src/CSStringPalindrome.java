public class CSStringPalindrome {

    public static boolean ReverseString(String str,int front, int rear){
        if(front>rear){
            return true;
        }
        if(str.charAt(front)==str.charAt(rear)){
            return ReverseString(str,front+1,rear-1);
        }
        else{
            return false;
        }
    }

    public static boolean isPalindrome(String str) {
        // Write your code here.


        int front=0;
        int rear=str.length()-1;
        return ReverseString(str,front,rear);



    }

    public static void main(String[] args) {
        String str0="racecar";
        String str=str0;

        System.out.println(str);


//        System.out.println(sb);
        int front=0;
        int rear=str.length()-1;
        ReverseString(str,front,rear);
        System.out.println(str);


    }
}
