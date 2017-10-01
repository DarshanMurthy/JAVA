class Node{
    int data;
    Node(int data){
        this.data = data;
    }
    Node right;
    Node left;
};

class heightofBinaryTree{


    public int height(Node node){
        if(node == null) {return -1;}
        else{
        int valueleft = height(node.left);
        int valueright = height(node.right);
        if(valueleft < valueright){
            return valueright+1;
        }
        else{
            return valueleft+1;
        }
    }

    }


    public static void main(String args[]){
       Node node = new Node(10);
       heightofBinaryTree tree = new heightofBinaryTree();
       int height = tree.height(node);
       System.out.println(height);

    }
}