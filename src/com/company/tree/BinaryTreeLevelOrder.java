package com.company.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * binary tree level order
 * */
public class BinaryTreeLevelOrder {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> levelNode = new LinkedList();
        levelNode.offer(root);
        while (!levelNode.isEmpty()) {
            List<Integer> subResult = new ArrayList();
            int currentSize = levelNode.size();
            for (int i = 1; i <= currentSize; i++) {
                TreeNode t = levelNode.poll();
                subResult.add(t.val);
                if (t.left != null) {
                    levelNode.offer(t.left);
                }
                if (t.right != null) {
                    levelNode.offer(t.right);
                }
            }
            result.add(subResult);
        }
        return result;
    }
}
