package binarytree;

import java.util.Scanner;
import Traversal.*;


public class BinaryTree {
    
     // Root of Binary Tree
    Node root;
 
    // Constructors
    BinaryTree(int data) {
        root = new Node(data);
    }
 
    BinaryTree() {
        root = null;
    }
    
    public static void main(String[] args) {
        int i;
        BinaryTree tree = new BinaryTree();
 
        /*create root*/
        tree.root = new Node(1);
 
 
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
 
        tree.root.left.left = new Node(4);
        
        System.out.println("Tree created");
        
        
        //Operations on binary tree
        do{
        System.out.println("\n\nChoose option for traversal  1. Inorder  2. Preorder   3. Postorder   and press 0 to terminate\n\n");
        Scanner sc = new Scanner(System.in);
        
        i = sc.nextInt();
        
        switch(i){
        
            case 1: System.out.println("Inorder is   :   ");
                    inOrder.printInorder(tree.root);
                    break;
            
            case 2: System.out.println("Preorder is   :   ");
                    preOrder.printPreorder(tree.root);
                    break;
                
            case 3: System.out.println("Postrder is   :   ");
                    postOrder.printPostorder(tree.root);
                    break;
                
            default:
                if(i!=0)
                System.out.println("Wrong option");
        }
        
        }while(i!=0);
        System.out.println("Program terminated");
        
        
        
    }
    
}
