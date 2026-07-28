class Solution {
    public int largestRectangleArea(int[] heights) {
        
       
        int i;
        int n = heights.length;
        int[] leftmost = new int[n];
        int[] rightmost = new int[n];
        Stack<Integer> stack= new Stack<>();
        for(i=0;i<n;i++){
            leftmost[i]=-1;
            
            
        while(!stack.isEmpty()&& heights[stack.peek()]>=heights[i])
            {
                stack.pop();
            }
        if(!stack.isEmpty())
            {
                leftmost[i]= stack.peek();
            }
        stack.push(i);
        
        }
        stack= new Stack<>();
        for(i=n-1;i>=0;i--){
            rightmost[i]=n;
            
            
        while(!stack.isEmpty()&& heights[stack.peek()]>=heights[i])
            {
                stack.pop();
            }
        if(!stack.isEmpty())
            {
                rightmost[i]= stack.peek();
            }
        stack.push(i);
        
        }
        int maxarea=0;
        for(i=0;i<n;i++){
            leftmost[i]++;
            rightmost[i]--;
            maxarea=Math.max(maxarea,heights[i]*(rightmost[i]-leftmost[i]+1));
        }
        return maxarea;
        
        
    }
}
