public class Kadane {

    public static void main(String[] args) {
        int[] arr = new int[]{-2,-3,4,-1,-2,1,5,-3};
        int sum=0;
        int max=arr[0];

        // Kadane algorithm O(N)
        /*
            -2,-3,4,-1,-2,1,5,-3
            Step 1: Keep adding the number until the sum is positive.
            Step 2: After every summation find the max between max and sum
            Step 3: If the sum becomes <0 we reset it to 0
            Step 4: Once we are out of the loop we print the max

            -2,-3,4,-1,-2,1,5,-3
            sum=-2 we reset it to 0, find max between max and sum. max=4
            sum=-3 we reset it to 0, find max between max and sum. max=4
            sum=4 sum is positive, find max between max and sum. max=4
            sum=3 sum is still positive, find max between max and sum. max=4
            sum=1 sum is still positive, find max between max and sum. max=4
            sum=2 sum is still positive, find max between max and sum. max=4
            sum=7 sum is still positive, find max between max and sum. max=7
            sum=4 sum is still positive, find max between max and sum. max=7

         */
//        for(int i=0;i<arr.length;i++){
//            sum=sum+arr[i];
//            max=Math.max(sum,max);
//            if(sum<0){
//                sum=0;
//            }
//
//        }
//        System.out.println("max: "+max);

        // If we want to print the max sub array we need to store those indices during the process
        int start=0;        // we take these 3 variables.
        int arrstart=-1;
        int arrend=-1;

        for(int i=0;i<arr.length;i++){
            if(sum==0){start=i;}      // Every time sum becomes zero thats a starting point.
            sum=sum+arr[i];

            max=Math.max(sum,max);
            arrstart=start;             // Everytime we found a new max, we save the start and end indices.
            arrend=i;                   // These variables will store the indices when the last time the max got changed
            if(sum<0){
                sum=0;
            }

        }
        for(int p=arrstart;p<arrend;p++){
            System.out.print(arr[p]+" "); // Now that we got the indices we can print the maximum sub array.
        }
        System.out.println("max: "+max);

    }
}
