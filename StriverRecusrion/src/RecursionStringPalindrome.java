public class RecursionStringPalindrome {


    public static void ReverseString(StringBuilder sb, int front, int rear){
        if(front>rear){
            return;
        }
        else{
            char frontChar = sb.charAt(front);
            char rearChar = sb.charAt(rear);
            sb.setCharAt(rear,frontChar);
            sb.setCharAt(front,rearChar);
            ReverseString(sb,front+1,rear-1);
            return;

        }
    }


    public static void main(String[] args) {
        String str="racecar";

        System.out.println(str);

        StringBuilder sb = new StringBuilder(str);
//        System.out.println(sb);
        int front=0;
        int rear=sb.length()-1;
        ReverseString(sb,front,rear);
        System.out.println(sb);

        System.out.println(str.equals(sb.toString()));
    }
}
