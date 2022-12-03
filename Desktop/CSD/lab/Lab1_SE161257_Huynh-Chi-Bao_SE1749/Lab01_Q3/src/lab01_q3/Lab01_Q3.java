/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab01_q3;

/**
 *
 * @author baohc
 */
public class Lab01_Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyList list = new MyList();
        Node n = new Node();
//        list.addToHead(10);
        list.addToTail(10);
        list.addToTail(20);
        list.addToHead(30);
        list.deleteFromTail();
        list.traverse();
    }
    
}
