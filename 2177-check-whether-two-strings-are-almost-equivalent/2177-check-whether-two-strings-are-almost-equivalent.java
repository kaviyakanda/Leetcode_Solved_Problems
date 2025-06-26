class Solution {
    public boolean checkAlmostEquivalent(String word1, String word2) {
        int[] arr=new int[26];
        for(int i=0;i<word1.length();i++)
        {
          
          arr[word1.charAt(i)-97]++;
          arr[word2.charAt(i)-97]--;


        }
        for(int i=0;i<26;i++)
        {
            if(Math.abs(arr[i])>3) return false;
        }

return true;
    }
}