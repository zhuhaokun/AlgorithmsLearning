package com.company.tree;

import java.util.Stack;

public class IsBST {
    public boolean isBST(TreeNode root) {
        return BSTChecker(root);
    }

    public boolean BSTChecker(TreeNode root) {
        Stack<TreeNode> nodeStack = new Stack<>();
        double lowerBound = -Double.MAX_VALUE;

        while (root != null || !nodeStack.isEmpty()) {
            while (root != null) {
                nodeStack.push(root);
                root = root.left;
            }
            root = nodeStack.pop();
            if (root.val <= lowerBound) {
                return false;
            } else {
                lowerBound = root.val;
                root = root.right;
            }
        }
        return true;
    }
}
