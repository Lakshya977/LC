/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        return solve(root);
    }
    public boolean solve(TreeNode root){
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean lefttoright = true; 
        while(!q.isEmpty()){
            int prevval = lefttoright ? Integer.MIN_VALUE : Integer.MAX_VALUE; 
            int size = q.size();
            for(int i=0;i<size;i++){
                TreeNode curr = q.poll();
                if(lefttoright){
                    if(curr.val % 2 ==0 || curr.val <= prevval ) return false;
                 }else{
                    if(curr.val %2 !=0 || curr.val >= prevval ) return false;
                 }
                 prevval = curr.val;
                if(curr.left != null) q.offer(curr.left);
                if(curr.right !=null) q.offer(curr.right);
            }
            lefttoright = !lefttoright;
        }
        return true;
    }
}