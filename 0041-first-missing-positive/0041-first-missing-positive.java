class Solution {
    public int firstMissingPositive(int[] nums) {
     Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        int val=1;
        boolean flag=true;
        while(flag)
        {
            if(!set.contains(val)) return val;
                
            val++;
        }
        return val;
    }
}
