/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q5_lab2;

import java.util.LinkedList;


public class MyStack {
      LinkedList<Students> s;
    
    public MyStack() {
        s = new LinkedList<>();
    }
    
    public void clear() {
        s.clear();
        System.out.println("*** Clear Successfully ****");
    }
    
    public boolean isEmpty() {
       if(s.isEmpty()){
           return true;
       }else{
           return false;
       }
    }
    
    public void push(Students t) {
        s.addLast(t);
    }
    
    public void pushMany(String[] ID, String[] n,int[] a){
        for (int j = 0; j < ID.length; j++) {
            push(new Students(ID[j], n[j], a[j]));
        }
    }
    
    public Students pop() {
        if(isEmpty()) 
            return null;
        return (s.removeLast());
    }
    
    public Students top() {
        if(isEmpty()) 
            return null;
        return s.getLast();
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
