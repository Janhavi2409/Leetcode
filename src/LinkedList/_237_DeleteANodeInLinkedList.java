package LinkedList;
import LinkedList.SLL.Node;

public class _237_DeleteANodeInLinkedList {
    public void deleteNode(Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
