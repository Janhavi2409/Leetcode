package LinkedList;

import static LinkedList.SLL.Node;

public class _61_RotateList {
    public Node rotateRight(Node head, int k) {
        if (head == null || k == 0) {
            return head;
        }
        Node temp = head;
        int length = 1;
        while (temp.next != null) {
            temp = temp.next;
            length++;
        }
        k = k % length;
        int skipLength = length - k;
        temp.next = head;
        Node tail = head;
        for (int i = 0; i < skipLength - 1; i++) {
            tail = tail.next;
        }
        head = tail.next;
        tail.next = null;
        return head;
    }
}
