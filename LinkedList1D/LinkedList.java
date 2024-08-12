package LinkedList1D;

public class LinkedList {

    public static Node convertArrToLL(int arr[]) {
        Node head = new Node(arr[0], null);
        Node current = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], null);
            current.next = temp;
            current = temp;
            // System.out.println(current.data);

        }
        return head;

    }

    public static void traverseLinkedList(Node node) {
        Node currentNode = node;
        while (currentNode != null) {
            System.out.println(currentNode.data);
            currentNode = currentNode.next;
        }
    }

    static void findLength(Node node) {
        int count = 0;
        Node currentNode = node;
        while (currentNode != null) {
            count++;
            currentNode = currentNode.next;

        }
        System.out.println("Length is" + count);
    }

    static void findElement(Node node, int value) {
        int count = 0;
        Node currentNode = node;
        while (currentNode != null) {
            if (currentNode.data == value) {
                System.out.println("found at " + count + " Position");
            } else {
                count++;
            }
            currentNode = currentNode.next;

        }
    }

    static Node insertValueAtIndexFirst(Node node, int value) {
        Node newNode = new Node(value, null);

        Node head = node;
        newNode.next = head;
        return newNode;
    }

    static Node insertValueAtLastIndex(Node node, int value) {
        Node newNode = new Node(value, null);
        Node currentNode = node;

        while (currentNode.next != null) {
            currentNode = currentNode.next;

        }
        currentNode.next = newNode;
        return node;
    }

    static Node insertValueAtMid(Node node, int value, int afterValue) {
        Node newNode = new Node(value, null);
        Node currentNode = node;
        while (currentNode.data != afterValue) {
            currentNode = currentNode.next;

        }
        newNode.next = currentNode.next;

        currentNode.next = newNode;
        return node;
    }

    static Node deleteValueFromFirst(Node node) {
        Node head = node;
        Node currentNode = head;
        currentNode = currentNode.next;

        return currentNode;
    }

    static Node deleteValueFromLast(Node node) {
        Node currentNode = node;

        while (currentNode.next.next != null) {
            currentNode = currentNode.next;

        }
        currentNode.next = null;
        return node;
    }

    static Node deleteValueAtMid(Node node, int afterValue) {
        Node currentNode = node;
        while (currentNode.next.data != afterValue) {
            currentNode = currentNode.next;

        }

        currentNode.next = currentNode.next.next;
        return node;
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 2, 5 };
        Node head = convertArrToLL(arr);
        // traverseLinkedList(head);
        // findLength(head);
        // findElement(head, 2);

        // After Insert element at index first
        // Node newHead = insertValueAtIndexFirst(head, 9);
        // traverseLinkedList(newHead);

        // After Insert element at last index
        // Node newHead = insertValueAtLastIndex(head, 9);
        // traverseLinkedList(newHead);

        // After Insert element at mid
        // Node newHead = insertValueAtMid(head, 7,2);
        // traverseLinkedList(newHead);

        // Remove element Insert element at first
        // Node newHead = deleteValueFromFirst(head);
        // traverseLinkedList(newHead);

        // Remove element Insert element at last
        // Node newHead = deleteValueFromLast(head);
        // traverseLinkedList(newHead);

        // Remove element Insert element at mid
        // Node newHead = deleteValueAtMid(head, 2);
        // traverseLinkedList(newHead);

        // Node node = new Node(4, null);
        // Node node1 = new Node(3, node);
        // Node node2 = new Node(2, node1);
        // Node node3 = new Node(1, node2);

        // System.out.println(node3.data);
        // System.out.println(node3.next.data);
        // System.out.println(node3.next.next.data);

        // System.out.println(node3.next.next.next.data);
        // System.out.println(node3.next.next.next.next.data);

    }

}
