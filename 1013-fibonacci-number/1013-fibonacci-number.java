class Solution {
    public int fib(int n) {
        if(n==1) return 1;
        if(n==0) return 0;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;

        for(int i=2;i<=n;i++)
        {
            int c=dp[i-1]+dp[i-2];
            dp[i]=c;


        }
        return dp[n];
        
    }
}