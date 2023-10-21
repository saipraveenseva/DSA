public class CSRecursionArrayNto1
{
    public static void RecursionNto1(int[] arr, int n,int i){
        if(n==0){
            return;
        }
        else
        {
            arr[i]=n;
            RecursionNto1(arr,n-1,i+1);
        }
    }
    public static int[] printNos(int n) {

        int[] arr=new int[n];
        RecursionNto1(arr,n,0);
        return arr;
    }

    public static void main(String[] args) {
        int n=5;
        int[] arr = new int[n];
        arr=printNos(n);
        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }
}