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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode solutionNode = root;

        while(true){
            if((p.val > solutionNode.val) && (q.val > solutionNode.val)){
                if(solutionNode.right != null){
                    solutionNode = solutionNode.right;
                } else {
                    break;
                }  
            } else if ((q.val < solutionNode.val) && (p.val < solutionNode.val)) {
                if(solutionNode.left != null){
                    solutionNode = solutionNode.left;
                } else {
                    break;
                }  
            } else {
                break;
            }
        }
        return solutionNode;
    }
}
