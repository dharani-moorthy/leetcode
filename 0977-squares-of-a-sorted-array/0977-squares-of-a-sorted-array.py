class Solution(object):
    def sortedSquares(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        a=[x**2 for x in nums]
        a.sort()
        return a
        