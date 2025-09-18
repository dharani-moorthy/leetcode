class Solution(object):
    def maxProductDifference(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        nums.sort()
        n=len(nums)
        max1=nums[n-1]
        max2=nums[n-2]
        min1=nums[0]
        min2=nums[1]
        a=(max1*max2)-(min1*min2)
        return a