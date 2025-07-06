class Solution {
    public List<String> generateParenthesis(int n) {
          List<String> result = new ArrayList<>();
        generateAll("", 0, 0, n, result);
        return result;
    }

    private void generateAll(String current, int open, int close, int n, List<String> result) {
        if (current.length() == 2 * n) {
            if (isValid(current)) {
                result.add(current);
            }
            return;
        }
        generateAll(current + "(", open + 1, close, n, result);
        generateAll(current + ")", open, close + 1, n, result);
    }

    private boolean isValid(String s) {
        int balance = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') balance++;
            else balance--;
            if (balance < 0) return false;
        }
        return balance == 0;
        
    }
}