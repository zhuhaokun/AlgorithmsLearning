package com.company.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Temp {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        List<Integer> subResult = new ArrayList<>();

        Queue<TreeNode> listNode = new LinkedList<>();
        listNode.offer(root);

        while (!listNode.isEmpty()) {
            int listNodeSize = listNode.size();
            for (int i = 1; i <= listNodeSize; i++) {
                TreeNode node = listNode.poll();
                subResult.add(node.val);
                if (node.left != null) {
                    listNode.offer(node.left);
                }
                if (node.right != null) {
                    listNode.offer(node.right);
                }
            }
            result.add(subResult);
            subResult = new ArrayList<>();
        }
        return result;
    }
}
