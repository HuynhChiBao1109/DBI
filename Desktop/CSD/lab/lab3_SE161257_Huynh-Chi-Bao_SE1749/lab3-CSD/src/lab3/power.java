/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;


public class power {

    public static int power(int x, int n) {
          if (n == 0) {
            return 1;
        } else if (n < 0) {
            return x * power(x, n + 1);
        } else {
            return x * power(x, n - 1);
        }
    }
    public static void main(String[] args) {
       int x,n;
       Scanner sc = new Scanner(System.in);
        System.out.print("enter x: ");
        x = sc.nextInt();
        System.out.print("enter n: ");
        n = sc.nextInt();
        System.out.println("Power : " + power(x,n));
    }
    
}
