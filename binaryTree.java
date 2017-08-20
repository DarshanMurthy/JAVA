// PreOrder Tree traveral. 
class Node{
    Node left, right;
    int key;
    Node(int data){
        key = data;
    }
};
public class binaryTree{
    Node root;
    void preOrder(Node root){
        if(root == null){
            return;
        }
        System.out.println(root.key);
        preOrder(root.left);
        preOrder(root.right);

    }
    public static void main(String args[]){
        binaryTree Tree = new binaryTree();
        Tree.root = new Node(10);
        Tree.root.left = new Node(-1);
        Tree.root.right = new Node(90);
        Tree.preOrder(Tree.root);

    }
}