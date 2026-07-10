class Solution {
    public int[] productExceptSelf(int[] nums) {
        int left =1;
        int right=1;
        int i;
       
        int n = nums.length;
        int [] result = new int[n];


        for(i=0;i<n;i++){
            result[i] = left;
            left = left * nums[i];
        }

        for(i=n-1;i>=0;i--){
            result[i]*=right;
            right = right * nums[i];
        }
    return result ;

    }
    

}  
