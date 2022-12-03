/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3;


public class HeightTree {
    public static boolean isLeaf(Node node){
        return (node.left != null && node.left.right == node && node.right != null && node.right.left ==node);
    }
    public static int maxDepth(Node node){
        if(node ==null){
            return 0;
        }else if(isLeaf(node)){
            return 1;
        }else{
            return 1 + Math.max(maxDepth(node.left),maxDepth(node.right));
        }
    }
    public static void main(String[] args) {
       Node root = new Node(1);
       root.left = new Node(2);
       root.right = new Node(3);
       root.left.left = new Node(4);
       root.left.right = new Node(5);
       root.left.left.left = new Node(6);
       
       Node L1 = root.left.left.left;
       Node L2 = root.left.right;
       Node L3 = root.right;
       
       L1.right =L2;
       L2.right = L3;
       L3.right = L1;
       
       L3.left = L2;
       L2.left =L1;
       L1.left =L3;
       
        System.out.println("Height of tree is :" + maxDepth(root));
    }
    
}
