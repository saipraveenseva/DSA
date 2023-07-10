
public class SumOfArray {

    public static void main(String[] args) {

        int[] arr = new int[]{1,2,3,4,5,6,7,8,9,10};

        int sum=0;
        //Logic/Display section

        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        System.out.println("sum: "+sum);
    }



}
