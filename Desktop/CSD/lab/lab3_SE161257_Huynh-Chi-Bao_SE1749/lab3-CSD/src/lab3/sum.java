/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;

public class sum {

    
    public static int sum(int m){
        if( m <=1){
            return m;
        }else{
            return m +sum(m-1);
        }
    
    }
    public static void main(String[] args) {
       int n;
       
        Scanner sc =new Scanner(System.in);
        System.out.print("enter n:");
        n=sc.nextInt();
        System.out.println( "Sum=" + sum(n));
        
    }
    
}
