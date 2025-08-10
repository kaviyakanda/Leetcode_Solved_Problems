class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pro = 1;
        int zeroCount = 0;
        for (int num : nums) {
            if (num != 0) {
                pro *= num;
            } else {
                zeroCount++;
            }
        }
        
        int[] res = new int[nums.length];
        
        if (zeroCount > 1) {
           
            return res;
        } 
        else if (zeroCount == 1) {
           
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] == 0) {
                    res[i] = pro;
                } else {
                    res[i] = 0;
                }
            }
        } 
        else {
      
            for (int i = 0; i < nums.length; i++) {
                res[i] = pro / nums[i];
            }
        }
        
        return res;
    }
}
