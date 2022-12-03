package Lab5_4;

import java.io.IOException;


public class Main {

    public static void main(String[] args) throws Exception {
        String filename;
        filename="matrix.txt";
        /*  
                    2               
                B ----- D           
                /     /  \
             4 /   3 /    \ 20
           A  /     /      \  F
              \    /       /
            20 \  /       / 5
                \/       /
                C ----- E
                    1
        */
        Graph g =new Graph();
        g.setData(filename);
        g.sortVertexBydegree();
        g.sequentialColoring();
        g.display();
    }
    
}
