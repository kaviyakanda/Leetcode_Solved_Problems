class Solution {
    public int trap(int[] height) {
        int n=height.length;
     int l= 0, r= height.length - 1;
        int left_max=0, right_max =0;
        int res=0;
        
           while(l<=r)
           {
             if (height[l]<=height[r]) {
                if(height[l]>=left_max)
                {
                    left_max=height[l];
                }
                else
                {
                    res+=left_max-height[l];
                }
                l++;
           }
            else {
             
                if(height[r]>=right_max)
                {
                    right_max=height[r];
                }
                else
                {
                    res+=right_max-height[r];
                }
                r--;
            }
        }
        return res;
    }
}

 