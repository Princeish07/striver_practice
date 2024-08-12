package DoublyLinkedList;

public class DoublyNode {
    DoublyNode prev;
    int data;
    DoublyNode next;

    DoublyNode(DoublyNode prev, int data, DoublyNode next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }

}
