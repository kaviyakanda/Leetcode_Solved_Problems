/*class Solution {
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
       
        return arr;*/
        class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] numsArr = new int[nums.length + 1];
        int missingNum = -1;
        int duplicate = -1;

        for (int i : nums) {
            numsArr[i]++;
        }

        for (int i = 0; i < numsArr.length; i++) {
            if (numsArr[i] == 2) {
                duplicate = i;
            } else if (numsArr[i] == 0) {
                missingNum = i;
            }
        }

        return new int[] { duplicate, missingNum };
    }
}