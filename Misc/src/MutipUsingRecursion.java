import java.sql.SQLOutput;
import java.util.Scanner;

public class MutipUsingRecursion {

    public static void MutliplicationTable(int n, int i){
        if(i>10){
            return;
        }
        else{
            System.out.println(n +"*"+i+"="+n*i);
            MutliplicationTable(n,++i);
        }

    }

    public static void main(String[] args) {
        System.out.println("Enter n: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        MutliplicationTable(n,i);
    }

}
