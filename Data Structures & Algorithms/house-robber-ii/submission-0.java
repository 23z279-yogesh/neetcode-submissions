class Solution {
    public int rob(int[] nums) {
        return Math.max(nums[0],Math.max(helper(Arrays.copyOfRange(nums,1,nums.length)),helper(Arrays.copyOfRange(nums,0,nums.length-1))));
    }
    public int helper(int[] nums){
        int rob2=0;
        int rob1=0;
        for(int num:nums){
            int newrob= Math.max(rob1+num,rob2);
            rob1=rob2;
            rob2=newrob;



        }
        return rob2;
    }

        
    
}
