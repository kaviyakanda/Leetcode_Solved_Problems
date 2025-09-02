class Solution {
    public int[] replaceElements(int[] arr) {
        int n=arr.length-1;
        if(n<=0) return new int[] {-1};
        int great=-1;
        for(int i=n;i>=0;i--)
        {
            int max=arr[i];
            arr[i]=great;
            great=Math.max(great,max);
        }
        return arr;
    }
}