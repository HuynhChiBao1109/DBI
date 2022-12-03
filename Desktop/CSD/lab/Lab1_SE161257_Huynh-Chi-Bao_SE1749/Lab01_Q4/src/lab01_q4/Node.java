/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_q4;

/**
 *
 * @author baohc
 */
public class Node {

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
