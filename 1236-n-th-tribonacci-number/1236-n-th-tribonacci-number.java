class Solution {
    public int tribonacci(int n) {
        
        if(n==1) return 1;
        if(n==0) return 0;
        if(n==2) return 1;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        dp[2]=1;

        for(int i=3;i<=n;i++)
        {
            int c=dp[i-2]+dp[i-1]+dp[i-3];
            dp[i]=c;

        }
        return dp[n];
    }
}