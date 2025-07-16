class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int last=nums[nums.length-1];
        int second=nums[nums.length-2];
        int third=nums[nums.length-3];
        int result1=last*second*third;
        int result2 = nums[0] * nums[1] * nums[nums.length - 1];  
        return Math.max(result1, result2);
    }
        
    
}