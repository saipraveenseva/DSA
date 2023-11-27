public class RightRotatebyKReversal {


    static void reversal(int arr[], int start, int end){

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }

    }

    static void RightRotate(int arr[], int k){
        k= k % arr.length;
        int n=arr.length;
        reversal(arr,n-k,n-1); // 0 1 2 3 4 5 6 9 8 7
        reversal(arr,0,n-k-1); // 6 5 4 3 2 1 0 9 8 7
        reversal(arr,0,n-1);   // 7 8 9 0 1 2 3 4 5 6  Rotated by k.
    }

    public static void main(String[] args) {
        int arr[]={0,1,2,3,4,5,6,7,8,9};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        int k=3;
        RightRotate(arr,k);

        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
