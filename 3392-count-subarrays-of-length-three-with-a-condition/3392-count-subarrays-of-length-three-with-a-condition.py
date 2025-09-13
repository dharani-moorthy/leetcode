class Solution:
    def countSubarrays(self, nums: List[int]) -> int:
        count=0
        for i in range (len(nums)-2):
            f=nums[i]
            s=nums[i+1]
            t=nums[i+2]
            if f+t==s/2.0:
                count+=1
        return count
        