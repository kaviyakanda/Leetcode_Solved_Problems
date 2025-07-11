class Solution {
    public int findLHS(int[] nums) {
        int max=0;
        Map<Integer,Integer>map=new HashMap<>();
        for(int num:nums)
        {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int key:map.keySet())
        {
            if(map.containsKey(key+1))
            {
                int tot=map.get(key)+map.get(key+1);
                max=Math.max(tot,max);
            }


        } return max;
    }

}