public class CheckIfArraySorted {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,9,3,9};

        //Logic section
        /**/

        for(int i=1;i<arr.length;i++){
            if(arr[i]>=arr[i-1]){
                    //Do nothing
            }
            else{
                System.out.println("Not sorted");
            }
        }

        //Display section
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
