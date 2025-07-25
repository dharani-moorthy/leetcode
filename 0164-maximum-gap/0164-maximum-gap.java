class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2){
            return 0;
        }
        int maxGap=0;
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
        int a=nums[i]-nums[i-1];
        maxGap=Math.max(maxGap,a);
        }
        return maxGap;
    }
}