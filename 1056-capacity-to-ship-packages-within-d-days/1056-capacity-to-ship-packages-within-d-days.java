class Solution {
    public int shipWithinDays(int[] weights, int days) {
        long low=0;
        long high=0;
        for(int val:weights)
        {
            low=Math.max(low,val);
            high+=val;
        }
        long ans=high;
        while(low<=high)
        {
            long mid=(low+high)/2;
            if(shipment(weights,days,mid))
            {
                ans=mid;
                high=mid-1;
            }
            else
            {
                low=mid+1;
            }
        }
        return (int)ans;

        
    }
    public boolean shipment(int[]  weights,int days,long limit)
    {
        int day=1;
        long units=0;
        for(int val:weights)
        {
            if(units+val>limit)
            {
                day++;
                units=0;
            }
            units+=val;
            if(day>days) return false;
        }
        return true;
    }
}