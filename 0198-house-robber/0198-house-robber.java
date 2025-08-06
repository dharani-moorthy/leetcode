class Solution {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        int one=nums[0];
        int two=0;
        for(int i=1;i<nums.length;i++){
           int temp=Math.max(one,two+nums[i]);
           two=one;
           one=temp;
        }
        return one;
    }
}