class Solution {
    public boolean isUgly(int n) {
        if(n<=0) return false;
        int[] arr={2,3,5};
        for(int num:arr)
        {
            while(n%num==0)
            {
                n/=num;
            }
        }
        return n==1;

        /*if (n <= 0) return false;
        if (n == 1) return true;  

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                if (isPrime(i) && i != 2 && i != 3 && i != 5) {
                    return false;
                }
            }
        }
        return true;
    }

    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;*/
        
    }
}
