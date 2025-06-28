class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==0) return 0;
        int res=0;
        for(int i=0;i<timeSeries.length-1;i++)
        {
            int val=Math.min(timeSeries[i+1]-timeSeries[i],duration);
            res+=val;
        }
        res=res+duration;
        return res;
    }
}