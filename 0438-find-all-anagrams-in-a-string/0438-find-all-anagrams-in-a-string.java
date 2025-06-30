class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       if (s.length() < p.length()) {
    return new ArrayList<>();
}

       
         int s_len=s.length();
         int plen=p.length();
        List<Integer> l=new ArrayList<>();
        int[] freq1=new int[26];
        int[] freq2=new int[26];
        for(int i=0;i<plen;i++)
        {
            freq1[p.charAt(i)-'a']++;
        }
        for(int i=0;i<plen;i++)
        {
            freq2[s.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)) l.add(0);
        for(int i=plen;i<s_len;i++)
        {
            freq2[s.charAt(i)-'a']++;
            freq2[s.charAt(i-plen)-'a']--;
            if(Arrays.equals(freq2,freq1)) l.add(i-plen+1);
        }
        return l;
    }
}