import com.sun.source.util.SourcePositions;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class StringsBasics {

    public static void main(String[] args) {
        String firstName = "Tony";
        String lastName = "Stark";
        String fullName = firstName + lastName; // concatenation
        System.out.println(fullName); //TonyStark

        // Taking input from user
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String inputfirstName = sc1.next(); // .next(); space is a delimter. It considers the input until it reaches a space.
        System.out.println(inputfirstName);

        System.out.println("Enter full name: ");
        String inputfullName = sc2.nextLine(); // .nextLine(); considers the entire line along with spaces.
        System.out.println(inputfullName);

        System.out.println(inputfullName.length()); // prints the length of the string

        //charAt

        for(int i=0;i<inputfullName.length();i++)
        {
            System.out.println(inputfullName.charAt(i)); // prints the string one by one.
        }

        //String comparision

        String s1="seva";
        String s2="seva11";

        //s1 > s2 : retutns a positive value
        //s1 = s2 : returns 0
        //s1 < s2 : return negative value
        //s1=hello s2=bello : s1>s2
        //s1=hello s2=hxllo : s1<s2

        //compareTo()


        if(s1.compareTo(s2)==0){
            System.out.println("Strings are equal");
        }
        else {
            System.out.println("NOT equal");
        }

        // why can't we use if(s1==s2)?
        //In java often times during coding rounds, the strings input is taken as objects and the above statement would compare the objects instead os string.
        // Below is a good example

        if(new String("sai") == new String("sai")){
            System.out.println("sai Strings are equal");
        }
        else {
            System.out.println("NOT equal");
        }

        // Even tho both the inputs given are equal(sai). It displays NOT equal
        //It is becoz it is comparing objects instead of strings.
        // So using compareTo() is always recommended.

        //.substring(index,index); Substrings
        String s3 = "My name is Sai praveen Seva";
        System.out.println(s3.substring(11,27)); // 27 index is not included
        System.out.println(s3.substring(11,s3.length())); // s3.length index is not included
        System.out.println(s3.substring(11)); // end index is optional. It considers until end of string.


        //Strings are immutable. Contents of string cannot be modified.


        //StringBuilder helps us to modify Strings

        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        System.out.println(sb.charAt(0));
        sb.setCharAt(0,'P');
        System.out.println(sb); // Pony

        sb.insert(0,'S');
        System.out.println(sb); // SPony

        sb.insert(3,'n');
        System.out.println(sb); // SPonny

        sb.delete(3,4);
        System.out.println(sb); // SPony

        sb.append(" Stark");
        System.out.println(sb);
        s3 = s3 + " bye";
        System.out.println(s3);

        System.out.println(sb.length());

        //Reverse a string

        StringBuilder sb2 = new StringBuilder("Silver Stallion");

        System.out.println(sb2);
        int front;
        int back;

        for(int j=0; j<sb2.length()/2;j++){
            front = j;
            back = sb2.length()-1-j;

             char frontChar = sb2.charAt(front);
             char backChar = sb2.charAt(back);

             sb2.setCharAt(front,backChar);
             sb2.setCharAt(back,frontChar);
        }

        System.out.println(sb2);


    }
}
