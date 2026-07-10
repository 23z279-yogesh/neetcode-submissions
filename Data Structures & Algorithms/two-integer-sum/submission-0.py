class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        c={}
        for i,num in enumerate(nums):
          if target-num in c:
            return [c[target-num],i]
          else:
             c[num]=i