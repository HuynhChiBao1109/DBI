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
public class Node {
    int value;
    Node next;
    Node prev;

    public Node() {
    }

    public Node(int value, Node next, Node prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    Node (int data) {
        value = data;
        next = null;
        prev = null;
    }
}
