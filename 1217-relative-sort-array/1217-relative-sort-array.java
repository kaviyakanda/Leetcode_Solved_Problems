class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        HashMap<Integer,Integer>hm=new HashMap<>();
        for(int num:arr1)
        {
            if(hm.containsKey(num))
            {
                hm.put(num,hm.get(num)+1);
            }
            else hm.put(num,1);
        }
        int[] res=new int[arr1.length];
        int count=0;
        for(int num:arr2)
        {
            while(hm.get(num)>0)
            {
                res[count]=num;
                count++;
                hm.put(num,hm.get(num)-1);
            }
            hm.remove(num);
        }
        int[] rem=new int[arr1.length-count];
        int ind=0;
        for(int num:arr1)
        {
            if(hm.containsKey(num))
            {
                while(hm.get(num)>0)
                {
                    rem[ind]=num;
                    ind++;
                    hm.put(num,hm.get(num)-1);
                }
                hm.remove(num);
            }
        }
        Arrays.sort(rem);
        for(int num:rem)
        {
            res[count]=num;
            count++;
        }
        return res;


        
    }
}