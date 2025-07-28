class Solution {
    public int minMoves(int[] nums) {
        int sum=0;
        int min=nums[0];
        for(int num:nums){
            min=Math.min(min,num);
        }
        for(int num:nums){
            sum+=num;
        }
        return sum-(min*nums.length);
        
    }
}