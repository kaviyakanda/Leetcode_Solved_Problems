class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] arr=new int[2];
        Arrays.sort(nums);
        List<Integer>l=new ArrayList<>();
        for(int num:nums)l.add(num);
        for(int i=1;i<nums.length;i++)
        {
         if(nums[i]==nums[i-1])
         {
             arr[0]=nums[i];
             break;

         }
        
        }
        int val=1;
        while(l.contains(val))
        {
            val++;

        }arr[1]=val;
       
        return arr;
        
    }
}