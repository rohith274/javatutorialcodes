package LinkedList;

class LinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createLinkedList(int nodeValue) {
        head = new Node();
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }
   
}