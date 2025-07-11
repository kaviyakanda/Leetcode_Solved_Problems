class Solution {
    public int[] sortArrayByParity(int[] nums) {
        if(nums.length==1) return nums;
      List<Integer>l=new ArrayList<>();
      for(int num:nums)
      {
        if(num%2==0)l.add(num);

      }
       for(int num:nums)
      {
        if(num%2!=0) l.add(num);

      }
      for(int i=0;i<nums.length;i++)
      {
        nums[i]=l.get(i);
      }
      return nums;

        
    }
}