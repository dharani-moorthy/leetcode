class Solution(object):
    def isMonotonic(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        increase=True
        decrease=True
    
        for i in range(1,len(nums)):
            if nums[i]<nums[i-1]:
                decrease=False
            if nums[i]>nums[i-1]:
                increase=False
        return increase or decrease          


        