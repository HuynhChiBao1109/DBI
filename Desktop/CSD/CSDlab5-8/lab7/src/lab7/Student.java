/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;


public class Student {
    public String name;
    private int age;
    private int marks;
    public Student(String name, int age, int marks){
        this.name = name;
        this.age =  age;
        this.marks = marks;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return  '\n' +"Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", marks=" + marks +
                '}' ;
    }
}
