package DoublyLinkedList;

import java.util.Stack;

public class ReverseLinkedList {
    static DoublyNode createLinkedList() {
        DoublyNode head = new DoublyNode(null, 2, null);
        DoublyNode currentNode = new DoublyNode(head, 6, null);
        head.next = currentNode;
        currentNode.next = new DoublyNode(currentNode, 9, null);
        currentNode.next.next = new DoublyNode(currentNode.next, 1, null);
        return head;
    }

    static void traversalLinkedList(DoublyNode node) {
        DoublyNode currentNode = node;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    static DoublyNode reverse(DoublyNode node) {
        Stack<Integer> stack = new Stack<Integer>();

        DoublyNode currentNode = node;
        while (currentNode != null) {
            stack.push(currentNode.data);
            currentNode = currentNode.next;

        }
        currentNode = node;

        while (currentNode != null) {

            currentNode.data = stack.pop();
            currentNode = currentNode.next;

        }

        return node;
    }

    public static void main(String[] args) {
        DoublyNode head = createLinkedList();
        DoublyNode head1 = reverse(head);

        traversalLinkedList(head1);

    }

}
