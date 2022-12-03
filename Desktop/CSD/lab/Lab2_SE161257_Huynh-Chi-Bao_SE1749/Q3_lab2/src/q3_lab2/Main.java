/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q3_lab2;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                // Question 3
        Mystack ms= new Mystack();
        String s1 = "Haveagoodday";
        for (int i = 0; i <= s1.length() - 1; i++) {
            ms.push(s1.charAt(i));
        }
        System.out.print("1.Stack is Empty: ");
        boolean check1 = ms.isEmpty();
        if(check1)
            System.out.println("Stack is Empty!");
        else{
            System.out.println("No!");
            ms.traverse();
        }
        System.out.print("\n2.Push of stack: ");
        ms.push(9);
        ms.traverse();
        System.out.print("\n3. Pop of Stack: ");
        ms.pop();
        ms.traverse();
        System.out.print("\n4. Top of Stack: ");
        System.out.println(ms.top());
        System.out.print("\n5. Print All in the stack: ");
        ms.traverse();
        System.out.print("\n6.Clear Stack: ");
        ms.clear();
        ms.traverse();
        
        /// Queue ////
        System.out.println("_____Queue Q3_____");
        Myqueue mq = new Myqueue();
        String s2 = "Haveagoodday";
        for (int i = 0; i <= s2.length() - 1; i++) {
            mq.enqueue(s2.charAt(i));
        }
        System.out.println("Queue");
        System.out.print("1.Queue is Empty: ");
        boolean check2 = mq.isEmpty();
        if(check2)
            System.out.println("Queue is Empty");
        else{
            System.out.println("No");
            mq.traverse();
        }
        System.out.print("\n2.Enqueue: ");
        mq.enqueue(9);
        mq.traverse();
        System.out.print("\n3. Dequeue: ");
        mq.dequeue();
        mq.traverse();
        System.out.print("\n4. Firt node: ");
        System.out.println(mq.first());
        System.out.print("\n5. Print All in the queue: ");
        mq.traverse();
        System.out.print("\n6.Clear Queue: ");
        mq.clear();
        mq.traverse();
        System.out.println("\n-------------------------------------------");
    }
    
}
