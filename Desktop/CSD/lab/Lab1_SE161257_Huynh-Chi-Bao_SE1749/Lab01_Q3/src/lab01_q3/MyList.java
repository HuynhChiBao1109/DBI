/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_q3;

/**
 *
 * @author baohc
 */
public class MyList {

    Node head, tail;
    //1.add a node with value x at the head of a list

    void addToHead(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {

            head.prev = newNode;
            newNode.next = head;
            head = newNode;
            head.prev = null;

        }
    }

    //2.add a node with value x at the tail of a list
    void addToTail(int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = tail = newNode;
            head.prev = null;
            tail.next = null;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            tail.next = null;
        }
    }

    //3.- add a node with value x after the node p
    void addAfter(Node node, int x) {
        Node newNode = new Node(x);
        if (head == null) {
            head = tail = node;
        } else {
            newNode.next = node.next;
            node.next = newNode;
        }
    }

    //4.- traverse from head to tail and dislay info of all nodes in the list
    void traverse() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " ");
            node = node.next;
        }
        System.out.println("");
    }

    //5.- count and return number of nodes in the list.
    int count() {
        Node node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        System.out.println(count);
        return count;
    }

    //6.- delete the head and return its info.
    int deleteFromHead() {
        Node node = head;
        if (node.next == null) {
            node = null;
        } else {
            head = node.next;
        }
        return node.value;
    }

    //7.delete the tail and return its info
    int deleteFromTail() {
        Node node = head;
        if (node.next == null) {
            node = null;
        } else {
            Node temp = new Node();
            temp = node;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            Node lastNode = temp.next;
            temp.next = null;
            lastNode = null;
        }
        return node.value;
    }

    //8.delete the node after the node p and return its info
    int deleteAter(Node p) {
        Node prev_Node = p;
        Node temp = p.next;
        if (temp == null) {
            return temp.value;
        }

        prev_Node.next = temp.next;
        return temp.value;
    }

    //9. delele the first node whose info is equal to x
    void delete(int x) {
        Node temp = head, prev = null;
        if (temp != null && temp.value == x) {
            head = temp.next;
        }

        while (temp != null && temp.value != x) {
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;

    }

    //10.search and return the reference to the first node having info x
    Node search(int x) {
        Node node = head;
        while (node != null && node.value != x) {
            node = node.next;
        }
        return node;
    }
}
