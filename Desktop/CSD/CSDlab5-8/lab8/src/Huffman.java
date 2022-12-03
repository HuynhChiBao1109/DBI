

public class Huffman {

    public static void printCode(Node root, String s) {
        if (root.left == null && root.right == null && Character.isLetter(root.c)) {

            System.out.println(root.c + ":" + s);

            return;
        }
        printCode(root.left, s + "0");
        printCode(root.right, s + "1");
    }
    
}
