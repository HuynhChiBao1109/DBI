/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;


public class Fibonacci {

    public static int fib(int n){
        if(n <=2){
            return 1;
        }else{
            return fib(n-1) + fib(n-2);
        }
    }
    public static void main(String[] args) {
      int n;
      Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        n = sc.nextInt();
        System.out.println("Output: " + fib(n));
    }
    
}
