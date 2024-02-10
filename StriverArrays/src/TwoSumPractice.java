
/* Given an array. Find two elements whose sum is equal to the given target. */
public class TwoSumPractice {


    public static void main(String[] args) {
        int[] arr ={0,1,2,3,4,5,6,7,8,9};

        int target= 14;

        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i] + arr[j] == target){
                    System.out.println(i+" "+j);
                }
            }

        }
        System.out.println("No two sum found");

    }

}
