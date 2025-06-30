class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int[] freq=new int[101];
        for(int i=0;i<nums.length;i++)
        {
            freq[nums[i]]++;
        }
        boolean flag=false;
        for(int i=0;i<freq.length;i++)
        {
            if(freq[i]==2 ||freq[i]==3) return true;
            else if(freq[i]>3)
            {
                flag=true;
                int val=freq[i];
                for(int k=2;k<val;k++)
                {
                    if(val%k==0) flag=false;
                }
                if(flag) return true;
            }
        }

           // else if(flag) return true;
           // else if(nums[i]==0) flag=false;
        return flag;
        
    }
}