package Lab5_2;

import java.util.*;
public class MyStack {
   
    LinkedList a;
    MyStack() {a = new LinkedList();}
    boolean isEmpty() {return(a.isEmpty());}
    void push(int x) {a.add(x);}
    int pop() {return((Integer) a.removeLast());}

}
