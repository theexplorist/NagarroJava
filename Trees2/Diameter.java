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
    public int diameterOfBinaryTree(TreeNode root) {
        
        if(root == null) {
            return 0;
        }
        int rootLeftHeight = maxDepth(root.left);
        int rootRightHeight = maxDepth(root.right);
        
        int rootDia = rootLeftHeight + rootRightHeight; //khud ka dia
        
        int rootLeftDia = diameterOfBinaryTree(root.left); //left subtree ka dia
        int rootRightDia = diameterOfBinaryTree(root.right); //right subtree ka dia
        int ans = Math.max(rootDia, Math.max(rootLeftDia, rootRightDia));
        return ans;
    }
}
