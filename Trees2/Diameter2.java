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
        int dia;
        int height;
        
        public Pair(int dia, int height) {
            this.dia = dia;
            this.height = height;
        }
    }
    public int diameterOfBinaryTree(TreeNode root) {
        Pair ans = diameter(root);
        return ans.dia;
    }
    
    public Pair diameter(TreeNode root) {
        
        if(root == null) {
            return new Pair(0, 0);
        }
        Pair left =  diameter(root.left);
        Pair right =  diameter(root.right);
        int leftDia = left.dia;
        int leftHt = left.height;
        int rightDia = right.dia;
        int rightHt = right.height;
        
        int apnaDia = leftHt + rightHt;
        int apniHt = Math.max(leftHt, rightHt) + 1;
        
        int actualDia = Math.max(apnaDia, Math.max(leftDia, rightDia));
        
        Pair ans = new Pair(actualDia, apniHt);
        return ans;
    }
    
    
}
