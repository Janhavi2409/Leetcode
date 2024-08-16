package LinkedList;

import LinkedList.SLL.Node;

import java.util.ArrayList;

public class _86_PartitionList {
    public Node partition(Node head, int x) {
        ArrayList<Integer> array = new ArrayList<>();
        Node dummy = head;
        while (head != null) {
            if (head.val < x) {
                array.add(head.val);
            }
            head = head.next;
        }
        while (dummy != null) {
            if (dummy.val >= x) {
                array.add(dummy.val);
            }
            dummy = dummy.next;
        }
        Node node = new Node();
        Node temp = node;
        for (int i = 0; i < array.size(); i++) {
            temp.next = new Node(array.get(i));
            temp = temp.next;
        }
        return node.next;
    }
}
