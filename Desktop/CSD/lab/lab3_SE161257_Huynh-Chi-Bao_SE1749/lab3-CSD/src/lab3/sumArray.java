/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;
import java.util.Scanner;


public class sumArray {
      public static int findsum(int a[], int n) {
          int sum;
        if (n == 1) {
            return a[0];
        } else {
             sum = a[0];
            for (int i = 1; i < n; i++) {
                sum+=a[i];
                }
            }
            return sum;
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
        System.out.println("Sum of array: " + findsum(a, n));
        } catch (Exception e) {
            System.out.println("error !");
            
        }
}
    
}
