import java.util.*;
class Node{
    int value ;
    Node left,right;
    public Node(int data){
        data=value;
        left=right=null;
    }
}


public class Tree{
    Node root;
    Tree(){
        root=null;
    }

    void preOrder(Node node){
        if(node == null) return ;
        System.out.println(node.value);
        preOrder(node.left);
        preOrder(node.right);
    }

    
public static void main(String args[]){
    Tree tree = new Tree();
    tree.root = new Node(10);
    tree.root.left = new Node(20);
    tree.root.right = new Node(30);
    tree.preOrder(tree.root);

    // HashMap<Integer,String> map = new HashMap<Integer,String>();
    // map.put(123,"node");
    // for(Map.Entry m: map.entrySet()){
    //     System.out.println(m.getKey());
    // }
}
}