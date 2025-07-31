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
   public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
   
     List<List<Integer>> ans = new ArrayList<>();
     if(root==null) return ans;
     solve(root,ans);
     return ans;
   }
   public void solve(TreeNode root, List<List<Integer>> ans){
      Queue<TreeNode> q = new LinkedList<>();
      boolean lr = true;
      q.offer(root);

      while(!q.isEmpty()){
       List<Integer> ll = new ArrayList<>();
       int n = q.size();
       for(int i=0;i<n;i++){
           TreeNode curr = q.poll();
           
           if(lr){
               ll.addLast(curr.val);
           }else{
               ll.addFirst(curr.val);
           }
           
           if(curr.left!=null) q.offer(curr.left);
           if(curr.right!=null) q.offer(curr.right);
       }
          ans.add(ll);
          lr = !lr;
      }

   }

} {
    
}
