package Traversal;
import binarytree.Node;

/**
 *
 * @author Pradeep
 */
public class postOrder {
    
     public static void printPostorder(Node node) {
        if (node == null)
            return;
 
        // recurtion on left subtree
        printPostorder(node.left);
 
        // recurtion on right subtree
        printPostorder(node.right);
 
        // to print node
        System.out.print(node.data + " ");
    }
    
}
