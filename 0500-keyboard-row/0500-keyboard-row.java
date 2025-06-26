class Solution {
    public String[] findWords(String[] words) {
        String s1="qwertyuiopQWERTYUIOP";
        String s2="asdfghjklASDFGHJKL";
        String s3="zxcvbnmZXCVBNM";
        List<String>l=new ArrayList<>();

        for(int i=0;i<words.length;i++)
        {
            boolean flag=false;
            boolean flag1=false;
            boolean flag2=false;
            char[] arr=words[i].toCharArray();
            for(int k=0;k<arr.length;k++)
            {
                if(s1.indexOf(arr[k])!=-1) flag=true;
                else if(s2.indexOf(arr[k])!=-1) flag1=true;
                else if(s3.indexOf(arr[k])!=-1) flag2=true;
            }
            if(flag&&!flag1&&!flag2) l.add(words[i]);
            else if(!flag&&flag1&&!flag2) l.add(words[i]);
             else if(!flag&&!flag1&&flag2) l.add(words[i]);
            

        }
        String[] res=new String[l.size()];
        for(int i=0;i<l.size();i++)
        {
            res[i]=l.get(i);
        }
        return res;

        
    }

}
