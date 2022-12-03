/*
 * Doubly Linked List In Java.
 * The program below shows Java implementation of a doubly-linked list with the 
 * addition and removal of nodes at the end of the list.
 */
package doublylinkedlistdemo;

class DoublyLinkedList {    
    //A node class for doubly linked list
    class Node{  
        int item;  
        Node previous;  
        Node next; 
        public Node() {}
        public Node(int item) {  
            this.item = item;  
        }     
    }  
    
    //Initially, heade and tail is set to null
    Node head, tail = null;  
   
    //add a new node at the end of the list  
    public void addNode(int item) {  
        //Create a new node  
        Node newNode = new Node(item);   
        //if list is empty, head and tail points to newNode  
        if(head == null) {  
            head = tail = newNode;  
            //head's previous will be null  
            head.previous = null;  
            //tail's next will be null  
            tail.next = null;  
        }  
        else {  
            //add newNode to the end of list. tail->next set to newNode  
            tail.next = newNode;  
            //newNode->previous set to tail  
            newNode.previous = tail;  
            //newNode becomes new tail  
            tail = newNode;  
            //tail's next point to null  
            tail.next = null;  
        }  
    } 
    
    //delete a node from the end of the list 
    public void delNode() {
        if(this.head != null) {
            //if head in not null and next of head is null, release the head
            if(this.head.next == null) {
                this.head = null;
            } else {
            //Else, traverse to the second last element of the list
                Node temp = new Node();
                temp = this.head;
                while(temp.next.next != null)
                    temp = temp.next;
            //Change the next of the second last node to null and delete the last node
                Node lastNode = temp.next;
                temp.next = null; 
                lastNode = null;
            }
        }
    }

    //print all the nodes of doubly linked list  
    public void printNodes() {  
        //Node current will point to head  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            //Print each node and then go to next.  
            System.out.print(current.item + " ");  
            current = current.next;  
        } 
        System.out.println();
    }  
}

public class DoublyLinkedListDemo {
    public static void main(String[] args) {
        //create a DoublyLinkedList object
        DoublyLinkedList dl_List = new DoublyLinkedList();  
        //Add nodes to the list  
        dl_List.addNode(10);  
        dl_List.addNode(20);  
        dl_List.addNode(30);  
        dl_List.addNode(40);  
        dl_List.addNode(50);    
        //print the nodes of DoublyLinkedList  
        dl_List.printNodes();
        //Delete the last node
        dl_List.delNode();
        dl_List.printNodes();  
    }  
}
