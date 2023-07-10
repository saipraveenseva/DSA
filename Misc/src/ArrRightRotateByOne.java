public class ArrRightRotateByOne {
    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int temp=arr[arr.length-1];

        /*
            1 2 3 4 5
              1 2 3 4

         */
        int n=arr.length;
        for(int i=n-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
