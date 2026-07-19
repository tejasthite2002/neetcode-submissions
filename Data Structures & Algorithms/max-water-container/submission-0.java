class Solution {
    public int maxArea(int[] heights) {
        int l=0,r=heights.length-1;
        int maxVal=0;
        while(l<r){
            if(heights[l]<heights[r]){
                int w=r-l;
                maxVal=Math.max(maxVal,heights[l]*w);
                l++;
            }
            else{
                int w=r-l;
                maxVal=Math.max(maxVal,heights[r]*w);
                r--;
            }
            
        }
        return maxVal;
    }
}
