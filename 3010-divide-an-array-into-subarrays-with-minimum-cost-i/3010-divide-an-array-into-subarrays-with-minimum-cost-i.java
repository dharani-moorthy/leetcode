class Solution {
    public int minimumCost(int[] nums) {
        int cost=nums[0];
        int num[]=Arrays.copyOfRange(nums,1,nums.length);
        Arrays.sort(num);
        cost+=num[0]+num[1];
    return cost;
}
}