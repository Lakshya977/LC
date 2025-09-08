class Solution {
    public int[] getNoZeroIntegers(int n) {
        int diff=0;
        for(int i=1;i<n;i++){
            diff = n-i;
            if(!hasZero(diff)&& !hasZero(i)){
                break;
            }
        }
        return new int[]{n-diff,diff};

    }
    private boolean hasZero(int num) {
        while (num > 0) {
            if (num % 10 == 0) return true;
            num /= 10;
        }
        return false;
    }
}