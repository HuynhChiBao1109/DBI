/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;


public class GCD {
    public static int gcd(int m,int n){
        if(n==0){
            return m;
        }else{
            return gcd(n, m%n);
        }
    }
    
    public static void main(String[] args) {
        int m,n;
        Scanner sc= new Scanner(System.in);
        System.out.print("enter m: ");
        m = sc.nextInt();
        System.out.print("enter n: ");
        n = sc.nextInt();
        System.out.println("GCD(m,n): " + gcd(m,n));
    }
    
}
