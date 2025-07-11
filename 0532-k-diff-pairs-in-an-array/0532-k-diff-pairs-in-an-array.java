class Solution {
    public int findPairs(int[] nums, int k) {
        int count=0;
       Map<Integer,Integer>map=new HashMap<>();
       for(int num:nums)
       {
        map.put(num,map.getOrDefault(num,0)+1);

       }
       for(int key:map.keySet())
       {
        if(k==0)
        {
            if(map.get(key)>1) count++;
        }
        else
        {
            if(map.containsKey(key+k)) count++;
        }
       }
       return count;

    }
}
