class Solution {
    public int[] countBits(int n) {
        int[] counts= new int[n+1];
        
        for(int i=0;i<=n;i++){int count=0;
           String k100= Integer.toBinaryString(i);
           for(int j=0;j<k100.length();j++){
           if(k100.charAt(j)=='1'){count++;}}
           counts[i]=count;
           

           

        }
        return counts;
        
    }
}
