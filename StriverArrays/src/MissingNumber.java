public class MissingNumber {

    public static int FindMissingNumber(int[] arr){
        int n=arr.length;

        int sum=(n*(n+1))/2;        // this gives the sum of first n natural numbers. It can also include 0.

        int arrsum=0;

        for(int i=0;i<n;i++){
            arrsum=arrsum+arr[i];      // Find the sum of all array elements.
        }
        return sum-arrsum;          // subtracting the arrsum from the sum of first n natural numbers will give us the missing number
    }

    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,0,1,2,3};  // Given input has a series of numbers with one missing number.


        System.out.println(FindMissingNumber(arr));
    }



}
