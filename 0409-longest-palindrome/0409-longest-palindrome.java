class Solution {
    public int longestPalindrome(String s) {
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        boolean odd=false;
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if((int)c>=97 && (int)c<=122) freq1[c-'a']++;
            else freq2[c-'A']++;
        }        
        int count=0;
        for(int i=0;i<26;i++)
        {
            if(freq1[i]%2==0) count+=freq1[i];
            else 
            {
                count+=freq1[i]-1;
                odd=true;
            }

             if(freq2[i]%2==0) count+=freq2[i];
            else
            {
                count+=freq2[i]-1;
                odd=true;
            } 
        }
        if(odd) return count+1;
        return count;
    }
}