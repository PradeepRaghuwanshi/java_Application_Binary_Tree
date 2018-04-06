package Traversal;
import binarytree.Node;

/**
 *
 * @author Pradeep
 */
public class preOrder {
    
     public static void printPreorder(Node node) {
        if (node == null)
            return;
 
        /* to print data of node */
        System.out.print(node.data + " ");
 
        /* recurtion on left sutree */
        printPreorder(node.left);
 
        /* recurtion on right subtree */
        printPreorder(node.right);
    }
    
}
