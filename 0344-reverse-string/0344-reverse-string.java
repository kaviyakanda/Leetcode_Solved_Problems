class Solution {
    public void reverseString(char[] s) {
       
        char[] arr=new char[s.length];
        
       int end=s.length-1;
        for(int i=0;i<s.length/2;i++)
        {
          char c= s[i];
          s[i]=s[end];
          s[end]=c;
          end--;
        }
       
        }
}