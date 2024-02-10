public class TwoSum {
    public static int[] TwoSumIndices(int[] arr, int target){

        /* -------------- Brute force technique------------------ */

        int[] result = {-1,-1};

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if(arr[i] + arr[j] == target && arr[i]!=arr[j] ){
                    System.out.println("YES");
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        System.out.println("NO");
        return result;

        //Better approach requires the knowledge of maps. Can be solved once we cover Maps concepts.//
    }

    public static void main(String[] args) {
        int[] arr= {2,6,5,5,9,11};
        int target=10;

        int[] result;

        result = TwoSumIndices(arr,target);

        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}
