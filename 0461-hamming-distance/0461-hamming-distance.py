class Solution(object):
    def hammingDistance(self, x, y):
        """
        :type x: int
        :type y: int
        :rtype: int
        """
        count=0
        a=x^y
        while a!=0:
            count=count+(a&1)
            a>>=1
        return count    

        