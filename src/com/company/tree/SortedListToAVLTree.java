package com.company.tree;

public class SortedListToAVLTree {
    public TreeNode sortedListToBST(ListNode head) {
        return buildTree(head, null);
    }

    public TreeNode buildTree(ListNode left, ListNode right) {
        if (left == right) {
            return null;
        }
        TreeNode node = new TreeNode();
        ListNode mid = getMedian(left, right);
        node.val = mid.val;
        node.left = buildTree(left, mid);
        node.right = buildTree(mid.next, right);

        return node;
    }

    public ListNode getMedian(ListNode leftNode, ListNode rightNode) {
        ListNode fast = leftNode;
        ListNode slow = leftNode;
        while (fast != rightNode && fast.next != rightNode) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
}
