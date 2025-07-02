class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if(nums.length<3) return target;

        Arrays.sort(nums);
        int final_sum=nums[0]+nums[1]+nums[2];
        for(int i=0;i<nums.length-2;i++)
        {
            if(i>0 && nums[i]==nums[i-1]) continue;
            int st=i+1;int end=nums.length-1;
            while(st<end)
            {
                int sum=nums[i]+nums[st]+nums[end];
                if(Math.abs(sum-target)<Math.abs(final_sum-target)) 
                {
                    final_sum=sum;
                }

         if(sum<target)st++;
        else if(sum>target) end--;
        else return sum;
            }

        }

        return final_sum;

        
        
    }
}
        
