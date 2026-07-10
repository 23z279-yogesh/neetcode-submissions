class Solution:
    def canJump(self, nums: List[int]) -> bool:
        i= len(nums)-1
        lp=len(nums)-1
        while i>=0:
            if i+nums[i]>=lp:
                lp=i
            i-=1
        return True if lp==0 else False
            
        