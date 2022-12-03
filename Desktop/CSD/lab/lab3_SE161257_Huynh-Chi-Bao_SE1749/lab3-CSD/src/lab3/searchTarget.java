/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;

import java.util.Scanner;


public class searchTarget {

    public static int searchBinary(int a[],int x,int begin,int end){
        if(begin>end){
            return -1;
        }else{
            int mid = (begin + end)/2;
            if(x== a[mid]){
                return mid;
            }else{
                if(x>a[mid]){
                    return searchBinary(a,x,mid+1,end);
                }else{
                    return searchBinary(a,x,begin,mid-1);
                }
            }
        }
    }
    public static void main(String[] args) {
        int n,x;
        Scanner sc = new Scanner(System.in);
        System.out.print("enter n:");
        n= sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter the elemnt og array:");
        for( int i =0; i < n ; i++){
            a[i] = sc.nextInt();
        }
        System.out.println("enter number need find target:");
        x = sc.nextInt();
        System.out.println("Taget:" + searchBinary(a,x,0,n-1));
    }
    
}
