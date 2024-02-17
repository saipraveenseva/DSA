/* Problem is to find out the majority element. A majority element is an element
that occurs more than floor(n/2) times in an array.
 */

public class MajorityElement {


    public static void main(String[] args) {

        int[] arr={1,2,2,3,6,2,0,2,1,2,1,2,2};


        //-----------------------------------Brute force technique-------------------------------//
        //TC: O(n^2)
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count > arr.length/2){
                System.out.println("The majority element is: "+arr[i]);
                return;
            }

        }
    }

}
