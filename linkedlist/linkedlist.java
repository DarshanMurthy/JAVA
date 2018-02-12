package linkedlist;
class Node{
	int data;
	Node next=null;
	Node(int data){
		this.data = data;
	}
}
class Operation{
	Node first;
	void insert(int data) {
		if(first == null) {
			Node node = new Node(data);
			node.next= null;
			first = node;
		}else {
			Node cur = first;
			while(cur.next!= null) {
				cur = cur.next;
			}
			Node node = new Node(data);
			cur.next = node;
		}
	}
	void display() {
		Node cur = first;
		if(first == null) {
			System.out.println("The list is empty");
		}
		else {
			while(cur!= null) {
				System.out.println(cur.data);
				cur = cur.next;
			}
		}
	}

}
public class linkedlist {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		Operation op = new Operation();
		op.insert(10);
		op.insert(20);
		op.insert(30);
		op.display();
		
		

		
		
		
	}

}
