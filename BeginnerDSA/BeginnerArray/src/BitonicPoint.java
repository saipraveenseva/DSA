//Given an array arr of n elements that is first strictly increasing and then maybe strictly decreasing, find the maximum element in the array.
//        Note: If the array is increasing then just print the last element will be the maximum value.
//        Input:
//        n = 9
//        arr[] = {1,15,25,45,42,21,17,12,11}
//        Output: 45
//        Explanation: Maximum element is 45.

class BitonicPoint {
    int findMaximum(int[] arr, int n) {
        // code here
        for(int i=0;i<n-1;i++){

            if(arr[i]>arr[i+1]){
                return arr[i];
            }

        }
        return arr[n-1];
    }
}
