class Solution:
    def minimumCost(self, nums: List[int]) -> int:
        cost=nums[0]
        a=nums[1:]
        a.sort()
        cost+=a[0]+a[1]
        return cost
        