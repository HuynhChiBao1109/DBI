/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;


public class MinArray {

    public static int findmin(int a[], int n) {

        if (n == 1) {
            return a[0];
        } else {
            return  Math.min(a[n-1], findmin(a,n-1));
           // int min = a[0];
            //or (int i = 0; i < n; i++) {
               // if (a[i] < min) {
                 //   min = a[i];
                //}
            }
            //return min;
        }
    


    public static void main(String[] args) {
        try {
            int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the element of array:");
        for (int i = 0; i < n; i++) {
           a[i] = sc.nextInt();
        }
        System.out.println("Min of array: " + findmin(a, n));
        } catch (Exception e) {
            System.out.println("error !");
            
        }
    }   
}