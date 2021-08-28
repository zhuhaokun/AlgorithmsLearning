package com.company.tree;

public class ListToBST {
    public TreeNode listToBST(ListNode head) {
        TreeNode root = new TreeNode();
        if (head == null) {
            return root;
        }
        /*
        *
        * */


        return root;
    }

    public static TreeNode addNode(TreeNode root, TreeNode newNode) {
        if (newNode.val <= root.val && root.left == null) {
            root.left = newNode;
        } else if (newNode.val > root.val && root.right == null) {
            root.right = newNode;
        } else {
            if (newNode.val <= root.val) {
                return addNode(root.left, newNode);
            } else {
                return addNode(root.right, newNode);
            }
        }
        return root;
    }
}
