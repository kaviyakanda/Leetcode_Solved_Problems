class Solution {
    public int minDeletion(int[] nums) {
        int len=nums.length-1;
        int count=0;
        for(int i=0;i<len;i++)
        {
            if((i-count)%2==0 &&nums[i]==nums[i+1]) count++;
        }
        if((nums.length-count)%2!=0)count++;
        return count;
        
    }
}