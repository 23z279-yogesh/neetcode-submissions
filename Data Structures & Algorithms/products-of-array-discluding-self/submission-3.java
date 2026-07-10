class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l= 1; 
        int r =1 ;
        int n  = nums.length;
        int [] result = new int[n];

        for(int i=0 ; i<n ; i++){
            result[i] = l;
            l=l*nums[i];

        }

        for(int i=n-1;i>=0;i--){
            result[i] = result[i]* r;
            r =  r* nums[i]; 
        }
    return result;
        
    }
}  
