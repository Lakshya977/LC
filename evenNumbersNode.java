//    public class TreeNode {
//        int val;
//        TreeNode left;
//        TreeNode right;
//        TreeNode() {}
//        TreeNode(int val) { this.val = val; }
//        TreeNode(int val, TreeNode left, TreeNode right) {
//          this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
 
class Solution {
    public int sumEvenGrandparent(TreeNode root) {
     return  solve(root, null,null);
    }
    public int solve(TreeNode root, TreeNode p , TreeNode g){
        int sum=0;
        if(root==null){
            return 0;
        }
        if(g != null && g.val % 2 == 0){
           sum += root.val;
        }

        sum += solve(root.left,root,p);
        sum += solve(root.right, root,p);

        return sum;
        
    }
}