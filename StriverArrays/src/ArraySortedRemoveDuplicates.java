public class ArraySortedRemoveDuplicates {
    public static void main(String[] args) {

        int[] arr = new int[]{1,1,2,2,3,4,4};
        //Logic section
        /*  Primary thing is array is sorted
        *   assign i=0 and start the traverse with j from 1.
        *   If arr[j] and arr[i] are same, do nothing just increment j in the for loop.
        *   If they both are different, then we have to replace i+1th location with arr[j].
        *   Putting into practice with the above example
        *   1 1 2 2 3 4 4
        *   i j Both are equal so do nothing increment j.
        *   i   j Both are not equal we replace i+1 th location with arr[j] and increment i and j increments in for loop.
        *   1 2 2 2 3 4 4
        *     i j Both are equal keep incrementing j until both are not equal. It stops at this.
        *     i     j Both are not equal replace i+1 th location with 3 and increment i and j increments in for loop.
        *   1 2 3 2 3 4 4
        *       i     j Both are different, replace i+1 th location j and increment i and j
        *   1 2 3 4 3 4 4
        *         i     j Both are equal increment j
        *         i       j. j>arr.length so loop terminates.
        * size=i+1 gives the size of new array with no duplicates.
        *     */

        int i=0;

        for(int j=1;j<arr.length;j++){
            if(arr[j] != arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }
        int size=i+1;



        //Display section
        for(int p=0;p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }
        System.out.println();
        System.out.println("Sorted array: ");
        for(int p=0;p<size;p++){
            System.out.print(arr[p]+" ");
        }
        System.out.println();
        System.out.println("size: "+size);
    }
}
