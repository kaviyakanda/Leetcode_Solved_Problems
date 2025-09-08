class Solution {
    public int peakIndexInMountainArray(int[] arr) {
       /* int max=Integer.MIN_VALUE;
        int ind=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                ind=i;
            }
        }
        return ind;*/
        int low=0;
        int high=arr.length-1;
        while(low<high)
        {
            int mid=low+(high-low)/2;
            if(arr[mid]<arr[mid+1])
            {
                low=mid+1;
            }
            else high=mid;
        }
        return low;
        
    }
}