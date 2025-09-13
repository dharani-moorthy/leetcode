class Solution(object):
    def countSubarrays(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count=0
        for i in range(len(nums)-2):
            f=nums[i]
            m=nums[i+1]
            t=nums[i+2]
            if f+t==m//2.0:
                count+=1
        return count
            
        