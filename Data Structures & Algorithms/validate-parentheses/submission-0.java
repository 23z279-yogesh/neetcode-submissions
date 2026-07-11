class Solution {
    public boolean isValid(String s) {
        Stack<Character> stck = new Stack<>();
        Map<Character,Character> hash = new HashMap<>();
        hash.put(')','(');
        hash.put(']','[');
        hash.put('}','{');
        for(char c : s.toCharArray()){
            if(hash.containsKey(c)){
                if(!stck.isEmpty() && stck.peek() == hash.get(c)){
                    stck.pop();
                }
                else{
                    return false;
                }}
            else{
                stck.push(c);
                

            }
        }
        
    return stck.isEmpty();
    }
}
