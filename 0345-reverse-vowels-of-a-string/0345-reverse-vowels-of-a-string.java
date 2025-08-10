class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
    String vowel="aeiouAEIOU";
    char[] arr=s.toCharArray();
        while(i<j)
        {
            while(i<j)
            {
                char c=arr[i];
                if(vowel.indexOf(c)!=-1) break;
            else i++;
            }
            while(i<j)
            {
                char c=arr[j];
                if(vowel.indexOf(c)!=-1) break;
                else j--;
            }
            if(i<j)
            {
                char c=arr[i];
                arr[i]=arr[j];
                arr[j]=c;
                i++;
                j--;
            }





        }
        return new String(arr);
        
    }
}