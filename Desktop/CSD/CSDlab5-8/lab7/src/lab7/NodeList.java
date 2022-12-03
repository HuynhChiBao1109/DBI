/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;


public class NodeList {
    private Node head;
    public NodeList(){
        head = null;
    }
    public void addToFront(Student student){
        Node newNode = new Node(student);
        newNode.next = head;
        head = newNode;
    }
    public void displayListValues(){
        Node headCopy = head;
        System.out.print('[');
        while(headCopy!= null) {
            if ((headCopy.next != null)) {
                System.out.print(headCopy.student.toString() + ", ");
            } else {
                System.out.print(headCopy.student.toString());
            }
            headCopy = headCopy.next;
        }
        System.out.println("]");
    }
    public boolean contains(Student student){
        Node headCopy = head;
        while(headCopy!= null) {
            if(headCopy.student == student)
                return true;
            headCopy = headCopy.next;
        }
        return false;
    }

    public Node getHead() {
        return head;
    }
}
