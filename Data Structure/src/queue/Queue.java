package queue;

public class Queue {

	int MAX = 5;
	int front = -1;
	int rear = -1;
	int arr[] = new int[MAX];
	
	public void Enqueue(int x) {
		if(rear == MAX-1 && rear-front<MAX-1) {
			rear = 0;
			arr[rear] = x;
		}
		else if(isFull()) {
			System.out.println("Queue is Full");
			return;
		}
		else if(isEmpty()) {
			front = rear = 0;
		}
		else
			rear += 1;
		arr[rear] = x;
	}
	
	public void Dequeue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
			return;
		}
		else if(front == rear)
			front = rear = -1;
		else
			front += 1;
	}
	
	public boolean isEmpty() {
		if(front == -1 && rear == -1)
			return true;
		else
			return false;
	}
	public boolean isFull() {
		if(rear == MAX - 1)
			return true;
		else
			return false;
	}
	public void show() {
		if(isEmpty()) {
			System.out.println("Queue is empty right now");
			return;
		}
		for(int i=front;i<=rear;i++)
			System.out.print(" "+arr[i]);
		System.out.println();
	}
}
