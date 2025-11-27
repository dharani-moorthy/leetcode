class Solution(object):
    def squareIsWhite(self, coordinates):
        """
        :type coordinates: str
        :rtype: bool
        """
        c = coordinates
        if (c == "a2" or c == "a4" or c == "a6" or c == "a8" or
            c == "b1" or c == "b3" or c == "b5" or c == "b7" or
            c == "c2" or c == "c4" or c == "c6" or c == "c8" or
            c == "d1" or c == "d3" or c == "d5" or c == "d7" or
            c == "e2" or c == "e4" or c == "e6" or c == "e8" or
            c == "f1" or c == "f3" or c == "f5" or c == "f7" or
            c == "g2" or c == "g4" or c == "g6" or c == "g8" or
            c == "h1" or c == "h3" or c == "h5" or c == "h7"):
            return True
        return False
