class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String res = s.replace("-", "").toUpperCase();

        StringBuilder sb = new StringBuilder(res);

        for(int i = sb.length() - k; i >0; i-=k){
            sb.insert(i, "-");
        }
        return sb.toString();
    }
}