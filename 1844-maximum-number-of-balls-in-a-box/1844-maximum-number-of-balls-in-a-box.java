class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int[] boxes=new int[100];
        for(int i=lowLimit;i<highLimit+1;i++)
        {
            int tot=0;
            int temp=i;
            while(temp>0)
            {
                int val1=temp%10;
                tot=tot+val1;
                temp=temp/10;

            }
            boxes[tot]++;
        }

        int max=Integer.MIN_VALUE;
        for(int num:boxes)
        {
            if(num>max) max=num;;
        }
        return max;
        
    }
}