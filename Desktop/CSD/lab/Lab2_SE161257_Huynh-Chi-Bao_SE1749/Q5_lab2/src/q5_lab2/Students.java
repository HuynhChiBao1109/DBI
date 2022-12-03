/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package q5_lab2;


public class Students {
     String ID;
    String Name;
    int age;

    public Students(String ID, String Name, int age) {
        this.ID = ID;
        this.Name = Name;
        this.age = age;
    }

    @Override
    public String toString() {
        return ID +" - "+ Name + " - " + age;
    }
}
