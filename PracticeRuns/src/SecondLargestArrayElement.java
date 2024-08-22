public class SecondLargestArrayElement {

    public static void main(String[] args) {
        int arr[]={12, 35, 1, 10, 34, 1};

        int first=-1;
        int second=-1;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>first){
                second=first;
                first=arr[i];
            }

            if(arr[i]<first && arr[i]>second){
                second=arr[i];
            }
        }

        System.out.println("Second Largest: "+second);
    }
}
