import java.sql.SQLOutput;
import java.util.Scanner;

/*
Print size of datatypes
 */
public class DataTypes {

    public static int findDatatypeSize(String datatype){

        switch(datatype){
            case "Integer":
                return (Integer.SIZE/8);


            case "Long":
                return (Long.SIZE/8);


            case "Float":
                return (Float.SIZE/8); // datatype.SIZE gives size in bits, so we divide by 8 to get size in Bytes.


            case "Double":
                return (Double.SIZE/8);


            case "Character":
                return (Character.SIZE/8);


            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        String datatype;
        System.out.println("Enter datatype: ");
        Scanner sc = new Scanner(System.in);
        datatype = sc.next();
        System.out.println(findDatatypeSize(datatype));
    }

}
