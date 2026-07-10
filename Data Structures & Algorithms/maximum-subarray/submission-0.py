class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        cursum=0
        maxi=nums[0]
        for i in nums:
            if cursum <0:
                cursum=0
            cursum = cursum + i
            maxi = max(cursum,maxi)
        return maxi

        