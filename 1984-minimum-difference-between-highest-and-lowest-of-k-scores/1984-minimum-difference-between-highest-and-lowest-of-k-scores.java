class Solution {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int res=Integer.MAX_VALUE;
        for(int i=0;i+k-1<nums.length;i++){
            int a=nums[i+k-1]-nums[i];
            res=Math.min(res,a);

        }
        return res;
    }
}