/* Problem is to find out the majority element. A majority element is an element
that occurs more than floor(n/2) times in an array.
 */

public class MajorityElement {


    public static void main(String[] args) {

        int[] arr={2,1,1,1,2,2};


        //-----------------------------------Brute force technique-------------------------------//
        //TC: O(n^2)
        /*
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

         */


        //------------------------------------Optimal approach(Moore's Voting algorithm)----------//
        /*
        Assume the array is {2,2,1,1,1,2,2,0}
        -Moore's voting algorithm starts with count=0
        -Assign the majority element(m) as arr[0] and increment count=1
        -2,2,1,1,1,2,2,2,0 and m=2
        -i
        -If both m and arr[i] are equal, increment count and i. i gets incremented in the for loop. count=1
        -2,2,1,1,1,2,2,2,0 and m=2
        -  i
        -Both m and arr[i] are still equal, increment count and i. count=2,
        -2,2,1,1,1,2,2,2,0 and m=2
        -m   i
        -Now m and arr[i] are not equal, decrement the count and increment i and count=1
        -2,2,1,1,1,2,2,2,0 and m=2
        -      i
        -Still both m and arr[i] are not equal, decrement count and increment i. count=0. When count becomes 0, the new m is arr[i].
        -2,2,1,1,1,2,2,2,0 and m=1
        -        i
        -Both m and arr[i] are again equal, increment count and i. count=1.
        -2,2,1,1,1,2,2,2,0 and m=1
        -          i
        -Now m and arr[i] are not equal, decrement count and increment i. Since count=0, the new m is arr[i]. m=2
        -2,2,1,1,1,2,2,2,0 and m=2
        -            i
        -Both are equal, increment count and i. count=1
        -2,2,1,1,1,2,2,2,0 and m=2
        -              i
        -Both are equal, increment count and i. count=2
        -2,2,1,1,1,2,2,2,0 and m=2
        -                i
        - Both are not equal, decrement count and increment i. count=1
        -2,2,1,1,1,2,2,2,0 and m=2.

        -We have traversed the entire array and got a majority element m=2.
        -Time to verify if its a majority element.
        -Run a for loop and calculate the occurence of the majority element. Here we get majcount=5
        -Write an if condition if majcount > arr.length/2 then return maj count or return -1.
        -Here 5 > 9/2 => 5 > 4. So we can consider 2 as the majority element.

         */


        int count=0;
        int maj_ele=-1;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                maj_ele=arr[i];
                count=1;
            }
            else if(maj_ele == arr[i]){
                count++;
            }
            else{
                count--;
            }
        }

        int majcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==maj_ele){
                majcount++;
            }
        }

        if(majcount > arr.length/2){
            System.out.println("Majority element: "+maj_ele);
        }
        else{
            System.out.println("No majority element");
        }
    }

}
