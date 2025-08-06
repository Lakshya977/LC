class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> ll = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!ll.contains(nums[i])){
                ll.add(nums[i]);
            }else{
                return true;
            }
        }
        return false;
    }
}