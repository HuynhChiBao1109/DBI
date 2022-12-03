/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q3_lab2;

public class Mystack {
    Node head;
    public Mystack() {
        head = null;
    }
    
    public void clear() {
        head = null;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public void push(Object info) {
        Node p = new Node(info);
        if(isEmpty()) 
            head = p;
        else {
            p.next = head; 
            head = p;}
    }
    
    public Object pop() {
        if(isEmpty()) 
            return null;
        Object info = head.info;
        head = head.next;
        return info;
    }
    
    public Object top() {
        if(isEmpty()) 
            return null;
        Object info = head.info;
        return info;
    }  
    
    public void traverse(){
        if (isEmpty())
            System.out.println("Empty!");
        else{
            Node p = head;
            while (p != null) {                
                System.out.print(p.info);
                p = p.next;
            }
        }
    }
}
