class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum=0;
        int bsum=0;
        for(int i:nums){
            if(i>9) {bsum += i;}
            else{
                sum +=i;
            }
        }
        if(sum==bsum) return false;
        return true;
    }
}