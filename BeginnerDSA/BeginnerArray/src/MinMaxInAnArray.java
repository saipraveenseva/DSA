class MinMAXInAnArray
{
    static pair getMinMax(long arr[], long n)
    {
        //Write your code here
        long min=Long.MAX_VALUE;
        long max=Long.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] < min)
            {
                min=arr[i];
            }
            if(arr[i] > max)
            {
                max=arr[i];
            }
        }
        return new pair(min,max);

    }

}