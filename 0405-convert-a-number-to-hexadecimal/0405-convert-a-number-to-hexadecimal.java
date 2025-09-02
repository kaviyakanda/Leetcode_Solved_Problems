class Solution {
    public String toHex(int num) {
        if(num==0) return "0";
        long n=num & 0xffffffffL;
        String res="0123456789abcdef";
        StringBuilder sb=new StringBuilder();
        while(n>0)
        {
            int rem=(int)(n%16);
            sb.append(res.charAt(rem));
            n=n/16;
        }
        return sb.reverse().toString();

    }
}