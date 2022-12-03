/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mytree;


public class Main {

    public static void main(String[] args) {
        BSTree tree = new BSTree();
        int [] a = {3,5,9};
        //   3
        //  1   5 
        // 0   2 9
        System.out.print("BST after insertion: ");
        for (int i = 0; i < a.length; i++) {
                System.out.print(a[i]+" ");
        }
        tree.addArray(a);
//        System.out.print("\nBreadth traversal: ");
//        tree.breadth();
//        System.out.print("PreOrder traversal: ");
//        tree.preOrder(tree.root);
//        System.out.print("\nInOrder traversal: ");
//        tree.inOrder(tree.root);
//        System.out.print("\nPostOrder traversal: ");
//        tree.postOrder(tree.root);
//        System.out.println("\n10.Count: "+tree.count());
//        System.out.println("11.Minimum value of BST is: "+tree.min().getData());
//        System.out.println("12.Maximum value of BST is: "+tree.max().getData());
//        System.out.println("13.Sum: " +tree.sum());
//        System.out.println("14.AVG: "+tree.avg());
//        System.out.println("15.Height of a tree: "+tree.height());
//        System.out.println("16.Sum of nodes on the longest path from root to leaf node: "+tree.sumOfLongRootToLeafPathUtil());
        //balanced
        if (tree.isBalanced())
        {System.out.println("17.Tree is balanced");}
        else
        {System.out.println("17.Tree is not balanced");}
//        //heap
//         if (tree.isHeap())
//         { System.out.println("19.Given binary tree is a Heap");}
//        else
//         {System.out.println("19.Given binary tree is not a Heap");}
//        
//         System.out.println("18.This function serves little purpose: it always returns 0");
    }
}
