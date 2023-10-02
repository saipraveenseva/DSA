//Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array(In Place).
//        In other words, arrange the elements into a sequence such that arr[1] >= arr[2] <= arr[3] >= arr[4] <= arr[5].....
//
//        If there are multiple solutions, find the lexicographically smallest one.
//
//        Note:The given array is sorted in ascending order, and you don't need to return anything to make changes in the original array itself.
//
//        Input:
//        n = 5
//        arr[] = {1,2,3,4,5}
//        Output: 2 1 4 3 5
//        Explanation: Array elements after
//        sorting it in wave form are
//        2 1 4 3 5.


class WaveArray {
    public static void convertToWave(int n, int[] arr) {
        // code here

        for(int i=0;i<n-1;i++){
            int l=arr[i];
            int g=arr[i+1];

            l=l^g;
            g=l^g;
            l=l^g;

            arr[i]=l;
            arr[i+1]=g;
            i++;
        }
    }


}

