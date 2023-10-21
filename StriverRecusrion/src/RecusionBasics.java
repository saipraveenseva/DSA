public class RecusionBasics {

    public static void printfromN(int N){
        if(N==0){
            System.out.println("Entire list is printed.");
            return;
        }
        else{
            System.out.print(N+" ");
            printfromN(N-1);
        }
    }

    public static void main(String[] args) {
        printfromN(10);
    }
}
