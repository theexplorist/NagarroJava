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
    public int maxDepth(TreeNode root) {

		if(root == null) {
			return 0;
		}
		
		int recLh = maxDepth(root.left);
		int recRh = maxDepth(root.right);
		
		int maxH = Math.max(recLh, recRh);
		int meraH = maxH + 1;
		return meraH;
	}
    public boolean isBalanced(TreeNode khud) {
        
        if(khud == null) {
            return true;
        }
        int leftHt = maxDepth(khud.left);
        int rightHt = maxDepth(khud.right);
        
        int diff = Math.abs(leftHt - rightHt);
        
        boolean isLeftBalanced = isBalanced(khud.left); //t
        boolean isRightBalanced = isBalanced(khud.right); //t
        
        boolean isTreeBalanced =  (diff <= 1) && isLeftBalanced && isRightBalanced;
        return isTreeBalanced;
    }
}
