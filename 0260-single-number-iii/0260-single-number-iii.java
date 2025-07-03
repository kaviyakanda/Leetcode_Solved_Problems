class Solution {
    public int[] singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==2) return nums;
        int[]arr=new int[2];
        int ind=0;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1]) 
            {
               arr[ind++]=nums[i];
               if(ind==2) break;
                        
            }
            else i++;

        }
        if(ind<2)arr[1]=nums[nums.length-1];
        return arr;
        
    }
}