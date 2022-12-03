/*
 * Circular Linked List In Java.
 * A circular linked list is a list that has its tail or last node connected 
 * back to the head or the first node.
 * The below program implements a circular linked list wherein we have to 
 * manipulate individual nodes of the linked list.
 */
package circularlinkedlistdemo;

class CircularLinkedList {  
    //Node definition for circular linked list  
    public class Node{  
        int data;  
        Node next;  
        public Node() {}
        public Node(int data) {  
            this.data = data;  
        }     
    }    
    
    //Initially head and tail pointers point to null  
    public Node head = null;  
    public Node tail = null;  
    
    //add new node at the front of the circular linked list   
    public void addBegin(int data){  
        //Create new node  
        Node newNode = new Node(data);  
        //check if list is empty  
        if(head == null) {  
             //head and tail point to same node if list is empty  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail points to new node if list is not empty
            newNode.next = head;  
            //New node becomes new tail.  
            head = newNode; 
            //tail points back to head  
            tail.next = head;  
        }  
    }  
    
    //add new node at the end of the circular linked list   
    public void addEnd(int data){  
        //Create new node  
        Node newNode = new Node(data);  
        //check if list is empty  
        if(head == null) {  
             //head and tail point to same node if list is empty  
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
            //tail points to new node if list is not empty
            tail.next = newNode;  
            //New node becomes new tail.  
            tail = newNode;  
            //tail points back to head  
            tail.next = head;  
        }  
    }  
    
    //Display the nodes in circular linked list 
    public void displayList() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("The List is empty");  
        }  
        else {  
            System.out.println("Circular linked list nodes: ");  
             do{  
                //Print each node of the linked list  
                System.out.print(current.data + " ");  
                current = current.next;  
            }while(current != head);  
            System.out.println();  
        }  
    }  
}

public class CircularLinkedListDemo {
    public static void main(String[] args) {
        //create a CircularLinkedList object
        CircularLinkedList c_list = new CircularLinkedList();  
        //Add data at the end of the list  
        c_list.addEnd(10);  
        c_list.addEnd(20);  
        c_list.addEnd(30);  
        //Display the nodes in circular linked list 
        c_list.displayList(); 
        //Add data at the front of the list
        c_list.addBegin(40);  
        c_list.addBegin(50);
        c_list.addBegin(60);
        //Display the nodes in circular linked list 
        c_list.displayList();
        //Add data at the end of the list  
        c_list.addEnd(70);  
        c_list.addEnd(80);  
        c_list.addEnd(90);  
        //Display the nodes in circular linked list 
        c_list.displayList(); 
    }   
}
