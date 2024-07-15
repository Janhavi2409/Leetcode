package LinkedList;

public class _237_DeleteANodeInLinkedList {
    public void deleteNode(SLL.Node node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
