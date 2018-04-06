package Traversal;
import binarytree.Node;

/**
 *
 * @author Pradeep
 */
public class inOrder {
     public static void printInorder(Node node) {
        if (node == null)
            return;
 
        /* recurtion on left child */
        printInorder(node.left);
 
        /* print the data of node */
        System.out.print(node.data + " ");
 
        /* recurtion on right child */
        printInorder(node.right);
    }
}
