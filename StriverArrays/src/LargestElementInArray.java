public class LargestElementInArray {

//    Code to find out largest element in an array.
public static void main(String[] args) {

    // Defining an array.
    int[] arr = new int[]{7,4,8,9,3,6,5,8,9,2,1,0};
    int largest=arr[0];

    //Logic section
    /*Assign the largest variable to arr[0] and start traversing the array from index 1.
    Compare each element with the largest variable. If the element at current index is greater than largest,
     assign the largest variable with the new largest element.*/

    for(int i=1;i<arr.length;i++){
        if(arr[i]>largest){
            largest=arr[i];
        }
    }
    //Display section
    System.out.println("Largest element in the array is: "+largest);
}
}
