package stacksandqueues;

public class Queue{
	int rear, front, size, capacity;
	int [] arr;
	Queue(int capacity){
		this.capacity = capacity;
		arr = new int[capacity-1];
		front = size = 0;
		rear = capacity-1;
	}
	void insert(int item) {
		if(size == capacity) {
			return;
		}
		rear = (rear+1) % capacity;
		arr[rear] = item;
		size = size + 1 ;
	}
	int dequeue() {
		if(size == 0 ) {
			return Integer.MIN_VALUE;
		}
		int temp = arr[front];
		
		return arr[front];
		
	}
	public static void main(String[] args) {
		Queue que  = new Queue(3);
		que.insert(1);
		que.insert(2);
		que.insert(3);
		
	}

}
