import java.util.ArrayList;

public class ArrayListLeftRotatebyK {

    public static void main(String[] args) {
        int n=10;

        ArrayList<Integer> arr=new ArrayList<Integer>(n);
        int k=2;
        for(int i=0;i<n;i++){
            arr.add(i);
        }
        System.out.println(arr);
        while(k>0) {
            int temp = arr.get(0);

            for (int i = 0; i < n - 1; i++) {
                arr.set(i, arr.get(i + 1));
            }

            arr.set(n - 1, temp);
            k--;
        }
        System.out.println(arr);


    }
}
