public /**
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
   int maxde =1;
   public int maxDepth(TreeNode root) {
       if(root==null) return 0;
       solve(root,1);
       return maxde;
   }
   public void solve(TreeNode root,int curr){
   if(root==null){
       return;
   }
   if(curr>maxde){
       maxde = curr;
   }
   solve(root.left,curr+1);
   solve(root.right,curr+1);
   }
} 
