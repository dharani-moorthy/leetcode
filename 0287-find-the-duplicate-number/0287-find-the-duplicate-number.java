class Solution {
    public int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int correct = nums[i] - 1;

            if (nums[i] != nums[correct]) {
                swap(nums, i, correct);
            } else {
                if (i != correct) {
                    return nums[i];
                }
                i++;
        }
    }
     return -1; 
    }
    static void swap(int[] nums, int first, int second) {
        if (first == second) return;
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
