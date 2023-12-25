public class GenerateSubArraysSum {

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        int sum=0;
        for(int i=0;i<n;i++){                           // Runs from 0 to n-1
            for(int j=i;j<n;j++){                       // Runs from i to n-1
                sum=0;
                for(int k=i;k<=j;k++) {

                    System.out.print(arr[k] + " ");     // Prints from i to j-1 and increments j
                    sum = sum + arr[k];
                }
                System.out.print("sum: " + sum);
//                if(sum==9){
//                    return;         // Displays the sub array with sum K.
//                }
                System.out.println();
            }
            System.out.println();
        }
    }

}
