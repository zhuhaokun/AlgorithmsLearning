package com.company.tree;

import java.util.*;

public class InorderTraversal2 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> nodeStack = new Stack<>();
        while (root != null || !nodeStack.isEmpty()) {
            while (root != null) {
                nodeStack.push(root);
                root = root.left;
            }
            root = nodeStack.pop();
            result.add(root.val);
            root = root.right;
        }
        return result;
    }
}
