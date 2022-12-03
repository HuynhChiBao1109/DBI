/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package q1_lab2;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        int numberElement1 = 8;
        for (int i = 1; i <= numberElement1; i++) {
            stack.push(i);
        }
        System.out.println("Stack");
        System.out.print("1.Stack is Empty: ");
        boolean check1 = stack.isEmpty();
        if(check1)
            System.out.println("Stack is Empty");
        else{
            System.out.println("No");
            stack.traverse();
        }
        System.out.println("\n2.Push stack: ");
        stack.push(9);
        stack.traverse();
        System.out.println("\n3. Pop Stack: ");
        stack.pop();
        stack.traverse();
        System.out.println("\n4. Top Stack: ");
        System.out.println(stack.top());
        System.out.println("5. Print All in the stack: ");
        stack.traverse();
        System.out.println("\n6.Clear Stack: ");
        stack.clear();
        stack.traverse();
    }
    
}
