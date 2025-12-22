class Solution:
    def countVowelStrings(self, n: int) -> int:
        res=(n+4)*(n+3)*(n+2)*(n+1)
        return res//24
        