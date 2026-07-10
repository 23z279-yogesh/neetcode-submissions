class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int r=j+1;r<n;r++){

                    if(nums[i] + nums[j] + nums[r] == 0){

                        

                    
                List<Integer> tmp = Arrays.asList(nums[i],nums[j],nums[r]);

                
            res.add(tmp);
            }}}
        }
    return new  ArrayList<>(res);
        
    }
}
