class Solution(object):
    def divideArray(self, nums):
        """
        :type nums: List[int]
        :rtype: bool
        """
        nums.sort()
        if len(nums)%2!=0:
            return false
        
        for i in range(0,len(nums),2):
            if(nums[i]!=nums[i+1]):
                return False

        return True       
        