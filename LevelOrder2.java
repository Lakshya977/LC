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
   public List<List<Integer>> levelOrder(TreeNode root) {
       
       List<List<Integer>> ans = new  ArrayList<>();
           if (root == null) return ans;
       solve(root,ans);
       return ans;
   }
   public void solve(TreeNode root , List<List<Integer>> ans){
     Queue<TreeNode> q = new LinkedList<>();

     q.offer(root);
     while(!q.isEmpty()){
       int size = q.size();
       List<Integer> ll = new ArrayList<>();
       for(int i=0;i<size;i++){
           TreeNode curr = q.poll();
           ll.add(curr.val);
           if(curr.left!=null) q.offer(curr.left);
           if(curr.right!= null) q.offer(curr.right);
       }
           ans.add(ll);
     }

   }
} {
    
}
