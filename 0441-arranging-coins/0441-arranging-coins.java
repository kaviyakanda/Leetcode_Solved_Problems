class Solution {
    public int arrangeCoins(int n) {
        int count=0;
        int step=0;
        int total=0;
        while(n>0)
        {
            n=n-step-1;
            step++;
            total+=1;
        }
        if(n==0) return total;
        return total-1;
        
    }
}