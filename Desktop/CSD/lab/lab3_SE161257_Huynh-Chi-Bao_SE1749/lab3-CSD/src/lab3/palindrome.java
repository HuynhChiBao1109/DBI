/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;


public class palindrome {
      
    public static int palindrome(int a[], int begin,int end){
        if(begin>= end){
            return 1;
        }else{
            if(a[begin] == a[end]){
                return palindrome(a,begin+1,end- 1);
            }else{
                return 0;
            }
        }
    }
    public static void main(String[] args) {
       int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        n= sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the element of array:");
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        if(palindrome(a,0,n-1)==1){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
    
}
