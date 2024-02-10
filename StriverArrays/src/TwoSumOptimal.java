import java.util.Arrays;

public class TwoSumOptimal {

    //This can be considered as the optimal approach.
    // But it does not solve the variant 2 problem which is getting the indices of the two sum elements

    //Optimal approach

    //Sort the array first
    //Use the two pointer method and greedy approach
    //left will point to arr[0] and right will point to arr[1]
    //if sum(arr[left],arr[right])>target then we decrement right pointer
    //if sum(arr[left],arr[right])<target then we increment left pointer
    //We keep doing it until sum(arr[left],arr[right])=target.


    public static int[] TwoSumOptimal(int[] arr,int target){
        int[] result={-1,-1};
        int[] sortedarray = Arrays.copyOf(arr, arr.length);

        Arrays.sort(sortedarray);
        int left=0;
        int right=sortedarray.length-1;
        int twosum1;
        int twosum2;

        while(left<right){ // 2,5,6,8,9,16

            if(sortedarray[left]+sortedarray[right] > target){
                right--;
            }

            else if(sortedarray[left]+sortedarray[right] < target){
                left++;
            }

            else if(sortedarray[left]+sortedarray[right] == target){
                System.out.println("YES");
                twosum1=sortedarray[left];
                twosum2=sortedarray[right];


                for(int i=0;i<arr.length;i++) { //2,6,5,8,9,16
                    if (arr[i] == twosum1) {
                        result[0] = i;
                    }
                    if(arr[i]==twosum2){
                        result[1]=i;
                    }
                }

                return result;
            }

        }
        System.out.println("NO");
        return result;
    }

    public static void main(String[] args) {
        int[] arr= {2,6,5,8,11};
        int target=14;

        int[] result=TwoSumOptimal(arr,target);
        System.out.println(result[0] +" "+result[1]);


    }

}
