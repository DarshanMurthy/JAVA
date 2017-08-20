class Node{
    int value;
    Node left,right;
    Node(int data){
        value=data;
    }

};

public class Test{
    Node root;

    public static void main(String args[]){
        System.out.println("Hello");
        Test test = new Test();
        test.root= new Node(10);
    }
}