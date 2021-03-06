package com.company.tree;

public class IsBalancedTree2 {
    public boolean isBalancedTree(TreeNode root) {
        return height(root) >= 0;
    }

    public int height(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left, right;
        if ((left = height(root.left)) == -1 || (right = height(root.right)) == -1 || Math.abs(left - right) > 1) {
            return -1;
        } else {
            return Math.max(left, right) + 1;
        }
    }
}
