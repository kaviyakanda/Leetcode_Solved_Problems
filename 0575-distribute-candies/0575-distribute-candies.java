class Solution {
    public int distributeCandies(int[] candyType) {
        if(candyType.length==1) return 1;
        Set<Integer>st=new HashSet<>();
        for(int i=0;i<candyType.length;i++)
        {
           st.add(candyType[i]);
        }
        
        int div=candyType.length/2;

       // if(l.size()<=div)
       int ret=Math.min(div,st.size());
        return ret;
      //  else return l.size();
    }
}