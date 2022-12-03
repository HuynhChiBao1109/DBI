/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_q1;

/**
 *
 * @author baohc
 */
public class MyList {

    Node head, tail;

    //1.add a node with value x at the head of a list
    void addToHead(int x) {
        Node node = new Node(x);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
    }

    //2.add a node with value x at the tail of a list
    void addToTail(int x) {
        Node node = new Node(x);
        if (head == null) {
            head = tail = node;
        } else {
            tail.next = node;
            tail = node;
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

    //11.delete node p if it exists in the list
    void delete(Node p) {
        Node delete = head, prev = null;
        while (delete != null && delete != p) {
            prev = delete;
            delete = delete.next;
        }
        if (prev == null) {
            head = head.next;
            if (head == null) {
                tail = null;
            }
        } else {
            prev.next = p.next;
            if (p == tail) {
                tail = prev;
            }
        }
        p.next = null;
    }

    //12delete an i-th node on the list. Besure that such a node exists.
    void deleteNode2(int i) {
        Node p = head;
        int count = 0;
        while (p != null && count < i) {
            count++;
            p = p.next;
        }
        delete(p);
    }

    //13 add a node with value x before the node p.
    void addBefore(Node p, int x) {
        if (head == p) {
            Node n = new Node(x);
            n.next = head;
            head = n;
        } else {
            Node k = null;
            for (Node n = head; n != p; k = n, n = n.next) ;
            Node m = new Node(x);
            m.next = k.next;
            k.next = m;
        }

    }

    //14 sort the list by ascending order of info.
    public void sort() {
        Node p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                Node pi = get(i);
                Node pj = get(j);
                if (pi.value > pj.value) {
                    int temp = pi.value;
                    pi.value = pj.value;
                    pj.value = temp;
                }
            }
        }

    }

    Node get(int i) {
        Node p = head;
        int count = 0;
        while (p != null & count < i) {
            count++;
            p = p.next;
        }
        return p;
    }

    //15 Reverse a singly linked list using only one pass through the list
    public void reverse() {
        int count = 0;
        Node p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        for (int i = 0, j = count - 1; i < j; i++, j--) {
            Node pi = get(i), pj = get(j);
            int temp = pi.value;
            pi.value = pj.value;
            pj.value = temp;
        }
    }

    //16 create and return array containing info of all nodes in the list
    int[] toArray() {
        int count = 0;
        Node p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        Node n = head;
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            if (n != null) {
                arr[i] = n.value;
                n = n.next;
            }
        }
        System.out.println("Array of node");
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + ", ");
        }
        return arr;
    }

    //17 Merge two ordered singly linked lists of integers into one ordered list
     static Node sortedMerge(Node headA, Node headB) {
        if (headA == null) 
            return headB;
        if (headB == null) 
            return headA;
        if (headA.value < headB.value) {
            headA.next = sortedMerge(headA.next, headB);
            return headA;        
        }
        else{
            headB.next = sortedMerge(headA, headB.next);
            return headB;
        }
    }
    //18 Attach a singly linked list to the end of another singly linked list
     static Node attachList(Node headA, Node headB, Node tailA) {
        if (headA == null) {
            return headB;
        }
        if (headB == null) {
            return headA;
        } else {
            while (headB != null) {                
                tailA.next = headB;
                tailA = tailA.next;
                headB = headB.next;
            }
        }
        return headA;
    }
    //19 find and return the maximum value in the list
    int max() {
        int max = get(0).value;
        int size = 0;
        Node p = head;
        while (p != null) {
            size++;
            p = p.next;
        }
        for (int i = 0; i < size; i++) {
            if (get(i).value > max) {
                max = get(i).value;
            }
        }
        System.out.println("max: " + max);
        return max;
    }

    //20 find and return the minimum value in the list
    int min() {
        int min = get(0).value;
        int size = 0;
        Node p = head;
        while (p != null) {
            size++;
            p = p.next;
        }
        for (int i = 0; i < size; i++) {
            if (get(i).value < min) {
                min = get(i).value;
            }
        }
        System.out.println("min: " + min);
        return min;
    }

    //21 return the sum of all values in the list
    int sum() {
        int sum = get(0).value;
        int size = 0;
        Node p = head;
        while (p != null) {
            size++;
            p = p.next;
        }
        for (int i = 0; i < size; i++) {
            sum += get(i).value;
        }
        System.out.println("sum: " + sum);
        return sum;
    }

    //22 return the average of all values in the list.
    int avg() {
        int sum = 0;
        int size = 0;
        Node p = head;
        while (p != null) {
            size++;
            p = p.next;
        }
        for (int i = 0; i < size; i++) {
            sum += get(i).value;
        }
        System.out.println("avg: " + sum / size);
        return sum / size;
    }

    //23 check and return true if the list is sorted, return false if the list is not sorted.
    boolean sorted() {
        boolean check = false;
        int count = 0;
        Node p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                Node pi = get(i);
                Node pj = get(j);
                if (pi.value < pj.value) {
                    check = true;
                } else {
                    check = false;
                    break;
                }
            }
        }
        if (check == true) {
            System.out.println("Node is sorted");
        } else {
            System.out.println("Node isn't sorted");
        }
        return check;
    }

    //24 insert node with value x into sorted list so that the new list is sorted.
    void insert(int x) {
        Node node = new Node(x);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            head = node;
        }
        sort();
    }
    //25 Check whether two singly linked list have the same contents    
    Node Insert(Node head, Node newNode) {
        Node current;
        if (head == null) {
            head = newNode;
        } else if (head.value <= newNode.value) {
            newNode.next = head;
            newNode.next.next = newNode;
            head = newNode;
        } else {
            current = head;
            while (current.next != null && current.next.value > newNode.value) {
                current = current.next;
            }
            newNode.next = current.next;
            if (current.next != null) {
                newNode.next = newNode;
            }
            current.next = newNode;
            current.next = current;
        }
        return head;
    }
}
