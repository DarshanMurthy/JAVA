class Node{
    int data;
    Node left, right;
    Node(int value){
        data = value;
    }

}

public class Tree_Flatten{
    Node root;
    void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.println(root.data);
        preOrder(root.left);
        preOrder(root.right);
    }


    public static void main(String args[]){
        Tree_Flatten tree = new Tree_Flatten();
        tree.root = new Node(10);
        tree.root.left= new Node(20);
        tree.root.right= new Node(30);
        tree.root.left.left= new Node(50);
        tree.preOrder(tree.root);

    }

}