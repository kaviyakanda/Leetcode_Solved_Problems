class Solution {
    public int findComplement(int num) {
        String s="";
    
        int temp = num;
        

        while (temp > 0) {
            if (temp % 2 == 0) s += "1"; 
            else s += "0";              
            temp /= 2;                  
        }

        StringBuilder str = new StringBuilder(s).reverse();
        
        int sum = 0;
        int val = 1;
        char[] arr = str.toString().toCharArray();
        
      
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == '1') sum +=(1*val);
            else sum+=(0*val);
            val=val*2;
        }

        return sum;
    }
}
