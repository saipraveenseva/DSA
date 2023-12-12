public class FindElementAppearsOnce {


    public static void main(String[] args) {
        int arr[]={4,2,1,1,4,5,2};

        /*
            Logic section
            0^x=x;
            x^x=0 so everything that appears twice gets cancelled out.

            4^2^1^1^4^5^2 = gives the output of element that appears once.
         */

        int xor=0;

        for(int i=0;i<arr.length;i++){
            xor = xor ^ arr[i];
        }

        System.out.println(xor);
    }

}
