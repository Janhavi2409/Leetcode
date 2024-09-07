package LinkedList;


// Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}


// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


public class _1367_LinkedListInBinaryTree {
    private boolean checkPath(ListNode head, TreeNode root) {
        if (head == null) {
            return true;
        }

        if (root == null) {
            return false;
        }

        if (head.val != root.val) {
            return false;
        }

        return checkPath(head.next, root.left) || checkPath(head.next, root.right);
    }

    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }

        if (checkPath(head, root)) {
            return true;
        }

        return isSubPath(head, root.left) || isSubPath(head, root.right);
    }
}
