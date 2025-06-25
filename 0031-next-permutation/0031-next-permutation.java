class Solution {
    public void nextPermutation(int[] nums) {


        int ind = -1, s, e, temp;
        int n = nums.length;
        for (int i = n - 1; i > 0; i--) {
            if (nums[i - 1] < nums[i]) {
                ind = i - 1;
                break;
            }
        }
        if (ind == -1) {
            s = 0;
            e = n - 1;
            while (s < e) {
                temp = nums[s];
                nums[s] = nums[e];
                nums[e] = temp;
                s++;
                e--;
            }
            return;
        }
        for (int i = n - 1; i > ind; i--) {
            if (nums[i] > nums[ind]) {
                temp = nums[ind];
                nums[ind] = nums[i];
                nums[i] = temp;
                break;
            }
        }
        s = ind + 1;
        e = n - 1;
        while (s < e) {
            temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }
    }
           
    }       
