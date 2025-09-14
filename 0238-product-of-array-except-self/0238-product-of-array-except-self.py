class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n=len(nums)
        a= [0]*n
        a[0]=1
        for i in range (1,n):
            a[i]=a[i-1]*nums[i-1]
        s=1
        for i in range( n-1,-1,-1):
            a[i]*=s
            s*=nums[i]
        return a

            
