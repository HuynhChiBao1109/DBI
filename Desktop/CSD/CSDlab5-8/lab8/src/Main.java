
import java.util.Comparator;
import java.util.PriorityQueue;


public class Main {

    public static void main(String[] args) {

        
        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f'};
        int[] charfreq = {5, 9, 12, 13, 16, 45};
            //                       100
            //                0/          \1
            //             (45: f)       (55: a+b+c+d+e)
            //                          0/                \1
            //                      25                  30
            //                 0/   \1              0/    \1
            //        (12:c)(13:d )     14    (16: e)
            //                                   0/ \1
            //                                 (5:a)(9:b)
            //                           
            //      a:1100
            //      b:1101
            //      c:100               
            //      d:101
            //      e:111
            //      f:0
        PriorityQueue<Node> q
                = new PriorityQueue<Node>(charArray.length, new ImplementComparator());

        for (int i = 0; i < charArray.length; i++) {
            Node node = new Node();

            node.c = charArray[i];
            node.item = charfreq[i];

            node.left = null;
            node.right = null;

            q.add(node);
        }

        Node root = null;

        while (q.size() > 1) {

            Node x = q.peek();
            q.poll();

            Node y = q.peek();
            q.poll();

            Node f = new Node();

            f.item = x.item + y.item;
            f.c = '-';
            f.left = x;
            f.right = y;
            root = f;
           
            
            q.add(f);
            
            System.out.println("Frequencies:"+f.item);
            
        }
        System.out.println(" Char | Huffman code: ");
        System.out.println("--------------------");
        Huffman.printCode(root, "");
        
        
        
    }
}
