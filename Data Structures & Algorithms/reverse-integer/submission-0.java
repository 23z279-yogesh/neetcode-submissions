class Solution {
    public int reverse(int x) {
        String sr=String.valueOf(x);
        if(sr.charAt(0)=='-'){
            String sub=sr.replaceAll("-","");
            StringBuilder s=new StringBuilder(sub);
            String see="-"+s.reverse().toString();
            long val=Long.parseLong(see);
            if(val<=Math.pow(2,31)-1&&val>=-Math.pow(2,31)){
                    return (int)val;
            }
            
        }
        else{
        String srr=String.valueOf(x);
        StringBuilder soo=new StringBuilder(srr);
        String jds=soo.reverse().toString();
        long vall=Long.parseLong(jds);
        if(vall<=Math.pow(2,31)-1&&vall>=-Math.pow(2,31)){
                    return (int)vall;
            }
        }
        return 0;
    }
}
