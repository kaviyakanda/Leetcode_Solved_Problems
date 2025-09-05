class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        String[] arr1=s1.split(" ");
        String[] arr2=s2.split(" ");
       List<String> res=new ArrayList<>();
       Map<String,Integer>map =new HashMap<>();
       for(String word : arr1)
       {
        map.put(word,map.getOrDefault(word,0)+1);
       }
       for(String word: arr2)
       {
        map.put(word,map.getOrDefault(word,0)+1);

       }
       for(String str:map.keySet())
       {
        if( map.get(str)==1) res.add(str);
       }
       String[] arr=new String[res.size()];
       for(int i=0;i<res.size();i++)
       {
        arr[i]=res.get(i);
       }
       return arr;
        
    }
}