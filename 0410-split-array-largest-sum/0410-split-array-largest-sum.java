class Solution {
    public int splitArray(int[] nums, int k) {
        long low=0;
        long high=0;
        for(int val:nums)
        {
            low=Math.max(low,val);
            high+=val;
        }
        long ans=high;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if(split(nums,k,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return (int)ans;
        
    }
    public boolean split(int[] nums,int k,long limit)
    {
        long currentsum=0;
        int count=1;
        for(int num:nums)
        {
            if(currentsum+num>limit) 
            {
                count++;
                currentsum=num;
                if(count>k) return false;
            }
            else currentsum+=num;
        }
        return true;
    }
}