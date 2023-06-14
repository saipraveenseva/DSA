public class SA3CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,9,4,8};

        //Logic section
        /* Start the traverse at index 1.
        *  Compare the element at index i with the element at index i-1
        *  If you find any such element, just print Not sorted and break the loop no need to traverse the entire array.
        */

        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                System.out.println("Not sorted");
                break;
            }

        }

        //Display section
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
