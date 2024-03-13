public class PrintAllSubArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{-2,-3,4,-1,-2,1,5,-3};
        int sum;
        int max=Integer.MIN_VALUE;


        for(int i=0;i<arr.length;i++){                //Brute force approach: O(n^3)
            for(int j=i;j<arr.length;j++){
                sum=0;
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");     // Prints all sub arrays
                    sum=sum+arr[k];                   // Prints sum of each sub array
                    max=Math.max(max,sum);
                }
                System.out.print(" sum: "+sum);
                System.out.println();
            }System.out.println();
        }
        System.out.println("max: "+max);


//
//        for(int i=0;i<arr.length;i++){          // Better approach: O(n^2)
//            sum=0;
//            for(int j=i;j<arr.length;j++){
//                sum=sum+arr[j];
//                max=Math.max(max,sum);          // If printing sub arrays is not required we can find the maximum sum of a sub array like this.
//            }
//        }
//        System.out.println("max: "+max);

    }
}
