package binarytree;

class Node{
	int data;
	Node llink;
	Node rlink;
	Node(int data){
		this.data = data;
	}
}
public class BTree{
	Node root;
	BTree(){
		root = null;
	}
	BTree(int key){
		root = new Node(key);
	}
	public static void main(String args[]) {
		BTree tree = new BTree();
		tree.root = new Node(10);
		tree.root.llink = new Node(20);
		tree.root.rlink = new Node(30);
	}
}

