/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_q2;

/**
 *
 * @author baohc
 */
public class Node {
    String value;
    Node next;

    public Node() {
    }

    public Node(String value, Node next) {
        this.value = value;
        this.next = next;
    }
    Node(String data) {
        value = data;
        next =null;
    }
}
