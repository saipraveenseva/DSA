public class CSReverseArray {

    public static int[] Reversal(int n, int[] arr,int front,int rear){
        if(front>rear){
            return arr;
        }
        else{
            int temp = arr[front];
            arr[front]=arr[rear];
            arr[rear]=temp;
            return Reversal(n,arr,front+1,rear-1);
        }
    }

    public static int[] reverseArray(int n, int []nums) {
        // Write your code here.
        return Reversal(n,nums,0,n-1);
    }

    public static void main(String[] args) {
        int[] nums={1,2,3,4,5};
        nums=reverseArray(nums.length,nums);

        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}