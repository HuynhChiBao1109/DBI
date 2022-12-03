/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3_lab2;

public class Node {
    Object info; Node next;
    Node() {
    }
    
    Node(Object info, Node next) {
        this.info=info; 
        this.next=next;
    }
    
    Node(Object info) {
        this(info, null);
    }
}
