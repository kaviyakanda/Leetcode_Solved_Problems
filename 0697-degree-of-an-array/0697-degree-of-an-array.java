import java.util.*;

class Solution {
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        Map<Integer, Integer> first = new HashMap<>();
        Map<Integer, Integer> last = new HashMap<>();
        
        int degree = 0;
        for (int i = 0; i < nums.length; i++) {
            int val = nums[i];
            freq.put(val, freq.getOrDefault(val, 0) + 1);
            degree = Math.max(degree, freq.get(val));

            if (!first.containsKey(val)) {
                first.put(val, i);
            }
            last.put(val, i); 
        }
        

        int minLen = Integer.MAX_VALUE;

        
        for (int num : freq.keySet()) {
            if (freq.get(num) == degree) {
                int len = last.get(num) - first.get(num) + 1;
                minLen = Math.min(minLen, len);
            }
        }

        return minLen;
    }
}
