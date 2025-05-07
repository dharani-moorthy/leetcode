class Solution {
    public int findKthLargest(int[] nums, int k) {
        int a=nums.length;
        Arrays.sort(nums);
        return nums[a-k];
    }
}