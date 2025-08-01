import java.util.*;
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
   public List<Integer> postorderTraversal(TreeNode root) {
       List<Integer> ans = new ArrayList<Integer>();
       solve(root, ans);
       return ans;
   }
  public void solve(TreeNode root, List<Integer> ans){
      if(root==null){
       return;
      }

     
     solve(root.left,ans);
     solve(root.right,ans);
     ans.add(root.val);
   }
} {
    
}
