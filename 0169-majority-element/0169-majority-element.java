class Solution {
    public int majorityElement(int[] nums) {
        for(int i=0;i<nums.length/2;i++){
            if(nums[i]==nums[i+1]);
            return nums[i];
        } if(nums.length==1){
            return nums.length;
        }
        return 0;
    }
}