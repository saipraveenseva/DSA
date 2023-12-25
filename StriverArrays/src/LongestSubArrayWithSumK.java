public class LongestSubArrayWithSumK {

        public static void main(String[] args) {
            int[] arr={1,2,3,4,5};
            int n=arr.length;
            int sum=0;
            int K=9;
            int len=0;

            /* ----------------- Display Sub arrays ---------------------------*/

            for(int i=0;i<n;i++){                           // Runs from 0 to n-1
                for(int j=i;j<n;j++){                       // Runs from i to n-1
                    sum=0;
                    for(int k=i;k<=j;k++) {

                        System.out.print(arr[k] + " ");     // Prints from i to j-1 and increments j
                        sum = sum + arr[k];
                    }
                    System.out.print("sum: " + sum);
                    System.out.println();
                }
                System.out.println();
            }

            sum=0;
            /* ----------------------------------------------------------------------*/






            /* ----------------- Brute force technique ---------------------------------*/
            /*
            for(int i=0;i<n;i++){                           // Runs from 0 to n-1
                for(int j=i;j<n;j++){                       // Runs from i to n-1
                    sum=0;
                    for(int k=i;k<=j;k++) {

                        System.out.print(arr[k] + " ");     // Prints from i to j-1 and increments j
                        sum = sum + arr[k];
                        if(sum==K){
                            len = Math.max(len,j-i);        // Since longest subsequence is used, we pick the max. j-i gives the length.
                        }
                    }
                    System.out.print("sum: " + sum);

                    System.out.println();
                }
                System.out.println();
            }

            // TC of brute force approach is O(n^3)
            /* ----------------------------------------------------------------------*/




            /* ----------------- Better technique ---------------------------------*/
            /*
            for(int i=0;i<n;i++){                           // Runs from 0 to n-1
                sum=0;
                for(int j=i;j<n;j++){                       // Runs from i to n-1
                        sum = sum + arr[j];
                        if(sum==K){
                            len = Math.max(len,j-i+1);      // As printing is not required, we can optimise this into 2 loops.
                        }                                   // Within first loop assign sum=0 and do the sum calculation in the jth loop
                }
            }

            // Optimised the complexity to O(n^2) for better approach
            /* ----------------------------------------------------------------------*/

            /* ----------------- Optimized technique(Sliding window) ---------------------------------*/

            int left=0, right=0;
            sum=arr[0];
            while(right < n){
                while(left <=right && sum > K){
                    sum = sum - arr[left];          // Assuming the sum > K initially, we figure out the left pointer location and then proceed with the right pointer location
                    left++;                         // if sum > K, subtract the left element from the sum and increment left.
                }

                if(sum==K){
                    len = Math.max(len,right-left+1); // If sum==K then figure out the longest length of the sub array.
                }
                right++;
                if(right < n){
                    sum= sum + arr[right];          // As long as the right < n we keep adding the right side elements to the sum. and if sum goes > k we go to upper while loop.
                }
            }

            System.out.println("Longest subarray length: "+len);
        }

    }


