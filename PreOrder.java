import java.util.ArrayList;
import java.util.List;

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
  }
 
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
          List<Integer> ans = new ArrayList<>();
          solve(root,ans);
          return ans;


    }
    public void solve(TreeNode root,List<Integer> ll){
       if(root==null){
        return;
       }

        ll.add(root.val);
        solve(root.left, ll);
        solve(root.right,ll);
    }
}