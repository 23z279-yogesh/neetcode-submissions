class Solution:
    def checkValidString(self, s: str) -> bool:
        leftmin=0
        leftmax=0
        for c in s:
            if c=="(":
                leftmin=leftmin + 1
                leftmax=leftmax+1
            elif c==")":
                leftmin = leftmin-1
                leftmax =leftmax-1
            else:
                leftmin=leftmin-1
                leftmax=leftmax+1
            if leftmax <0:
                return False
            if leftmin <0:
                leftmin =0
        return leftmin == 0       