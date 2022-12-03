package lab1_q1;

class Node {

    int value;
    Node next;

    public Node() {
    }

    public Node(int value, Node next) {
        this.value = value;
        this.next = next;
    }

    Node(int data) {
        value = data;
        next = null;
    }

}
