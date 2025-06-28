class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) return 0;
        int val=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            int res=nums[i]-nums[i+1];
            if(Math.abs(res)>val) val=Math.abs(res);

        }
        

        return val;
    }
}