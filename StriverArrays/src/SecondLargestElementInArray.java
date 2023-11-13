public class SecondLargestElementInArray {
    public static void main(String[] args) {

        //Array Definition
        int[] arr = new int[]{1,4,2,9,0,1,7,7,2,3,99};
        int largest=arr[0];
        int slargest=Integer.MIN_VALUE;
        int n=arr.length;
        //Logic section


        //Brute force approach
        /* Sort the array. The array will become {1,2,3,4,5,5}. The largest element is at index n-1.
           We cannot assume the element at n-2 location to be the second largest.
           Considering the case array might have duplicates, We run a loop from n-1.
           If we find an element that is not equal to the largest, we return it as second largest.

           Code this section later(optional)
         */

        //Better approach
        /*  Run two loops one after the other. First loop will traverse the array and finds out the largest element.
        *   Now run a second loop. Compare the element at index i with the largest and second largest.
        *   If the element is smaller than largest and greater than slargest. Mark the element as slargest.
        *   Keep moving right until you reach end of the array. */

        //Code for better approach
        /*
        for(int i=1;i<n;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println("Largest: "+largest); // We got the largest. Now we run the second loop.

        for(int j=0;j<n;j++)
        {
            if(arr[j]<largest && arr[j]>slargest){
                slargest=arr[j];
            }
        }
        System.out.println("Second largest: "+slargest);
        */

        //Optimal solution
//      //The above solution can be optimised into a single loop
//

        for(int i=0;i<n;i++){
            if(arr[i]>largest){         //This if statement finds out the largest element.
                slargest=largest;       //Before assigning the largest with arr[i] we save the largest element in slargest.
                largest=arr[i];         //The element in the slargest could be the 2nd largest.
            }
            else if(arr[i]<largest && arr[i]>slargest){
                slargest=arr[i];        // Here we use the previously largest element and see if arr[i] < largest and > slargest.
            }                           // If it is then we assign slargest with arr[i]
        }

        if(slargest==Integer.MIN_VALUE){// This if statement covers the corner case where array has only one element or there's no second largest element in an array {2,2,2,2,2}.
            System.out.println("Largest: "+largest);
            System.out.println("There is no second largest");
        }
        else {
            System.out.println("Largest: " + largest);
            System.out.println("Second largest: " + slargest);
        }
    }
}
