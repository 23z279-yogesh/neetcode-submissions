class Solution {
    public int reverseBits(int n) {
        String sr=String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        StringBuilder reverse = new StringBuilder(sr);
        String s=reverse.reverse().toString();
       int b=(int) Long.parseLong(s,2);
       return b;


       
        
    }
}
