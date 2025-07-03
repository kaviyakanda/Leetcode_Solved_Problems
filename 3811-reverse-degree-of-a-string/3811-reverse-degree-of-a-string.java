class Solution {
    public int reverseDegree(String s) {
        char[] arr=s.toCharArray();
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            int val='z'-arr[i]+1;
            sum+=val*(i+1);
        }
        return sum;
    }
}