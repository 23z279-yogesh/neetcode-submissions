class Solution {
    public int largestRectangleArea(int[] heights) { 
        Stack<Integer> stack = new Stack<>();
        int n = heights.length;

        int[] leftmost = new int[n];
        int[] rightmost = new int[n];
        
       
        int maxarea=0;
        

        for(int i=0;i<n;i++){
             leftmost[i]=-1;
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i]){
                stack.pop();
            }
            if(!stack.isEmpty()){
                leftmost[i] = stack.peek();
            }
            stack.push(i);
            


        }
        stack = new Stack<>();
        for(int i=n-1;i>=0 ; i--){
             rightmost[i] = n;
            while(!stack.isEmpty() && heights[stack.peek()]>=heights[i])
            {
                stack.pop();
            }
            if(!stack.isEmpty()){
                rightmost[i] = stack.peek();
            }
            stack.push(i);

        }

        for(int i=0 ; i<n;i++){
            leftmost[i]++;
            rightmost[i]--;
            maxarea = Math.max(maxarea,heights[i]* (rightmost[i]-leftmost[i]+1));

        }
        return maxarea;
   








    }
}


        