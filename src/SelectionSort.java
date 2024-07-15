public class SelectionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{13,46,24,52,20,9};
        int pivot=arr[0];

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[j]<pivot){
                    pivot=arr[j];
                }
            }
            int temp=arr[i];
            arr[i]=pivot;
            arr[i]=temp;
        }

        System.out.println();

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
