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
    class Pair {
        boolean isB;
        int height;
        
        public Pair(boolean isB, int height) {
            this.isB = isB;
            this.height = height;
        }
    }
    public boolean isBalanced(TreeNode root) {
        
        Pair ans = balanced(root);
        return ans.isB;
    }
    
 
    public Pair balanced(TreeNode root) {
        
        if(root == null) {
            return new Pair(true, 0);
        }
        Pair left =  balanced(root.left);
        Pair right =  balanced(root.right);
        boolean leftB = left.isB;
        int leftHt = left.height;
        boolean rightB = right.isB;
        int rightHt = right.height;
        
        boolean apnaB = (Math.abs(leftHt - rightHt) <= 1);
        int apniHt = Math.max(leftHt, rightHt) + 1;
        
        boolean isTreeB = apnaB && leftB && rightB;
        
        Pair ans = new Pair(isTreeB, apniHt);
        return ans;
    }
}
