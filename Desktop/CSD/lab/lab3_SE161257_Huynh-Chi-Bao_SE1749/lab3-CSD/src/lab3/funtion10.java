/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;


public class funtion10 {

    public static double sum(int n) {
        double zero = 0.0;
        if (n < 0) {
            throw new IllegalArgumentException("Illegal power Argument");
        } else if (n == 0) {
            return zero;
        } else {
            return (1 / (double)n) + sum(n - 1);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n: ");
        n = sc.nextInt();
        System.out.println("Sum of Recriprocals: " + sum(n));
    }
    
}
