class Solution {
    public String reverseOnlyLetters(String s) {
        int st = 0;
        int end = s.length() - 1;
        char[] arr = s.toCharArray();
        
        while (st < end) {
            if (!Character.isLetter(arr[st])) {
                st++;
            } else if (!Character.isLetter(arr[end])) {
                end--;
            } else {
                char temp = arr[st];
                arr[st] = arr[end];
                arr[end] = temp;
                st++;
                end--;
            }
        }
        return new String(arr);
    }
}
