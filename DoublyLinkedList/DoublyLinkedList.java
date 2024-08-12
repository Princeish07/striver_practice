package DoublyLinkedList;

class DoublyLinkedList {
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

    static DoublyNode insertAtFirst(DoublyNode node, int value) {
        DoublyNode newNode = new DoublyNode(null, value, null);
        DoublyNode currentNode = node;
        currentNode.prev = newNode;
        newNode.next = currentNode;
        return newNode;

    }

    static DoublyNode insertAtLast(DoublyNode node, int value) {
        DoublyNode newNode = new DoublyNode(null, value, null);
        DoublyNode currentNode = node;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        newNode.prev = currentNode;
        currentNode.next = newNode;
        return node;

    }

    static DoublyNode insertAtMid(DoublyNode node, int value, int afterValue) {
        DoublyNode newNode = new DoublyNode(null, value, null);
        DoublyNode currentNode = node;
        while (currentNode.data != afterValue) {
            currentNode = currentNode.next;
        }

        newNode.prev = currentNode;
        newNode.next = currentNode.next;
        currentNode.next = newNode;
        return node;

    }

    static DoublyNode deleteFromFirst(DoublyNode node) {

        DoublyNode currentNode = node.next;
        currentNode.prev = null;
        return currentNode;

    }

    static DoublyNode deleteFromLast(DoublyNode node) {
        DoublyNode currentNode = node;
        while (currentNode.next.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        return node;

    }

    static DoublyNode deleteFromMid(DoublyNode node, int afterValue) {
        DoublyNode currentNode = node;
        while (currentNode.next.data != afterValue) {
            currentNode = currentNode.next;
        }
        currentNode.next = currentNode.next.next;
        currentNode.next.prev = currentNode.next;
        return node;

    }

    static int searchValue(DoublyNode node, int value) {
        int count = 0;
        while (node.data != value) {
            node = node.next;
            count++;
        }

        return count;

    }

    public static void main(String[] args) {

        DoublyNode head1 = createLinkedList();

        // Insert at first index
        // DoublyNode currentHead = insertAtFirst(head1, 6);
        // traversalLinkedList(currentHead);

        // Insert at last index
        // DoublyNode currentHead = insertAtLast(head1, 6);
        // traversalLinkedList(currentHead);

        // Insert at mid
        // DoublyNode currentHead = insertAtMid(head1, 2, 9);
        // traversalLinkedList(currentHead);

        // Delete at first
        // DoublyNode currentHead = deleteFromFirst(head1);
        // traversalLinkedList(currentHead);

        // Delete at last
        // DoublyNode currentHead = deleteFromLast(head1);
        // traversalLinkedList(currentHead);

        // Delete at last
        // DoublyNode currentHead = deleteFromMid(head1, 6);
        // traversalLinkedList(currentHead);

        // Search Value
        int data = searchValue(head1, 1);
        System.out.println(data);

    }

}
