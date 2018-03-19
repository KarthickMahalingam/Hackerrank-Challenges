import java.io.*;
import java.util.*;
class Tree{
    int data;
    Tree left, right;
    Tree(int key){
        data = key;
        left = right = null;
    }
}

class MirrorTree{
    public static Tree createMirror(Tree root){
        if( root == null) return root;
        createMirror(root.left);
        createMirror(root.right);
        Tree temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        
        return root;
    }
    
    public static void printTree(Tree root){
        if(root == null) return;
        printTree(root.left);
        System.out.println(root.data);
        printTree(root.right);
    }
    
    public static void levelOrder(Tree root){
        Queue<Tree> que = new LinkedList<Tree>();
        que.add(root);
        int level = 0;
        System.out.println("*********************");
        while(!que.isEmpty()){
            level = que.size();
            while(level > 0){
                Tree temp = que.poll();
                System.out.print("->"+temp.data);
                if(temp.left !=null)
                  que.add(temp.left);
                if(temp.right !=null)
                  que.add(temp.right);
                level--;
            }
            System.out.println();
        }
        
    }
    
    public static void main(String arg[]){
        Tree root;
        root = new Tree(10);
        root.left = new Tree(5);
        root.right = new Tree(15);
        root.left.left = new Tree(3);
        root.left.right = new Tree(7);
        root.right.left = new Tree(12);
        root.right.right = new Tree(17);
        root.left.left.left = new Tree(1);
        root.left.left.right = new Tree(4);
        createMirror(root);
        printTree(root);
        levelOrder(root);
    }
}

Input:
/*
         10
        /  \
       5    15
      / \  /  \
     3  7 12  17
    / \
    1 4

*/

Output: 
->10
->15->5
->17->12->7->3
->4->1
