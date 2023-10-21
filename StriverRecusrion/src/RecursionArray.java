import java.util.Arrays;

public class RecursionArray {
        static int i=0;
        public static int[] printNos(int x) {
            // Write Your Code Here
            int[] arr = new int[x];
            if (x == 0) {
                return arr;
            } else {
                arr[i++] = x;
                printNos(x--);
            }
            return arr;

        }

        public static void main(String[] args) {
            System.out.println(Arrays.toString(printNos(5)));
        }

}
