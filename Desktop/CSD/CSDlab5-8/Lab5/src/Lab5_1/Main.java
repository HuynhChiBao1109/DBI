package Lab5_1;

public class Main {

    public static void main(String[] args) {
      int [][] b = {
          {0,1,1,1,0,0},  
          {1,0,1,1,0,0},  
          {1,1,0,1,0,0},  
          {1,1,1,0,0,1},  
          {0,0,0,0,0,1},  
          {0,0,0,1,1,0}  
      };
      Graph g = new Graph();
      g.setData(b);
      g.dispAdj();
      
      System.out.println("\n1.1 Breadth first traversal:");
      g.breadth(0);
      System.out.println("\n1.2 Depth first traversal:");
      g.depth(0);
      System.out.println("");
      
    }
    
}
