package queue;

public class TestQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue q = new Queue();
		q.show();
		q.Enqueue(10);
		q.Enqueue(20);
		q.Enqueue(30);
		q.Enqueue(40);
		q.Enqueue(50);
		q.Dequeue();
		q.Dequeue();
		q.show();
		q.Enqueue(60);
		q.show();
	}

}
