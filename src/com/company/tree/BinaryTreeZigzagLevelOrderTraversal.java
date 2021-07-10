package com.company.tree;

import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }

        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);
        Boolean isStartFromLeft = true;
        while (!nodeQueue.isEmpty()) {
            Deque<Integer> subResult = new LinkedList<>();
            int currentQueueSize = nodeQueue.size();
            for (int i = 1; i <= currentQueueSize; i++) {
                TreeNode t = nodeQueue.poll();
                if (isStartFromLeft) {
                    subResult.offerLast(t.val);
                } else {
                    subResult.offerFirst(t.val);
                }
                if (t.left != null) {
                    nodeQueue.offer(t.left);
                }
                if (t.right != null) {
                    nodeQueue.offer(t.right);
                }
            }
            result.add((List<Integer>) subResult);
            isStartFromLeft = !isStartFromLeft;
        }
        return result;
    }
}
