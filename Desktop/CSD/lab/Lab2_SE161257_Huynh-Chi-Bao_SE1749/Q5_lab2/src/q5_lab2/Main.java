/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q5_lab2;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String[] ID = {"SE001", "SE002", "SE003", "SE004", "SE005"};
        String[] name = {"Han", "Khanh", "Bao", "Duy", "Thinh"};
        int[] age = {19, 19, 20, 20, 20};
   //****** Stack ****////
        MyStack ms = new MyStack();
        ms.pushMany(ID, name, age);
        System.out.print("Check stack is empty:");
        boolean check1 = ms.isEmpty();
        if(check1){
            System.out.println("1.Stack is empty");
        }else{
            System.out.println(" No");
            System.out.println("----- Stack list -----");
            ms.traverse();
        }
        System.out.println("2.Push stack: ");
        ms.push(new Students("SE006","Truc",20));
        ms.traverse();
        System.out.println("3.Pop stack: ");
        ms.pop();
        ms.traverse();
        System.out.println("4.Top Stack: ");
        System.out.println(ms.top());
        System.out.println("5.Display all values in stack: ");
        ms.traverse();
        System.out.println("6.Clear the stack: ");
        ms.clear();
        ms.traverse();
        System.out.println("-------------------------------------------");
    
   /////     Queue           ////
        MyQueue mq = new MyQueue();
        mq.enqueueMany(ID, name, age);
        System.out.print("Check Queue is empty:");
        boolean check2 = mq.isEmpty();
        if(check2){
            System.out.println("1.Queue is empty");
        }else{
            System.out.println(" No");
            System.out.println("----- Queue list -----");
            mq.traverse();
        }
        System.out.println("2.Enqueue : ");
        mq.enqueue(new Students("S006","Truc",20));
        mq.traverse();
        System.out.println("3.Dequeue : ");
        mq.dequeue();
        mq.traverse();
        System.out.println("4.First Queue: ");
        System.out.println(mq.first());
        System.out.println("5.Display all values in stack: ");
        mq.traverse();
        System.out.println("6.Clear the stack: ");
        mq.clear();
        mq.traverse();
        System.out.println("----------------------");
        }
    }
    
