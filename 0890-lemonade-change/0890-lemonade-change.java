class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c5=0;
        int c10=0;
        for(int num:bills)
        {
            if(num==5) c5++;
            else if(num==10)
            {
                c10++;
                c5--;
            }
            else
            {
                if(c5>0 && c10>0)
                {
                    c5--;
                    c10--;
                }
                else
                {
                    c5-=3;
                }
            }
            if(c5<0 || c10<0) return false;
        }
        return true;
    }
}