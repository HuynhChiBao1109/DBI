/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q2_lab2;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyQueue mq = new MyQueue();
        int numberElement2 = 8;
        for (int i = 1; i <= numberElement2; i++) {
            mq.enqueue(i);
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
        System.out.print("\n2.Enqueue is : ");
        mq.enqueue(9);
        mq.traverse();
        System.out.print("\n3. Dequeue is : ");
        mq.dequeue();
        mq.traverse();
        System.out.print("\n4. First node is: ");
        System.out.print(mq.first());
        System.out.print("\n5. Print All in the Queue: ");
        mq.traverse();
        System.out.print("\n6.Clear Queue: ");
        mq.clear();
        mq.traverse();

    }
    
}
