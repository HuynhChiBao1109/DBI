/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;



    public class run {
    public static void main(String[] args) throws Exception {

        Student A2 = new Student("Carol", 21,95);
        Student B2 = new Student("cain", 23, 100);
        Student C2 = new Student("Cynthia", 25, 86);

        Student A3 = new Student("Duke",23,88);

        Student A5 = new Student("Farquan", 25,85);
        Student B5 = new Student("farhan", 27, 65);

        Student A9 = new Student("James",30,75);
        Student B9 = new Student("jake",25,99);

        MyHashTable hashTable = new MyHashTable();

        hashTable.put(A2);
        hashTable.put(B2);
        hashTable.put(C2);
        hashTable.put(A3);
        hashTable.put(A5);
        hashTable.put(B5);
        hashTable.put(A9);
        hashTable.put(B9);
        System.out.println();
       
        System.out.println("____________Displaying current state of hash-table________________");
        hashTable.displayHashTable(); // Display current state of hashtable
        System.out.println("_____________________________________________________________________");
    }
}
