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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyList list = new MyList();
       Node n  = new Node();
       
       list.addToHead(30);
       list.addToHead(40);
       list.addToTail(10);
       list.addToHead(50);
       list.traverse();
       list.sort();
       list.traverse();
       n = list.search(10); list.addAfter(n, 20);
       list.traverse();
       n = list.search(30);list.delete(n);
       list.traverse();
       list.deleteFromHead();
       list.deleteFromTail();
       list.traverse();
       n = list.search(20); list.addBefore(n, 90);
       list.traverse();
       list.addToHead(60);
       list.traverse();
       list.sort();
       list.traverse();
       list.sorted();
       list.toArray();
       list.traverse();
       list.max();
       list.min();
       list.sum();
       list.avg();
       list.count();
       
      
    }
    
}
