/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q4_lab2;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Mystack ms1= new Mystack();
        String s3 = "Have a good day";
        String sc1[] = s3.split("\\s+");
        for (int i = 0; i < sc1.length; i++) {
            ms1.push(sc1[i] + " ");
        }
        System.out.println("_____ Stack Q4 _____");
        System.out.print("1.Stack is Empty: ");
        boolean check3 = ms1.isEmpty();
        if(check3)
            System.out.println("Stack is Empty");
        else{
            System.out.println("No");
            ms1.traverse();
        }
        System.out.print("\n2.Push stack: ");
        ms1.push("teacher ");
        ms1.traverse();
        System.out.print("\n3. Pop Stack: ");
        ms1.pop();
        ms1.traverse();
        System.out.print("\n4. Top Stack: ");
        System.out.println(ms1.top());
        System.out.print("\n5. Print All in the stack: ");
        ms1.traverse();
        System.out.print("\n6.Clear Stack: ");
        ms1.clear();
        ms1.traverse();
        System.out.println("____ Queue Q4____");
        myqueue mq1 = new myqueue();
        String s4 = "Have a good day";
        String sc2[] =s4.split("\\s+");
        for (int i = 0; i < sc2.length; i++) {
            mq1.enqueue(sc2[i] + " ");
        }
        System.out.println("Queue");
        System.out.print("1.Queue is Empty: ");
        boolean check4 = mq1.isEmpty();
        if(check4)
            System.out.println("Queue is Empty");
        else{
            System.out.println("No");
            mq1.traverse();
        }
        System.out.print("\n2.Enqueue: ");
        mq1.enqueue("teacher");
        mq1.traverse();
        System.out.print("\n3. Dequeue: ");
        mq1.dequeue();
        mq1.traverse();
        System.out.print("\n4. Firt node: ");
        System.out.println(mq1.first());
        System.out.print("\n5. Print All in the queue: ");
        mq1.traverse();
        System.out.print("\n6.Clear Queue: ");
        mq1.clear();
        mq1.traverse();
    }
    }
    

