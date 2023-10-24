public class CSFibonacci {

    public static int[] RecursiveFibonacci(int n,int[] arr, int i){
        if(i>=n){
            return arr;
        }
        else{
            arr[i]=arr[i-1]+arr[i-2];
            return RecursiveFibonacci(n,arr,i+1);
        }

    }


    public static void main(String[] args) {
        int n=7;
        int[] arr = new int[n];
        arr[0]=0;
        if(n>1) {
            arr[1] = 1;
            RecursiveFibonacci(n, arr, 2);
        }
        for(int j=0;j<n-1;j++){
            System.out.print(arr[j]+" ");
        }

    }
}

//
//    d1 d2
//     0  1
//     1  2
//     3  5
//     8  13
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181.