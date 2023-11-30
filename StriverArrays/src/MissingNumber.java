public class MissingNumber {

    public static int FindMissingNumber(int[] arr){
        int n=arr.length;

        int sum=(n*(n+1))/2;

        int arrsum=0;

        for(int i=0;i<n;i++){
            arrsum=arrsum+arr[i];
        }
        return sum-arrsum;
    }

    public static void main(String[] args) {
        int arr[]={5,6,7,8,9,0,1,2,3};

        System.out.println(FindMissingNumber(arr));
    }



}
