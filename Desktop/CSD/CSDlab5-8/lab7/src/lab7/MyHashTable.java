/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;


public class MyHashTable{
    private NodeList[] studentLists;
    public MyHashTable(){
        studentLists = new NodeList[26]; // create an array containing 26 student lists
        for(int i = 0; i < 26; i++) // create an object of each list at each index of the array
            studentLists[i] = new NodeList();
    }
    public Student put(Student student) throws Exception {
        Character hashKey = student.getName().charAt(0);
        if(hashKey >= 'A' && hashKey <= 'Z'){
            studentLists[hashKey - 'A'].addToFront(student);
            return studentLists[hashKey - 'A'].getHead().student;
        }else if(hashKey >='a' && hashKey <= 'z'){
            studentLists[hashKey - 'a'].addToFront(student);
            return studentLists[hashKey - 'a'].getHead().student;
        }else throw new Exception("Student name must only contain letters.");
    }
    public void get(int index){
        if(index < 0 || index > 25){
            System.out.println("The hashtable has only indices from [0-25]. Please enter appropriate index.");
            return;
        }
        studentLists[index].displayListValues();
    }

    public boolean contains(Student student) throws Exception {
        Character hashKey = student.getName().charAt(0);
        if(hashKey >= 'A' && hashKey <= 'Z'){
            return studentLists[hashKey - 'A'].contains(student);
        }else if(hashKey >='a' && hashKey <= 'z'){
            return studentLists[hashKey - 'a'].contains(student);
        }else throw new Exception("Student name must only contain letters.");
    }
    public void displayHashTable(){
        for(int i = 0 ; i < 26; i++){
            System.out.println("Values present at index " + i + ":");
            studentLists[i].displayListValues();
        }
    }
}

