class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(candidates, 0, target, new ArrayList<>(), ans);
        return ans;
    }

    private void findCombinations(int[] candidates, int start, int target, List<Integer> temp, List<List<Integer>> ans) {
        if (target == 0) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                temp.add(candidates[i]);
                findCombinations(candidates, i, target - candidates[i], temp, ans);
                temp.remove(temp.size() - 1); 
            }
        }
    }
}
