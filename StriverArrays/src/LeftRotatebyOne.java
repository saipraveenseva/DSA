public class LeftRotatebyOne {

    static int[] LeftRotate(int[] arr, int n){
        int temp=arr[0];

        for(int i=0;i<n-1;i++){
            arr[i]=arr[i+1];

        }
        arr[n-1]=temp;

        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9,0};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        arr=LeftRotate(arr,arr.length);

        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
