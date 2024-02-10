public class Sort0s1s2s {

    // Learn Dutch National flag algorithm for optimal solution.

    public static void sort0s1s2s(int[] arr){
        int count0=0;
        int count1=0;
        int count2=0;

        for(int i=0;i<arr.length;i++){ // counting 0s, 1s and 2s in this for loop.
            if(arr[i]==0){
                count0++;
            }
            if(arr[i]==1){
                count1++;
            }
            if(arr[i]==2){
                count2++;
            }
        }
        // 000111122
        for(int i=0;i<count0;i++){
            arr[i]=0;   // Now that we know the count we know append the array with those number of Os
        }

        for(int i=count0;i<count0+count1;i++){
            arr[i]=1;      // Followed by number of 1s
        }

        for(int i=count0+count1;i<arr.length;i++){
            arr[i]=2;   // And 2s
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");   // Printing the new array.
        }
    }


    public static void main(String[] args) {
        int[] arr={2,0,2,1,1,0};
        sort0s1s2s(arr);
    }
}
