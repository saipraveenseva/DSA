public class CSStringRecursionArray {

    public static void RecursionStringArray(String[] arr,int n){
        if(n==0){
            return;
        }
        else
        {
            arr[n-1]="Coding Ninjas";
            RecursionStringArray(arr,n-1);

        }

    }
    public static void printNtimes(String[] arr,int n) {
        // Write your code here.

        RecursionStringArray(arr,n);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }


        public static void main(String[] args) {
        int x=5;
        String[] arr= new String[x];
       printNtimes(arr,x);

    }

}
