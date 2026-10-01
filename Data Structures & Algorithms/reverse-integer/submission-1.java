class Solution {
    public int reverse(int x) {
        String s = String.valueOf(x);
        if(s.charAt(0)== '-'){
           String a =s.replace("-","");
           StringBuilder c = new StringBuilder(a);
          String b= c.reverse().toString();
          Long v = Long.parseLong(b);
          if(v>= -Math.pow(2,31) && v <=Math.pow(2,31)-1){{
            
          
          long d=-v;
          return  (int)d;

          }

        }}
        else{
            StringBuilder z = new StringBuilder(s);
          String bl= z.reverse().toString();
          long op = Long.parseLong(bl);
          if(op >= -Math.pow(2,31) && op <=Math.pow(2,31)-1){
            return (int)op;
          
          }

        }

        
    
    return 0;
}
}