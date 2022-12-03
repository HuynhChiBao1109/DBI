/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q5_lab2;

import java.util.LinkedList;


public class MyQueue {
     
    LinkedList<Students> s;
    public MyQueue() {
        s = new LinkedList<>();
    }
    
    public void clear() {
        s.clear();
        System.out.println("*** Clear Successfully ****");
    }
    
    public boolean isEmpty() {
        return (s.isEmpty());
    }
    
    //addLast
    public void enqueue(Students x) {
        s.addLast(x);
    }
    
    public void enqueueMany(String[]ID, String[] n, int[] a){
        for (int i = 0; i < ID.length; i++) {
            enqueue(new Students(ID[i], n[i], a[i]));
        }
    }
    
    public Students dequeue() {
        if(isEmpty()) 
            return null;
        return s.removeFirst();
    }
    
    public Students first() {
        if (isEmpty()) {
            return null;
        }
        return s.getFirst();
    }
    
    public void traverse(){
        if(!s.isEmpty()){
            for (int i = 0; i < s.size(); i++) {
                System.out.println(s.get(i));
            }
        }else{
            System.out.println("Stack is empty");
        }
    }
}