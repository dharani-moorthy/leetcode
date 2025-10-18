class Solution:
    def findGCD(self, nums: List[int]) -> int:
        nums.sort()
        a=nums[0]
        b=nums[-1]
        return self.c(a,b)
    def c(self,a:int,b:int)-> int:
        while b!=0:
            a,b=b,a%b
        return abs(a)
           
        
        
        