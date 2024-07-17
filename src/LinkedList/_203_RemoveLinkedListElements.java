package LinkedList;

import LinkedList.SLL.Node;

public class _203_RemoveLinkedListElements {
    public Node removeElements(Node head, int val) {
        Node list = new Node(0);
        list.next = head;
        Node current = list;
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return list.next;
    }
}
