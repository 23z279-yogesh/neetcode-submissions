class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> res = new HashMap();
        for(String str : strs){
            char[] c= str.toCharArray();
            Arrays.sort(c);
            String sort=new String(c);
            res.putIfAbsent(sort,new ArrayList<>());
            res.get(sort).add(str);
        }
        return new ArrayList<>(res.values());
        
    }
}
