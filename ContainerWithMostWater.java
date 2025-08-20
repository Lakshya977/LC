class Solution {
    public int maxArea(int[] height) {
        int curr=0;
        int i=0;
        int j=height.length-1;
        while(i<j){
            curr = Math.max(curr,Math.min(height[j],height[i])*(j-i));
            if(height[i]<=height[j]){
                i++;
            }else{
                j--;
            }

        }
        return curr;

    }
}