/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;


public class factorial {

    public static int fact(int n){
        if( n <=1){
            return 1;
        }else{
            return n*fact(n-1);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.print("enter n: ");
        n = sc.nextInt();
        System.out.println("Factorial of  " + n + " is: " + fact(n));
    }
    
}
