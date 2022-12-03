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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MyList list = new MyList();
       Node n = new Node();
       list.addToHead("bao");
       list.addToHead("huynh");
       list.addToTail("chi");
       list.traverse();
       n = list.search("bao");
       list.addAfter(n, "cao");
       list.traverse();
       list.count();
    }
    
}
