public class MoveZeroesRight {

    public static int[] MoveZeroes(int arr[]){

        int j=-1;
        for(int p=0;p<arr.length;p++){
            if(arr[p]==0){          // Finding the location of first 0.
                j=p;
                break;
            }
        }


        if(j==-1){
            return arr;
        }
        else{

            for(int i=j+1;i<arr.length;i++){        // starting the traverse from i+1 if we find a non zero number then swap it with zero.
                if(arr[i]!=0){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];

                    j++;
                }
            }
            return arr;
        }

    }



    public static void main(String[] args) {
            int arr[]={1,0,2,3,2,0,0,4,5,1};

            MoveZeroes(arr);

            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+" ");
            }
    }
}
