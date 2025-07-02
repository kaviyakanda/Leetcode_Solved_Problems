class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> l = new ArrayList<>();
        if (nums == null || nums.length < 4) return l;

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                int st = j + 1, end = nums.length - 1;

                while (st < end) {
                    long sum = (long) nums[i] + nums[j] + nums[st] + nums[end];

                    if (sum == target) {
                        l.add(Arrays.asList(nums[i], nums[j], nums[st], nums[end]));
                        st++;
                        end--;

                        while (st < end && nums[st] == nums[st - 1]) st++;
                        while (st < end && nums[end] == nums[end + 1]) end--;
                    } else if (sum < target) {
                        st++;
                    } else {
                        end--;
                    }
                }
            }
        }

        return l;
    }
}
