//import package.Node ;

// class Node{
// 	int data;
// 	Node left;
// 	Node right;
// 	Node(int value){
// 		data= value;
// 	}
// }
public class BinaryTree{
	void inOrder(Node node){

		if(node == null) return;
		System.out.println(node.data);
		inOrder(node.left);
		inOrder(node.right);// backtrack.
		System.out.println("check");
	}
	public static void main(String args[]){
		BinaryTree tree = new BinaryTree();
		Node node = new Node(10);
		node.left= new Node(20);
		node.left.left = new Node(80);
		node.left.left.right= new Node(90);
		tree.inOrder(node);

	}

}