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
    public TreeNode invertTree(TreeNode root) {

        if(root == null){
            return root;
        }

        ArrayList<TreeNode> list = new ArrayList<>();

        list.add(root);

        while(list.size() != 0){

            TreeNode currentElement = list.get(0);
            list.remove(0);

            TreeNode temp = currentElement.left;
            currentElement.left = currentElement.right;
            currentElement.right = temp;

            if(currentElement.left != null){
                list.add(currentElement.left);
            }

            if((currentElement.right) != null) {
                list.add(currentElement.right);
            }
        }

        return root;
    }
}
