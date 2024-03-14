
/* Problem statement
1. You are given an array prices where prices[i] is the price of a given stock on the ith day.
2. You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
3. Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 */

public class BuySellStock {

    public static void main(String[] args) {
        int arr[]=new int[]{7,1,5,3,6,4};

        int mini=arr[0];
        int profit=0;
        int cost=0;

            /* TC: O(n)
             Dynamic programming is applied here.
             We need to store the minimum value to the left of i and we do this for every increment.
             Once we find the minimum element to the left of i, we subtract arr[i] with the minimum element.

              7,1,5,3,6,4
              m i           m->mini, profit=0
              cost=1-7=-6
              profit=max(0,-6)=0
              mini=min(7,1)=1

              7,1,5,3,6,4
              m   i         m->mini, profit=0
              cost=5-1=4
              profit=max(0,4)=4
              mini=min(1,5)=1

              7,1,5,3,6,4
              m     i       m->mini, profit=4
              cost=3-1=2
              profit=max(4,2)=4
              mini=min(1,3)=1

              7,1,5,3,6,4
              m       i     m->mini, profit=4
              cost=6-1=5
              profit=max(4,5)=5
              mini=min(1,6)=1

              7,1,5,3,6,4
              m         i   m->mini, profit=5
              cost=4-1=3
              profit=max(5,3)=5
              mini=min(1,4)=1

              return profit
        */
        for(int i=1;i<arr.length;i++){
            cost=arr[i]-mini;
            profit=Math.max(profit,cost);
            mini=Math.min(mini,arr[i]);
        }
        System.out.println(profit);

        for(int p=0;p<arr.length;p++){
            System.out.print(arr[p]+" ");
        }
    }
}
