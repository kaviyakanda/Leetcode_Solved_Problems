class Solution {
    public int heightChecker(int[] heights) {
        
        int[] res=heights.clone();
        for(int i=1;i<res.length;i++)
        {
            int key=res[i];
            int j=i-1;
            while(j>=0 && res[j]>key)
            {
                res[j+1]=res[j];
                j--;
            }
            res[j+1]=key;
        }
        int count=0;
        for(int i=0;i<res.length;i++)
        {
            if(heights[i]!=res[i]) count++;
        }
        return count;
    }
}