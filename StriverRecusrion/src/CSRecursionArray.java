public class CSRecursionArray {

    public static void RecursionArray(int[] arr, int x){
            if(x==0){
                return;
            }
            else
            {
                arr[x-1]=x;                         // arr[4]=5,  arr[3]=4,  arr[2]=3,  arr[1]=2,  arr[0]=1
                RecursionArray(arr, x-1);       // RA(arr,5), RA(arr,4), RA(arr,3), RA(arr,2), RA(arr,1)
            }
        }
        public static int[] printNos(int x) {
            // Write Your Code Here

            int [] arr = new int[x];
            RecursionArray(arr,x);
            return arr;

        }

    public static void main(String[] args) {
        int x=5;
        int[] arr=printNos(x);
        for(int i=0;i<x;i++) {
            System.out.print(arr[i]+" ");
        }
    }

}
